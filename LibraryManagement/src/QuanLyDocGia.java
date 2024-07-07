import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuanLyDocGia {

    private String name;
    private int age;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String readerCode;

    private static Map<String, QuanLyDocGia> danhSachDocGia = new HashMap<>();

    public QuanLyDocGia() {
    }

    public QuanLyDocGia(String name, int age, String gender, String dateOfBirth, String address, String readerCode) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.readerCode = readerCode;
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

    public static void dangKyDocGiaMoi() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap Name: ");
            String name = scanner.nextLine();
            while (!name.matches("[a-zA-Z\\s]+")) {
                System.out.println("Loi: Ten khong duoc chua so. Vui long nhap lai.");
                System.out.print("Nhap Name: ");
                name = scanner.nextLine();
            }

            System.out.print("Nhap Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            System.out.print("Nhap Gender: ");
            String gender = scanner.nextLine();
            while (!gender.matches("[a-zA-Z\\s]+")) {
                System.out.println("Loi: Gioi tinh khong duoc chua so. Vui long nhap lai.");
                System.out.print("Nhap Gender: ");
                gender = scanner.nextLine();
            }

            System.out.print("Nhap Date (dd/MM/yyyy): ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("Nhap Address: ");
            String address = scanner.nextLine();

            System.out.print("Nhap Reader code: ");
            String readerCode = scanner.nextLine();

            QuanLyDocGia newReader = new QuanLyDocGia(name, age, gender, dateOfBirth, address, readerCode);
            danhSachDocGia.put(readerCode, newReader);
            System.out.println("Da dang ky doc gia moi thanh cong!");

        } catch (Exception e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
        }
    }

    public static void timKiemDocGia(String tuKhoa) {
        if (danhSachDocGia.containsKey(tuKhoa)) {
            danhSachDocGia.get(tuKhoa).display();
        } else {
            System.out.println("Khong tim thay doc gia voi ma " + tuKhoa);
        }
    }

    public void capNhatThongTinDocGia(String readerCode) {
        if (danhSachDocGia.containsKey(readerCode)) {
            QuanLyDocGia reader = danhSachDocGia.get(readerCode);
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Nhap ten moi (hoac nhan Enter de bo qua): ");
                String tenMoi = scanner.nextLine();
                if (!tenMoi.isEmpty()) {
                    reader.setName(tenMoi);
                }

                System.out.print("Nhap tuoi moi (hoac nhan Enter de bo qua): ");
                String tuoiMoi = scanner.nextLine();
                if (!tuoiMoi.isEmpty()) {
                    reader.setAge(Integer.parseInt(tuoiMoi));
                }

                System.out.print("Nhap gioi tinh moi (hoac nhan Enter de bo qua): ");
                String gioiTinhMoi = scanner.nextLine();
                if (!gioiTinhMoi.isEmpty()) {
                    reader.setGender(gioiTinhMoi);
                }

                System.out.print("Nhap ngay moi (dd/MM/yyyy) (hoac nhan Enter de bo qua): ");
                String dateMoi = scanner.nextLine();
                if (!dateMoi.isEmpty()) {
                    reader.setDateOfBirth(dateMoi);
                }

                System.out.print("Nhap dia chi moi (hoac nhan Enter de bo qua): ");
                String diaChiMoi = scanner.nextLine();
                if (!diaChiMoi.isEmpty()) {
                    reader.setAddress(diaChiMoi);
                }

                System.out.print("Nhap ma doc gia moi (hoac nhan Enter de bo qua): ");
                String maDocGiaMoi = scanner.nextLine();
                if (!maDocGiaMoi.isEmpty()) {
                    // Kiểm tra mã mới không trùng với mã độc giả khác
                    if (!danhSachDocGia.containsKey(maDocGiaMoi)) {
                        reader.setReaderCode(maDocGiaMoi);
                        danhSachDocGia.remove(readerCode); // Xóa bản ghi cũ
                        danhSachDocGia.put(maDocGiaMoi, reader); // Thêm bản ghi mới
                    } else {
                        System.out.println("Loi: Ma doc gia moi da ton tai!");
                    }
                }
                System.out.println("Cap nhat thong tin doc gia thanh cong!");

            } catch (NumberFormatException e) {
                System.out.println("Loi: Tuoi phai la mot so nguyen!");
            } catch (Exception e) {
                System.out.println("Da xay ra loi: " + e.getMessage());
            }
        } else {
            System.out.println("Khong tim thay doc gia voi ma " + readerCode);
        }
    }
}
