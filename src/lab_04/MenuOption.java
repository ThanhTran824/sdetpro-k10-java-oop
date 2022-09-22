package lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOption {
    public static void main(String[] args) {
        boolean isContinuing = true;
        int arrayLength;

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

            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    System.out.print("Please enter your number: ");
                    int newNum = scanner.nextInt();
                    myNumbers.add(newNum);
                    break;
                case 2:
                    System.out.println(myNumbers);
                    break;
                case 3:
                    if(myNumbers.size() > 0) {
                        arrayLength = myNumbers.size();
                        int maxValue = myNumbers.get(0);
                        for (int index = 1; index < arrayLength; index++)
                            if (maxValue < myNumbers.get(index))
                                maxValue = myNumbers.get(index);
                        System.out.println("Max value is: " + maxValue);
                    }
                    else System.out.println("Array is empty");
                    break;
                case 4:
                    if(myNumbers.size() > 0) {
                        arrayLength = myNumbers.size();

                        int minValue = myNumbers.get(0);
                        for (int index = 1; index < arrayLength; index++)
                            if (minValue > myNumbers.get(index))
                                minValue = myNumbers.get(index);
                        System.out.println("Min value is: " + minValue);
                    }
                    else System.out.println("Array is empty");
                    break;
                case 5:
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
                    break;
                case 6:
                    isContinuing = false;
            }
        }

    }
}
