package model;

public class Ticket {
    private int id;
    private Client client;
    private MovieShow movieShow;

    public Ticket() {
    }

    public Ticket(int id, Client client, MovieShow movieShow) {
        this.id = id;
        this.client = client;
        this.movieShow = movieShow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public MovieShow getMovieShow() {
        return movieShow;
    }

    public void setMovieShow(MovieShow movieShow) {
        this.movieShow = movieShow;
    }

    public String getInfo() {
        return id + " | " + movieShow.getMovieInfo() + " | " + client.getFullName();
    }

}
