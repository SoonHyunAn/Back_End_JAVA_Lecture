package MySQL.sec05_Basic;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Ex04_Properties {
    public static void main(String[] args) {
        // 절대 경로
        Properties prop = new Properties();         // Map<String, String>
        String path = "C:/Workspace/WebProject/05. JAVA/lesson/src/MySQL/sec05_Basic/mysql.properties";
        try {
            InputStream is = new FileInputStream(path);
            prop.load(is);
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        String host = prop.getProperty("host");
        String port = prop.getProperty("port");
        String database = prop.getProperty("database");
        String user = prop.getProperty("user");
        String password = prop.getProperty("password");

        String connStr = "jdbc:mysql://"+ host + ":" + port + "/" + database;
        System.out.println(connStr);
        System.out.println("Drive_rManager.getConnection(connStr, user, password);");
    }
}
