package main;

public class RomeOperation extends Operation {
    private String str1 = "I";
    private String str2 = "II";
    private String str3 = "III";
    private String str4 = "IV";
    private String str5 = "V";
    private String str6 = "VI";
    private String str7 = "VII";
    private String str8 = "VIII";
    private String str9 = "IX";
    private String str10 = "X";

    public int romanToArabic1(String a) {
        if (str1.intern() == a.intern()) {
            return 1;
        } else if (str2.intern() == a.intern()) {
            return 2;
        } else if (str3.intern() == a.intern()) {
            return 3;
        } else if (str4.intern() == a.intern()) {
            return 4;
        } else if (str5.intern() == a.intern()) {
            return 5;
        } else if (str6.intern() == a.intern()) {
            return 6;
        } else if (str7.intern() == a.intern()) {
            return 7;
        } else if (str8.intern() == a.intern()) {
            return 8;
        } else if (str9.intern() == a.intern()) {
            return 9;
        } else {
            return 10;
        }
    }

    public int romanToArabic2(String b) {
        if (str1.intern() == b.intern()) {
            return 1;
        } else if (str2.intern() == b.intern()) {
            return 2;
        } else if (str3.intern() == b.intern()) {
            return 3;
        } else if (str4.intern() == b.intern()) {
            return 4;
        } else if (str5.intern() == b.intern()) {
            return 5;
        } else if (str6.intern() == b.intern()) {
            return 6;
        } else if (str7.intern() == b.intern()) {
            return 7;
        } else if (str8.intern() == b.intern()) {
            return 8;
        } else if (str9.intern() == b.intern()) {
            return 9;
        } else {
            return 10;
        }
    }

    public StringBuilder arabicToRoman(int result) {
        if (result < 1) {
            try {
                throw new ArithmeticException("Извините, но римское число не может быть меньше или равно нулю");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Перезапустите программу и попробуйте еще раз");
            }
        }
        StringBuilder resultEnd = new StringBuilder();
        while (result >= 100) {
            resultEnd.append("C");
            result = result - 100;
        }
        while (result >= 90) {
            resultEnd.append("XC");
            result = result - 90;
        }
        while (result >= 50) {
            resultEnd.append("L");
            result = result - 50;
        }
        while (result >= 40) {
            resultEnd.append("XL");
            result = result - 40;
        }
        while (result >= 10) {
            resultEnd.append("X");
            result = result - 10;
        }
        while (result >= 9) {
            resultEnd.append("IX");
            result = result - 9;
        }
        while (result >= 5) {
            resultEnd.append("V");
            result = result - 5;
        }
        while (result >= 4) {
            resultEnd.append("IV");
            result = result - 4;
        }
        while (result >= 1) {
            resultEnd.append("I");
            result = result - 1;
        }
        return resultEnd;
    }
}
