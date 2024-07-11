package Main;

import BookAndDocument.BookMenu;
import DataBooks.*;
import Invoice.*;
import java.util.Scanner;
import Reader.*;
import LibraryStaff.maintest;

public class Main {

    public static void main(String[] args) {

        Scanner duc = new Scanner(System.in);

        boolean mycheck = true;

        while (mycheck) {

            System.out.println("------------- HỆ THỐNG QUẢN LÝ  Nhà Sách --------------");
<<<<<<< HEAD
            System.out.println("Enter 3 Quản Lý Nhân Viên ");
=======
            System.out.println("Enter 1 Quản lý Mượn Trả Sách  ");
            System.out.println("Enter 2 Quản lý Sách và Tài Liệu  ");
            System.out.println("Enter 3 Quản lý Nhân Viên Thư Viện ");
            System.out.println("Enter 4 Quản lý Độc Giả ");
>>>>>>> 4f53eac8a6482259b9ab618ad5270009000b6a3a
            System.out.println("Enter 5 Hóa Đơn ");
            System.out.println("Enter 6 Thoát ProGram !");
            System.out.println("\n");
            System.out.print("NHập lựa chọn của bạn :");

            int op = duc.nextInt();
            duc.nextLine();

            switch (op) {

                case 1: {
                    // quản lý mượn trả sách ở đây
                    break;
                }
                case 2: {
                    BookMenu.bookmenu();
                    break;
                }
                case 3: {
                    maintest.main(args);
                    //quả lý nhân viên thư viện ở đây
                    break;
                }
                case 4: {
                    // quản lý độc giả ở đây 
                    Reader.main(args);
                    break;
                }
                case 5: {
                    MainVoice.main(args);
                    break;
                }
                case 6: {
                    System.out.println("Đã Thoát !");
                    mycheck = false;
                    break;
                }
            }
        }
    }

   
}
