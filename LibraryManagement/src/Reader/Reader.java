/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reader;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Reader {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        List<QuanLyDocGia> danhSachDocGia = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChuong trinh quan ly doc gia:");
            System.out.println("1. Dang ky doc gia moi");
            System.out.println("2. Cap nhat thong tin doc gia");
            System.out.println("3. Tim kiem doc gia");
            System.out.println("4. Hien thi danh sach doc gia");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        QuanLyDocGia docGiaMoi = QuanLyDocGia.dangKyDocGiaMoi();
                        if (docGiaMoi != null) {
                            danhSachDocGia.add(docGiaMoi);
                            System.out.println("Dang ky doc gia moi thanh cong!");
                        }
                        break;
                    case 2:
                        System.out.print("Nhap ma doc gia can cap nhat: ");
                        int maDocGiaCanCapNhat = scanner.nextInt();
                        scanner.nextLine();
                        boolean found = false;
                        for (QuanLyDocGia docGia : danhSachDocGia) {
                            if (docGia.getMaDocGia() == maDocGiaCanCapNhat) {
                                docGia.capNhatThongTinDocGia();
                                found = true;
                                System.out.println("Cap nhat thong tin doc gia thanh cong!");
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Khong tim thay ma doc gia!");
                        }
                        break;
                    case 3:
                        System.out.print("Nhap ten hoac ma doc gia can tim: ");
                        String tuKhoa = scanner.nextLine();
                        List<QuanLyDocGia> ketQuaTimKiem = QuanLyDocGia.timKiemDocGia(danhSachDocGia, tuKhoa);
                        if (ketQuaTimKiem.isEmpty()) {
                            System.out.println("Khong tim thay doc gia!");
                        } else {
                            for (QuanLyDocGia docGia : ketQuaTimKiem) {
                                docGia.display();
                            }
                        }
                        break;
                    case 4:
                        for (QuanLyDocGia docGia : danhSachDocGia) {
                            docGia.display();
                        }
                        break;
                    case 0:
                        System.out.println("Thoat chuong trinh.");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le! Vui long thu lai.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Loi: Lua chon phai la mot so nguyen!");
                scanner.nextLine(); // Clear the invalid input
                choice = -1; // Reset choice to avoid exiting the loop
            } catch (Exception e) {
                System.out.println("Da xay ra loi: " + e.getMessage());
                choice = -1; // Reset choice to avoid exiting the loop
            }
        } while (choice != 0);
    }
}
