package queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeat = true;

        MyDamnQueue Queky = new MyDamnQueue();

        Scanner input = new Scanner(System.in);

        while (repeat) {
            System.out.println("Welcome to wacky woohoo pizza man cinema");
            System.out.println("1. Pesan tiket");
            System.out.println("2. Tampilkan tiket");
            System.out.println("3. Hapus Daftar tiket");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu : ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                System.out.print("Masukan Nama pemesan : ");
                String nama = input.nextLine();
                System.out.print("Masukan Jumlah Tiket : ");
                String jumlah = input.nextLine();

                if (nama.matches("[a-z A-Z]+") && jumlah.matches("\\d+")) {
                    Queky.AddTicket(nama, jumlah);
                } else {
                    System.out.println("Tidak Valid\n");
                }

            } else if (pilih == 2) {
                Queky.DisplayTicket();
            } else if (pilih == 3) {
                Queky.RemoveTicket();
            } else if (pilih == 4) {
                repeat = false;
                System.out.println("\nThanks\n");
                System.out.println("also check this motivation song");
                System.out.println("1. https://youtu.be/Jrg9KxGNeJY?si=ssmOIYMf5GrVqVwu");
                System.out.println("2. https://youtu.be/-CTqKDgtbbg?si=5NProSLAaEe9lbDN\n");
            } else {
                System.out.println("aight bet 💀 <- (skull emote)\n");
            }

        }

        input.close();
    }
}