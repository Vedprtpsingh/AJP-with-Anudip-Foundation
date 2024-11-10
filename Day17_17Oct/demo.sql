create database ajp;
show databases;
use ajp;
create table Student(sid int,sname varchar(20),sage int);
desc Student;
insert into student values(1,'Rahul',23);
select * from student;                                           

insert into student values(2,'komal',22),(3,'Varun',21);
insert into student (sid,sage) values(5,24);
alter table student add(address varchar(30));
select sid from student;
alter table student modify address varchar(100);
alter table student
change address location varchar(50);
alter table student drop location;
rename table stuinfo to student;
desc student;