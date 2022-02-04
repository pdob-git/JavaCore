package pl.pdob.mp3reader;


import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3v2;

import java.io.File;
import java.io.IOException;

public class Mp3Reader {
    public static void main(String[] args) throws TagException, IOException {
        File sourceFile = new File("scott_holmes_music_stylish_groove.mp3");
        MP3File mp3file = new MP3File(sourceFile);
        if (mp3file.hasID3v2Tag()) {
            AbstractID3v2 tag = mp3file.getID3v2Tag();
            String albumTitle = tag.getAlbumTitle();
            String songTitle = tag.getSongTitle();
            String leadArtist = tag.getLeadArtist();
            System.out.println("album: " + albumTitle);
            System.out.println("song: " + songTitle);
            System.out.println("author: " + leadArtist);
        }
    }
}
