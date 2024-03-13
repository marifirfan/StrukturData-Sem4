package Tugas.PartOne;

import java.util.ArrayList;
import java.util.Scanner;

class Contact<Nama, Kontak> {

    private Nama Nama;
    private Kontak Nomor;

    public Contact(Nama Nama, Kontak Nomor) {
        this.Nama = Nama;
        this.Nomor = Nomor;
    }

    public Nama getNama() {
        return Nama;
    }

    public Kontak getKontak() {
        return Nomor;
    }

}

public class ContactManager {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> Nama = new ArrayList<>();
        ArrayList<String> Nomor = new ArrayList<>();

        Contact<String, String> contact;

        int Pilihan;

        do {

            System.out.println("Selamat datang di Manajemen Kontak");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Tampilkan Kontak");
            System.out.println("3. Cari Kontak");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            Pilihan = input.nextInt();

            if (Pilihan == 1) {
                input.nextLine();

                // add a f contact
                String UserName;
                String UserNumber;
                boolean ulang = true;

                while (ulang) {

                    System.out.print("Masukan Nama Kontak  : ");
                    UserName = input.nextLine();
                    System.out.print("Masukan Nomor Kontak : ");
                    UserNumber = input.nextLine();

                    if (UserName.matches("[a-zA-Z]+") && UserNumber.matches("\\d+")) {
                        contact = new Contact<>(UserName, UserNumber);
                        Nama.add(contact.getNama());
                        Nomor.add(contact.getKontak());
                        ulang = false;
                    } else {
                        System.out.println("\nData tidak valid, mampus kau kena loop\n");
                    }
                }

                System.out.println("Kontak Berhasil di tambahkan\n");

            } else if (Pilihan == 2) {
                // list a f contact
                System.out.println("daftar Kontak : ");
                for (int i = 0; i < Nama.size(); i++) {
                    System.out.println(i + 1 + ". " + Nama.get(i) + " - " + Nomor.get(i));
                }

                System.out.println();

            } else if (Pilihan == 3) {
                input.nextLine();

                // search a f contact
                System.out.print("Masukan Nama Kontak yang ingin di cari : ");
                String SeacrhNama = input.nextLine();
                boolean NotFound = true;

                for (int i = 0; i < Nama.size(); i++) {
                    if (Nama.get(i).equals(SeacrhNama)) {
                        System.out.println("Kontak yang Anda cari ditemukan");
                        System.out.println("Nama: " + Nama.get(i));
                        System.out.println("Nomor telepon: " + Nomor.get(i));
                        System.out.println();
                        NotFound = false;
                    }
                }

                if (NotFound) {
                    System.out.println("Kontak yang anda cari tidak di temukan\n");
                }

            } else if (Pilihan == 4) {
                System.out.println("\nTerima kasih");
                break;
            } else {
                System.out.println("error bruh");
            }

        } while (Pilihan != 4);

        System.out.println("POWER!!!, MORE POWER!!!!!!!!!!");

        input.close();
    }
}
