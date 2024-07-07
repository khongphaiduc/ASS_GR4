/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reader;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author TRUNG NGUYÊN
 */
public class ReaderManagement {

    private String name;
    private int age;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String readerCode;

    private static Map<String, ReaderManagement> readerList = new HashMap<>();

    public ReaderManagement() {
    }

    public ReaderManagement(String name, int age, String gender, String dateOfBirth, String address, String readerCode) {
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
        System.out.print("Date of Birth: " + dateOfBirth + " | ");
        System.out.print("Address: " + address + " | ");
        System.out.print("Reader Code: " + readerCode + "\n");
    }

    public static void registerNewReader() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap ten: ");
            String name = scanner.nextLine();
            while (!name.matches("[a-zA-Z\\s]+")) {
                System.out.println("Loi: Ten khong the chua so. Vui long nhap lai.");
                System.out.print("Nhap name: ");
                name = scanner.nextLine();
            }

            int age = -1;
            boolean valid = false;
            while (!valid) {
                System.out.print("Nhap tuoi: ");
                try {
                    age = scanner.nextInt();
                    scanner.nextLine();
                    if (age > 0) {
                        valid = true;
                    } else {
                        System.out.println("Loi: Tuoi phai la so duong.");
                    }
                } catch (Exception e) {
                    System.out.println("Loi: Vui long nhap mot so hop le( Khong duoc nhap chu cai).");
                    scanner.nextLine();
                }
            }

            String gender = "";
            while (!gender.equals("1") && !gender.equals("2")) {
                System.out.print("Nhap gioi tinh (1 cho nam, 2 cho nu): ");
                gender = scanner.nextLine();
                if (!gender.equals("1") && !gender.equals("2")) {
                    System.out.println("Loi: Gioi tinh chi co 1 (nam) hoac 2 (nu).");
                }
            }

            String dateOfBirth = "";
            boolean validDate = false;
            while (!validDate) {
                System.out.print("Nhap ngay thang nam sinh (dd/MM/yyyy): ");
                dateOfBirth = scanner.nextLine();
                if (dateOfBirth.matches("\\d{2}/\\d{2}/\\d{4}")) {
                    String[] parts = dateOfBirth.split("/");
                    int day = Integer.parseInt(parts[0]);
                    int month = Integer.parseInt(parts[1]);
                    int year = Integer.parseInt(parts[2]);

                    if (day >= 1 && day <= 31 && month >= 1 && month <= 12) {
                        validDate = true;
                    } else {
                        System.out.println("Loi: Ngay thang nam sinh khong hop le. Vui long nhap lai.");
                    }
                } else {
                    System.out.println("Loi: Ngay thang nam sinh khong dung dinh dang. Vui long nhap lai.");
                }
            }

            System.out.print("Nhap dia chi: ");
            String address = scanner.nextLine();

            System.out.print("Nhap ma doc gia: ");
            String readerCode = scanner.nextLine();

            ReaderManagement newReader = new ReaderManagement(name, age, gender, dateOfBirth, address, readerCode);
            readerList.put(readerCode, newReader);
            System.out.println("Thanh cong nhap vao doc gia moi!");

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    public static void searchReader(String keyword) {
        if (readerList.containsKey(keyword)) {
            readerList.get(keyword).display();
        } else {
            System.out.println("Khong tim thay ma doc gia " + keyword);
        }
    }

    public void updateReaderInfo(String readerCode) {
        if (readerList.containsKey(readerCode)) {
            ReaderManagement reader = readerList.get(readerCode);
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Nhap ten moi (hoac an Enter de bo qua): ");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    reader.setName(newName);
                }

                System.out.print("Nhap tuoi moi (hoac an Enter de bo qua): ");
                String newAge = scanner.nextLine();
                if (!newAge.isEmpty()) {
                    reader.setAge(Integer.parseInt(newAge));
                }

                System.out.print("Nhap gioi tinh moi (hoac an Enter de bo qua): ");
                String newGender = scanner.nextLine();
                if (!newGender.isEmpty()) {
                    reader.setGender(newGender);
                }

                System.out.print("Nhap ngay thang nam moi (dd/MM/yyyy) (hoac an Enter de bo qua): ");
                String newDateOfBirth = scanner.nextLine();
                if (!newDateOfBirth.isEmpty()) {
                    reader.setDateOfBirth(newDateOfBirth);
                }

                System.out.print("Nhap dia chi moi (hoac an Enter de bo qua)): ");
                String newAddress = scanner.nextLine();
                if (!newAddress.isEmpty()) {
                    reader.setAddress(newAddress);
                }

                System.out.print("Nhap ma doc gia moi (hoac an Enter de bo qua)): ");
                String newReaderCode = scanner.nextLine();
                if (!newReaderCode.isEmpty()) {

                    if (!readerList.containsKey(newReaderCode)) {
                        reader.setReaderCode(newReaderCode);
                        readerList.remove(readerCode);
                        readerList.put(newReaderCode, reader);
                    } else {
                        System.out.println("Loi: Ma doc gia moi da ton tai!");
                    }
                }
                System.out.println("Cap nhat thong tin doc gia thanh cong!");

            } catch (NumberFormatException e) {
                System.out.println("Loi: Tuoi phai la mot so!");
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
        } else {
            System.out.println("Khong tim thay doc gia voi ma " + readerCode);
        }
    }
}
