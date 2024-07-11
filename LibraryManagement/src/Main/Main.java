package Main;

import BookAndDocument.BookMenu;
import DataBooks.*;
import Invoice.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner duc = new Scanner(System.in);

        boolean mycheck = true;

        while (mycheck) {

            System.out.println("------------- HỆ THỐNG QUẢN LÝ  Nhà Sách --------------");
            System.out.println("Enter 5 Hóa Đơn ");
            System.out.println("Enter 6 Thoát ProGram !");
            System.out.println("\n");
            System.out.print("NHập lựa chọn của bạn :");

            int op = duc.nextInt();

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
                    //quả lý nhân viên thư viện ở đây
                    break;
                }
                case 4: {
                    // quản lý độc giả ở đây 
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
