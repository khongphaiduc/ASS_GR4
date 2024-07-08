package Invoice;

import DataBooks.*;
import DataBooks.ListBooks;
import java.time.LocalDateTime;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
// code by Pham Trung Đức 

public class OutInvoice {

    static Scanner duc = new Scanner(System.in);
    static ArrayList<Object> danhsach = new ArrayList<>();

    LocalDateTime time = LocalDateTime.now();

    DateTimeFormatter time1 = DateTimeFormatter.ofPattern("  dd/MM/yyyy  hh/mm/ss");
    DateTimeFormatter time2 = DateTimeFormatter.ofPattern("ddMMyyyhhmmss");

    String time1s = time.format(time1);
    String time2s = time.format(time2);

    public static boolean mycheckname(String name) {

        return name.matches("[a-zA-Z ]+");

    }

    public void invoice(String name, Integer age) throws IOException {

        if (!mycheckname(name)) {
            throw new IllegalArgumentException("Tên không được chứa ký tự đặng biết hoặc chữ số nha nghe !");
        }

        if (age <= 0) {
            throw new IllegalArgumentException("age không được nhỏ hơn hoặc bằng 0 !");
        }

        File file = new File("hoa_don_" + time2s + ".txt");
        if (file.createNewFile()) {
            System.out.println("Hóa Đơn Đã Sắm Sàng !");
        } else {
            System.out.println("------- Hóa Đơn Đã Tồn Tại !! --------");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("hoa_don_" + time2s + ".txt"))) {
            writer.write("------------- Hóa Đơn Thư Viện GR4 --------------\n");
            writer.write("Tên Khách Hàng : " + name + "\n");
            writer.write("Thời Gian Mua Mượn : " + time1s + "\n");
            writer.write("Mã Hóa Hóa Đơn : " + time2s + "\n");

            writer.write("Nội Dung Gồm \n ");
            double sumtien = 0;
            ListBooks obz = new ListBooks();
          
              System.out.println("Nhập 01 để kết thúc thêm sách vào hóa đơn !");
               System.out.println("Nhập Mã Sách ");
               int count=-1,stt=0;
                 double moneynew=0;
                 
            while (true) {
     stt++;
                String codebooks = duc.nextLine();
                count++;
                if (codebooks.equals("01")) {
                    break;
                }
                // lấy đối tượng của 1 hashmap ép kiểu về 1 đối tượng cụ thể mới mục  đích có thể truy cập lấy thông tin của 1 thuộc tính cụ thể 
                Books mtp = (Books) obz.getDataListBook().get(codebooks);//ép kiểu lấy đối tưởng từ hashmap về đối tượng books

<<<<<<< HEAD
                Books mtp = (Books) obz.getDataListBook().get(namebooks);//ép kiểu lấy đối tưởng từ hashmap về đối tượng books

                int tien = (int) mtp.getPrice();
                sumtien = sumtien + tien;
=======
                double tien = mtp.getPrice();
               
                        
              
                       sumtien = sumtien + tien;
                
             
                     
                
                String namebooks="STT :"+stt+" "+mtp.getTitle();
>>>>>>> 5f5845b749ba4f22a881a9b5e36923f990f9b416
                
                danhsach.add(namebooks);

            }
            
                      if(count>=5){
                           moneynew  =  sumtien*0.9;
                       }else{
                            moneynew= sumtien;
                      }
      
            for (int i = 0; i < danhsach.size(); i++) {
            writer.write(danhsach.get(i)+"\n");
            }
            
            writer.write("Số Lượng :"+count+"\n");
            writer.write("Tiền Gốc Là :"+sumtien +"\n");
            writer.write("Tiền Sau Khi Giảm Giá là  :"+moneynew +"\n");
            writer.write("Tổng tiền cần thanh toán sau khi VAT  là: ");
            writer.write(String.valueOf(moneynew*1.01 )+ " Nghìn Đồng !");
            writer.write("\n ");
            writer.write("Cảm Ơn Quý Khách Đã Tin Tưởng Dịch Vụ Của Chúng Tôi !\n");
              writer.write("--------------------------------------------------------------------------------------");
        }
        
        BufferedReader reader = new BufferedReader(new FileReader("hoa_don_" + time2s + ".txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    }

    public void FindHoaDon(String code) throws IOException {

        BufferedReader reader1 = new BufferedReader(new FileReader("hoa_don_" + code + ".txt"));
        String line1;
        System.out.println("Thông Tin Hóa Đơn Mà Bạn Tìm Kiếm");
        while ((line1 = reader1.readLine()) != null) {
            System.out.println(line1);
        }

    }
}
