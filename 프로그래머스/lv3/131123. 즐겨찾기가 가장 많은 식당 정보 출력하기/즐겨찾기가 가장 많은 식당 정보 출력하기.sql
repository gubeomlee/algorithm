-- 코드를 입력하세요
SELECT r.food_type, r.rest_id, r.rest_name, r.favorites
from rest_info r join (
    select food_type, max(favorites) favorites
    from rest_info
    group by food_type
) f
on r.food_type = f.food_type and r.favorites = f.favorites
order by food_type desc; 
