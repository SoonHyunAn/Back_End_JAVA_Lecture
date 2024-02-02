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