package lab_06;

import javax.swing.text.EditorKit;

public class TimeToMinutes {
    public static void main(String[] args) {
        String givenString = "2hrs and 5 minutes";

        String[] strSplit = givenString.split("and");

        int totalMinutes = 0;
        String digits;

        String strHour = strSplit[0].trim();
        String strMinutes = strSplit[1].trim();
        if(strHour.contains("hrs")){
            digits = "";
            for (int i = 0; i < strHour.length(); i++) {
                char c = strHour.charAt(i);
                if (Character.isDigit(c)) {
                    digits += c;
                }
            }
            //System.out.println(digits);
            totalMinutes += (Integer.parseInt(digits) * 60);
        }
        if(strMinutes.contains("minutes")){
            digits = "";
            for (int i = 0; i < strMinutes.length(); i++) {
                char c = strMinutes.charAt(i);
                if (Character.isDigit(c))
                    digits += c;
            }
            totalMinutes += Integer.parseInt(digits);
        }

        System.out.println(totalMinutes);
    }
}
