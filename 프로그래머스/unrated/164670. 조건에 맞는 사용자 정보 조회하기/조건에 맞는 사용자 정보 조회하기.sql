-- 코드를 입력하세요
SELECT distinct u.user_id, u.nickname, u.city || ' ' || u.street_address1 || ' ' || street_address2 전체주소, substr(tlno, 1, 3) || '-' || substr(tlno, 4, 4) || '-' || substr(tlno, 8, 4) 전화번호
from used_goods_board b join used_goods_user u 
on b.writer_id = u.user_id
where b.writer_id in (
    select writer_id
    from used_goods_board
    group by writer_id
    having count(writer_id) >= 3
)
order by user_id desc;