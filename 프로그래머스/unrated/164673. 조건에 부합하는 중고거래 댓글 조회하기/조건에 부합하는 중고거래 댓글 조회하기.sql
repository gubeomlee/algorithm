-- 코드를 입력하세요
SELECT b.title title, b.board_id board_id, r.reply_id reply_id, r.writer_id writer_id, r.contents contents, to_char(r.created_date, 'yyyy-mm-dd') created_date
from used_goods_board b, used_goods_reply r
where b.board_id = r.board_id and extract(year from b.created_date) = 2022 and extract(month from b.created_date) = 10
order by r.created_date, b.title; 