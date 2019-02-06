/*
Program Name:           Textbook
Program Author:         Jason Chau
Date Created:           09/30/17
*/
package lab2withbooks;

public class Textbook extends Book{
    private String gradeLevel;
    public String getGradeLevel(String gradeLevel){
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    public Textbook(String gradeLevel, String title, String author, String numberOfPages) {
        super(title, author, numberOfPages);
        this.gradeLevel = gradeLevel;
    }
}