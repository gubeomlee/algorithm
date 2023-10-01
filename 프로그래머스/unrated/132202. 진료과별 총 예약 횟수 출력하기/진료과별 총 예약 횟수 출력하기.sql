-- 코드를 입력하세요
SELECT code "진료과코드", count(code) "5월예약건수"
from(
    select mcdp_cd code
    from appointment
    where extract(month from apnt_ymd) = 5
)
group by code
order by count(code), code; 