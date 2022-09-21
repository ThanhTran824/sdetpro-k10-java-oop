package lab_03;

import java.security.SecureRandom;
import java.util.Arrays;

public class SortedArrayMerger {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int[] arrayA = new int[ARRAY_LENGTH];
        int[] arrayB = new int[ARRAY_LENGTH];
        //create two arrays with random value
        for (int index = 0; index < ARRAY_LENGTH; ++index) {
            arrayA[index] = new SecureRandom().nextInt(100);
        }

        for (int index = 0; index < ARRAY_LENGTH; ++index){
            arrayB[index] = new SecureRandom().nextInt(100);
        }

        //sort
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        //print Array
        for (int value : arrayA){
            System.out.print(value + " ");
        }

        System.out.println("\n");

        for (int value : arrayB){
            System.out.print(value + " ");
        }

        System.out.println("\n");
        //Merge
        int pivotA = -1;
        int pivotB = -1;

        int[] arrayC = new int[ARRAY_LENGTH * 2];
        int indexA = 0, indexB = 0, indexC = 0;

        while(indexA < ARRAY_LENGTH || indexB < ARRAY_LENGTH) {
            //if indexA == ARRAY_LENGTH || indexB == ARRAY_LENGTH
            if(indexA == ARRAY_LENGTH) {
                arrayC[indexC++] = arrayB[indexB];
                indexB++;
            }
            else if (indexB == ARRAY_LENGTH) {
                arrayC[indexC++] = arrayA[indexA];
                indexA++;
            }

            //else if indexA < ARRAY_LENGTH || indexB < ARRAY_LENGTH
            else if (arrayA[indexA] <= arrayB[indexB]) {
                arrayC[indexC++] = arrayA[indexA];
                indexA++;
            }
            // arrayA[indexA] > arrayB[indexB]
            else {
                arrayC[indexC++] = arrayB[indexB];
                indexB++;
            }
        }

        //print Array

        System.out.println("Array after merge: ");
        for (int value : arrayC){
            System.out.print(value + " ");
        }
    }
}
