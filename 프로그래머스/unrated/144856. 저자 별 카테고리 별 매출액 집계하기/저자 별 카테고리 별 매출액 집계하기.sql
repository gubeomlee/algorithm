-- 코드를 입력하세요
SELECT b.author_id, a.author_name, b.category, sum(b.price * s.sales) total_sales
from book b join (
    select book_id, sum(sales) sales
    from book_sales 
    where extract(month from sales_date) = 1 
    group by book_id
) s 
on b.book_id = s.book_id
join author a 
on b.author_id = a.author_id 
group by b.author_id, a.author_name, b.category
order by author_id, category desc 