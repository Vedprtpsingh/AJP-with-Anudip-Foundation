create database ajp;
show databases;
use ajp;
create table Stds(sid varchar(10) primary key,sfirstname varchar(25) not null,slastname varchar(25) not null,DOB datetime not null,gender varchar(25) not null,email varchar(30) unique not null,phone varchar(25) not null);
desc Stds;
INSERT INTO stds VALUES (100,'Dev','Singh','2003-02-14 01:07:00+05:30','male','devsingh@gmail.com',1234567890);
INSERT INTO stds VALUES (101,'Pradeep','shivach','2004-12-10 01:07:00+05:30','male','pradeep@gmail.com',8484339999);
INSERT INTO stds VALUES (102,'Komal','Singh','2001-02-11 03:07:00+05:30','female','komal@gmail.com',1524789630);
INSERT INTO stds VALUES (104,'John','Roi','2003-12-10 04:17:00+05:30','male','jr0409@gmail.com',3224789630);
INSERT INTO stds VALUES (105,'Devid','khatri','2006-05-03 03:07:00+05:30','male','devid3232@gmail.com',1554789542);
INSERT INTO stds VALUES ('S101', 'John', 'Doe', '2000-10-10', 'M', 'john@example.com', 9878457945), ('S102', 'Jane', 'Smith', '2013-08-08', 'M', 'Jane@example.com', 9977457745), ('$103', 'Alice', 'Johnson', '2011-09-08', 'F', 'alice@example.com', 9876457845), ('$104', 'Jim', 'Doe', '2011-07-08', 'F', 'jim.doe@india.com', 9876457842), ('S105', 'Peter', 'Parker', '2011-06-05', 'F' ,'p_parker@example.com', 9276457843);
select * from stds;
alter table stds;
create table course( courseid varchar(10) primary key,coursetitle varchar(30) not null,credits int not null);
INSERT INTO course VALUES('C101','Math4',10);
INSERT INTO course VALUES('C102','COA1',9);
INSERT INTO course VALUES('C103','DBMS',9);
desc course;
select * from course;
alter table course;
create table instructor(insID varchar(10) primary key,email varchar(30) unique not null,firstname varchar(25) not null,lastname varchar(25) not null);
INSERT INTO instructor VALUES('I101','ps123@hmail.com','Pradeep','Pajapati');
INSERT INTO instructor VALUES('I102','po23@hmail.com','Pooja','Pajapati');
INSERT INTO instructor VALUES('I103','tss@hmail.com','tamana','bhatiya');
desc instructor;



create table enrollment(EnrollmentID varchar(10) primary key, StudentID varchar(10), CourseID varchar (10), InstructorID varchar(10) not null);
INSERT INTO Enrollment  VALUES ('E1001', 'S101', 'C101', '1101'), ('E1002', 'S102', 'C101', '1101'), ('E1003','S103', 'C102', '1102');
create table score(ScoreID varchar(10), StudentID varchar(10), CourseID varchar(10), CreditObtained varchar(10), DateOfExam varchar(10));
INSERT INTO Score (ScoreID, StudentID, CourseID, CreditObtained, DateOfExam) VALUES ('SC101', 'S101', 'C101', '12', '2022-10-10'), ('SC102', '$102', 'C101', '10', '2022-10-10');

create table feedback(StudentID varchAR(10), InstructorName varchar(25), Feedback varchar (100));
INSERT INTO Feedback(StudentID, InstructorName, Feedback) VALUES ('S101', '1101', 'Session was good'), ('S102', '1101', 'Topic was well explained');



