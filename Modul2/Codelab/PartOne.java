package Codelab;
//Muhammad Arif Irfan - 202210370311030 - Strukdat - J

import java.util.ArrayList;

public class PartOne {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Fortuner");
        list.add("Mustang");
        list.add("BMW");
        list.add("Mercendes");

        int angka;

        System.out.println("Daftar Mobil");
        angka = 0;
        for (String string : list) {
            System.out.println(angka + ". " + string);
            angka++;
        }

        System.out.println("\nElement pada index ke 2 : " + list.get(2));

        list.set(0, "ferrari");

        System.out.println("\ndaftar mobil setelah perubahan : ");
        angka = 0;
        for (String string : list) {
            System.out.println(angka + ". " + string);
            angka++;
        }

        list.remove(3);

        System.out.println("\ndaftar mobil setelah Pengpausan : ");
        angka = 0;
        for (String string : list) {
            System.out.println(angka + ". " + string);
            angka++;
        }

        System.out.println("\nJumlah element dalam ArrayList: " + list.size());
        System.out.println("\nApakah ArrayList kosong? : " + list.isEmpty());

    }
}
