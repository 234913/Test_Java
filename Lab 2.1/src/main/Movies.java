package main;

public class Movies extends Collection {
    private Kompozycja kompozycja;
    private String language;
    public Movies(String creationdate, String author, String publishinghouse, String price, String language) {
        super();
        this.language = language;
        this.kompozycja = new Kompozycja();
        kompozycja.setIndex("123456");
    }

    @Override
    public String toString() {
        return "Movies{" +
                "Index='" + kompozycja.getIndex() + '\'' +
                ", title='"+language +'\''+
                '}';
    }
}
