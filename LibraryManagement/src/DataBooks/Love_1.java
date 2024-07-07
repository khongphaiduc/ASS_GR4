/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBooks;

public class Love_1 extends Books {
    
    private String context;

    public Love_1(String Title, String Author, String Publisher, int Year_of_Publication, int Number_of_Pages, String Summary, int price) {
        super(Title, Author, Publisher, Year_of_Publication, Number_of_Pages, Summary, price);
    }

    public Love_1(String context, String Title, String Author, String Publisher, int Year_of_Publication, int Number_of_Pages, String Summary, int price) {
        super(Title, Author, Publisher, Year_of_Publication, Number_of_Pages, Summary, price);
        this.context = context;
    }


   

    public String getContext() {
        return context;
    }



    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
       return "Book Details:" +
           "\nTitle: " + super.getTitle() +
           "\nAuthor: " + super.getAuthor() +
           "\nContext :"+context +
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
