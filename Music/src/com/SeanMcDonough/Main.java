package com.SeanMcDonough;

import com.SeanMcDonough.Model.Artist;
import com.SeanMcDonough.Model.DataSource;
import com.SeanMcDonough.Model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    DataSource dataSource = new DataSource();
	    if(!dataSource.open()){
            System.out.println("Can't open data source");
            return;
        }
//        List<Artist> artists = dataSource.queryArtists(5);
//	    if(artists == null){
//            System.out.println("No Artists!");
//            return;
//        }

//        for(Artist artist : artists) {
//            System.out.println("ID = " + artist.getId() + " Name = " + artist.getName());
//        }

//        List<String> albumsForArtist =
//                dataSource.queryAlbumsForArtist("Carole King", dataSource.ORDER_BY_ASC);
//
//	    for(String album : albumsForArtist){
//            System.out.println(album);
//        }
//
//        List<SongArtist> songArtists = dataSource.queryArtistForSong("Heartless", dataSource.ORDER_BY_ASC);
//        if (songArtists == null){
//            System.out.println("Couldnt find the artist for the song.");
//            return;
//        }
//
//        for(SongArtist artist : songArtists){
//            System.out.println("Artist name = " + artist.getArtistName() + "Album name = " +
//                    artist.getAlbumName() + "Track = " + artist.getTrack());
//        }
//
//        dataSource.querySongsMetadata();
//        dataSource.getCount(dataSource.TABLE_SONGS);
//        dataSource.createViewForSongArtists();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter song title: ");
//        String title = scanner.nextLine();
//
//        songArtists = dataSource.querySongInfoView(title);
//        if(songArtists.isEmpty()){
//            System.out.println("Cannot find artist for song");
//            return;
//        }
//        for(SongArtist artist : songArtists){
//            System.out.println("Artist name = " + artist.getArtistName() + "||Album name = " +
//                                artist.getAlbumName() + "||Track Number = " + artist.getTrack());
//        }

        dataSource.insertSong("Trust", "Megadeth", "Cryptic Writings", 3);


        dataSource.close();
    }
}
