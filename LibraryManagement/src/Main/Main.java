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

            System.out.println("Enter 1: Quản lý Sách và Tài Liệu  ");
            System.out.println("Enter 2: Quản lý Nhân Viên Thư Viện ");
            System.out.println("Enter 3: Quản lý Độc Giả ");

            System.out.println("Enter 4: Hóa Đơn ");
            System.out.println("Enter 5: Thoát ProGram !");
            System.out.println("\n");
            System.out.print("NHập lựa chọn của bạn :");

            int op = duc.nextInt();
            duc.nextLine();

            switch (op) {

                
                case 1: {
                    BookMenu.bookmenu();
                    break;
                }
                case 2: {
                    maintest.main(args);
                    //quả lý nhân viên thư viện ở đây
                    break;
                }
                case 3: {
                    // quản lý độc giả ở đây 
                    Reader.main(args);
                    break;
                }
                case 4: {
                    MainVoice.main(args);
                    break;
                }
                case 5: {
                    System.out.println("Đã Thoát !");
                    mycheck = false;
                    break;
                 
                }
                default: System.out.println("lỗi dữ liệu!!!!!!!!");
            }
        }
    }

   
}
