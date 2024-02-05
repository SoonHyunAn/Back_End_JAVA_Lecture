/*
	4. 과제 
*/

# 1. 2009년도에 데뷔한 걸그룹의 힛트송은?
# (걸그룹 이름, 데뷔일자, 힛트송 제목)
SELECT l.name 걸그룹이름, l.debut 데뷔일자, r.title 힛트송제목 FROM girl_group l
	JOIN song r
	ON l.hit_song_id = r.sid
	WHERE Year(l.debut) = 2009; 	
	# WHERE l.debut LIKE "2009%"; // WHERE l.debut BETWEEN DATE = "2009-01-01" AND DATE = "2009-12-31"; 


# 2. 데뷔일자가 빠른 5개 그룹의 힛트송은?
# (걸그룹 이름, 데뷔일자, 힛트송 제목)
SELECT l.name 걸그룹이름, l.debut 데뷔일자, r.title 힛트송제목 FROM girl_group l
	JOIN song r
	ON l.hit_song_id = r.sid
	ORDER BY l.debut # ASC 생략 가능
	LIMIT 5;

# 3. 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?
SELECT Continent 대륙명, COUNT(*) 국가숫자, ROUND((SUM(GNP))) GNP합, ROUND(AVG(GNP)) GNP평균 FROM country
	GROUP BY Continent;


# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
#       (대륙명, 국가명, 도시명, 인구수)
SELECT r.Continent 대륙명, r.name 국가명, l.name 도시명, l.population 인구수 FROM city l
	JOIN country r
	ON r.Code = l.CountryCode
	WHERE r.Continent = 'Asia'
	ORDER BY l.population DESC
	LIMIT 10;


# 5. 전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?
#       (국가명, GNP, 언어명)
SELECT l.name 국가명, l.GNP GNP, r.Language 언어명 FROM countrylanguage r
	JOIN country l
	ON l.Code = r.CountryCode
	WHERE r.IsOfficial = 'T'
	ORDER BY l.GNP DESC
	LIMIT 10;