package main;

public class Books extends Collection {
    private Kompozycja kompozycja;
    private String pagenumber;
    public Books(String creationdate, String author, String publishinghouse, String price, String pagenumber) {
        super();
        this.pagenumber = pagenumber;
        this.kompozycja = new Kompozycja();
        kompozycja.setIndex("987654");
    }

    @Override
    public String toString() {
        return "Books{" +
                "Index='" + kompozycja.getIndex() + '\'' +
                ", title='"+pagenumber +'\''+
                '}';
    }
}
