package my;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MusicCollection {
    public static void main(String[] args) {
        System.out.println("Moje rozwiązanie");
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        showStatistics(songs);

    }

    private static void showStatistics(List<Song> songs) {


        int totalMetalTime = totalTimeForGenre(songs,Song.Genre.POP);
        System.out.println("Łączny czas piosenek popowych na playliście (w sekundach) : "
                + totalMetalTime);

        long songFromArtistNumber = getSongsFromArtistNumber(songs,"Metallica");
        System.out.println("Liczba piosenek Metalliki na playliście: "
                + songFromArtistNumber);

        List<Song>  songsWithOutGenre = getSongsWithoutGenre(songs, Song.Genre.POP);
        System.out.println("Piosenki bez POPu");
        songsWithOutGenre.forEach(System.out::println);
    }

    private static List<Song> getSongsWithoutGenre(List<Song> songs, Song.Genre genreToRemove) {
        return songs.stream()
                .filter(song -> song.getGenre() != genreToRemove)
                .distinct()
                .collect(Collectors.toList());
    }

    private static long getSongsFromArtistNumber(List<Song> songs, String artist) {
        return songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .count();
    }

    private static int totalTimeForGenre(List<Song> songs, Song.Genre genre) {
       return songs.stream()
                .filter(song -> song.getGenre() == genre)
                .map(song -> song.getLength())
                .flatMapToInt(length -> IntStream.of(length))
                .sum();
    }
}