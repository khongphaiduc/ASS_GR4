/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBooks;
public class horrified_2  extends Books {
    
    private String Fear_Elements;
     
    private String Psychological_Elements;

    public horrified_2(String Title, String Author, String Publisher, int Year_of_Publication, int Number_of_Pages, String Summary, int price) {
        super(Title, Author, Publisher, Year_of_Publication, Number_of_Pages, Summary, price);
    }

    
    public horrified_2(String Fear_Elements, String Psychological_Elements, String Title, String Author, String Publisher, int Year_of_Publication, int Number_of_Pages, String Summary, int price) {
        super(Title, Author, Publisher, Year_of_Publication, Number_of_Pages, Summary, price);
        this.Fear_Elements = Fear_Elements;
        this.Psychological_Elements = Psychological_Elements;
    }

 

    public String getFear_Elements() {
        return Fear_Elements;
    }

    public String getPsychological_Elements() {
        return Psychological_Elements;
    }

    public void setFear_Elements(String Fear_Elements) {
        this.Fear_Elements = Fear_Elements;
    }

    public void setPsychological_Elements(String Psychological_Elements) {
        this.Psychological_Elements = Psychological_Elements;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nFear_Elements : "+ Fear_Elements+
                "\nPsychological_Elements  "+Psychological_Elements;
    }

    
     @Override
    public int getPrice(){
        return super.getPrice();
    }
    
    
    
}