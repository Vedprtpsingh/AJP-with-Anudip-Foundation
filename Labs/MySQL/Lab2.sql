create table Client_Masterr(ClientNo varchar(6)Primary Key,Name varchar(20)not null,
Address1 varchar(30)not null,Address2 varchar(30) not null,City varchar(15) not null,
Pincode int not null,State varchar(15) not null,BalDue varchar(20) not null);
select name from Client_Masterr;
Insert into Client_Masterr values(101,'ram','C.r avenue','p.k.road','kolkata',700008,'west bengal',500);
select name from Client_Masterr;
select * from Client_Masterr;
