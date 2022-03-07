package com.generics.level.hard;

import java.util.ArrayList;
import java.util.List;

public class WildCardExtendsANDSuper {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        List<C> listC = new ArrayList<>();
        // incompatible types: java.util.List<A> cannot be converted to java.util.List<? extends B>
//        showInfo(listA);
        showInfo(listB);
        showInfo(listC);
    }

    static void showInfo(List<? extends B> list) {
        System.out.println(list);
    }
}

class A {
}

class B extends A {
}

class C extends B {
}
