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

        if(yourBMI < 18.5) {
            System.out.println("You are underweight");
        } else if (yourBMI >= 18.5 && yourBMI <= 24.9) {
            System.out.println("You are normal weight");
        } else if (yourBMI > 24.9 && yourBMI <= 29.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obesity");
        }
    }
}
