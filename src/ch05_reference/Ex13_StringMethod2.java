package ch05_reference;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Ex13_StringMethod2 {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요? 반갑습니다.";

		// 대소문자 변경
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		// 문자열 대치
		String str3 = str2.replace("안녕하세요", "안녕").replace("반갑습니다", "방가방가");
		System.out.println(str3);
		System.out.println(str3.replace("방가", "하이"));
		String regExp = str2.replaceAll("[?.]", "*");
		System.out.println(regExp);

		// 문자열 일부 발췌
		String dateTime = "2024-01-17 14:20:05";
		String date = dateTime.substring(0, 10);
		String time = dateTime.substring(11);
		System.out.println(date);
		System.out.println(time);

		String now = LocalDateTime.now().toString();
		System.out.println(now);
		date = now.substring(0, 10);
		time = now.substring(11, 19);
		System.out.println(date);
		System.out.println(time);

		// 주민등록번호로부터 생년월일 (yyyy-mm-dd 꼴) 추출
		String ssn1 = "880927-1234567", ssn2 = "010117-4123456";
		char ssn1Gender = ssn1.charAt(7);
		char ssn2Gender = ssn2.charAt(7);
		String ssn1Year = "";
		String ssn2Year = "";

		if (ssn1Gender == '1' || ssn1Gender == '2')
			ssn1Year = "19" + ssn1.substring(0, 2);
		else
			ssn1Year = "20" + ssn1.substring(0, 2);

		if (ssn2Gender == '1' || ssn2Gender == '2')
			ssn2Year = "19" + ssn2.substring(0, 2);
		else
			ssn2Year = "20" + ssn2.substring(0, 2);

		System.out.println(ssn1Year + "-" + ssn1.substring(2, 4) + "-" + ssn1.substring(4, 6));
		System.out.println(ssn2Year + "-" + ssn2.substring(2, 4) + "-" + ssn2.substring(4, 6));
		
		// 문자열을 분할해서 배열로 반환
		String fruitStr="감, 배, 귤, 밤";
		String[] fruits = fruitStr.split(", ");
		System.out.println(Arrays.toString(fruits));
		
		String fruitStr2="감, 배; 귤: 밤";
		String[] fruits2 = fruitStr2.split("[,;:] ");
		System.out.println(Arrays.toString(fruits2));
		
		String pathStr ="C:\\Tools\\jdk17\\bin;C:\\Program Files\\Common Files\\Oracle\\Java\\javapath;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files\\Git\\cmd;C:\\Program Files\\nodejs\\;C:\\Users\\human-24\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\human-24\\AppData\\Local\\Programs\\Microsoft VS Code\\bin;C:\\Users\\human-24\\AppData\\Local\\GitHubDesktop\\bin;C:\\Users\\human-24\\AppData\\Roaming\\npm";
		String[] pathes =pathStr.split(";");
		String pathReplace = pathStr.replace("[:;]", "").replace("\\", "\n");
		for (String path : pathes)
			System.out.println(path);
		System.out.println(pathReplace);
		
		// 문자열 배열을 하나의 문자열로 생성
		System.out.println(String.join(" -:- ", "감, 배; 귤: 밤".split("[,;:] ")));
		
		// 문자열 좌우의 공백 제거 - 단순 스페이스 뿐만 아니라 tab, 엔터도 모두 제거
		String dirtyText = " \t 자바 프로그래밍		\t \r\n";
		String cleanText = dirtyText.trim();
		System.out.println(cleanText + ", " + cleanText.length());
		
		// 
	}
}