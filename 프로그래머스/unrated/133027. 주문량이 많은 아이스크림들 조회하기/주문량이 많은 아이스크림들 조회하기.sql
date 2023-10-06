-- 코드를 입력하세요
SELECT flavor 
from (
    select f.flavor, (f.total_order + j.total_order) total_order
    from first_half f join (
        select flavor, sum(total_order) total_order
        from july 
        group by flavor
    ) j 
    on f.flavor = j.flavor 
    order by total_order desc 
)
where rownum <= 3; 
