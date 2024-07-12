package LibraryStaff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;


import java.util.Scanner;

public class EmployeeController {

    public void addemployee(Scanner scanner, ArrayList<EmployeeModel> employee) {
        System.out.println("nhập thông tin nhân viên");
        try{
        System.out.println("nhập tên nhân viên( không dấu)");
        String name = scanner.nextLine();
        if (!name.matches("[a-zA-Z\\s]+")) {
        System.out.println("không hợp lệ. Nhập đúng định dạng");
        System.out.println("nhập tên nhân viên");
         name = scanner.nextLine();
    }
       
        System.out.println("nhập tuổi nhân viên");
        int age = scanner.nextInt();
        scanner.nextLine();
        
         
        
        System.out.println("nhập giới tính(không dấu)");
        String gender = scanner.nextLine();
        if (!gender.matches("[a-zA-Z\\s]+")) {
        System.out.println("không hợp lệ. Nhập đúng định dạng");
        System.out.println("nhập giới tính");
        gender = scanner.nextLine();
        }
        
        
        System.out.println("nhập địa chỉ nhân viên(không dấu)");
        String address = scanner.nextLine();

        System.out.println("nhập ID nhân viên");
        
        int ID = scanner.nextInt();

        scanner.nextLine();
        
        

        EmployeeModel employees = new EmployeeModel(name, address, gender, age, ID);
        employee.add(employees);
        System.out.println("Đã thêm nhân viên!");
        
         
    
    }catch (InputMismatchException ime) {
            System.out.println("không hợp lệ. Định dạng không đúng( nhập số )");
            scanner.nextLine();
        
    }
            
            
    }
    


    public void removeemployee(ArrayList<EmployeeModel> employee, int idremove) {
        boolean fo =false;
        for (EmployeeModel nhanvien : employee) {

            {
                if (nhanvien.getID() == idremove) {
                    employee.remove(nhanvien);
                    System.out.println("đã xóa nhân viên có ID: " + idremove);
                    fo = true;
                    break;
                } 
                    
                    
                }

            }if(!fo){
                System.out.println("không tìm thấy ID này");

        }
    }
    

