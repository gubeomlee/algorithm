-- 코드를 입력하세요
SELECT u.user_id, u.nickname, b.total_sales
from (select writer_id, sum(price) total_sales
     from used_goods_board
     where status = 'DONE'
     group by writer_id
     having sum(price) >= 700000) b join used_goods_user u 
on b.writer_id = u.user_id 
order by total_sales; 
