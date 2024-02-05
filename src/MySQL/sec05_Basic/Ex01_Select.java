package MySQL.sec05_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Ex01_Select {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world", // 호스트, 포트, DE명
                    "hmuser", "hmpass"
            );
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

