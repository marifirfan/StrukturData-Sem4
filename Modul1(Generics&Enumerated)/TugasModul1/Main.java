package TugasModul1;

import java.util.Scanner;

class Barang<Kalimat, Angka, Pilihan> {

    private enum tipe {
        Sandang, Pangan, Papan, nothing
    }

    private Kalimat nama;
    private Angka uang;
    private Pilihan pilih;

    Barang(Kalimat nama, Angka uang, Pilihan pilih) {
        this.nama = nama;
        this.uang = uang;
        this.pilih = pilih;
    }

    public Kalimat getNama() {
        return nama;
    }

    public Angka getHarga() {
        return uang;
    }

    public void Jenis() {
        tipe item;

        switch ((int) pilih) {
            case 1:
                item = tipe.Sandang;
                break;
            case 2:
                item = tipe.Pangan;
                break;
            case 3:
                item = tipe.Papan;
                break;
            default:
                item = tipe.nothing;
        }
        System.out.println("Jenis : " + item);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String Makanan = input.nextLine();

        System.out.print("Masukkan Harga : ");
        double Harga = input.nextDouble();

        System.out.println("Pilih jenis barang : ");
        System.out.println("1. Sandang");
        System.out.println("2. Pangan");
        System.out.println("3. Papan");
        System.out.print("Masukkan pilihan : ");
        int Pilih = input.nextInt();

        Barang<String, Double, Integer> barang = new Barang<>(Makanan, Harga, Pilih);

        System.out.println("\nInformasi barang :");
        System.out.println("Nama : " + barang.getNama());
        System.out.println("Harga : " + barang.getHarga());
        barang.Jenis();

        input.close();
    }
}
