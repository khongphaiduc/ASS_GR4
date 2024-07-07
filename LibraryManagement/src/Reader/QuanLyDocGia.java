package reader;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class QuanLyDocGia {

   private String name;
private int age;
private String gender;
private String dateOfBirth;
private String address;
private String readerCode;

    public QuanLyDocGia() {
    }
<<<<<<< HEAD

    public QuanLyDocGia(String name, int age, String gender, String dateOfBirth, String address, String readerCode) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.readerCode = readerCode;
=======
// ten biến bằng tiếng anh
    public QuanLyDocGia(String ten, int tuoi, String gioiTinh, String date, String diaChi, int maDocGia) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.date = date;
        this.diaChi = diaChi;
        this.maDocGia = maDocGia;
>>>>>>> 5c6ef23f4dd85a0074c89d02283691d7221628eb
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReaderCode() {
        return readerCode;
    }

    public void setReaderCode(String readerCode) {
        this.readerCode = readerCode;
    }

    
   public void display() {
    System.out.print("Name: " + name + " | ");
    System.out.print("Age: " + age + " | ");
    System.out.print("Gender: " + gender + " | ");
    System.out.print("Date: " + dateOfBirth + " | ");
    System.out.print("Address: " + address + " | ");
    System.out.print("Reader code: " + readerCode + "\n");
}

    public static QuanLyDocGia dangKyDocGiaMoi() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap Name: ");
<<<<<<< HEAD
            String ten = scanner.nextLine();
            while (!ten.matches("[a-zA-Z\\s]+")) {
                System.out.println("Loi: Ten khong duoc chua so. Vui long nhap lai.");
                System.out.print("Nhap Name: ");
                ten = scanner.nextLine();
            }

            System.out.print("Nhap Age: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
=======
            String ten = scanner.nextLine();// ?

            System.out.print("Nhap Age: ");
            int tuoi = scanner.nextInt();//?
            scanner.nextLine(); 
>>>>>>> 5c6ef23f4dd85a0074c89d02283691d7221628eb

            System.out.print("Nhap Gender: ");
            String gioiTinh = scanner.nextLine();
            while (!gioiTinh.matches("[a-zA-Z\\s]+")) {
                System.out.println("Loi: Gioi tinh khong duoc chua so. Vui long nhap lai.");
                System.out.print("Nhap Gender: ");
                gioiTinh = scanner.nextLine();
            }

            System.out.print("Nhap Date (dd/MM/yyyy): ");
            String date = scanner.nextLine();

            System.out.print("Nhap Address: ");
            String diaChi = scanner.nextLine();//?

            System.out.print("Nhap Reader code: ");
<<<<<<< HEAD
            String maDocGia = scanner.nextLine();
=======
            int maDocGia = scanner.nextInt();//?
>>>>>>> 5c6ef23f4dd85a0074c89d02283691d7221628eb

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
                this.name = tenMoi;
            }

            System.out.print("Nhap tuoi moi (hoac nhan Enter de bo qua): ");
            String tuoiMoi = scanner.nextLine();
            if (!tuoiMoi.isEmpty()) {
                this.age = Integer.parseInt(tuoiMoi);
            }

            System.out.print("Nhap gioi tinh moi (hoac nhan Enter de bo qua): ");
            String gioiTinhMoi = scanner.nextLine();
            if (!gioiTinhMoi.isEmpty()) {
                this.gender = gioiTinhMoi;
            }

            System.out.print("Nhap ngay moi (dd/MM/yyyy) (hoac nhan Enter de bo qua): ");
            String dateMoi = scanner.nextLine();
            if (!dateMoi.isEmpty()) {
                this.dateOfBirth = dateMoi;
            }

            System.out.print("Nhap dia chi moi (hoac nhan Enter de bo qua): ");
            String diaChiMoi = scanner.nextLine();
            if (!diaChiMoi.isEmpty()) {
                this.address = diaChiMoi;
            }

            System.out.print("Nhap ma doc gia moi (hoac nhan Enter de bo qua): ");
            String maDocGiaMoi = scanner.nextLine();
            if (!maDocGiaMoi.isEmpty()) {
                this.readerCode = maDocGiaMoi;
            }
        } catch (NumberFormatException e) {
            System.out.println("Loi: Tuoi hoac ma doc gia phai la so!");
        } catch (Exception e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
        }
    }

<<<<<<< HEAD
   public static List<QuanLyDocGia> timKiemDocGia(List<QuanLyDocGia> danhSachDocGia, String tuKhoa) {
    List<QuanLyDocGia> ketQua = new ArrayList<>();
    for (QuanLyDocGia docGia : danhSachDocGia) {
        if (docGia.getReaderCode().equals(tuKhoa)) { // Chỉ tìm theo mã độc giả
            ketQua.add(docGia);
=======
    public static List<QuanLyDocGia> timKiemDocGia(List<QuanLyDocGia> danhSachDocGia, String tuKhoa) {
        List<QuanLyDocGia> ketQua = new ArrayList<>();
        
        for (QuanLyDocGia docGia : danhSachDocGia) {
            if (docGia.getTen().equalsIgnoreCase(tuKhoa) || Integer.toString(docGia.getMaDocGia()).equals(tuKhoa)) {
                ketQua.add(docGia);
            }
>>>>>>> 5c6ef23f4dd85a0074c89d02283691d7221628eb
        }
    }
    return ketQua;
}
}
