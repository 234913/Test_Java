package main;

import java.util.Date;

public class Renting {
    private User user;
    private Collection collection;
    private Date rentingdate;
    private Date returndate;

    public Renting(User user, Collection collection, Date rentingdate, Date returndate) {
        this.user = user;
        this.collection = collection;
        this.rentingdate = rentingdate;
        this.returndate = returndate;
    }

    public Renting(User user, Collection collection, Date rentingdate) {
        this.user = user;
        this.collection = collection;
        this.rentingdate = rentingdate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Date getRentingdate() {
        return rentingdate;
    }

    public void setRentingdate(Date rentingdate) {
        this.rentingdate = rentingdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    @Override
    public String toString() {
        return "Renting{" +
                "user=" + user.getFirstname() +
                ", collection=" + collection.getClass() +
                ", rentingdate=" + rentingdate +
                ", returndate=" + returndate +
                '}';
    }
}
