/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2withbooks;

public class Biography extends Book{
    private String subject;
    public String getSubject(String subject){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public Biography(String subject, String title, String author, String numberOfPages) {
        super(title, author, numberOfPages);
        this.subject = subject;
    }
}
