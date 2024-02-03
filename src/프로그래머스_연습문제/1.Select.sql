1. 평균 일일 대여 요금 구하기
SELECT round(avg(DAILY_FEE)) AVERAGE_FEE from CAR_RENTAL_COMPANY_CAR
    where CAR_TYPE = "SUV"

2. 동물의 아이디와 이름
SELECT ANIMAL_ID, NAME from ANIMAL_INS
    order by ANIMAL_ID asc

3. 조건에 맞는 회원수 구하기
SELECT COUNT(*) USERS FROM USER_INFO
    WHERE AGE >= 20 AND AGE <= 29 AND YEAR(JOINED)=2021

4. 상위 n개 레코드
SELECT NAME from ANIMAL_INS
    order by DATETIME asc
    limit 1

5. 여러 기준으로 정렬하기
SELECT ANIMAL_ID, NAME, DATETIME from ANIMAL_INS
    order by NAME asc, DATETIME desc

6. 조건에 맞는 도서 리스트 출력하기
SELECT BOOK_ID, PUBLISHED_DATE from BOOK
    where CATEGORY='인문' AND YEAR(PUBLISHED_DATE) = 2021
    order by PUBLISHED_DATE asc

7. 어린 동물 찾기
SELECT ANIMAL_ID, NAME From ANIMAL_INS 
    where INTAKE_CONDITION != "Aged"
    Order by ANIMAL_ID asc;

8. 아픈 동물 찾기
SELECT ANIMAL_ID, NAME From ANIMAL_INS 
    where INTAKE_CONDITION = "Sick"
    Order by ANIMAL_ID asc;

9. 조건에 맞는 도서 리스트 출력하기
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') PUBLISHED_DATE from BOOK
    where CATEGORY='인문' AND YEAR(PUBLISHED_DATE) = 2021
    order by PUBLISHED_DATE asc;

10. 역순 정렬하기
SELECT NAME, DATETIME from ANIMAL_INS 
    order by ANIMAL_ID desc

11. 3월에 태어난 여성 회원 목록 출력하기
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') DATE_OF_BIRTH from MEMBER_PROFILE
    WHERE Month(DATE_OF_BIRTH) = 3 AND TLNO is not null AND GENDER = 'W'
    order by MEMBER_ID asc;

12. 인기있는 아이스크림
SELECT FLAVOR from FIRST_HALF
    order by TOTAL_ORDER desc, SHIPMENT_ID;

13. 12세 이하인 여자 환자 목록 출력하기
SELECT PT_NAME, PT_NO, GEND_CD, AGE, ifnull(TLNO,'NONE') from PATIENT
    where AGE <=12 and GEND_CD = 'W'
    order by AGE desc, PT_NAME;

14. 흉부외과 또는 일반외과 의사 목록 출력하기
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') HIRE_YMD from DOCTOR
    where MCDP_CD = 'CS' OR MCDP_CD = 'GS'
    order by HIRE_YMD desc, DR_NAME;

15. 조건에 부합하는 중고거래 댓글 조회하기
SELECT a.TITLE TITLE, a.BOARD_ID BOARD_ID, b.REPLY_ID REPLY_ID, b.WRITER_ID WRITER_ID, b.CONTENTS CONTENTS, DATE_FORMAT(b.CREATED_DATE, '%Y-%m-%d') CREATED_DATE from USED_GOODS_BOARD a
    JOIN USED_GOODS_REPLY b
    ON a.BOARD_ID = b.BOARD_ID
    WHERE YEAR(a.CREATED_DATE)=2022 AND MONTH(a.CREATED_DATE) = 10
    ORDER by b.CREATED_DATE asc, a.TITLE asc

16. 과일로 만든 아이스크림 고르기
SELECT a.FLAVOR from FIRST_HALF a
    JOIN ICECREAM_INFO b
    ON a.FLAVOR = b.FLAVOR
    where a.TOTAL_ORDER > 3000 AND b.INGREDIENT_TYPE = 'fruit_based'
    order by a.TOTAL_ORDER DESC;