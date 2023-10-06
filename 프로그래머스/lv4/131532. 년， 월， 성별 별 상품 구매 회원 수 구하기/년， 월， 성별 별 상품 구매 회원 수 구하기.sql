-- 코드를 입력하세요
SELECT extract(year from s.sales_date) year, extract(month from s.sales_date) month, i.gender, count(distinct gender) users
from user_info i join online_sale s 
on i.user_id = s.user_id 
where i.gender is not null 
group by extract(year from s.sales_date), extract(month from s.sales_date), i.gender
order by year, month, gender;