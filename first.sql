create table employee(empno int,ename varchar(20),sal float);


select * from bluelotus.employee;

#insert the multiple records
insert into bluelotus.employee values(1041,'martin',6000),
									(1031,'allen',5000),(1021,'gopal',4000);


select * from employee;

describe employee;
# add new columns  to existing table using alter add
# syntax alter table add (columnname datatype,columname datatype);

alter table employee add (JOB varchar(20),mobileno int);
describe employee;

# modify the columndatatype/columnsize increase or decrease --alter modify
#syntax: alter table tableName modify columname datatype
#increasing the size of the ename column
alter table employee modify ename varchar(30);
#change the column datatype int to float  of mobileno column
alter table employee modify mobileno float;

#alter rename ,change the columns name
#sytnax: alter table tableName rename [column] oldcolumnanme to new columname;
#change the column name job to designation
alter table employee rename column job to designation;

#alter drop ,drop the column
#sytnax: alter table tableName drop [column] columnName;
#drop the column name mobileno;
alter table employee drop column mobileno;


#alter adding constraints to table
#syntax: alter table tablename add [constraint_name] primary key|check|unique|foreign key
alter table employee add primary key(empno);

describe emp;

#rename a table (DDL)
#syntax: rename table oldtablename to newtablename;
rename table employee to emp;

select * from emp;

#truncate table tableName;
#remove all records at time permanently we cannot restore
truncate table emp;

#drop table tablename [casecade];
drop table emp;

show tables;






