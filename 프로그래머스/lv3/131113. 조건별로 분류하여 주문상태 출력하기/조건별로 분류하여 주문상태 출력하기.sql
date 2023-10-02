-- 코드를 입력하세요
SELECT order_id, product_id, nvl2(out_date, to_char(out_date, 'yyyy-mm-dd'), '') out_date,
    case 
        when date '2022-05-01' >= out_date then '출고완료'
        when date '2022-05-01' < out_date then '출고대기'
        when out_date is null then '출고미정'
    end as 출고여부 
from food_order
order by order_id; 