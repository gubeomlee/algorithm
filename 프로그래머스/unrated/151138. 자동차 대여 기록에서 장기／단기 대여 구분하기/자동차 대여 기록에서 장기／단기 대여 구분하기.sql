-- 코드를 입력하세요
SELECT history_id, car_id, to_char(start_date, 'yyyy-mm-dd') start_date, to_char(end_date, 'yyyy-mm-dd') end_date, 
    case
        when end_date - start_date + 1 >= 30 then '장기 대여' 
        else '단기 대여'
    end as rent_type
from car_rental_company_rental_history
where extract(month from start_date) = 9
order by history_id desc; 