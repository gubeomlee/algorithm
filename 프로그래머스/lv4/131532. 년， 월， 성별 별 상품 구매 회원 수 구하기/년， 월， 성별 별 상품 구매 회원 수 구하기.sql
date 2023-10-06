-- 코드를 입력하세요
SELECT s.year, s.month, i.gender, count(gender) users
from user_info i join (
    select user_id, extract(year from sales_date) year, extract(month from sales_date) month
    from online_sale
    group by user_id, extract(year from sales_date), extract(month from sales_date)
) s 
on i.user_id = s.user_id 
where i.gender is not null 
group by s.year, s.month, i.gender
order by year, month, gender;