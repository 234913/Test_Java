package main;

public class Music extends Collection {
    private Kompozycja kompozycja;
    private String title;
    public Music(String creationdate, String author, String publishinghouse, String price, String title) {
        super();
        this.title = title;
        this.kompozycja = new Kompozycja();
        kompozycja.setIndex("234985");
    }

    @Override
    public String toString() {
        return "Music{" +
                "Index='" + kompozycja.getIndex() + '\'' +
                ", title='"+title +'\''+'}';
    }
}
