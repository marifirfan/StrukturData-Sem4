package Tugas.PartTwo;

class Node<Data> {

    Data nama;
    Data nomor;

    Node<Data> next;

    public Node(Data Nama, Data Nomor) {
        this.nama = Nama;
        this.nomor = Nomor;
    }
}

public class MyFLinkedList {

    Node<String> newNode;
    Node<String> Head;

    public void AddContact(String Nama, String Nomor) {
        newNode = new Node<>(Nama, Nomor);
        if (Head == null) {
            Head = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
        }
    }

    public void DisplayContact() {
        Node<String> current = Head;

        if (current == null) {
            System.out.println("Your f data is empty\n");
            return;
        }

        int i = 0;
        System.out.println("Daftar Kontak : ");
        while (current != null) {
            i++;
            System.out.println(i + ". " + current.nama + " - " + current.nomor);
            current = current.next;
        }
    }

    public void searchContact(String nama) {
        Node<String> current = Head;
        boolean NotFound = true;
        if (current == null) {
            System.out.println("Your f data is empty\n");
        } else {
            while (current != null) {
                if (current.nama.toLowerCase().equals(nama.toLowerCase())) {
                    System.out.println("Kontak di temukan");
                    System.out.println("Nama  : " + current.nama);
                    System.out.println("Nomor : " + current.nomor);
                    System.out.println();
                    NotFound = false;
                }
                current = current.next;
            }

            if (NotFound) {
                System.out.println("Kontak yang anda cari tidak di temukan\n");
            }
        }

    }

}
