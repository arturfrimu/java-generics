package com.generics.level.basic;

public class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}

class TestInfo {
    public static void main(String[] args) {
        Info<String> stringInfo = new Info<>("Hello World");
        System.out.println(stringInfo);
        Info<Integer> integerInfo = new Info<>(1);
        System.out.println(integerInfo);
        Info<Long> longInfo = new Info<>(12412412412412412L);
        System.out.println(longInfo);
    }
}
