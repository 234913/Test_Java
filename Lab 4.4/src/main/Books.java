package main;

public class Books extends Collection {
    private String pagenumber;
    public Books(String creationdate, String author, String publishinghouse, String price, String pagenumber) {
        super();
        this.pagenumber = pagenumber;
    }

    @Override
    public String toString() {
        return "Books{" +
                "pagenumber='" + pagenumber + '\'' +
                '}';
    }
}
