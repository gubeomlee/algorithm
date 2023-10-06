-- 코드를 입력하세요
SELECT y.cart_id
from (
    select cart_id
    from cart_products 
    where name = 'Yogurt'
) y join (
    select cart_id 
    from cart_products 
    where name = 'Milk'
) m
on y.cart_id = m.cart_id 
order by cart_id