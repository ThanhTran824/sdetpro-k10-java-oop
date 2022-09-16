package lab_03;

import java.security.SecureRandom;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;

        int[] arrIntNumber = new int[ARRAY_LENGTH];

        for (int index = 0; index < ARRAY_LENGTH; ++index) {
            arrIntNumber[index] = new SecureRandom().nextInt(100);
        }

        for (int value : arrIntNumber) {
            System.out.print(value + " ");
        }

        //sort
        for (int index = 0; index < arrIntNumber.length; index++) {
            for (int step = index + 1; step < arrIntNumber.length; step++) {
                if (arrIntNumber[index] < arrIntNumber[step]) {
                    int temp = arrIntNumber[index];
                    arrIntNumber[index] = arrIntNumber[step];
                    arrIntNumber[step] = temp;
                }
            }
        }
        System.out.println("\n-----------------------------");
        for (int value : arrIntNumber) {
            System.out.print(value + " ");
        }
    }
}
