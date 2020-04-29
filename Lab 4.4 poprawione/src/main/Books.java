package main;

public class Books extends Collection {
    private Kompozycja index;
    private String pagenumber;
    public Books(String creationdate, String author, String publishinghouse, String price, String pagenumber) {
        this.pagenumber = pagenumber;
        this.index = new Kompozycja();
        index.setIndex("234985");
    }

    @Override
    public String toString() {
        return "Books{" +
                "Index='" + index.getIndex() + '\'' +
                "pagenumber='" + pagenumber + '\'' +
                '}';
    }
}
