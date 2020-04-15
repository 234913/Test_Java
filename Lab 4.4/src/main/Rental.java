package main;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rental {
    ArrayList<User> UsersList;
    ArrayList<Collection> CollectionList;
    ArrayList<Renting> RentingList;

    public  Rental(){
        UsersList = new ArrayList<User>();
        CollectionList = new ArrayList<Collection>();
        RentingList = new ArrayList<Renting>();
    }

    public void rentThing(Collection thing, User user, Date date){
        if (!user.isIsblocked() || user.isPenaltypaid()){
        Renting renting = new Renting(user, thing, date);
        RentingList.add(renting);
            System.out.println("User " + user.getFirstname() +" is renting "+ thing.getClass());
        }
        else{
            System.out.println(user.getFirstname() +" is blocked or did not paid penalty");
        }
    }

    public void returnThing (Collection thing, User user, Date date){
        for (Renting renting : RentingList) {
            if (renting.getUser()==user && renting.getCollection()==thing){
                renting.setReturndate(date);
                long diff = (renting.getReturndate().getTime() - renting.getRentingdate().getTime());
                long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                if(days>30){
                    renting.getUser().setIsblocked(true);
                    renting.getUser().setPenaltypaid(false);
                    System.out.println("Penalty for "+user.getFirstname() +" did not returned within 30 days");
                    System.out.println(renting.getUser().getFirstname() +" returned"+ renting.getCollection().getClass()+" with penalty");
                }
                else{
                    System.out.println(renting.getUser().getFirstname() +" returned"+ renting.getCollection().getClass()+" without penalty");
                }
            }
        }
    }

    public void payPenalty(User user){
        user.setIsblocked(false);
        user.setPenaltypaid(true);
        System.out.println("Penalty is paid by "+ user.getFirstname());
    }

    public ArrayList<User> getUsersList() {
        return UsersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        UsersList = usersList;
    }

    public ArrayList<Collection> getCollectionList() {
        return CollectionList;
    }

    public void setCollectionList(ArrayList<Collection> collectionList) {
        CollectionList = collectionList;
    }

    public ArrayList<Renting> getRentingList() {
        return RentingList;
    }

    public void setRentingList(ArrayList<Renting> rentingList) {
        RentingList = rentingList;
    }
}