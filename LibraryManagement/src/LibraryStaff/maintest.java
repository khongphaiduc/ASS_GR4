
package LibraryStaff;

import java.util.ArrayList;
import java.util.Scanner;


public class maintest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    ArrayList<EmployeeModel> employee = new ArrayList<>();
    
    EmployeeController Controler = new EmployeeController();
    Controler.addDefaultEmployees(employee);
    EmployeeView menu = new EmployeeView(Controler, scanner);
   
    menu.choice(scanner, employee, 0);
    }
}
