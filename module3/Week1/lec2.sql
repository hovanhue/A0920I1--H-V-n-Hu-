
create database if not exists lec2;
use lec2;
CREATE TABLE if not exists lec2.contacts( 
 contact_id INT NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE if not exists lec2.suppliers( 
supplier_id INT NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

CREATE TABLE users(
   user_id INT AUTO_INCREMENT PRIMARY KEY,
   username VARCHAR(40),
   password VARCHAR(255),
   email VARCHAR(255)
);

CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   PRIMARY KEY(role_id)
);


create TABLE lec2.userroles(
user_id int not null,
role_id int not null,
PRIMARY KEY(user_id, role_id),
FOREIGN KEY(user_id) REFERENCES users(user_id),
FOREIGN KEY(role_id) REFERENCES roles(role_id)
);

