package lab_09;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        //form up data from objects
        Employee emplThanhTran = new FTE();
        emplThanhTran.setName("Thanh");
        emplThanhTran.setSalary(Settings.FTE_SALARY);
        Employee emplDuongTran = new Contractor();
        emplDuongTran.setName("Duong");
        emplDuongTran.setSalary(Settings.CONTRACTOR_SALARY);

        List<Employee> employeeList = Arrays.asList(emplThanhTran, emplDuongTran);

        //Calling controller to process data
        int totalSalary = new EmployeeController().getTotalSalary(employeeList);
        System.out.println("Total salary: " + totalSalary);
    }
}
