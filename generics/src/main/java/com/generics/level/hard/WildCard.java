package com.generics.level.hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Jerry");
        strList.add("Tom");

        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);

        WildCard.showListElements(strList);
        WildCard.showListElements(intList);
    }

    static void showListElements(List<?> list) {
        System.out.println("My list = " + list);
    }
}
