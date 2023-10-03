-- 코드를 입력하세요
select distinct car_id, 
    case 
        when car_id in (
            select car_id 
            from car_rental_company_rental_history 
            where date '2022-10-16' between start_date and end_date
        ) then '대여중'
        else '대여 가능'
    end as availability 
from car_rental_company_rental_history 
order by car_id desc; 