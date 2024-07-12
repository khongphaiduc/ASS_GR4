/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookAndDocument;

import DataBooks.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class AddBook {

    private static Scanner sc = new Scanner(System.in);

    public static void addBooksNew(ListBooks books) {
        System.out.print("Enter đầu sách muốn thêm: ");
        String headBooks = sc.nextLine();

        try {
            if (headBooks.equals("Love")) {
                System.out.println("Nhập nội dung: ");
                String context = sc.nextLine();

                System.out.println("Nhập tiêu đề: ");
                String title = sc.nextLine();

                System.out.println("Nhập tác giả: ");
                String author = sc.nextLine();

                System.out.println("Nhập nhà xuất bản: ");
                String publisher = sc.nextLine();

                System.out.println("Nhập năm xuất bản: ");
                int year_of_publication = sc.nextInt();

                System.out.println("Nhập số trang: ");
                int number_of_pages = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhập tóm tắt: ");
                String summary = sc.nextLine();

                System.out.println("Nhập giá: ");
                int price = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter codebooks mới: ");
                String codebook = sc.nextLine();

                Love_1 loveBooknew = new Love_1(context, title, author, publisher, year_of_publication, number_of_pages, summary, price);
                books.getDataListBook().put(codebook, loveBooknew);

                System.out.println("Sách " + title + " đã được thêm thành công!");

            } else if (headBooks.equals("education")) {

                System.out.println("Nhập tiêu đề: ");
                String title = sc.nextLine();

                System.out.println("Nhập tác giả: ");
                String author = sc.nextLine();

                System.out.println("Nhập nhà xuất bản: ");
                String publisher = sc.nextLine();

                System.out.println("Nhập năm xuất bản: ");
                int year_of_publication = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhập số trang: ");
                int number_of_pages = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhập tóm tắt: ");
                String summary = sc.nextLine();

                System.out.println("Nhập giá: ");
                int price = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhập code cho sách: ");
                String codebook = sc.nextLine();

                Education_3 edu = new Education_3(title, author, publisher, year_of_publication, number_of_pages, summary, price);
                books.getDataListBook().put(codebook, edu);

                System.out.println("Sách " + title + " đã được thêm thành công!");

            } else if (headBooks.equals("horrified")) {

                System.out.println("Nhập yếu tố kinh dị: ");
                String fearElements = sc.nextLine();

                System.out.println("Nhập yếu tố tâm lý: ");
                String psychologicalElements = sc.nextLine();

                System.out.println("Nhập tiêu đề: ");
                String title = sc.nextLine();

                System.out.println("Nhập tác giả: ");
                String author = sc.nextLine();

                System.out.println("Nhập nhà xuất bản: ");
                String publisher = sc.nextLine();

                System.out.println("Nhập năm xuất bản: ");
                int year_of_publication = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhập số trang: ");
                int number_of_pages = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhập tóm tắt: ");
                String summary = sc.nextLine();

                System.out.println("Nhập giá: ");
                int price = sc.nextInt();
                sc.nextLine();

                System.out.println("Nhập code cho sách: ");
                String codebook = sc.nextLine();

                horrified_2 booknew = new horrified_2(fearElements, psychologicalElements, title, author, publisher, year_of_publication, number_of_pages, summary, price);
                books.getDataListBook().put(codebook, booknew);

                System.out.println("Sách " + title + " đã được thêm thành công!");
            } else {
                System.out.println("Không tìm thấy sách cần thêm");
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm sách: " + e.getMessage());
        }
    }
}
