package MySQL.sec06_kcity;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/*
 * city Dao (Data Access Object) -- DB table 을 다루는 라이브러리
 *           Select, Insert, Update, Delete 를 처리하는 프로그램
 * */
public class CityDao {
    private String connStr;
    private String user;
    private String password;

    public CityDao() {
        String path = "C:/Workspace/WebProject/05. JAVA/src/MySQL/sec05_Basic/mysql.properties";
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(path));

            String host = prop.getProperty("host");
            String port = prop.getProperty("port");
            String database = prop.getProperty("database");

            this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
            this.user = prop.getProperty("user");
            this.password = prop.getProperty("password");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection myConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connStr, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public City getCityById(int id) {
        Connection conn = myConnection();
        String sql = "select * from kcity where id = ?";
//        City city = new City();     // 방법 1
        City city = null;             // 방법 2
        try {
            // 파라미터 세팅
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            // Select 실행하고 결과 받기
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                // 방법 1
                city = new City();
                city.setId(rs.getInt(1));
                city.setName(rs.getString(2));
                city.setCountryCode(rs.getString(3));
                city.setDistrict(rs.getString(4));
                city.setPopulation(rs.getInt(5));
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return city;
    }

    public City getCityByName(String name) {
        Connection conn = myConnection();
        String sql = "select * from kcity where name=?";
        City city = null; // 방법 2
        try {
            //  파라메터 세팅
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);

            // Select 실행하고 결과 받기
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                city = new City(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return city;
    }

    public List<City> getCityListAll() {
        Connection conn = myConnection();
        String sql = "select * from kcity";
        List<City> list = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();

            // Select 실행하고 결과 받기
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                City city = new City(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                list.add(city);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
