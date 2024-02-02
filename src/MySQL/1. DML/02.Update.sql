################################################################
#
# 데이터 조작 언어 (DML: Data Manipulation Language)
#
################################################################

/*
    * 2. Update

        Update 테이블
            SET 필드명1 = 값1, 필드명2 = 값2, ... , 필드명 N = 값 N
            WHERE 조건;         # 조건  - 프라이머리 키 = 값


*/
# 키 값에 따른 테이블 값을 수정 - ID 변경은 자제
Update kcity SET name = '수원', population = 1200000 where id = 2340;
Update kcity SET name = '용인', population = 1100000 where id = 2362;

# id 값이 2390 보다 큰 값을 수정
Update kcity SET population = population + 100000 where id > 2390;

# 
/*
*  
*/

