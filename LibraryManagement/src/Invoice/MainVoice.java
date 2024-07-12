package Invoice;

import DataBooks.ListBooks;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainVoice {

    public static void main(String[] args) {

        Scanner duc = new Scanner(System.in);

        OutInvoice obj1 = new OutInvoice();
        ListBooks obj2 = new ListBooks();

        
               
          
     
            
        try{
        
        boolean mycheck=true;
        
        while (mycheck) {

            System.out.println("----------------- HÓA ĐƠN ---------------");

            System.out.println("Enter 1 để tạo hóa đơn mới.");
            System.out.println("Enter 2 để tìm kiếm hóa đơn.");
            System.out.println("Enter 0 để thoát .");

            int op = duc.nextInt();
            
        
            
            if(op!=1&&op!=2&&op!=0){
                System.out.println("Mày Nhìn Xem Có Option "+op+" Không ???? Mà Chọn !!");
            }
                    
            duc.nextLine();

            switch (op) {
                case 1: {

                    boolean check = true;

                    while (check) {

                        System.out.println("-----------------------------");
                        System.out.println("Bạn Đang  Tạo Hóa Đơn !!!!! ");
                        System.out.println("Nhập tên (-) thể thoát khỏi tạo hóa đơn ! ");
                        System.out.print("Nhập tên :");
                        String name = duc.nextLine();

                        if (name.equals("-")) {
                            check = false;
                            break;
                        }

                        System.out.print("Nhập Tuổi : ");
                        int age = duc.nextInt();
                        duc.nextLine();
                        obj2.DisplayListNameBook();
                        try {
                            obj1.invoice(name, age);

                        } catch (Exception e) {
                            System.out.println("Nhập sai Vui Lòng Lại Nhé  ");

                        }

                    }
                    break;
                }

                case 2:{
                    boolean check = true;
                    
                    while (check) {
                        System.out.print("Nhập Mã Hóa Đơn (Nếu code = ( - )  Thoát tìm kiếm) : ");
                        String code = duc.nextLine();
                        
                        if(code.equals("-")){
                            check=false;
                            break;
                        }
                        
                        try {
                            obj1.FindHoaDon(code);

                        } catch (Exception e) {
                            System.out.println("Hóa Đơn Không Tồn Tại !");
                        }
                    }

                    break;
                    }
                case 0:
                    System.out.println("Nhấn 1 phím bất kỳ để thoát khỏi mục hóa đơn ^*^ ");
                    String out=duc.nextLine();
                    mycheck=false;
                    break;
                default:
                    break;
            }
            
        }
    }catch(InputMismatchException e ){
        
            System.out.println("Không nhập chữ  !");
            
        }
        }
    
}

