package main;

public class Operation {
    String string = "+";
    String string1 = "-";
    String string2 = "*";
    String string3 = "/";
    public int operation(Integer a, String act, Integer b) {
        if (string.intern()==act.intern()) {
            int resultAdd = a+b;
            return resultAdd;
        } else if (string1.intern()==act.intern()) {
            int resultMod = a-b;
            return resultMod;
        } else if (string2.intern()==act.intern()) {
            int resultMulti = a*b;
            return resultMulti;
        } else {
            int resultDiv = a/b;
            return resultDiv;
        }
    }
}
