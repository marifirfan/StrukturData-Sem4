package queue;

class Node {

    String Nama;
    String Jumlah;
    int Nomor;

    Node next;

    public Node(String Nama, String Jumlah, int Nomor) {
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Nomor = Nomor;
    }

}

public class MyDamnQueue {

    Node newData;
    Node first;
    Node last;

    private int ItemIndex = 0;

    public void AddTicket(String Name, String amount) {
        ++ItemIndex;
        newData = new Node(Name, amount, ItemIndex);

        if (first == null) {
            first = newData;
        } else {
            last.next = newData;
        }
        last = newData;

        System.out.println("\n------------------------------------------");
        System.out.println("Nomor Tiket : " + ItemIndex);
        System.out.println("------------------------------------------");
        System.out.println("Nama Pemesan : " + Name + " | Jumlah pesanan : " + amount + "\n");
    }

    public void DisplayTicket() {
        Node current = first;
        if (current == null) {
            System.out.println("Tidak Ada Data !\n");
        }

        while (current != null) {
            System.out.print("\nNomor Ticket : " + current.Nomor + " | Nama : " + current.Nama + " | Jumlah : "
                    + current.Jumlah);
            current = current.next;
            if (current == null) {
                System.out.println("\n");
            }
        }
    }

    public void RemoveTicket() {

        if (first == null) {
            System.out.println("Tidak Ada Data !\n");
        } else {
            System.out.println("hapus ticket dengan nomor " + first.Nomor + "\n");
            first = first.next;

            if (first == null) {
                last = null;
            }
        }

    }

}
