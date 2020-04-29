package main;

public class Movies extends Collection {
    private Kompozycja index;
    private String language;
    public Movies(String creationdate, String author, String publishinghouse, String price, String language) {
        this.language = language;
        this.index = new Kompozycja();
        index.setIndex("234985");
    }

    @Override
    public String toString() {
        return "Movies{" +
                "Index='" + index.getIndex() + '\'' +
                "language='" + language + '\'' +
                '}';
    }
}
