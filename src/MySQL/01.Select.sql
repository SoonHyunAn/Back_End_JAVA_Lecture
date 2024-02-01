################################################################
#
# 데이터 조작 언어 (DML: Data Manipulation Language)
#
################################################################

SHOW DATABASES;
USE world;
SHOW TABLES;
DESC city;

/*
    * 1. Select

    SELECT 필드명
        FROM 테이블명
        JOIN 테이블명
        ON 조인 조건
        WHERE 조회 조건
        GROUNP BY 필드명 
        HAVING 그룹 조건
        ORDER BY 필드명 순서
        LIMIT 숫자 OFFSET 숫자;
*/

SELECT * FROM city; 
SELECT `name`, population FROM city LIMIT 10; # 필드명을 보존하고 싶을 때 'back quote' 사용

/*
*  1-1. 조회 조건: WHERE
*/
SELECT * FROM city WHERE countrycode='KOR'; 
SELECT * FROM city WHERE population >= 9000000;
SELECT * FROM city WHERE countrycode='KOR' AND population >= 1000000;
SELECT DISTINCT district FROM city WHERE countrycode='KOR'; # DISTINCT 중복 제거(고유한 값)

# 수도권 도시(서울, 인천, 경기)
SELECT * FROM city
    WHERE district = 'Seoul'OR district = 'Inchon' OR district = 'Kyonggi';
SELECT * FROM city
    WHERE district IN ('Seoul', 'Inchon', 'Kyonggi');

# 경기도에서 인구수가 홀수인 도시
SELECT * FROM city WHERE district = 'Kyonggi' AND population % 2 = 1;

# 국내에서 인구수가 50~100만인 도시
SELECT * FROM city WHERE countrycode='KOR'
    AND population >= 500000 AND population <= 1000000;
SELECT * FROM city WHERE countrycode='KOR' 
    AND population between 500000 AND 1000000;

# 충청남북도의 도시
SELECT * FROM city WHERE district IN ('Chungchongbuk', 'Chungchongnam');
SELECT * FROM city WHERE district LIKE 'Chungchong%'; 
# %: 임의의 문자열을 의미함. 즉 저 자리는 뭐가 들어가도 상관없음
# LIKE: %를 사용해 DB를 긁어올 때 사용

/*
*  1-2. 순서(Order) : ASC(Ascending: 오름차순, default), DESC(Descending: 내림차순)
*/
# 인구수가 900만 이상인 도시를 인구수의 내림차순으로 조회
SELECT * FROM city WHERE population >= 9000000
    ORDER BY population DESC;

# 국내에서 인구수가 50~100만인 도시를 지역 오름차순, 인구수 내림차순으로 조회
SELECT * FROM city WHERE countrycode='KOR'
    AND population >= 500000 AND population <= 1000000
	ORDER BY district ASC, population DESC;

# 국내에서 인구수가 50~100만인 도시를 지역, 인구수 내림차순으로 조회
SELECT * FROM city WHERE countrycode='KOR'
    AND population >= 500000 AND population <= 1000000
	ORDER BY district, population DESC;

/*
*  1-3. 갯수 
*/
# 전세계에서 인구수 top 10
SELECT * FROM city ORDER BY population DESC LIMIT 10;

# 국내 인구수 top 5
SELECT * FROM city WHERE countrycode='KOR' 
ORDER BY population DESC LIMIT 5;

# 국내 인구수 top 11~20
SELECT * FROM city WHERE countrycode='KOR' 
    ORDER BY population DESC 
    LIMIT 10 OFFSET 10;

# 미국 인구수 top 11~20
SELECT * FROM city WHERE countrycode='USA' 
    ORDER BY population DESC 
    LIMIT 10 OFFSET 10;

/*
*  1-4. 함수 
*/
# 현재 날짜와 시각
SELECT now();

# 국내 도시의 갯수 - 레코드의 갯수
SELECT count(*) FROM city WHERE countrycode='KOR'; 

# 최대, 최소 - 국내 도시중 인구수 최대, 최소 도시
SELECT MAX(population), MIN(population) from city WHERE countrycode = 'KOR';     # WHERE에서 사용 불가

# 국내 도시의 인구 평균
SELECT AVG(population) from city WHERE countrycode = 'KOR';         # 소수점 표시
SELECT round(AVG(population)) from city WHERE countrycode = 'KOR';  # 소수점 X

# Aliasing
SELECT ROUND(AVG(population)) AS avgPop from city   # 결과값의 이름을 지정 (AS - 생략가능)
    WHERE countrycode = 'KOR';    
