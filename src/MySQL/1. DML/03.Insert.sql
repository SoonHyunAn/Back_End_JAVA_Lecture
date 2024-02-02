################################################################
#
# 데이터 조작 언어 (DML: Data Manipulation Language)
#
################################################################

/*
    * 3. Insert

        Insert into 테이블 (필드명1, 필드명2, ..., 필드명n)
            values (값1, 값2, ..., 값n) [, (값1, 값2, ..., 값n)];

        Insert into 테이블 values (모든 필드의 값) [, (모든 필드의 값)];

*/
# 경기도 화성시, 의정부시 추가
Insert into kcity 
    values (default, '화성', 'KOR', 'Kyonggi', 900000), (default, '의정부', 'KOR', 'Kyonggi', 200000);

# 강원도 속초시 추가 - id 값은 default value 활용 (auto_increment 포함)
 INSERT INTO kcity (name, countrycode, district) values ('속초', 'KOR', 'Kang-won');

# 경기도 광주시 추가 - auto_increment 속성이 있어도 설정가능
 INSERT INTO kcity values (2600, '광주', 'KOR', 'Kyonggi', 300000);
