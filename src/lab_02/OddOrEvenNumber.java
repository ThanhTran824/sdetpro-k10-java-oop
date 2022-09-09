package lab_02;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        System.out.print("Please enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if(userNumber % 2 == 0) {
            System.out.println(userNumber + " is even number.");
        }
        else System.out.println(userNumber + " is odd number.");
    }
}
