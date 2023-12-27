drop table if exists t_employee;
drop table if exists t_department;
 
create table t_employee(
  EMP_ID INTEGER NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(100) NOT NULL,
  AGE INTEGER,
  SAL INTEGER,
  PRIMARY KEY ( EMP_ID )
);
 
CREATE TABLE t_department (
  dept_id   INTEGER      NOT NULL AUTO_INCREMENT,
  dept_name VARCHAR(128) NOT NULL,
  PRIMARY KEY (dept_id)
);
 
insert into t_employee values (1, 'Alex', 25, 25000);
insert into t_employee values (2, 'Bob', 28, 5000);
insert into t_employee values (3, 'John', 57, 15000);
insert into t_employee values (4, 'Harry', 96, 50000);
insert into t_employee values (5, 'Smith', 38, 215000);
 
INSERT INTO t_department (dept_id, dept_name) VALUES (12, 'IT');
INSERT INTO t_department (dept_id, dept_name) VALUES (62, 'Sales');
INSERT INTO t_department (dept_id, dept_name) VALUES (32, 'Admin');
INSERT INTO t_department (dept_id, dept_name) VALUES (42, 'HR');