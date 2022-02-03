package pl.pdob.exampleparser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Downloader {


    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.example.com/");
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
