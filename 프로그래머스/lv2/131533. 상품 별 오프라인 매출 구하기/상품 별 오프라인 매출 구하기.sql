-- 코드를 입력하세요
select p.product_code, p.price * s.sum sales
from product p
join (
    select product_id, sum(sales_amount) sum
    from offline_sale
    group by product_id
) s on p.product_id = s.product_id
order by sales desc, product_code;
