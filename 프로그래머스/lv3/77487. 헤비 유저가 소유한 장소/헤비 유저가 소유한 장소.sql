-- 코드를 입력하세요
SELECT p.id, p.name, p.host_id
from places p join (
    select host_id
    from places
    group by host_id
    having count(*) > 1
) c
on p.host_id = c.host_id
order by id; 
