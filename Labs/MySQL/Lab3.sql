-- Customer Table
CREATE TABLE Customer (customer_id INT PRIMARY KEY,first_name VARCHAR(20),last_name VARCHAR(30));
-- Orders Table
CREATE TABLE Orders (order_id INT PRIMARY KEY,order_date DATE,total_amount INT,
    customer_id INT,FOREIGN KEY (customer_id) REFERENCES Customer(customer_id));
-- Inner Join Query
SELECT Customer.first_name, Customer.last_name, Orders.order_date, Orders.total_amount
FROM Customer
INNER JOIN Orders ON Customer.customer_id = Orders.customer_id;

-- Department Table
CREATE TABLE Department (department_id INT PRIMARY KEY,department_name VARCHAR(30));
-- Employees Table
CREATE TABLE Employees (employee_id INT PRIMARY KEY,first_name VARCHAR(30),last_name VARCHAR(30),
department_id INT,FOREIGN KEY (department_id) REFERENCES Department(department_id));

-- Left Join Query
SELECT Department.department_name, Employees.first_name, Employees.last_name
FROM Department
LEFT JOIN Employees ON Department.department_id = Employees.department_id;
