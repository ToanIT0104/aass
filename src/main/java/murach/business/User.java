package murach.business;

import java.io.Serializable;

public class User implements Serializable{
    private String email;
    private String firstName;
    private String lastName;
    private String date;
    private String contact;

    public User(){
        email = "";
        firstName = "";
        lastName = "";
        date = "";
        contact = "";
    }

    public User(String email, String firstName, String lastName, String date,  String contact) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
}