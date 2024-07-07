import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Dang ky doc gia moi");
            System.out.println("2. Cap nhat thong tin doc gia");
            System.out.println("3. Tim kiem doc gia");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    QuanLyDocGia.dangKyDocGiaMoi();
                    break;
                case 2:
                    System.out.print("Nhap ma doc gia can cap nhat: ");
                    String maDocGiaCanCapNhat = scanner.nextLine();
                    QuanLyDocGia quanLyDocGia = new QuanLyDocGia();
                    quanLyDocGia.capNhatThongTinDocGia(maDocGiaCanCapNhat);
                    break;
                case 3:
                    System.out.print("Nhap ma doc gia can tim: ");
                    String tuKhoa = scanner.nextLine();
                    QuanLyDocGia.timKiemDocGia(tuKhoa);
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 4);
    }
}
