/*
Program Name:           Lab2WithBooks
Program Author:         Jason Chau
Date Created:           09/27/17
*/
package lab2withbooks;
import javax.swing.JOptionPane;

public class Lab2WithBooks {
    public static void main(String[] args) {
        String proceed;
        do{
            String title = JOptionPane.showInputDialog("Enter the title: ");
            String[] bookChoice = {"Textbook", "Novel", "Biography"};
            String bookType = (String) JOptionPane.showInputDialog(null, "Which type of book is it?", "Book Type", JOptionPane.QUESTION_MESSAGE, null, bookChoice, bookChoice);
            String author = JOptionPane.showInputDialog("Enter the author: ");
            String address = JOptionPane.showInputDialog("Enter the author's address: ");
            String email = JOptionPane.showInputDialog("Enter the author's email: ");
            String numberOfPages = JOptionPane.showInputDialog("Enter the number of pages: ");
            Book book = new Book(title, author, numberOfPages);
            DelegationAuthor bookauthor = new DelegationAuthor(new Book(title, author, numberOfPages), address, email);
            if("Textbook".equals(bookType)){
                String gradeLevel = JOptionPane.showInputDialog("Enter the grade level: ");
                Textbook textbook = new Textbook(title, author, numberOfPages, gradeLevel);
                JOptionPane.showMessageDialog(null, "Title: " + book.getTitle() + "\nBook Type: " + bookType + "\nAuthor: " + book.getAuthor() + "\n\t\t\tAddress: " + bookauthor.getAddress() + "\n\t\t\tEmail: " + bookauthor.getEmail() + "\nNumber of Pages: " + book.getNumberOfPages() + "\nGrade Level: " + textbook.getGradeLevel(gradeLevel));
            }
            if("Novel".equals(bookType)){
                String[] genreChoice = {"Adventure", "Comedy", "Drama", "Fantasy", "Historical", "Horror", "Mystery", "Mythology",  "Non Fiction", "Poetry", "Romance", "Sci-Fi", "Thriller", "Tragedy"};
                String genre = (String) JOptionPane.showInputDialog(null, "Choose a genre", "Genre", JOptionPane.QUESTION_MESSAGE, null, genreChoice, genreChoice);
                Novel novel = new Novel(title, author, numberOfPages, genre);
                JOptionPane.showMessageDialog(null, "Title: " + book.getTitle() + "\nBook Type: " + bookType + "\nAuthor: " + book.getAuthor() + "\n\t\t\tAddress: " + bookauthor.getAddress() + "\n\t\t\tEmail: " + bookauthor.getEmail() + "\nNumber of Pages: " + book.getNumberOfPages() + "\nGenre: " + novel.getGenre(genre));
            }
            if("Biography".equals(bookType)){
                String subject = JOptionPane.showInputDialog("Enter the subject for a biography: ");
                Biography biography = new Biography(title, author, numberOfPages, subject);
                JOptionPane.showMessageDialog(null, "Title: " + book.getTitle() + "\nBook Type: " + bookType + "\nAuthor: " + book.getAuthor() + "\n\t\t\tAddress: " + bookauthor.getAddress() + "\n\t\t\tEmail: " + bookauthor.getEmail() + "\nNumber of Pages: " + book.getNumberOfPages() + "\nBiography Subject: " + biography.getSubject(subject));
            }
            proceed = JOptionPane.showInputDialog("Would you like to continue? Y for Yes: ");
        }
        while(proceed.equalsIgnoreCase("Y"));
        JOptionPane.showMessageDialog(null, "Thank You For Using My Programming");
    }
}
