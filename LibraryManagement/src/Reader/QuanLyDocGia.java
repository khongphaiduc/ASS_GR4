package reader;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class QuanLyDocGia {

    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String date;
    private String diaChi;
    private int maDocGia;

    public QuanLyDocGia() {
    }

    public QuanLyDocGia(String ten, int tuoi, String gioiTinh, String date, String diaChi, int maDocGia) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.date = date;
        this.diaChi = diaChi;
        this.maDocGia = maDocGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(int maDocGia) {
        this.maDocGia = maDocGia;
    }

    public void display() {
        System.out.println("Name: " + ten);
        System.out.println("Age: " + tuoi);
        System.out.println("Gender: " + gioiTinh);
        System.out.println("Date: " + date);
        System.out.println("Address: " + diaChi);
        System.out.println("Reader code: " + maDocGia);
    }

    public static QuanLyDocGia dangKyDocGiaMoi() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap Name: ");
            String ten = scanner.nextLine();

            System.out.print("Nhap Age: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Nhap Gender: ");
            String gioiTinh = scanner.nextLine();

            System.out.print("Nhap Date (dd/MM/yyyy): ");
            String date = scanner.nextLine();

            System.out.print("Nhap Address: ");
            String diaChi = scanner.nextLine();

            System.out.print("Nhap Reader code: ");
            int maDocGia = scanner.nextInt();

            return new QuanLyDocGia(ten, tuoi, gioiTinh, date, diaChi, maDocGia);

        } catch (InputMismatchException e) {
            System.out.println("Loi: Du lieu nhap vao khong hop le!");
            scanner.nextLine(); // Clear the invalid input
        } catch (Exception e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
        }
        return null;
    }

    public void capNhatThongTinDocGia() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap ten moi (hoac nhan Enter de bo qua): ");
            String tenMoi = scanner.nextLine();
            if (!tenMoi.isEmpty()) {
                this.ten = tenMoi;
            }

            System.out.print("Nhap tuoi moi (hoac nhan Enter de bo qua): ");
            String tuoiMoi = scanner.nextLine();
            if (!tuoiMoi.isEmpty()) {
                this.tuoi = Integer.parseInt(tuoiMoi);
            }

            System.out.print("Nhap gioi tinh moi (hoac nhan Enter de bo qua): ");
            String gioiTinhMoi = scanner.nextLine();
            if (!gioiTinhMoi.isEmpty()) {
                this.gioiTinh = gioiTinhMoi;
            }

            System.out.print("Nhap ngay moi (dd/MM/yyyy) (hoac nhan Enter de bo qua): ");
            String dateMoi = scanner.nextLine();
            if (!dateMoi.isEmpty()) {
                this.date = dateMoi;
            }

            System.out.print("Nhap dia chi moi (hoac nhan Enter de bo qua): ");
            String diaChiMoi = scanner.nextLine();
            if (!diaChiMoi.isEmpty()) {
                this.diaChi = diaChiMoi;
            }

            System.out.print("Nhap ma doc gia moi (hoac nhan Enter de bo qua): ");
            String maDocGiaMoi = scanner.nextLine();
            if (!maDocGiaMoi.isEmpty()) {
                this.maDocGia = Integer.parseInt(maDocGiaMoi);
            }
        } catch (NumberFormatException e) {
            System.out.println("Loi: Tuoi hoac ma doc gia phai la so!");
        } catch (Exception e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
        }
    }

    public static List<QuanLyDocGia> timKiemDocGia(List<QuanLyDocGia> danhSachDocGia, String tuKhoa) {
        List<QuanLyDocGia> ketQua = new ArrayList<>();
        
        for (QuanLyDocGia docGia : danhSachDocGia) {
            if (docGia.getTen().equalsIgnoreCase(tuKhoa) || Integer.toString(docGia.getMaDocGia()).equals(tuKhoa)) {
                ketQua.add(docGia);
            }
        }
        return ketQua;
    }
}