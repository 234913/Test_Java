package main;

public class Collection {
    private String creationdate;
    private String author;
    private String publishinghouse;
    private String price;
    public void Collection (String insidenumber, String creationdate, String author, String publishinghouse, String price){
        this.creationdate = creationdate;
        this.author = author;
        this.publishinghouse = publishinghouse;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Collection{" +
                ", creationdate='" + creationdate + '\'' +
                ", author='" + author + '\'' +
                ", publishinghouse='" + publishinghouse + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishinghouse() {
        return publishinghouse;
    }

    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
