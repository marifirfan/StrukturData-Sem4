/*
 * Nama : Muhammad Arif Irfan
 * Nim : 202210370311030
 * Kelas : Struktur Data J
 */

 class MyHash1 {

    int maxSize; // ukuran maksimum dari array hash
    int[] array; // array untuk menyimpan data dalam hash table

    /**
     * @param maxSize jumlah ukuran atau index untuk array
     */
    public MyHash1(int maxSize) { // ! maxSize = 10
        this.maxSize = maxSize; // menginisialisasi ukuran maksimum array hash
        this.array = new int[maxSize]; // inisialisasi array dengan ukuran maksimum
    }

    /**
     * @param data angka
     * @return hasil modulus dari data (integer) dan maxSize
     */
    public int hashFunction(int data) { // todo : menghitung modulus
        return data % maxSize; // mengembalikan hasil dari modulus data dan maxSize
    }

    /**
     * @param newData angka yang akan di modulus dengan maxSize
     * @implNote newData akan masuk ke dalam method hashFunction dan akan mengembalikan nilai modulus
     * nilai modulus akan menjadi nilai index untuk newData yang akan di simpan di dalam array
     */
    public void insert(int newData) { // todo : menambahkan data
        int index = hashFunction(newData); // hasil return dari method hashFunction di inisialisasikan menjadi index
        array[index] = newData; // hasil dari method hashFunction akan di jadikan index untuk menyimpan newData pada array
    }

    /**
     * @param data angka
     * @return hasil result
     * @implNote data akan masuk ke dalam method hashFunction lalu hasil dari hashFunction
     * akan di inisialisasikan menjadi index agar index tersebut di jadikan 0 untuk menghapus data di dalamnya
     */
    public int remove(int data) { // todo : menghapus data
        int result = 0; // mengatur result menjadi 0
        int index = hashFunction(data); // hasil return dari method hashFunction di inisialisasikan menjadi index
        result = array[index]; // result adalah array pada index yang dihasilkan hashFunction
        array[index] = 0; // mengatur kembali array pada index menjadi 0 atau menghapus data pada index tersebut
        return result; // mengembalikan hasil result
    }
    /**
     * @param data angka yang dicari
     * @return mengembalikan hasil dari data yang di cari
     * @implNote data yang akan di cari akan di hitung nilai hashnya 
     * jika outputnya sesuai dengan indexnya maka result akan menjadi array pada index tersebut.
     * jika outputnya 0 maka data tidak tersedia 
     */
    public int find(int data) { // todo : mencari data
        int result = 0; // mengatur result menjadi 0
        int index = hashFunction(data); // hasil return dari method hashFunction
        result = array[index]; // result adalah array pada index
        return result; // mengembalikan hasil result
    }

    /**
     * @implNote method ini akan melakukan perulangan dari 0 hingga jumlah maxSizenya
     * jika array pada index "i" tidak sama dengan 0 maka akan mengoutput nilai data pada array itu sendiri
     */
    public void display(){ // todo : menampilkan data
        for(int i=0; i<maxSize; i++){ // melakukan perulangan dari 0 hingga maxSize
            if(array[i] != 0){ // jika kondisi pada array index i != 0
                System.out.print(array[i]+" "); // maka akan mengoutput data dari array index i itu sendiri
            }
        }
    }
}

public class DasarHash1 {
    public static void main(String[] args) {
        MyHash1 my = new MyHash1(10); // jumlah index dan akan dijadikan sebagai modulus
        
        my.insert(10); // memasukan angka 10
        my.insert(3); // memasukan angka 3
        my.insert(5); // memasukan angka 5
        
        my.remove(3); // menghapus angka 3
        
        System.out.println(my.find(5)); // mencari angka 5
        System.out.println(my.find(1)); // mencari angka 1

        my.display(); // menampilkan semua data

    }
}
