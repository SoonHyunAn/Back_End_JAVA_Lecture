package MySQL.sec07_song;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SongDao songDao = new SongDao();

        // select
        Song song1 = songDao.getSongBySid(101);
        System.out.println(song1);
        System.out.println();

        Song song2 = songDao.getSongByTitle("Tell ME");
        System.out.println(song2);
        System.out.println();

        List<Song> list1 = songDao.getSongListAll();
        for (Song lis : list1)
            System.out.println(lis);
        System.out.println();

        // insert
		Song song3 = new Song("Hypeboy", "하 하 하 하입보이");
		songDao.insertSong(song3);

        //update
        Song song4 = songDao.getSongBySid(117);
        song4.setTitle("Hype Boy");
        song4.setLyrics("너 없이는 매일 매일이 yeah 재미없어 어쩌지");
        songDao.updateSong(song4);
        for (Song lis : list1)
            System.out.println(lis);
        System.out.println();

        //delete
        songDao.deleteSong(119);
        for (Song lis : list1)
            System.out.println(lis);
        System.out.println();

        songDao.close();
    }
}
