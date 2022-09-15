package lab_03;

import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.security.SecureRandom;

public class MaxAndMinNumberInArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] arrIntNumber = new int[ARRAY_LENGTH];

        for(int index = 0; index < ARRAY_LENGTH; index++) {
            arrIntNumber[index] = new SecureRandom().nextInt(100);
        }

        for(int value : arrIntNumber){
            System.out.println(value);
        }

        int maxNumber = arrIntNumber[0];
        int minNumber = arrIntNumber[0];

        for(int index = 1; index < ARRAY_LENGTH; index++) {
            if(arrIntNumber[index] < minNumber)
                minNumber = arrIntNumber[index];
            if(arrIntNumber[index] > maxNumber)
                maxNumber = arrIntNumber[index];
        }

        System.out.println("Max number is: " + maxNumber);
        System.out.println("Min number is: " + minNumber);
    }
}
