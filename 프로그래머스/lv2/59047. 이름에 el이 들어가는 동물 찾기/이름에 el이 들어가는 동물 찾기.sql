-- 코드를 입력하세요
SELECT animal_id, name 
from animal_ins
where (name like '%el%' or name like '%EL%' or name like '%El%' or name like '%eL%') and animal_type = 'Dog'
order by name; 