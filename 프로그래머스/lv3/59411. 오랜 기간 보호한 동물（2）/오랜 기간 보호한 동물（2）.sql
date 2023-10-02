-- 코드를 입력하세요
SELECT animal_id, name
from(
    select i.animal_id, i.name
    from animal_ins i join animal_outs o
    on i.animal_id = o.animal_id
    order by (o.datetime - i.datetime) desc
)
where rownum <= 2; 