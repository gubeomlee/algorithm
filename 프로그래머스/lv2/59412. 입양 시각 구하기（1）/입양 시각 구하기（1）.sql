-- 코드를 입력하세요
SELECT to_number(to_char(datetime, 'hh24')) hour, count(*) count
from animal_outs
where to_number(to_char(datetime, 'hh24')) between 9 and 19 
group by to_number(to_char(datetime, 'hh24'))
order by hour;