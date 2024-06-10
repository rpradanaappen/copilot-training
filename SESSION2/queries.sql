-- database: mysql

-- get all users from the users table

SELECT * FROM users;

-- get all users from the users table with the name "John"

SELECT * FROM users WHERE name = 'John';

-- show all the tables in the database

SHOW TABLES;

-- get all the users from the users table ordered by salary

SELECT * FROM users ORDER BY salary;

-- get all the users from the users table ordered by salary in descending order

SELECT * FROM users ORDER BY salary DESC;

-- get all the users from the users table and join them with the addresses table

SELECT * FROM users JOIN addresses ON users.id = addresses.user_id;

-- get all the users from the users table that have a name that starts with the letter B

SELECT * FROM users WHERE name LIKE 'B%';

-- get all the users from the users table that have a name that ends with the letter a

SELECT * FROM users WHERE name LIKE '%a';

