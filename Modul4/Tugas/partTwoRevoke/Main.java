package Tugas.partTwoRevoke;
import java.util.Scanner;

/**
 * @author Rey
 */

public class Main {
    public static void main(String[] args) {

        DataPemilih data = new DataPemilih();
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("Selamat datang di sistem Voting Online");
            System.out.println("Pilih Menu :");
            System.out.println("1. Login");
            System.out.println("2. Daftar");
            System.out.println("3. Hasil Vote");
            System.out.println("4. logout"); // ? should i use this
            System.out.print("Pilihan Anda: ");

            int Pilih = input.nextInt();

            switch (Pilih) {
                case 1: { // todo : login
                    data.login();
                    break;
                }
                case 2: { // todo : register
                    data.register();
                    break;
                }
                case 3: { // ? the hell is this for???
                    System.out.println("\n======== Hasil Suara ========\n");
                    for (String i : data.candidates.keySet()) {
                        System.out.println(i + " : " + data.candidates.get(i) + " Suara");
                    }
                    System.out.println("=============================\n");
                    break;
                }
                case 4: {
                    repeat = data.logout();
                    break;
                }
                default: {
                    System.out.println("really💀💀💀");
                    System.out.println("Pilihan tidak tersedia, terima kasih\n");
                    break;
                }
            }
        }

        input.close();

    }
}
