package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class A01_CollectionDemo {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Hossein");
        stringCollection.add("Hossein");
        stringCollection.add("MahanJoon");
        stringCollection.add("Saeed");
        System.out.println(stringCollection);
        stringCollection.remove("Hossein");
        System.out.println("stringCollection is: " + stringCollection);
        System.out.println("is \"Saeed\" in the setString? " + stringCollection.contains("Saeed"));
        Collection<String> setString = new HashSet<>();
        setString.add("Soha");
        setString.add("Soha");
        setString.add("Karim");
        setString.add("Karim");
        System.out.println("setString is: " + setString);
        stringCollection.addAll(setString);
        System.out.println("stringCollection is: " + stringCollection);
    }
}
