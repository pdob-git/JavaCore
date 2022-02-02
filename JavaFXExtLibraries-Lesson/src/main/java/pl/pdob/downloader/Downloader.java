package pl.pdob.downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Downloader {


    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.wykop.pl/");
//        URL url = new URL("https://app.javastart.pl/kurs/java/java-podstawy-temat-53-zewn%C4%99trzne-biblioteki/lekcja/java-zewnetrzne-biblioteki-jsoup-new");
        InputStream inputStream = url.openStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = null;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();

    }
}
