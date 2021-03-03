CREATE DATABASE IF NOT EXISTS lec1;
use lec1;
CREATE TABLE customers(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(40),
   address VARCHAR(255),
   email VARCHAR(255)
);

CREATE TABLE orders(
   id INT,
   staff VARCHAR(50),
   PRIMARY KEY(id),
   customer_id INT AUTO_INCREMENT,
   FOREIGN KEY(customer_id) REFERENCES customers(id)
);