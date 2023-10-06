-- 코드를 입력하세요
SELECT p.member_name, r.review_text, to_char(r.review_date, 'yyyy-mm-dd') review_date
from member_profile p join rest_review r 
on p.member_id = r.member_id 
where p.member_id in (
    select member_id 
    from rest_review 
    group by member_id 
    having count(*) = (select max(count) from (select count(*) count from rest_review group by member_id))
)
order by review_date, review_text; 