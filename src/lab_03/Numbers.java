package lab_03;

import java.security.SecureRandom;

public class Numbers {
    public static void main(String[] args) {
        final short ARRAY_LENGTH = 10;
        int coundOdd = 0, countEven = 0;
        int[] arrNumber = new int[ARRAY_LENGTH];
        for (int index = 0; index < ARRAY_LENGTH; ++index){
            arrNumber[index] = new SecureRandom().nextInt(100);
        }

        for (int value : arrNumber){
            System.out.println(value);
        }
        System.out.println("-----------------------------------------------------");
        for (int value : arrNumber){
            if(value % 2 == 0)
                countEven++;
            else coundOdd++;
        }

        System.out.println("Odd number is: " + coundOdd);
        System.out.println("Even number is: " + countEven);
    }
}
