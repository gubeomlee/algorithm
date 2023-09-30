-- 코드를 입력하세요
SELECT category, count(category) products
from (
    select substr(product_code, 0, 2) category
    from product 
)
group by category
order by category; 