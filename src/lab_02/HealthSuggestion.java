package lab_02;

import java.util.Scanner;

public class HealthSuggestion {
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

        if(yourBMI < 18.5) {
            System.out.println("You should increase: " + ((18.5 - yourBMI) * yourHeight * 2) + " (kg)");
        }
        else if (yourBMI >= 18.5 && yourBMI < 24.9) {
            System.out.println("Your health is well");
        }
        else {
            System.out.println("You should decrease: " + ((yourBMI - 24.9) * yourHeight * 2) + " (kg)");
        }
    }

}
