package main;


public class User {
    private String firstname;
    private String lastname;
    private String adress;
    private String age;
    private String creationdate;
    private boolean penaltypaid;
    private boolean isblocked;

    public User(){
        this.penaltypaid = true;
        this.isblocked = false;
    }

    public User(String firstname, String lastname, String adress, String age, String creationdate){
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.age = age;
        this.creationdate = creationdate;
        this.penaltypaid = true;
        this.isblocked = false;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public boolean isPenaltypaid() {
        return penaltypaid;
    }

    public void setPenaltypaid(boolean penaltypaid) {
        this.penaltypaid = penaltypaid;
    }

    public boolean isIsblocked() {
        return isblocked;
    }

    public void setIsblocked(boolean isblocked) {
        this.isblocked = isblocked;
    }
}
