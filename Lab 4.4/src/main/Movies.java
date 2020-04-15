package main;

public class Movies extends Collection {
    private String language;
    public Movies(String creationdate, String author, String publishinghouse, String price, String language) {
        super();
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "language='" + language + '\'' +
                '}';
    }
}
