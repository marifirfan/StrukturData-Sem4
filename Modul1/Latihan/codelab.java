package Latihan;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void display() {
        System.out.println("Nilai dalam Box: " + value);
    }

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.setValue(42);
        stringBox.setValue("Hello generics");

        Integer integerValue = integerBox.getValue();
        String stringValue = stringBox.getValue();

        integerBox.display();
        stringBox.display();

        System.out.println("Nilai yang diambil dari integerBox: " + integerValue);
        System.out.println("Nilai yang diambil dari stringBox: " + stringValue);
    }
}
