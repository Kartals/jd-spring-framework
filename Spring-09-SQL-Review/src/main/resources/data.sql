select *
from departments;

select *
from employees;

select *
from regions;

select employee_id, first_name, department
from employees;

select *
from employees
where department='Sports';

select *
from employees
where department like  '%nit%';

select *
from employees
where department like  'F%nit%';

select *
from employees
where salary>100000;

select *
from employees
where salary < 100000;

select *
from employees
where salary>=100000;

select *
from employees
where salary<=100000;

select *
from employees
where department='Clothing'
and salary>90000;


select *
from employees
where department='Clothing'
and salary>90000
and region_id=2;

select *
from employees
where department='Clothing'
or salary>90000;

select *
from employees
where salary<40000
and (department='Clothing'
or department='Pharmacy');

select *
from employees
where department !='Sports';

select *
from employees
where department <>'Sports';

select *
from employees
where not department <>'Sports';

select *
from employees
where email is null;

select *
from employees
where email is not null;

select *
from employees
where department='Sports'
or department='First Aid'
or department='Toys'
or department='Garden';

select *
from employees
where department in ('Sports','First Aid', 'Toys');

select *
from employees
where salary between 80000 and 100000;

select first_name, email
from employees
where gender='F'
and department='Tools'
and salary >110000
and email is not null;

select first_name,hire_date, salary, department
from employees
where salary>165000
or (department='Sports'
and gender='M');

select *
from employees
order by employee_id DESC;

select distinct department
from employees;

select distinct department
from employees
fetch first 3 rows only ;

select salary as yearly_salary
from employees;


select *
from students
order by age DESC
fetch first 4 rows only ;


select *
from students
where  age<=20
and  (student_no between 3 and 5 or student_no=7)
or (age>20 and student_no>=4);


select upper(first_name), lower(department)
from employees;

select length(first_name)
from employees;


select trim ('   Hello There   ');

select length ('   Hello There   ');
select length (trim('   Hello There   '));

select first_name || ' '|| last_name as full_name
from employees;

select (salary>140000)
from employees;

select (salary>140000) as hight_paid
from employees
order by salary DESC ;


select department, (department like '%oth%')
from employees;

select 'This is test data' as test_data;

select substring('this is test data' from 1 for 4) as test_data;

select substring('this is test data' from 9) as test_data;

select department, replace(department, 'Clothing', 'Clothes')
from departments;

select replace (department, 'Grocery', 'Kiosk')
from departments;


select *
from employees
where salary=(select max(salary)
from employees);

select max(salary)
from employees;

select min(salary)
from employees;

select avg(salary)
from employees;

select round(salary)
from employees;

select count(email)
from employees;

select count(employee_id)
from employees;

select sum(salary)
from employees
where department='Clothing';

select *
from professors;

select last_name,upper(substring(department for 3)) as department, salary,hire_date
from professors;

select max(salary), min(salary)
from professors
where last_name !='Wilson';


select count(*), department
from employees
group by department;

select sum(salary) as total_salary, department
from employees
group by department;

select round(avg(salary)) as average_salary, department
from employees
group by department;

select min(salary), max(salary), avg(salary),count(*) as total_number_employess, department
from employees
group by department;

select *
from employees;

select sum(salary)as total_salary, department
from employees
where region_id in(4,5,6)
group by department;

select department, count(*)
from employees
group by department
order by department;


select department, count(*)
from employees
group by department
having count(*)<36
order by department;



--show all unique domain and number of employees
select count(*), substring(email, position('@' in email) +1) email_domain
from employees
where email is not null
group by email_domain;

select d.department
from employees e, departments d;

select department
from employees;

select  *
from employees
where department not in (select department from departments);

select *
from (select * from employees where salary>150000) a;

--returns all employees that work in Electrics division
select *
from employees
where department in (select department from departments where division='Electronics');

--returns all employees work in ASIA or CANADA make more than 130000
select *
from employees
where region_id in (select region_id from regions where salary>130000 and (country='ASIA' or country='Canada'));

--First name where work in Asia or Canadada and how much less making from the highest employee in the company
select first_name, (select max(salary) from employees)-salary
from employees
where region_id in (select region_id from regions where (country='ASIA' or country='Canada'));

--write a query that all of those employers that work in the kids division And
--the dates at which those employees were hired is greater than all of the hire_dates employees
--who work in the maintenance department

select *
from employees
where department= any (select department from departments where division='Kids')
and hire_date > all (select hire_date from employees where department='Maintenance');

--write a query that returns the names of those students that are taking the courses Physics and US History

select student_name
from students
where student_no in (select student_no from student_enrollment where course_no in(select course_no from courses where course_title in('Physics', 'US History')));

select first_name, salary,
case
    when salary<10000 then 'UNDER PAID'
    when salary<50000 then 'PAID WELL'
    else 'UNPAID'
end as category
from employees;

select category,count(*)
from (select first_name,
             case
                 when salary<100000 then 'UNDER PAID'
                 when salary>100000 and salary<160000 then 'PAID WELL'
                 else 'EXECUTIVE'
                 end as category from employees) a
group by category;

select first_name, country
from employees e, regions r
where r.region_id=e.region_id;

select first_name, email, division, d.department
from employees e, departments d, regions r
where e.department=d.department
and e.region_id=r.region_id;

select distinct department from employees;

select first_name, email, division
from employees e inner join departments d
on e.department = d.department
where email is not null ;

select first_name, email, division, country
from employees e inner join departments d
on e.department = d.department inner join regions r
on e.region_id = r.region_id
where email is not null ;

select distinct e.department, d.department
from employees e left join departments d
on e.department = d.department;

select distinct e.department, d.department
from employees e right join departments d
on e.department = d.department;

select distinct e.department, d.department
from employees e full join departments d
on e.department = d.department;

select department
from  employees
union
select department
from departments;

select department
from  employees
union
select department
from departments
union
select country
from regions;

select department
from  employees
union all
select department
from departments;

select department
from  employees
except
select department
from departments;






