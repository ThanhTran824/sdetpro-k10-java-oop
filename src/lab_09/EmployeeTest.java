package lab_09;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        //form up data from objects
        Employee emplThanhTran = new FTE();
        Employee emplDuongTran = new Contractor();
        Employee emplThongTran = new Contractor();

        List<Employee> employeeList = Arrays.asList(emplThanhTran, emplDuongTran, emplThongTran);

        //Calling controller to process data
        int totalSalary = new EmployeeController().getTotalSalary(employeeList);
        System.out.println("Total salary: " + totalSalary);
    }
}
