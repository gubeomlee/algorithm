-- 코드를 입력하세요
select d.hour, nvl(a.count, 0) count
from (
    select level - 1 hour 
    from dual
    connect by level <= 24
) d left outer join (
    select to_number(to_char(datetime, 'hh24')) hour, count(*) count
    from animal_outs 
    group by to_char(datetime, 'hh24')
) a
on d.hour = a.hour
order by hour
