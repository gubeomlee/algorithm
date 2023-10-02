-- 코드를 입력하세요
select car_id, availability
from(
    select car_id, availability, count(*) over (partition by car_id) count
    from (
        select distinct car_id, 
            case 
                when date '2022-10-16' between start_date and end_date then '대여중'
                else '대여 가능'
                end as availability
        from car_rental_company_rental_history
    )
)
where count = 1 or availability = '대여중'
order by car_id desc; 