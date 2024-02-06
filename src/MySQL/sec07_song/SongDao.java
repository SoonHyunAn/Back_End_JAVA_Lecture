package MySQL.sec07_song;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SongDao {
    private String connStr;
    private String user;
    private String password;
    private Connection conn;

    public SongDao() {
        String path = "C:/Workspace/WebProject/05. JAVA/src/MySQL/sec05_basic/mysql.properties";
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(path));

            String host = prop.getProperty("host");
            String port = prop.getProperty("port");
            String database = prop.getProperty("database");

            this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
            this.user = prop.getProperty("user");
            this.password = prop.getProperty("password");
            conn = DriverManager.getConnection(connStr, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Song getSongBySid(int sid) {
        String sql = "select * from song where sid = ?";
//        song song = new song();     // 방법 1
        Song song = null;             // 방법 2
        try {
            // 파라미터 세팅
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, sid);

            // Select 실행하고 결과 받기
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                // 방법 1
                song = new Song();
                song.setSid(rs.getInt(1));
                song.setTitle(rs.getString(2));
                song.setLyrics(rs.getString(3));
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return song;
    }

    public Song getSongByTitle(String title) {
        String sql = "select * from song where title like ?";
        Song song = null; // 방법 2
        try {
            //  파라메터 세팅
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + title + "%");

            // Select 실행하고 결과 받기
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return song;
    }

    public List<Song> getSongListAll() {
        String sql = "select * from song";
        List<Song> list = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();

            // Select 실행하고 결과 받기
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Song song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(song);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void insertSong(Song song) {
        String sql = "insert into song values(default, ?, ?)";
        try {
            //  파라메터 세팅
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, song.getTitle());
            pstmt.setString(2, song.getLyrics());

            // SQL 실행
            pstmt.executeUpdate();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSong(Song song) {
        String sql = "update song set title=?, lyrics=? where sid = ?";
        try {
            //  파라메터 세팅
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, song.getTitle());
            pstmt.setString(2, song.getLyrics());
            pstmt.setInt(3, song.getSid());

            // SQL 실행
            pstmt.executeUpdate();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteSong(int sid) {
        String sql = "delete from song where sid = ?";
        try {
            //  파라메터 세팅
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, sid);

            // SQL 실행
            pstmt.executeUpdate();

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
