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

//        // insert
//        Song song3 = new Song("비스트", "Mystery");
//        songDao.insertSong(song3);
//        for (Song lis : list1)
//            System.out.println(lis);
//        System.out.println();

        //update
        Song song4 = songDao.getSongBySid(116);
        song4.setTitle("Dumb Dumb (덤덤)");
        song4.setLyrics("Dumb Dumb Dumb Dumb Dumb");
        songDao.updateSong(song4);
        for (Song lis : list1)
            System.out.println(lis);
        System.out.println();

        //delete
        songDao.deleteSong(119);
        for (Song lis : list1)
            System.out.println(lis);
        System.out.println();
    }
}
