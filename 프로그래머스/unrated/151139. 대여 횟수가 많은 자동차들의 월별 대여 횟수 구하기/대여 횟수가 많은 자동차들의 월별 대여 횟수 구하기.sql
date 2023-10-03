-- 코드를 입력하세요
SELECT extract(month from h.start_date) month, h.car_id, count(*) records
from car_rental_company_rental_history h join (
    select car_id
    from car_rental_company_rental_history
    where extract(month from start_date) between 8 and 10
    group by car_id
    having count(*) >= 5
) s
on h.car_id = s.car_id
where extract(month from h.start_date) between 8 and 10
group by extract(month from h.start_date), h.car_id
order by month, car_id desc;