    public void clearemploy(ArrayList<EmployeeModel> employee, Scanner scanner, int choice) {

        do {
            System.out.println("chọn 1 chức năng xóa");
            System.out.println("1.xóa toàn bộ danh sách");
            System.out.println("2.xóa nhân viên theo ID ");
            System.out.println("3.chọn 0 để thoát");
       try{
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    
                    employee.clear();
                    System.out.println("đã xóa toàn bộ");
                    break;

                case 2:
                    System.out.println("nhập ID nhân viên");
                    int idremove = scanner.nextInt();
                    scanner.nextLine();
                    removeemployee(employee, idremove);

                    break;
                
            }

        } catch(InputMismatchException e){
            System.out.println("lỗi! nhập lại định dạng( số nguyên) ");
            scanner.nextLine();
        }

    }while (choice != 0);
        }
        
    public void display(ArrayList<EmployeeModel> employee) {
        if (employee.isEmpty()) {
            System.out.println("không có nhân viên");
        } else {
            Collections.sort(employee, Comparator.comparingInt(EmployeeModel::getID));

            for (EmployeeModel em : employee) {

                System.out.printf("name: %s, age: %d, gender: %s, address: %s, ID: %d, ", em.getName(), em.getAge(), em.getGender(), em.getAddress(), em.getID());
                System.out.println("      ");

            }
        }

    }

    public void changeemployee(Scanner scanner, ArrayList<EmployeeModel> employee, int ID) {
       
        try{
        System.out.println("nhập ID nhân viên cần thay đổi");
        ID = scanner.nextInt();
        scanner.nextLine();
        
        boolean fo = false;
        for (EmployeeModel manageLibraryStaff : employee) {
            if (manageLibraryStaff.getID() == ID) {
                System.out.println("nhập tên mới");
                manageLibraryStaff.setName(scanner.nextLine());

                System.out.println("nhập tuổi mới");
                manageLibraryStaff.setAge(scanner.nextInt());
                scanner.nextLine();
                
                System.out.println("nhập giới tính ");
                manageLibraryStaff.setGender(scanner.nextLine());

                System.out.println("nhập địa chỉ mới");
                manageLibraryStaff.setAddress(scanner.nextLine());
            
           
            System.out.println("thông tin sau khi cập nhât");
            System.out.printf("name:%15s, age:%2d, gender:%s address:%s", manageLibraryStaff.getName(), manageLibraryStaff.getAge(), manageLibraryStaff.getGender(), manageLibraryStaff.getAddress());
            System.out.println("    ");
            fo = true;
            break;
           
        }
         
    }if(!fo){
         System.out.println("không tìm thấy ID");
    }   
    }catch (InputMismatchException e) {
        System.out.println("Lỗi! Bạn cần nhập vào một số nguyên cho ID.");
        scanner.nextLine(); 
    }
    }

    public void employeeSalary(Scanner scanner, ArrayList<EmployeeModel> employee, double time, int choice, int id, double salary, int shift) {
        
        do {
            System.out.println("1.cập nhật lương nhân viên");
            System.out.println("2.tính lương nhân viên");
            System.out.println("0.nhập 0 để thoát");
        try{
            choice = scanner.nextInt();
            scanner.nextLine();
            boolean fo = false;

            switch (choice) {
                case 1:
                    System.out.println("nhập id nhân viên");

                    id = scanner.nextInt();
                    for (EmployeeModel manageLibraryStaff : employee) {

                        if (manageLibraryStaff.getID() == id) {
                            System.out.println("cập nhật lương ca 1 ");
                            double salary1 = scanner.nextDouble();
                            System.out.println("cập nhật lương ca 2");
                            double salary2 = scanner.nextDouble();
                            System.out.println("cập nhật lương ca 3");
                            double salary3 = scanner.nextDouble();

                            manageLibraryStaff.setSalary1(salary1);
                            manageLibraryStaff.setSalary2(salary2);
                            manageLibraryStaff.setSalary3(salary3);

                            System.out.println("thông tin nhân viên đã được cập nhật:"  + manageLibraryStaff.getName().toUpperCase() + " - "+"Ca 1:" + salary1 +"VND" + " - "+"Ca 2:"+ salary2 +"VND" + " - "+"Ca 3:" + salary3 +"VND");
                            fo = true;
                            break;
                        }
                        
                            

                    }if(!fo){
                        System.out.println("không tìm thấy nhân viên có ID:" + id);
                    } break;
                   

                case 2:
                   
                    System.out.println(" nhập id cần tính lương");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    boolean fe = false;
                    for (EmployeeModel manageLibraryStaff : employee) {
                        if (manageLibraryStaff.getID() == id) {
                            System.out.println("nhập ca làm( 1_2_3)");
                            shift = scanner.nextInt();
                            System.out.println("nhập thời gian đã làm(giờ)");
                            time = scanner.nextDouble();
                        
                        
                            
                        switch (shift) {
                            case 1:
                                salary = manageLibraryStaff.getSalary1();
                                break;
                            case 2:
                                salary = manageLibraryStaff.getSalary2();
                                break;
                            case 3:
                                salary = manageLibraryStaff.getSalary3();
                                break;
                        }
                        
                        double salarys = time * salary;
                        System.out.println("số tiền nhận đươc: " + salarys + "VND");
                        fe = true;
                        break;
                        
                    }
                    
                    
                      }if(!fe){
                            System.out.println("không tìm thấy ID " + id);
                       } break;
                

            }
        }catch(InputMismatchException e){
            System.out.println("Lỗi! Nhập lại định dạng ");
            scanner.nextLine();
        }

        }while(choice != 0);}   

    public EmployeeController search(Scanner scanner, ArrayList<EmployeeModel> employee, int sear) {
        try{
        System.out.println("nhập ID nhân viên cần tìm");
        sear = scanner.nextInt();
        scanner.nextLine();
        boolean fo = false;
        for (EmployeeModel manageLibraryStaff : employee) {
            if (manageLibraryStaff.getID() == sear) {
               
                System.out.printf("name:%15s, age:%2d, address:%s, ID:%4d", manageLibraryStaff.getName(), manageLibraryStaff.getAge(), manageLibraryStaff.getAddress(), manageLibraryStaff.getID());
                System.out.println("   ");
                fo = true;
                break;
            } 
            
        }if(!fo){
               System.out.println("không tìm thấy ID nhân viên");
        }

    }catch(InputMismatchException e ){
            System.out.println("nhập định dạng không đúng ( nhập số nguyên ) ");
            scanner.nextLine();
    } 
        return null;
}
    public void addDefaultEmployees(ArrayList<EmployeeModel> employee) {
       EmployeeModel emp1 = new EmployeeModel("Nguyen Van An", "Ha Noi", "Nam", 30, 1123);
       EmployeeModel emp2 = new EmployeeModel("Tran Thi Nhung", "Ho Chi Minh", "Nu", 25, 2234);
       EmployeeModel emp3 = new EmployeeModel("Le Van Cau", "Da Nang", "Nam", 28, 3345);
       EmployeeModel emp4 = new EmployeeModel("Pham Thi Dieu", "Hai Phong", "Nu", 32, 4456);
       EmployeeModel emp5 = new EmployeeModel("Hoang Van Nhan", "Can Tho", "Nam", 27, 5567);


        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        employee.add(emp4);
        employee.add(emp5);
    
    
}
}
