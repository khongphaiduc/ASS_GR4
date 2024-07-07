/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookAndDocument;

import DataBooks.ListBooks;
import DataBooks.*;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Admin
 */
public class BookMenu {

    public static void main(String[] args) {
        bookmenu();
    }

    public static void bookmenu() {
        ListBooks books = new ListBooks();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Danh sách");
            System.out.println("2.Tìm sách.");
            System.out.println("3.Thêm xóa sách.");
            System.out.println("4.Chỉnh giá tiền.");
            System.out.println("0.Exit.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    handleChoice1(books);
                    break;
                case 2:
                    handleChoice2(sc, books);
                    break;
                case 3:
                    books = handleChoice3(sc, books);
                    break;
                case 4:
                    handleChoice4(sc, books);
                case 0:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("xin hãy thử lại");
            }
        }

    }

    private static void handleChoice1(ListBooks books) {
        System.out.println(books.getDataListBook());
    }

    private static void handleChoice2(Scanner sc, ListBooks books) {
        System.out.println("Nhập mã Sách: ");
        String key = sc.nextLine();
        Object itemBook = books.getDataListBook().get(key);
        if (itemBook != null) {
            System.out.println("Kết quả tìm kiếm : \n");
            System.out.println(itemBook);
        } else {
            System.out.println("Không có kết quả tìm kiếm");
        }
    }

    private static ListBooks handleChoice3(Scanner sc, ListBooks books) {
        Books item;

        while (true) {
            System.out.println("1.Thêm mới");
            System.out.println("2.Sửa sách.");
            System.out.println("3.Xóa sách.");
            System.out.println("0.Exit.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    item = instantBook(sc);
                    String newKey = getKey(books);
                    books.getDataListBook().put(newKey, item);
                    System.out.println("Key sách mới là: " + newKey);
                    return books;
//                    AddBook(sc, books);
//                    return books;
                case 2:
                    String key = "";
                    System.out.println("Nhập bookKey: ");
                    if (books.getDataListBook().get(key) == null) {
                        System.out.println("Không tìm thấy sách với key là: " + key);
                    } else {
                        item = instantBook(sc);
                        books.getDataListBook().replace(key, item);
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã sách cần xóa: ");
                    String keyToDelete = sc.nextLine();
                    if (books.findBook(keyToDelete) == null) {
                        System.out.println("Không tìm thấy sách với mã: " + keyToDelete);
                    } else {
                        books.removeBook(keyToDelete);
                        System.out.println("Sách đã được xóa");
                    }
                    break;
                case 0:
                    break;
            }
            return books;
        }
    }
    private static void handleChoice4(Scanner sc, ListBooks books) {
        System.out.println("Nhập mã sách cần chỉnh giá: ");
        String key = sc.nextLine();
        Books book = books.findBook(key);
        if (book != null) {
            System.out.println("Nhập giá mới: ");
            double newPrice = sc.nextDouble();
            sc.nextLine();
            books.updateBookPrice(key, newPrice);
            System.out.println("Giá sách đã được cập nhật");
        } else {
            System.out.println("Không tìm thấy sách với mã: " + key);
        }
    }
    
    private static Books instantBook(Scanner sc) {
        System.out.print("Nhập title: ");
        String Title = sc.nextLine();

        System.out.print("Nhập Author: ");
        String Author = sc.nextLine();

        System.out.print("Nhập Publisher: ");
        String Publisher = sc.nextLine();

        System.out.print("Nhập Year_of_Publication: ");
        int Year_of_Publication = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập Number_of_Pages: ");
        int Number_of_Pages = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập Summary: ");
        String Summary = sc.nextLine();

        System.out.print("Nhập price: ");
        int price = sc.nextInt();
        sc.nextLine();

        return new Books(Title, Author, Publisher, Year_of_Publication, Number_of_Pages, Summary, price);
    }

    private static String getKey(ListBooks books) {
        return "BK" + UUID.randomUUID().toString().substring(0, 3);
    }
}
