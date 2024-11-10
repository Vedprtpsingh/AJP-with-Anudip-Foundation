CREATE TABLE employee (emp_id INT PRIMARY KEY,f_name VARCHAR(50),l_name VARCHAR(50),email VARCHAR(100),
phone_no VARCHAR(20),hire_date DATE,job_id VARCHAR(10),salary DECIMAL(10, 2),commission DECIMAL(5, 2),mang_id INT,dept_id INT);

INSERT INTO employee (emp_id, f_name, l_name, email, phone_no, hire_date, job_id, salary, commission, mang_id, dept_id) VALUES
(1, 'Alice', 'Johnson', 'alice.johnson@example.com', '123-456-7890', '2020-01-15', 'MGR01', 75000.00, 5.00, NULL, 10),
(2, 'Bob', 'Smith', 'bob.smith@example.com', '234-567-8901', '2019-04-23', 'DEV02', 60000.00, 4.50, 1, 20),
(3, 'Charlie', 'Rose', 'charlie.rose@example.com', '345-678-9012', '2021-06-10', 'ANA03', 55000.00, 3.00, 1, 30),
(4, 'Dana', 'White', 'dana.white@example.com', '456-789-0123', '2018-08-05', 'DEV02', 62000.00, 4.75, 1, 20),
(5, 'Eve', 'Black', 'eve.black@example.com', '567-890-1234', '2022-02-20', 'DSG04', 50000.00, 2.50, NULL, 40);
SELECT * FROM employee;
DELIMITER //GetAllEmployees
CREATE PROCEDURE GetAllEmployees()
BEGIN
    SELECT * FROM employee;
END //
DELIMITER ;GetAllEmployeesGetAllEmployeesGetAllEmployees
CALL GetAllEmployees();



DELIMITER //
CREATE PROCEDURE UpdateEmployeeSalary(
    IN p_emp_id INT,
    IN p_new_salary DECIMAL(10,2)
)
BEGIN
    UPDATE employee
    SET salary = p_new_salary
    WHERE emp_id = p_emp_id;
END //
DELIMITER ;
CALL UpdateEmployeeSalary(3, 65000.00);







DELIMITER //
CREATE PROCEDURE InsertNewEmployee(IN p_emp_id INT,IN p_f_name VARCHAR(50),IN p_l_name VARCHAR(50),IN p_email VARCHAR(100),IN p_phone_no VARCHAR(20),
    IN p_hire_date DATE,IN p_job_id VARCHAR(10),IN p_salary DECIMAL(10, 2),IN p_commission DECIMAL(5, 2),IN p_mang_id INT,IN p_dept_id INT)
BEGIN
    INSERT INTO employee (emp_id, f_name, l_name, email, phone_no, hire_date, job_id, salary, commission, mang_id, dept_id)
    VALUES (p_emp_id, p_f_name, p_l_name, p_email, p_phone_no, p_hire_date, p_job_id, p_salary, p_commission, p_mang_id, p_dept_id);
END //
DELIMITER ;
CALL InsertNewEmployee(6, 'Dev', 'Singh', 'Dev@example.com', '678-901-2345', '2023-05-10', 'DEV02', 65000.00, 4.00, 1, 20);



DELIMITER //
CREATE FUNCTION GetTotalEmployees() 
RETURNS INT DETERMINISTIC 
BEGIN 
    DECLARE total INT; 
    SELECT COUNT(*) INTO total FROM employee; 
    RETURN total; 
END //
DELIMITER ;
select GetTotalEmployees()



DELIMITER //
CREATE FUNCTION GetTotalSalary() 
RETURNS DECIMAL(10, 2) DETERMINISTIC 
BEGIN 
    DECLARE total_salary DECIMAL(10, 2); 
    SELECT SUM(salary) INTO total_salary FROM employee; 
    RETURN total_salary; 
END //
DELIMITER ;
SELECT GetTotalSalary();




DELIMITER //
CREATE PROCEDURE DeleteEmployee(IN p_emp_id INT)
BEGIN
    DELETE FROM employee
    WHERE emp_id = p_emp_id;
END //
DELIMITER ;
CALL DeleteEmployee(99);







delimiter //
create trigger empidCheck before insert on employee for each row if new.salary<0 
then set new.salary=0;
end if; // 
select * from employee;
insert into employee values (90, 'Deva', 'Singha', 'Devasingha@example.com', '343441-2345', '2023-05-10', 'DEV03', -65000.00, 4.00, 1, 20);
SELECT * FROM employee;