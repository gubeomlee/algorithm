-- 코드를 입력하세요
SELECT hour, count(hour) count 
from (
    select to_number(to_char(datetime, 'hh24')) hour
    from animal_outs
)
where 9 <= hour and hour <= 19 
group by hour
order by hour; 
