package Codelab;
//Muhammad Arif Irfan - 202210370311030 - Strukdat - J

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PartTwo {
    public static void main(String[] args) {
        Node head = new Node(5);

        Node second = new Node(10);
        head.next = second;

        Node third = new Node(15);
        second.next = third;

        System.out.println("Daftar Angka : ");

        Node current = head;
        while (current != null) {
            System.out.println("Data : " + current.data);
            current = current.next;
        }

        System.out.println("\nElement kedua: " + head.next.data);

        head.data = 25;

        System.out.println("Daftar Angka setelah perubahan: ");

        current = head;
        while (current != null) {
            System.out.println("Data : " + current.data);
            current = current.next;
        }

        head.next = head.next.next;

        System.out.println("\nDaftar angka setelah di dihapus : ");
        current = head;
        while (current != null) {
            System.out.println("Data : " + current.data);
            current = current.next;
        }
    }
}

// di panggil di sini
