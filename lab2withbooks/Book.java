/*
Program Name:           Book
Program Author:         Jason Chau
Date Created:           09/27/17
*/
package lab2withbooks;

public class Book {
    private String title;
    private String author;
    private String numberOfPages;
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getNumberOfPages(){
        return numberOfPages;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setNumberOfPages(String numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public Book(String title, String author, String numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
}