package lab_14;

import java.util.Scanner;

public class TryCatchWithZeroNumber {

    public static void main(String[] args) {
        int dividedNumber, divisorNumber, result, count = 0;
        Boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter divisor number: ");
        divisorNumber = scanner.nextInt();
        do {
            System.out.print("Enter divided number: ");
            dividedNumber = scanner.nextInt();
            count++;
        } while (dividedNumber == 0 && count < 2);
        try {
            result = divisorNumber / dividedNumber;
        } catch (ArithmeticException e) {
            throw e;
        }
        System.out.println("result is: " + result);
    }

}
