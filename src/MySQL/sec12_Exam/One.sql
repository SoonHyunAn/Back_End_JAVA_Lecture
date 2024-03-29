1) 국내 광역시도별 도시의 개수가 많은 5개 광역시도를 조회하는 SQL. [10]
SELECT District, count(District) FROM city
    WHERE CountryCode='KOR'
    GROUP BY District
    ORDER BY COUNT(District) DESC
    LIMIT 5;

2) 인구수가 800만 보다 큰 도시의 국가명, 도시명, 인구수를 조회하는 SQL. [10]
SELECT r.Name, l.Name, l.Population FROM city l
    JOIN country r
    ON l.CountryCode =r.Code
    WHERE l.Population > 8000000
    ORDER BY  l.Population DESC;

3) 아시아 대륙에서 인구수가 가장 많은 도시 Top 10을 조회하는 SQL [10]
(국가명, 도시명, 인구수)
SELECT r.name, l.Name, l.Population FROM city l
    JOIN country r
    ON l.CountryCode =r.Code
    WHERE r.Continent ='Asia'
    ORDER BY  l.Population DESC
    LIMIT 10;

4) 강원도(Kang-won)에 인구가 120000인 태백시를 삽입하는 SQL. [10]
INSERT INTO city (Name, CountryCode, District, Population)
    values ('태백', 'KOR', 'Kang-won', 120000);

5) Chunchon 시의 이름과 인구수를 춘천과 30만으로 변경하는 SQL. [10]
Update city SET population = 300000
    where NAME='Chunchon';
