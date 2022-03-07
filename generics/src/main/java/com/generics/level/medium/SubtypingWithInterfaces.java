package com.generics.level.medium;

public class SubtypingWithInterfaces<T extends Number & I1 & I2> {
    private T value;

    public SubtypingWithInterfaces(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SubtypingWithInterfaces{" +
                "value=" + value +
                '}';
    }
}

interface I1 {
}

interface I2 {
}
