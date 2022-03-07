package com.generics.level.basic;

public class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet", 20);
        System.out.println("value1 = " + pair1.getValue1() + "\n" + "value2 = " + pair1.getValue2());
        Pair<Integer, Integer> pair2 = new Pair<>(40, 40);
        System.out.println("value1 = " + pair2.getValue1() + "\n" + "value2 = " + pair2.getValue2());
    }
}
