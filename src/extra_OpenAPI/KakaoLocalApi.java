//package extra_OpenAPI;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.net.URI;
//import java.net.URLEncoder;
//import java.net.http.HttpHeaders;
//import java.util.Map;
//
///*
//도로명주소로부터 위도(Latitude), 경도(Longitude) 정보를 구해주는 메소드
// */
//public class KakaoLocalApi {
//    public Map<String, Double> getGeocode(String addr) throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader(("C:/Workspace/WebProject/05. JAVA/lesson/src/extra_OpenAPI/kakaoApiKey.txt")));
//        String kakaoKey = br.readLine();
//        br.close();
//        String query = URLEncoder.encode(addr, "utf-8");
//        String apiUrl = "https://dapi.kakao.com/v2/local/search/address.json" + "?query=" + query;
//
////        URL url = new URL(apiUrl);
////        // 헤더 설정
////        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
////        conn.setRequestProperty("Authorization", "KakaoAK "+kakaoKey);
////        conn.setDoInput(true);
//
//        URI uri = new URI(apiUrl);
//        // 헤더 설정
//        HttpHeaders headers= new HttpHeaders ();
//
//
//
//        return null;
//    }
//}
