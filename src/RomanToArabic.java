public class RomanToArabic {
    public static int romanToArabic (String str) {

        if (str.equals("I")) {
            return 1;
        } else if (str.equals("II")) {
            return 2;
        } else if (str.equals("III")) {
            return 3;
        } else if (str.equals("IV")) {
            return 4;
        } else if (str.equals("V")) {
            return 5;
        } else if (str.equals("VI")) {
            return 6;
        } else if (str.equals("VII")) {
            return 7;
        } else if (str.equals("VIII")) {
            return 8;
        } else if (str.equals("IX")) {
            return 9;
        } else if (str.equals("X")) {
            return 10;
        } else {
            return -1;
        }
    }
}

