/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBooks;

/**
 *
 * @author Admin
 */
public class Books {
      private String  Title,Author,Publisher;
    
    private int Year_of_Publication,Number_of_Pages;
    
    private String Summary;
 
    private int price;
     
    
    public Books(String Title, String Author, String Publisher, int Year_of_Publication, int Number_of_Pages, String Summary,int price) {
        this.Title = Title;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Year_of_Publication = Year_of_Publication;
        this.Number_of_Pages = Number_of_Pages;
        this.Summary = Summary;
        this.price=price;
    }

    public String getTitle() {
        return Title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public int getYear_of_Publication() {
        return Year_of_Publication;
    }

    public int getNumber_of_Pages() {
        return Number_of_Pages;
    }

    public String getSummary() {
        return Summary;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public void setYear_of_Publication(int Year_of_Publication) {
        this.Year_of_Publication = Year_of_Publication;
    }

    public void setNumber_of_Pages(int Number_of_Pages) {
        this.Number_of_Pages = Number_of_Pages;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
    }
    
    @Override
    public String toString() {
    return "Book Details " +
           "\nTitle: " + Title +
           "\nAuthor: " + Author +
           "\nPublisher: " + Publisher +
           "\nYear of Publication: " + Year_of_Publication +
           "\nNumber of Pages: " + Number_of_Pages +
           "\nSummary: " + Summary+
            "\nPrice :"+price;
}
    
}
