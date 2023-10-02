-- 코드를 입력하세요
SELECT b.category, sum(sales) total_sales
from book b join book_sales s 
on b.book_id = s.book_id
where extract(month from s.sales_date) = 1
group by category
order by category; 