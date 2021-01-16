package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorMain {
    public static void main(String[] args) {
       CheckPatternAndResultOperation checkPatternAndResultOperation = new CheckPatternAndResultOperation();
       checkPatternAndResultOperation.checkMainAndResult(checkPatternAndResultOperation.input());
    }
}