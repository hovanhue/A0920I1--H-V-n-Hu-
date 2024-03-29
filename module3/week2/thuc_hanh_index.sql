use classicmodels;
EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

ALTER TABLE customers ADD INDEX idx_customerNumber(customerNumber);
EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);

EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';

DELIMITER //

CREATE PROCEDURE findAllCustomers()
BEGIN
  SELECT * FROM customers;
END //
delimiter ;

call findAllCustomers();

delimiter //
DROP PROCEDURE IF EXISTS findAllCustomers//
CREATE PROCEDURE findAllCustomers()
begin
	select * from customers where customerNumber = 175;
end; //
call findAllCustomers();

DELIMITER //
DROP PROCEDURE IF EXISTS getCusById//
CREATE PROCEDURE getCusById (IN cusNum INT(11))
BEGIN
  SELECT * FROM customers WHERE customerNumber = cusNum;
END //

call getCusById(175);

DELIMITER //
CREATE PROCEDURE GetCustomersCountByCity(IN  in_city VARCHAR(50), OUT total INT)
BEGIN
    SELECT COUNT(customerNumber)
    INTO total
    FROM customers
    WHERE city = in_city;
END//

CALL GetCustomersCountByCity('Lyon',@total);
SELECT @total;


DELIMITER //
CREATE PROCEDURE SetCounter(INOUT counter INT, IN inc INT)
BEGIN
    SET counter = counter + inc;
END//
DELIMITER ;
-- Gọi store procedure:
SET @counter = 1;
CALL SetCounter(@counter,1); -- 2
CALL SetCounter(@counter,1); -- 3
CALL SetCounter(@counter,5); -- 8
SELECT @counter; -- 8

CREATE VIEW customer_views AS -- hiển thị bảng ảo
SELECT customerNumber, customerName, phone -- 3 trường 
FROM  customers; -- lấy từ bảng customers
select * from customer_views; -- hiển thị bảng ảo

-- cập nhật thông tin của bảng ảo
CREATE OR REPLACE VIEW customer_views AS
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone
FROM customers
WHERE city = 'Nantes';

DROP VIEW customer_views;