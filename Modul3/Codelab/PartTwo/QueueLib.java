package Codelab.PartTwo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLib {
    public static void main(String[] args) {
        Queue<String> lib = new LinkedList<>();

        // queue logic = first in, first out

        lib.add("Bebek"); // -> first in
        lib.add("Angsa");
        lib.add("Kuda");
        lib.add("Buaya");
        lib.add("Tikus"); // -> last in

        System.out.println("Peek : " + lib.peek()); // -> peek the first in = Bebek

        System.out.println("All data : " + lib); // -> get all data [just print it out men]

        lib.poll(); // -> out Bebek;
        lib.poll(); // -> out Angsa;

        System.out.println("data now : " + lib);
        
    }
}