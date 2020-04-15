package main;

public class Music extends Collection {
    private String title;
    public Music(String insidenumber, String creationdate, String author, String publishinghouse, String price, String title) {
        super();
        this.title = title;

    }

    @Override
    public String toString() {
        return "Music{" +
                "title='"+title +'\''+'}';
    }
}
