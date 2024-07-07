/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBooks;

/**
 *
 * @author Admin
 */
public class Education_3  extends Books{


    

    public Education_3(String Title, String Author, String Publisher, int Year_of_Publication, int Number_of_Pages, String Summary, int price) {
        super(Title, Author, Publisher, Year_of_Publication, Number_of_Pages, Summary, price);
    }

   

    @Override
    public String toString() {
         return "Book Details:" +
           "\nTitle: " + super.getTitle() +
           "\nAuthor: " + super.getAuthor() +
           
           "\nPublisher: " + super.getPublisher() +
           "\nYear of Publication: " + super.getYear_of_Publication() +
           "\nNumber of Pages: " + super.getNumber_of_Pages() +
           "\nSummary: " + super.getSummary();
    }
    
    @Override
    public double getPrice(){
        return super.getPrice();
    }
    
}
