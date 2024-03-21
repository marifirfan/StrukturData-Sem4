
class MyQueue{
    int maxSize;
    int front;
    int rear;
    int [] data;
    int nItem;

    public MyQueue(int maxSize){
        this.maxSize = maxSize;
        front = 0;
        rear = 1;
        data = new int[maxSize];

        nItem = 0;
    }

    public void insert(int item) {
        if (rear == maxSize - 1) // Jika rear telah mencapai akhir array
            rear = -1; // Kembali ke awal array
        data[++rear] = item; // Masukkan item dan naikkan rear
        nItem++; // Tambahkan jumlah item
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}