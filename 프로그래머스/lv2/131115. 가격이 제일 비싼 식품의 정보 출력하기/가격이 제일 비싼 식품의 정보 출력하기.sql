-- 코드를 입력하세요
SELECT *
from(
    select *
    from food_product
    order by price desc
)
where rownum = 1;