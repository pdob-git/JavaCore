package pl.pdob.exampleparser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ExampleParser {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://www.example.com/").get();
        String title = document.title();
        System.out.println(title);

        String h1Text = document.select("h1").first().text();
        String pText = document.select("p").first().text();
        System.out.println(h1Text);
        System.out.println(pText);

    }
}
