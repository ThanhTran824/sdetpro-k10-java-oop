package lab_06;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        String myPassword = "password123@";
        final int TRY_ENTER = 3;

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < TRY_ENTER) {
            System.out.print("Please enter your password: ");
            String myInput = scanner.nextLine();
            if(myInput.equals(myPassword)) {
                System.out.println("You are correct");
                break;
            }
            else {
                count++;
            }
        }

        if(count == TRY_ENTER){
            System.out.println("You are reach maximum password tries");
        }
    }
}
