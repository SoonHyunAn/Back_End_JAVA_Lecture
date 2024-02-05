package extra_Challenge.Ex03_WordFrequency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//3. WordFrequency 텍스트파일
//빈도수가 가장 많은 단어 10개 출력
public class WordFrequency {

    public static void main(String[] args) throws Exception {
        String filename = "C:/Workspace/WebProject/05. JAVA/lesson/src/extra_Challenge/Ex03_WordFrequency/wordFrequency.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));

        Map<String, Integer> map = new HashMap<>();
        Set<String> wordSet = new HashSet<>(); // 고유 단어 수
        List<String> wordList = new ArrayList<>(); // 단어 수
        String line;
        int count = 0;
        while((line = br.readLine()) != null) {
            count += line.length();
            String cleanText = line.replaceAll("[^0-9A-Za-zㄱ-ㅎㅏ-ㅣ가-힣]", " "); // 특수문자를 공백으로 변환
            String[] cleanWords = cleanText.split("\\s+"); // 공백으로 나눠서 배열에 저장
            for (String word: cleanWords) {
                if (word.isEmpty())
                    continue;
                String lowerWord = word.toLowerCase();
                wordSet.add(lowerWord);
                wordList.add(lowerWord);
                if (map.containsKey(lowerWord))
                    map.put(lowerWord, map.get(lowerWord) + 1);
                else
                    map.put(lowerWord, 1);
            }
        }
        br.close();
        System.out.println(wordSet.size() + ", " + wordList.size() + ", " + count);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((Comparator<? super Entry<String, Integer>>) new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
//		System.out.println(entryList);
        for (int i = 0; i < 10; i++) {
            System.out.println(entryList.get(i));
        }
    }
}
