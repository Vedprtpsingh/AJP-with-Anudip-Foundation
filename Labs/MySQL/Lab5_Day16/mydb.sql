-- Salary Log Related Tables
create database if not exists mydb;
use mydb;
CREATE TABLE employee (
    eid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    salary DECIMAL(10,2)
);
insert into employee values(100,'DEV',50000.00);
CREATE TABLE Salary_Log (
    log_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    new_salary DECIMAL(10,2),
    change_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (employee_id) REFERENCES employee(eid)
);

-- Create trigger for salary updates
DELIMITER //
CREATE TRIGGER update_salary_trigger
AFTER UPDATE ON employee
FOR EACH ROW
BEGIN
    IF NEW.salary != OLD.salary THEN
        INSERT INTO Salary_Log (employee_id, new_salary) 
        VALUES (NEW.eid, NEW.salary);
    END IF;
END;
//
DELIMITER ;

-- Products Related Tables
CREATE TABLE products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(10),
    price DECIMAL(10,2)
);

CREATE TABLE Product_Metadata (
    product_id INT,
    last_modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (product_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- Create trigger for product updates
DELIMITER //
CREATE TRIGGER update_last_modified_trigger
AFTER INSERT ON Products
FOR EACH ROW
BEGIN
    INSERT INTO Product_Metadata (product_id) 
    VALUES (NEW.product_id)
    ON DUPLICATE KEY UPDATE last_modified = CURRENT_TIMESTAMP;
END;
//
DELIMITER ;