package Codelab.PartOne;

import java.util.Stack;

public class Stacklib {
    public static void main(String[] args) {

        Stack<String> lib = new Stack<>();

        System.out.println("is f data is empty? : " + lib.empty());

        // stack logic = last in, first out

        lib.push("Bebek"); // -> first in
        lib.push("Angsa");
        lib.push("Kuda");
        lib.push("Buaya");
        lib.push("Tikus"); // -> last in

        System.out.println("is f data is empty? : " + lib.empty());

        System.out.println("Peek : " + lib.peek()); // -> see the top data / last insert = Tikus

        System.out.println("All data : " + lib); // display all data

        lib.pop(); // out Tikus
        lib.pop(); // out Buaya

        System.out.println("All data now : " + lib);
        System.out.println("Position of Kuda : " + lib.search("Kuda"));

    }
}