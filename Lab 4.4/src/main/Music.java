package main;

public class Music extends Collection {
    private Kompozycja index;
    private String title;
    public Music(String creationdate, String author, String publishinghouse, String price, String title) {
        this.title = title;
        this.index = new Kompozycja();
        index.setIndex("234985");
    }

    @Override
    public String toString() {
        return "Music{" +
                "Index='" + index.getIndex() + '\'' +
                ", title='"+title +'\''+'}';
    }
}
