-- 코드를 입력하세요
SELECT to_char(sales_date, 'yyyy-mm-dd') sales_date, product_id, user_id, sales_amount
from(
    select user_id, product_id, sales_amount, sales_date
    from online_sale
    where extract(month from sales_date) = 3
    
    union 
    
    select null as user_id, product_id, sales_amount, sales_date
    from offline_sale
    where extract(month from sales_date) = 3
)
order by sales_date, product_id, user_id