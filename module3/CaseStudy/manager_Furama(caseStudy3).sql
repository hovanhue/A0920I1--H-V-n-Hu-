
CREATE USER 'hovanhue'@'%' IDENTIFIED BY '123123';
GRANT ALL PRIVILEGES ON * . * TO 'hovanhue'@'%';

create database manager_Furama;
use manager_Furama;
create table postion(
	postion_id int primary key,
    postion_name varchar(45)
);
create table education_degree(
	education_degree_id int primary key,
    education_degree_name varchar(45)
);
create table division(
	division_id int primary key,
    division_name varchar(45)
);

create table `role`(
	role_id int primary key,
    role_name varchar(255)
);
create table `user`(
	username varchar(255) primary key,
    `password` varchar(255)
);
create table user_role(
	role_id int,
    username varchar(255),
    foreign key (role_id) references `role` (role_id),
    foreign key (username) references `user`(username)
);

create table employee(
	employee_id int primary key,
    employee_name varchar(45),
    employee_birthday date,
    employee_idCard varchar(45),
    employee_salary double,
    employee_phone varchar(45),
    employee_email varchar(45),
    employee_address varchar(45),
    postion_id int,
    education_degree_id int,
    division_id int,
    username varchar(45),
    foreign key (postion_id) references postion(postion_id),
    foreign key (education_degree_id) references education_degree(education_degree_id),
    foreign key (division_id) references division(division_id),
    foreign key (username) references `user`(username)
);

create table service_type(
	service_type_id int primary key,
    service_type_name varchar(45)
);
create table rent_type(
	rent_type_id int primary key,
    rent_type_name varchar(45),
    rent_type_cost double
);

create table service(
	service_id int primary key,
    service_name varchar(45),
    service_area int,
    service_cost double,
    service_max_people int,
    rent_type_id int,
    service_type_id int,
    standard_room varchar(45),
    description_other varchar(45),
    pool_area double,
    number_floors int,
    foreign key (rent_type_id) references rent_type(rent_type_id),
    foreign key (service_type_id) references service_type(service_type_id)
);
alter table service 
modify column service_area double;

create table customer_type(
	customer_type_id int primary key,
    customer_type_name varchar(45)
);
create table customer(
	customer_id int primary key,
    customer_type_id int,
    customer_name varchar(45),
    customer_birthday date,
    customer_gender bit(1),
    customer_idCard varchar(45),
    customer_phone varchar(45),
    customer_email varchar(45),
    customer_address varchar(45),
    foreign key (customer_type_id) references customer_type(customer_type_id)
);

create table contract(
	contract_id int primary key,
    contract_start_date datetime,
    contract_end_date datetime,
    contract_deposit double,
    contract_total_money double,
    employee_id int,
    customer_id int,
    service_id int,
    foreign key (employee_id) references employee(employee_id),
    foreign key (customer_id) references customer(customer_id),
    foreign key (service_id) references service(service_id)
);
create table attach_service(
	attach_service_id int primary key,
    attach_service_name varchar(45),
    attach_service_cost double,
    attach_service_unit int,
    attach_service_status varchar(45)
);
create table contract_detail(
	contract_detail_id int primary key,
    contract_id int,
    attach_service_id int,
    quantity int,
    foreign key (contract_id) references contract(contract_id),
    foreign key (attach_service_id) references attach_service(attach_service_id)
);

insert into division values (1, "Sale – Marketing"),(2, "Hành Chính"),(3,"Phục vụ"),(4, "Quản lý");
insert into postion values (1, "Lễ tân"),(2, "Phục vụ"),(3, "Chuyên viên"),(4, "Giám sát"),(5, "Quản lý"),(6, "Giám đốc");
insert into education_degree values (1, "Trung cấp"),(2, "Cao đẳng"),(3, "Đại học"),(4, "Sau đại học");

insert into `user` values ("hovanhue1","123321"),("hovanhue2","123321"),("hovanhue3","123321"),("hovanhue4","123321"),("admin","admin");
insert into `role` values (1, "admin"),(2, "user");
insert into `user_role` values (1, "admin");

insert into employee values (1,"Anh","2000-01-01","204034813",4500000,"035909493","tuanAnh@gmail.com","Ha Tinh",5,3,4,"admin"),
(2,"Hue","2000-01-01","204034813",5000000,"035909493","hovanhue@gmail.com","Ha Tinh",1,4,3,"hovanhue1"),
(3,"Đạt","2000-01-01","204034813",4800000,"035909493","quangDat@gmail.com","Ha Tinh",2,2,2,"hovanhue2"),
(4,"Trí","2000-01-01","204034813",4500000,"035909493","Huutri@gmail.com","Ha Tinh",3,4,1,"hovanhue3");

insert into customer_type values (1, "Diamond"),(2, "Platinium"),(3, "Gold"),(4, "Silver"),(5, "Member");
insert into customer values (1,1,"Nguyen Van A","2000-03-03",1,"231249086","0905448213","nguyenvanA@gmail.com","Da Nang"),
(2,2,"Nguyen Van B","1993-03-31",0,"231249086","0905448213","nguyenvanB@gmail.com","Quang Nam"),
(3,3,"Nguyen Van C","1998-03-30",1,"233249086","0905448213","nguyenvanC@gmail.com","Hue"),
(4,4,"Nguyen Van D","1998-02-03",1,"235549086","0905448213","nguyenvanD@gmail.com","Quang Ngai"),
(5,5,"Nguyen Van E","1998-01-30",1,"237749086","0905448213","nguyenvanE@gmail.com","Ha Tinh");

insert into rent_type values (1,"Villa","200000"),(2,"House","300000"),(3,"Room","100000"),(4,"Dịch vụ đi kèm","100000");
insert into service_type values (1, "Villa"),(2, "House");
insert into service values(1,"Villa",200.0,2000000,10,1,1,"5 sao","Đẹp, bắt mắt",30,2);
insert into service values(2,"House",150.0,1500000,10,2,2,"5 sao","Đẹp, bắt mắt",30,1);
insert into service values(3,"Room",100.0,1000000,4,3,3,"5 sao","Đẹp, bắt mắt",30,1);

insert into attach_service values (1,"Karaoke","100000","10","Trống"),(2,"massage","100000","10","Trống")
,(3,"Thức ăn","100000","10","Trống"),(4,"Nước uống","100000","10","Trống"),(5,"Thuê xe","100000","10","Trống");
insert into contract values(1, "2021-01-01","2021-01-10",500000,1000000,1,1,1),(2, "2021-01-01","2021-01-10",500000,1000000,2,2,2),
(3, "2021-01-01","2021-01-10",500000,1000000,3,3,3);
insert into contract_detail values (1, 1, 1, 1),(2, 2, 2, 2),(3, 3, 3, 3);


