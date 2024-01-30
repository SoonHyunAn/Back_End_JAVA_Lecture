package extra_OpenAPI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class RoadAddrApi {
    public String getRoadAddr(String keyword) throws Exception {
        InputStream is = new FileInputStream("C:/Workspace/WebProject/05. JAVA/lesson/src/extra_OpenAPI/roadApiKey.txt");
        byte[] arr = new byte[80];
        while (true) {
            int num = is.read(arr);
            if (num == -1) break;
        }

        String confmKey = null;
        int currentPage = 1, countPerPage = 5;
        String resultType = "json";
        keyword = URLEncoder.encode(keyword, StandardCharsets.UTF_8);
        String apiUrl = "http://www.juso.go.kr/addrlink/addrLinkApi.do" + "?confmKey=" + confmKey + "&currentPage=" + currentPage + "&countPerPage=" + countPerPage + "&resultType=" + resultType + "&keyword=" + keyword;

        URL url = new URL(apiUrl);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
        StringBuffer sb = new StringBuffer();
        String tempStr = null;

        while (true) {
            tempStr = br.readLine();
            if (tempStr == null) break;
            sb.append(tempStr);                                // 응답결과 JSON 저장
        }
        br.close();

        return sb.toString();
    }
}
