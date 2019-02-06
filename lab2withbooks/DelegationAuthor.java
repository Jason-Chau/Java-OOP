/*
Program Name:           DelegationAuthor
Program Author:         Jason Chau
Date Created:           09/27/17
*/
package lab2withbooks;

public class DelegationAuthor {
    private Book name;
    private String address;
    private String email;
    public Book getName(){
        return name;
    }
    public void setName(Book name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public DelegationAuthor(Book name, String address, String email){
        this.name = name;
        this.address = address;
        this.email = email;
    }
}