package Tugas.PartTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Pilihan;

        MyFLinkedList listed = new MyFLinkedList();

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
                        listed.AddContact(UserName, UserNumber);
                        ulang = false;
                    } else {
                        System.out.println("\nData tidak valid, mampus kau kena loop\n");
                    }
                }

                System.out.println("Kontak Berhasil di tambahkan\n");

            } else if (Pilihan == 2) {
                // display f contact
                listed.DisplayContact();
                System.out.println();
            } else if (Pilihan == 3) {
                input.nextLine();
                // search f contact
                System.out.print("Masukan nama yang ingin di cari : ");
                String searchName = input.nextLine();
                listed.searchContact(searchName);

            } else if (Pilihan == 4) {
                break;
            } else {
                System.out.println("Error bruh");
            }
        } while (Pilihan != 4);

        System.out.println("POWER, MORE POWER!!!!!!!!\n");
        input.close();
    }
}