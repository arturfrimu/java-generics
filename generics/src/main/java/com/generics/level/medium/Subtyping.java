package com.generics.level.medium;

public class Subtyping<T extends Number> {
    private T value;

    public Subtyping(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Subtyping{" +
                "value=" + value +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Subtyping<Integer> sub1 = new Subtyping<>(6000000);

        Subtyping<Long> sub2 = new Subtyping<>(36516516516516L);

        Subtyping<Double> sub3 = new Subtyping<>(565165165416456565165D);

        Subtyping<Number> sub4 = new Subtyping<>(651616154);

//      Subtyping<String> sub4 = new Subtyping<>("Hello World");  // java: type argument java.lang.String is not within bounds of type-variable T

    }
}
