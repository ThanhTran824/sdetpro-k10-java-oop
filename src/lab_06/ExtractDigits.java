package lab_06;

public class ExtractDigits {
    public static void main(String[] args) {
        String myString = "12345abc678";
        String digits = "";

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (Character.isDigit(c)) {
                digits += c;
            }
        }

        System.out.println(digits);

    }
}
