package lab_09;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {


    //calling
    public int getTotalSalary(List<Employee> emplList) {
        int totalSalary = 0;
        for (Employee empl : emplList) {
            totalSalary += empl.getSalary();
        }

        return totalSalary;
    }
}
