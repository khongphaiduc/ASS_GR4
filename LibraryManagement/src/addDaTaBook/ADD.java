
package addDaTaBook;

import DataBooks.*;
import java.util.Scanner;

public class ADD {

    ListBooks obj = new ListBooks();
    Scanner duc = new Scanner(System.in);

    public void addBooksNew() {
        System.out.print("Enter đầu sách muốn thêm :");
        String headBooks = duc.nextLine();

        if (headBooks.equals("Love")) {
            System.out.println("Nhập nội dung: ");
            String context = duc.nextLine();

            System.out.println("Nhập tiêu đề: ");
            String title = duc.nextLine();

            System.out.println("Nhập tác giả: ");
            String author = duc.nextLine();

            System.out.println("Nhập nhà xuất bản: ");
            String publisher = duc.nextLine();

            System.out.println("Nhập năm xuất bản: ");
            int year_of_publication = duc.nextInt();

            System.out.println("Nhập số trang: ");
            int number_of_pages = duc.nextInt();
            duc.nextLine();

            System.out.println("Nhập tóm tắt: ");
            String summary = duc.nextLine();

            System.out.println("Nhập giá: ");
            int price = duc.nextInt();

            System.out.print("Enter codebooks mới :");
            String codebook = duc.nextLine();
            Love_1 loveBooknew = new Love_1(context, title, author, publisher, year_of_publication, number_of_pages, summary, price);
            obj.getDataListBook().put(codebook, loveBooknew);
            duc.nextLine();
            System.out.println("Sách " + title + " đã được thêm thành công !");
        } else if (headBooks.equals("education")) {

            System.out.println("Nhập tiêu đề: ");
            String title = duc.nextLine();

            System.out.println("Nhập tác giả: ");
            String author = duc.nextLine();

            System.out.println("Nhập nhà xuất bản: ");
            String publisher = duc.nextLine();

            System.out.println("Nhập năm xuất bản: ");
            int year_of_publication = duc.nextInt();
            duc.nextLine();

            System.out.println("Nhập số trang: ");
            int number_of_pages = duc.nextInt();
            duc.nextLine();

            System.out.println("Nhập tóm tắt: ");
            String summary = duc.nextLine();

            System.out.println("Nhập giá: ");
            int price = duc.nextInt();
            System.out.println("Nhập code cho sách :");
            String codebook = duc.nextLine();
            duc.nextLine();
            duc.close();

            Education_3 edu = new Education_3(title, author, publisher, year_of_publication, number_of_pages, summary, price);
            obj.getDataListBook().put(codebook, edu);

            System.out.println("Sách " + title + " đã được thêm thành công !");

        } else if (headBooks.equals("horrified")) {

            System.out.println("Nhập yếu tố kinh dị: ");
            String fearElements = duc.nextLine();

            System.out.println("Nhập yếu tố tâm lý: ");
            String psychologicalElements = duc.nextLine();

            System.out.println("Nhập tiêu đề: ");
            String title = duc.nextLine();

            System.out.println("Nhập tác giả: ");
            String author = duc.nextLine();

            System.out.println("Nhập nhà xuất bản: ");
            String publisher = duc.nextLine();

            System.out.println("Nhập năm xuất bản: ");
            int year_of_publication = duc.nextInt();
            duc.nextLine();

            System.out.println("Nhập số trang: ");
            int number_of_pages = duc.nextInt();
            duc.nextLine();

            System.out.println("Nhập tóm tắt: ");
            String summary = duc.nextLine();

            System.out.println("Nhập giá: ");
            int price = duc.nextInt();

            System.out.println("Nhập code cho sách :");
            String codebook = duc.nextLine();

            duc.close();

            horrified_2 booknew = new horrified_2(fearElements, psychologicalElements, title, author, publisher, year_of_publication, number_of_pages, summary, price);
            obj.getDataListBook().put(codebook, booknew);

            System.out.println("Sách " + title + " đã được thêm thành công !");

        }

    }

}
