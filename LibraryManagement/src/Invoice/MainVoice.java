package Invoice;

import DataBooks.ListBooks;
import java.util.Scanner;

public class MainVoice {

    public static void main(String[] args) {

        Scanner duc = new Scanner(System.in);

        OutInvoice obj1 = new OutInvoice();
        ListBooks obj2 = new ListBooks();

        System.out.print("Nhập tên :");
        String name = duc.nextLine();
        System.out.print("Nhập Tuổi : ");
        int age = duc.nextInt();
        obj2.display();

        try {
            obj1.invoice(name, age);

        } catch (Exception e) {
            System.out.println("Nhập sai ");
        }

    }
}
