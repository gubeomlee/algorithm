-- 코드를 입력하세요
select h.history_id, round(h.fee*(100 - nvl(p.rate, 0)) / 100) fee
from (
    select h.history_id, (h.end_date - h.start_date + 1) * c.daily_fee fee, 
        case 
            when (h.end_date - h.start_date + 1) >= 90 then '90일 이상'
            when (h.end_date - h.start_date + 1) >= 30 then '30일 이상'
            when (h.end_date - h.start_date + 1) >= 7 then '7일 이상'
        end duration_type
    from car_rental_company_car c 
    join car_rental_company_rental_history h on c.car_id = h.car_id
    where c.car_type = '트럭'
) h 
left outer join (
    select duration_type, to_number(regexp_substr(discount_rate, '\d+')) rate
    from car_rental_company_discount_plan
    where car_type = '트럭'
) p on h.duration_type = p.duration_type
order by fee desc, history_id desc; 