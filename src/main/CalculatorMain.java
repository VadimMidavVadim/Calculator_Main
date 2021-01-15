package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Введите арифметическое выражение арабскими или римскими цифрами от 1 до 10. Пример: 1 + 10 или I + X");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("((^[1-9]|^[1-9]0)|(^I|^II|^III|^IV|^V|^VI|^VII|^VIII|^IX|^X))(\\s)([\\+]|[\\-]|[\\*]|[\\/])(\\s)(([1-9]$|[1-9]0$)|(I$|II$|III$|IV$|V$|VI$|VII$|VIII$|IX$|X$))");
        String result = scanner.nextLine();
        Matcher matcher = pattern.matcher(result);
        boolean var = matcher.matches();
        if (var) {
            Pattern pattern1 = Pattern.compile("(^[1-9]|^[1-9]0)(\\s)([\\+]|[\\-]|[\\*]|[\\/])(\\s)([1-9]$|[1-9]0$)");
            Matcher matcher1 = pattern1.matcher(result);
            boolean var1 = matcher1.matches();
            Pattern pattern2 = Pattern.compile("(^I|^II|^III|^IV|^V|^VI|^VII|^VIII|^IX|^X)(\\s)([\\+]|[\\-]|[\\*]|[\\/])(\\s)(I$|II$|III$|IV$|V$|VI$|VII$|VIII$|IX$|X$)");
            Matcher matcher2 = pattern2.matcher(result);
            boolean var2 = matcher2.matches();
            if (var1) {
                String[] resultArray = result.split(" ");
                Integer value1 = Integer.valueOf(resultArray[0]);
                String str = resultArray[1];
                Integer value2 = Integer.valueOf(resultArray[2]);
                Operation arabicOperation = new Operation();
                System.out.println(arabicOperation.operation(value1, str, value2));
            } else if (var2) {
                String[] resultArray1 = result.split(" ");
                String str1 = resultArray1[0];
                String str2 = resultArray1[1];
                String str3 = resultArray1[2];
                RomeOperation romeOperation = new RomeOperation();
                System.out.println(romeOperation.arabicToRoman(romeOperation.operation(romeOperation.romanToArabic1(str1), str2, romeOperation.romanToArabic2(str3))));
            } else {
                try {
                    throw new MyPatternException("Арифметические операции можно производить только с римскими или только с арабскими цифрами. Пожалуйста, введите корректное значение");
                } catch (MyPatternException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                throw new MyPatternException("Пожалуйста, введите корректное арифметическое выражение, как на данном примере");
            } catch (MyPatternException ex) {
                ex.printStackTrace();
            }
        }
    }
}