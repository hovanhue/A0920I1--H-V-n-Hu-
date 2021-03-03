create database if not exists lec1;
drop table if exists customers;
create table if not exists customers(
customerNumber int primary key,
cusomerName varchar(255),
phone varchar(50),
address varchar(255),
city varchar(255)
);
