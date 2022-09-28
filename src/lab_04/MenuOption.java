package lab_04;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOption {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isContinuing = true;

        List<Integer> myNumbers = new ArrayList<>();

        while (isContinuing) {
            System.out.println("========MENU========");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Search number");
            System.out.println("6. Quit");

            System.out.print("Please enter your choice: ");


            int userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    addNumToList(myNumbers);
                    break;
                case 2:
                    printList(myNumbers);
                    break;
                case 3:
                    if(myNumbers.size() > 0)
                        System.out.println("Max value is: " + getMaxNumber(myNumbers));
                    else System.out.println("Array is empty");
                    break;
                case 4:
                    if(myNumbers.size() > 0)
                        System.out.println("Min value is: " + getMinValue(myNumbers));
                    else System.out.println("Array is empty");
                    break;
                case 5:
                    searchNumber(myNumbers);
                    break;
                case 6:
                    isContinuing = false;
            }
        }

    }

    private static List<Integer> addNumToList(List<Integer> myNumbers) {
        System.out.print("Please enter your number: ");
        int newNum = scanner.nextInt();
        myNumbers.add(newNum);
        return myNumbers;
    }

    private static void printList(List<Integer> myNumbers) {
        System.out.println(myNumbers);
    }

    private static int getMaxNumber(List<Integer> myNumbers) {
            int arrayLength = myNumbers.size();
            int maxValue = myNumbers.get(0);
            for (int index = 1; index < arrayLength; index++)
                if (maxValue < myNumbers.get(index))
                    maxValue = myNumbers.get(index);
            return maxValue;
    }

    private static int getMinValue(List<Integer> myNumbers) {
        int arrayLength = myNumbers.size();

        int minValue = myNumbers.get(0);
        for (int index = 1; index < arrayLength; index++)
            if (minValue > myNumbers.get(index))
                minValue = myNumbers.get(index);

        return minValue;
    }

    private static void searchNumber(List<Integer> myNumbers) {
        System.out.print("Enter your number: ");
        int findNumber = scanner.nextInt();
        boolean found = false;
        for(int index = 0; index < myNumbers.size(); index++){
            if (myNumbers.get(index) == findNumber) {
                System.out.println("Your number is put in index: " + index);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Your number isn't existed in array");
    }
}
