Enter password: ********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 11
Server version: 9.3.0 MySQL Community Server - GPL

Copyright (c) 2000, 2025, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+---------------------------+
| Database                  |
+---------------------------+
| information_schema        |
| mysql                     |
| performance_schema        |
| r2                        |
| std                       |
| student_management_system |
| sys                       |
+---------------------------+
7 rows in set (0.028 sec)

mysql> use std;
Database changed
mysql> create table student(id int(10) primary key,name varchar(25) not null,address varchar(25) not null,age int not null);
Query OK, 0 rows affected, 1 warning (0.269 sec)

mysql> desc student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| id      | int         | NO   | PRI | NULL    |       |
| name    | varchar(25) | NO   |     | NULL    |       |
| address | varchar(25) | NO   |     | NULL    |       |
| age     | int         | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.025 sec)

mysql> insert into student values(101,'ravi','botad',21);
Query OK, 1 row affected (0.078 sec)

mysql> insert into student values(102,'kishan','ahmedabad',24);
Query OK, 1 row affected (0.068 sec)

mysql> insert into student values(103,'jay','riya',20);
Query OK, 1 row affected (0.070 sec)

mysql> insert into student values(104,'riya','bhuj',21);
Query OK, 1 row affected (0.074 sec)

mysql> insert into student values(105,'neeraj','surat',19);
Query OK, 1 row affected (0.069 sec)

mysql> update student set address='delhi' where id=103;
Query OK, 1 row affected (0.079 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select *from student;
+-----+--------+-----------+-----+
| id  | name   | address   | age |
+-----+--------+-----------+-----+
| 101 | ravi   | botad     |  21 |
| 102 | kishan | ahmedabad |  24 |
| 103 | jay    | delhi     |  20 |
| 104 | riya   | bhuj      |  21 |
| 105 | neeraj | surat     |  19 |
+-----+--------+-----------+-----+
5 rows in set (0.008 sec)

mysql> select sum(age) from student;
+----------+
| sum(age) |
+----------+
|      105 |
+----------+
1 row in set (0.004 sec)

mysql> select avg(age) from student;
+----------+
| avg(age) |
+----------+
|  21.0000 |
+----------+
1 row in set (0.007 sec)

mysql> select max(age) from student;
+----------+
| max(age) |
+----------+
|       24 |
+----------+
1 row in set (0.005 sec)

mysql> select min(age) from student;
+----------+
| min(age) |
+----------+
|       19 |
+----------+
1 row in set (0.009 sec)

mysql> select count(*) from student;
+----------+
| count(*) |
+----------+
|        5 |
+----------+
1 row in set (0.019 sec)

mysql>