-- 코드를 입력하세요
SELECT i.food_type, i.rest_id, i.rest_name, i.favorites 
from rest_info i join (
    select food_type, max(favorites) favorites
    from rest_info 
    group by food_type
) f
on i.food_type = f.food_type and i.favorites = f.favorites
order by i.food_type desc 