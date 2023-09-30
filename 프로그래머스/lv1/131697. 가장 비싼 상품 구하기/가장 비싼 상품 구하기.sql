-- 코드를 입력하세요
SELECT price max_price 
from (
    select price 
    from product
    order by price desc
)
where rownum = 1; 