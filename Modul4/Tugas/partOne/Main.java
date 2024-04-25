package Tugas.partOne;

import java.util.HashMap;
import java.util.Scanner;

// * if you gaze for long into an abyss, the abyss gazes also into you. ~ Friedrich Nietzsche

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> candidates = new HashMap<>();
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        candidates.put("Kandidat A", 0);
        candidates.put("Kandidat B", 0);
        candidates.put("Kandidat C", 0);

        while (repeat) {
            System.out.println("Selamat datang di sistem voting");
            System.out.println("Pilih kandidat yang ingin anda dukung : ");
            System.out.println("- Kandidat A");
            System.out.println("- Kandidat B");
            System.out.println("- Kandidat C");
            System.out.print("Masukan nama Kandidat (atau ketik 'selesai' untuk keluar): ");

            String kandidat = input.nextLine();

            if (candidates.containsKey(kandidat)) {
                candidates.put(kandidat, candidates.get(kandidat)+1);
                System.out.println("terimakasih suara anda telah direkam.\n");
            } else if (kandidat.equals("selesai")){
                repeat = false;
            } else {
                System.out.println("\nBRO U GOOD?, Kandidat tidak tersedia");
                System.out.println("just make this easy please 💀 <- skull emote\n");
            }

        }

        System.out.println("\nHasil Voting : ");
        for (String i : candidates.keySet()) {
            System.out.println(i + " : " + candidates.get(i) + " Suara");
        }

        input.close();
    }
}
