use bluelotus;
select * from bluelotus.emp;

select * from bluelotus.emp where comm is null;

select * from bluelotus.emp where comm is not null;

select * from emp where sal>=1500 and sal<=3000;

select * from emp where sal between 1500 and 3000;

select * from emp where sal=1500 or sal=3000;

select * from emp where sal in(1500,3000);

select ename from emp;

select * from emp where ename like 's%';

select * from emp where ename like 'A_l%';

select * from emp where ename like '%t%';

select max(sal) as maxSal from emp;

select max(sal) 'maxSal' from emp;
#column alias names
select max(sal) as "maxSal" from emp;

select min(sal) minsal,max(sal) as maxSal,sum(sal) as "sumSal",avg(sal) as avg,count(*) as countval from emp;

select count(*) as noofrecords from emp;

select count(comm) as ct from emp; 

select * from emp where deptno=10;

select deptno,sum(sal) from emp  group by deptno order by deptno;

select deptno,sum(sal),count(*) as noOfEmployees from emp  group by deptno order by deptno;

select deptno,sum(sal),count(*) as noOfEmps from emp  group by deptno having noOfEmps>3;

select deptno,job,sum(sal),count(*) noOfEmpls from emp group by deptno,job;

select * from emp where deptno=20 and job='MANAGER';


select * from emp order by sal;

select * from emp order by sal desc;

select * from emp order by 6;


create table dept_u1 as select * from dept;

create table dept_u2 as select * from dept;

insert into dept_u1 values(50,'Hr','Newjersey');
insert into dept_u2 values(60,'Testing','Texas');
select * from dept_u1;
select * from dept_u2;

select * from dept_u1
union
select * from dept_u2; #union

select * from dept_u1
union all
select * from dept_u2;


#minus and intersect















