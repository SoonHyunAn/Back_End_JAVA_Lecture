################################################################
#
# 데이터 정의 언어 (DDL: Data Definition Language)
#
################################################################

/*
    1. 테이블 생성
        ERMaster 활용
        erm 파일 생성 수 DDL로 내보내기 하기.
        기본키 - 중복 불가능한 값

    하이디 쿼리에서 sql 파일을 불러와서 실행시킬 수있음.
*/

# 주소록(addrBook) 테이블 생성 - 이름, 전화번호, 이메일, 생일
CREATE TABLE addrBook(
	aid int NOT NULL AUTO_INCREMENT,
	name varchar(16) NOT NULL,
	tel varchar(16),
	email varchar(32),
	birthDay date,
	PRIMARY KEY (aid));

# 사용자(users) 테이블 생성 - uid, pwd, uname, email, regDate, isDeleted 

CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(16) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	aid int NOT NULL,
	PRIMARY KEY (uid)
);

# 연결

ALTER TABLE users
	ADD FOREIGN KEY (aid)
	REFERENCES addrBook (aid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

/*
    2. 테이블 조회
*/

# 테이블 목록 확인
SHOW TABLES;

# 테이블 구조
DESC users; # discribe

/*
    3. 테이블 삭제
*/


############
# ++ view 생성 (읽기 전용)
############
create view LargeCity as select * from city  
    where population>7000000;

# LargeCity view 삭제
drop view LargeCity;

# dataTable 삭제
drop table dataTable;

# kcity 테이블의 모든 데이터 삭제
truncate kcity;

/*
    3. 테이블 이름 변경
*/

# 이름 변경
rename table kcity to korCity;

/*
 * 5. 테이블 구조 변경
 */

 # users 테이블에서 email 뒤에 tel 추가
 Alter table users
	add tel varchar(16) not null after email;

 # users 테이블에서 tel 필드의 not null 제거
  Alter table users
	change tel tel varchar(16);

################################################################
#
# 테이블 조인 (table join)
#
################################################################

/*
	1. 테이블 생성
*/

# song table
create table if not Exists song(
	sid int PRIMARY KEY AUTO_INCREMENT,
	title varchar(32) not null,
	lyrics varchar(64)
) AUTO_INCREMENT = 101; # 시작 번호 지정

# girl_group table
create table if not Exists girl_group(
	gid int PRIMARY KEY AUTO_INCREMENT,
	name varchar(32) not null,
	debut date not null,
	hit_song_id int
) AUTO_INCREMENT = 1001;

/*
	2. 데이터 입력
*/

# song table
insert into song (title, lyrics) values
('Tell Me', 'tell me tell me tetetete tel me'),
   ('Gee', 'GEE GEE GEE GEE GEE BABY BABY'),
   ('미스터', '이름이 뭐야 미스터'), 
   ('Abracadabra', '이러다 미쳐 내가 여리여리'),
   ('8282', 'Give me a call Baby baby'), ('기대해', '기대해'),
   ('I Dont care', '다른 여자들의 다리를'), 
   ('Bad Girl Good Girl', '앞에선 한 마디 말도'), ('피노키오', '뉴예삐오'),
   ('별빛달빛', '너는 내 별빛 내 마음의 별빛'), 
   ('A', 'A 워오우 워오우워 우우우'),
   ('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고'), ('LUV', '설레이나요 '),
   ('짧은치마', '짧은 치마를 입고 내가 길을 걸으면'),
   ('위아래', '위 아래 위위 아래'), ('Dumb Dumb', '너 땜에 하루종일');


# girl_group table
insert into girl_group (name, debut, hit_song_id) values
	('원더걸스', '2007-02-10', 101),
   ('소녀시대', '2007-08-02', 102), ('카라', '2009-07-30', 103),
   ('브라운아이드걸스', '2008-01-17', 104), ('다비치', '2009-02-27', 105),
   ('2NE1', '2009-07-08', 106), ('f(x)', '2011-04-20', 108),
   ('시크릿', '2011-01-06', 109), ('레인보우', '2010-08-12', 110),
   ('애프터 스쿨', '2009-11-25', 120), ('포미닛', '2009-08-28', 121);

/*
	3. Join (먼저 쓴 테이블이 left) - 
*/
# Inner Join
select r.name, r.debut, l.title, l.lyrics from song l
	Join girl_group r									# Inner 생략
	on l.sid = r.hit_song_id;

# Left Join - 가수 부분이 깨짐 - 안씀
select r.name, r.debut, l.title, l.lyrics from song l
	left outer Join girl_group r						# Outer 생략 가능
	on l.sid = r.hit_song_id;

# Right Join  - 노래 부분이 깨짐 - 안씀
select r.name, r.debut, l.title, l.lyrics from song l
	right outer Join girl_group r						# Outer 생략 가능
	on l.sid = r.hit_song_id;

# Full outer join - 지원하지 않기 때문에 UNION으로 합침 (합집합)
select r.name, r.debut, l.title, l.lyrics from song l
	left outer Join girl_group r						# Outer 생략 가능
	on l.sid = r.hit_song_id
UNION 
select r.name, r.debut, l.title, l.lyrics from song l
	right outer Join girl_group r						# Outer 생략 가능
	on l.sid = r.hit_song_id;



