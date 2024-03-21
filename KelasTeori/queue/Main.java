
class MyQueue {
    int maxSize;
    int front;
    int rear;
    int[] data;
    int nItem;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        front = 0;
        rear = -1;
        data = new int[maxSize];
        nItem = 0;
    }

    public void insert(int newData) {
        if (rear == maxSize - 1) // Jika rear telah mencapai akhir array
            rear = -1; // Kembali ke awal array
        data[++rear] = newData; // Masukkan item dan naikkan rear
        nItem++; // Tambahkan jumlah item
    }

    // public void displayAll() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty.");
    // return;
    // }
    // System.out.print("Queue: ");
    // int i = front;
    // while (true) {
    // System.out.print(data[i] + " ");
    // if (i == rear)
    // break;
    // i = (i + 1) % maxSize; // Menggunakan modulo untuk berputar di sekitar array
    // }
    // System.out.println();

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return -1; // Mengembalikan nilai default jika antrian kosong
        }
        int removedItem = data[front++]; // Ambil item dan maju front
        if (front == maxSize) // Jika front mencapai akhir array
            front = 0; // Kembali ke awal array
        nItem--; // Kurangi jumlah item
        return removedItem; // Mengembalikan item yang dihapus
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        int count = 0;
        while (count < nItem) { // Mengubah kondisi loop agar sesuai dengan jumlah item
            System.out.print(data[i] + " ");
            i = (i + 1) % maxSize;
            count++;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return (nItem == 0);
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);

        queue.insert(11);
        queue.insert(80);
        queue.insert(140);
        queue.insert(10);

        queue.displayAll();
    }
}