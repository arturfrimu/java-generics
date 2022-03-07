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

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1D);
        list1.add(2D);
        System.out.println(WildCard.summ(list1));
    }

    static void showListElements(List<?> list) {
        System.out.println("My list = " + list);
    }

    static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
