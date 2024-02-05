################################################################
#
# 테이블 Export/Import
#
################################################################

/*
    1. secure_file_priv 확인
	
	C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\
*/
SHOW VARIABLES LIKE 'secure_file_priv';

/*
	2. Export (Table -> File) -- backup과 유사
*/
SELECT * FROM song INTO Outfile
	'C:/ProgramData/MySQL/MySQL Server 8.0/Upload/song.scv'
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '/n';
	
/*
	3. Import (File -> Table) -- backup과 유사
*/