package extra_Challenge.Ex01_WordCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/WebProject/05. JAVA/lesson/src/extra_Challenge/Ex01_WordCount/wordCount.txt"))) {
            String line;
            int wordCount = 0;
            int uniqueWordCount = 0;
            int charCount = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" "); // 공백을 기준으로 단어 분리

                charCount += line.length(); // 줄의 글자 수 추가
                wordCount += words.length; // 단어 수 추가

                Set<String> uniqueWords = new HashSet<>(); // Set 이니까 자동으로 중복 제거.
                for (String word : words) {
                    uniqueWords.add(word.toLowerCase()); // 소문자로 변환하여 중복 단어 방지

                }
                System.out.println(uniqueWords);
                uniqueWordCount += uniqueWords.size(); // 고유 단어 수 추가
            }

            System.out.println("주어진 파일의 고유 단어 수는 " + uniqueWordCount + "개, 단어 수는 " + wordCount + "개, 글자 수는 " + charCount + "개");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


