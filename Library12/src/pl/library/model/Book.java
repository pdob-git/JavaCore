package pl.library.model;

public class Book extends Publication {
    //Fields
    private String author;
    private int pages;
    private String isbn;
    //Constructors

    public Book(String title, String author, int year, int pages, String publisher,
                String isbn) {
        super(title, publisher, year);

        this.pages = pages;
        this.author = author;
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = getTitle() + "; " + author + "; " + getYear() + "; "
                + pages + "; " + getPublisher();
        if (isbn != null) {
            info = info + "; " + isbn;
        }
        System.out.println(info);
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}