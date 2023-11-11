package org.example;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        // List allow duplicate elements:
        stringList.add("Hossein");
        stringList.add("Hossein");
        stringList.add("Mahan");
        stringList.add("Mahan");
        System.out.println("stringLis: " + stringList);
        // List allow to add null values
        stringList.add(null);
        stringList.add(null);
        stringList.add("Test");
        System.out.println("stringLis: " + stringList);
    }
}
