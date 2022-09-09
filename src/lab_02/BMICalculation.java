package lab_02;

import java.util.Scanner;

public class BMICalculation {

    public static void main(String[] args) {
        float yourHeight;
        float yourWeight;
        float yourBMI;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height (meter): ");
        yourHeight = scanner.nextFloat();
        System.out.print("Enter your weight (kg): ");
        yourWeight = scanner.nextFloat();
        //calculate BMI
        yourBMI = yourWeight / (yourHeight * 2);
        System.out.println("Your BMI is: " + yourBMI);
    }
}
