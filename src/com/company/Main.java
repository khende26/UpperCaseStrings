package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> myStrings = new ArrayList<>();
        myStrings.add("abc");
        myStrings.add("def");
        myStrings.add("ghi");
        try {
            myStrings.get(2);
        } catch (NullPointerException e) {
            UpperCaseStringList upperCaseStrings = new UpperCaseStringList(null);
            System.out.println(upperCaseStrings.getUpperCaseStrings());

        }
    }
}
