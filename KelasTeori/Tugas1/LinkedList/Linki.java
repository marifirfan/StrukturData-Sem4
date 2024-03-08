
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node first;// node untuk menunjuk node paling depan
    Node last;//// node untuk menunjuk node paling belakang

    public void insertFisrt(int data) {
        Node newNode = new Node(data);// buat node baru
        if (first == null) {// jika masih kosong (belu ada node sama sekali)
            first = newNode;
            last = newNode;
        } else {// jika sudah ada data
            newNode.next = first;
            first = newNode;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void display() {
        Node current = first;// current menunjuk first
        while (current != null) {// perulangan sampai semua node
            System.out.print(current.data + " ");
            current = current.next;// i++
        }
    }

    public boolean find(int data) {
        boolean hasil = false;
        Node current = first;
        while (current != null) {// diulang selama current tidak sama dengan null
            if (current.data == data) {
                hasil = true;// jika ada data yang sama maka hasil berubah true
                break;// hentikan perulangan
            }
            current = current.next;// i++

        }
        return hasil;
    }

    public void deletFirst() {
        first = first.next;// first pindah ke next
    }

    public void delete(int data) {
        Node current = first;
        Node before = first;// digunakan untuk node sebelumnya
        if (first.data == data) {// jika data yang dihapus node depan
            first = first.next;
        } else {// jika yang dihapus bukan node depan
            current = current.next;
            while (current != null) {
                if (current.data == data) {
                    before.next = current.next;
                    break;
                }
                current = current.next;
                before = before.next;
            }
        }
    }

    public void insertSort(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            // Jika data pada linked list masih kosong, maka data baru menjadi node pertama
            // dan terakhir.
            first = newNode;
            last = newNode;
        } else if (data <= first.data) {
            // Jika data baru lebih kecil atau sama dengan data pada node pertama, maka data
            // baru
            // akan menjadi node pertama dan menunjuk ke node sebelumnya.
            newNode.next = first;
            first = newNode;
        } else {
            Node current = first;
            Node before = null;
            // Traverse (mengunjungi) linked list untuk menemukan posisi yang tepat untuk
            // menyisipkan node baru.
            while (current != null && data > current.data) {
                before = current;
                current = current.next;
            }
            // Menyisipkan node baru pada posisi yang sesuai.
            before.next = newNode;
            newNode.next = current;

            // Memperbarui node terakhir jika node baru disisipkan di akhir linked list.
            if (current == null) {
                last = newNode;
            }
        }
    }
}

public class Linki {
    public static void main(String[] args) {
        LinkedList my = new LinkedList();
        my.insertSort(10);
        my.insertSort(20);
        my.insertSort(30);
        my.insertSort(50);
        my.insertSort(60);
        my.insertSort(80);

        // my.delete(60);
        // my.insertFisrt(100);
        my.display();
    }
}
