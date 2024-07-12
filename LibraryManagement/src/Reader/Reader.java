/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reader;

import java.util.Scanner;

/**
 *
 * @author TRUNG NGUYÊN
 */
public class Reader {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String choice = "";

        do {
            System.out.println("1. Dang ky doc gia moi");
            System.out.println("2. Cap nhat thong tin doc gia");
            System.out.println("3. Tim kiem thong tin doc gia");
            System.out.println("4. Hien thi thong tin doc gia");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextLine();

            try {
                int choiceNumber = Integer.parseInt(choice);

                switch (choiceNumber) {
                    case 1:
                        ReaderManagement.registerNewReader();
                        break;
                    case 2:
                        System.out.print("Nhap ma doc gia can cap nhat: ");
                        String readerCodeToUpdate = scanner.nextLine();
                        ReaderManagement readerManagement = new ReaderManagement();
                        readerManagement.updateReaderInfo(readerCodeToUpdate);
                        break;
                    case 3:
                        System.out.print("Nhap ma doc gia de tim kiem: ");
                        String keyword = scanner.nextLine();
                        ReaderManagement.searchReader(keyword);
                        break;
                    case 4:
                        System.out.print("Nhap ma doc gia de hien thi thong tin: ");
                        String codeToShow = scanner.nextLine();
                        ReaderManagement.searchReader(codeToShow);
                        break;
                    case 5:
                        System.out.println("Thoat khoi chuong trinh.");
                        break;
                    default:
                        System.out.println("Lua chon sai (chon 1 hoac 2 hoac 3 hoac 4 hoac 5). Vui long nhap lai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lua chon sai. Vui long nhap mot so nguyen.");
            }

        } while (!choice.equals("5"));
    }
}
    