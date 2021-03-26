USE classicmodels;
select productCode, productName, buyprice, quantityInstock from products
where buyprice > 56.76 and quantityInstock >10;


SELECT productCode, productName, buyprice, textDescription
FROM products
inner join productlines
on products.productline = productlines.productline
WHERE buyprice > 56.76 AND buyprice < 95.59;

select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast';

select status from orders 
group by status;

select status, COUNT(*) as 'So luong status'
from orders
group by status;

select status, sum(quantityOrdered * priceEach) as amount
from orders 
inner join orderdetails on orders.ordernumber = orderdetails.ordernumber
group by status;

select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;


select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders 
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;

SELECT customers.customerNumber, customerName, phone, paymentDate, amount FROM customers
INNER JOIN payments
on customers.customerNumber = payments.customerNumber
where city = 'Las Vegas';

select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers
left join orders
on customers.customerNumber = orders.customerNumber;

select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers LEFT JOIN orders
on customers.customerNumber = orders.customerNumber
where orderNumber is null