SELECT count(*) NumCity FROM city WHERE countrycode='KOR'; 

/*
*  1-5. 그룹핑 
*/
# 국내 광역시도별 인구수의 평균을 내림차순으로 조회
SELECT district, ROUND(AVG(population)) avgPop FROM city 
    WHERE countrycode='KOR' GROUP BY district ORDER BY avgPop desc;

# 도시의 갯수가 많은 나라 top 10
SELECT countrycode, count(*) NumCity from city
    GROUP by countrycode 
    ORder by NumCity desc
    LIMIT 10;

# 충청남도의 도시 이름
SELECT `name` cites FROM city WHERE district = 'Chungchongnam';
SELECT GROUP_CONCAT(`name`) cites FROM city WHERE district = 'Chungchongnam'; # 한줄로

# 국내 광역시도 이름
SELECT DISTINCT district FROM city WHERE countrycode='KOR';
SELECT GROUP_CONCAT(district) districts FROM city WHERE countrycode='KOR';

/*
*  1-6. 그룹핑 조건
*/
# 국내 도별(도시의 개수가 2개 이상 - 광역시 제외) 인구수의 평균을 내림차순으로 조회
SELECT district, ROUND(AVG(population)) avgPop FROM city 
    WHERE countrycode='KOR'
    GROUP BY district 
    HAVING count(*) >= 2 # 그룹핑 조건 - 도시의 개수가 2개 이상
    ORDER BY avgPop desc;

# 국내 도시의 개수가 5개 이상인 도를 내림차순으로 
SELECT district, count(*) NumCity from city
    WHERE countrycode='KOR'
    GROUP BY district 
    HAVING NumCity >= 5
    ORDER by NumCity desc;

# 국내 도시의 갯수가 5개 이상인 도의 평균 도시 인구수를 인구 평균 내림차순으로
SELECT district, ROUND(AVG(population)) avgPop from city
    WHERE countrycode='KOR'
    GROUP BY district 
    HAVING COUNT(*) >= 5
    ORDER by avgPop desc;

# 도시 갯수가 100개 이상인 국가의 도시 인구 평균을 내림차순으로 정렬
SELECT countrycode, ROUND(AVG(population)) avgPop from city
    GROUP BY countrycode
    HAVING COUNT(*) >= 100
    ORDER by avgPop desc;

/*
*  1-7. 조인
*/
# 인구수가 800만보다 큰 도시의 국가명, 도시명, 인구수
SELECT country.Name, city.name, city.population from city
    INNER join country on city.countrycode = country.Code
    WHERE city.population > 8000000;

SELECT r.name contryName, l.Name cityName, l.Population FROM city l
	JOIN country r        # INNER 는 생략가능
	ON l.CountryCode=r.Code
	WHERE l.Population > 8000000;

# 양쪽 테이블에서 필드명이 유니크 하면 Continent 처럼 테이블 이름을 지정하지 않아도 된다.
SELECT Continent, r.name contryName, l.Name cityName, l.Population FROM city l 
	JOIN country r
	ON l.CountryCode=r.Code
	WHERE l.Population > 8000000;

# 아시아 대륙에서 인구수가 많은 도시 Top 10
SELECT Continent, r.Name countryName, l.Name cityName, l.Population from city l
    join country r
    on l.CountryCode=r.Code
    WHERE r.Continent = 'Asia'
    ORDER BY l.population DESC
	LIMIT 10;

# 아시아 국가의 국가명과 공식 언어
SELECT * FROM countrylanguage WHERE countrycode = 'IND';

SELECT l.Name, r.`Language` FROM country l
	JOIN countrylanguage r
	ON l.Code = r.CountryCode
	WHERE l.Continent = "Asia" AND r.IsOfficial='T';

# 아시아 대륙에서 인구수가 가장 많은 Top 10 나라에서 사용하는 공식언어
SELECT l.Name, r.`Language` FROM country l
	JOIN countrylanguage r
	ON l.Code = r.CountryCode
	WHERE l.Continent = "Asia" AND r.IsOfficial='T'
	ORDER BY l.Population desc
	LIMIT 10;

# 3개의 테이블 조인
# 아시아 대륙에서 인구수가 가장 많은 Top 10 도시에서 사용하는 공식언어
Select r.Name countryName, l.Name cityName, l.Population, o.`Language` from city l
    join country r on l.CountryCode = r.Code
    join countrylanguage o on l.CountryCode = o.CountryCode
    WHERE r.Continent = "Asia" AND o.IsOfficial='T'
    ORDER BY l.Population desc
	LIMIT 10;