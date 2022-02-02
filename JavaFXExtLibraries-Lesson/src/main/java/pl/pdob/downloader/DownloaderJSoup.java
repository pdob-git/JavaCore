package pl.pdob.downloader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DownloaderJSoup {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.wykop.pl/").get();
        String title = document.title();
        System.out.println(title);

        Elements h2Elements = document.select("h2");
        for (Element h2 : h2Elements) {
            String h2Url = h2.select("a").first().attr("href");
            String h2text = h2.text();
            System.out.println(h2text + " ::: " + h2Url);
        }
    }
}
