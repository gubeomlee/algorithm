-- 코드를 입력하세요
SELECT u.user_id, u.nickname, b.sum total_sales
from (select writer_id, sum(price) sum
     from used_goods_board
     where status = 'DONE'
     group by writer_id     
     ) b join used_goods_user u
on b.writer_id = u.user_id
where b.sum >= 700000
order by b.sum;