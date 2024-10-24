create database ajp;
show databases;
use ajp;
create table Student(sid int,sname varchar(20),sage int);
desc Student;
insert into student values(1,'Rahul',23);
select * from student;
insert into student values(2,'komal',22),(3,'Varun',21);
insert into student (sid,sage) values(5,20);
alter table student add(address varchar(30));
select sid from student;
alter table student modify address varchar(100);
alter table student
change address location varchar(50);
alter table student drop location;
rename table stuinfo to student;
desc student;
truncate table student;
drop table studend;
update student set sage=24 where sid=4;
delete from student where sid=4;
create table Employee (eid int ,ename varchar(20),esal double,hiredate date);
insert into employee values(101,'Nitu',54000,'2023-11-16'),
(102,'Varun',55000,'2023-04-12'),
(104,'komal',70000,'2024-09-01'),
(103,'Dev',60000,'2024-10-01'),
(105,'Parmatma',45000,'2024-10-01');
select * from employee;
drop table employee;
select ename,esal*12 as 'Anual Salary' from Employee;
select esal*0.5 as 'half Month Salary' from Employee;
select esal+1000 as 'Incriment Salary' from Employee;
select * from employee where esal=54000;
select * from employee where esal<=55000;
select * from employee where esal!=55000;
select * from employee where esal between 55000 and 60000;
select * from employee where esal in(45000,54000);
select * from employee where esal is null;
select * from employee where ename like 'n%';
select * from employee where ename like '_o%';
select * from employee where ename like '%o%';
select * from employee where esal>=55000 and eid<=103;
select * from employee where esal>=55000 or eid<=103;
select * from employee order by esal;
select * from employee order by esal asc;
select * from employee order by esal desc;
select upper(ename) from employee;
select lower(ename) from employee;
select concat(ename,' ',esal) as 'name with sal' from employee;
select ename,length(ename) from employee;
select ename,substr(ename,2,3) from employee;
select ename,esal from employee where esal >50000;
select ename,esal from employee where esal between 40000 and 50000;
select ename,esal,hiredate from employee where hiredate between '2023-01-01' and '2023-12-31';
select ename from employee where ename like '%a%' and ename like '%n%';
select ename from employee where hiredate between '2023-01-01' and '2023-12-31' order by esal desc;