package Tugas.partTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataPemilih {

    private Scanner input = new Scanner(System.in);

    private String regexName = "^[a-zA-Z][a-zA-Z ]*$";
    private String regexNik = "^[0-9]+$";
    private String regexEmail = "^[a-z][a-z0-9]*@gmail.com$";
    private String regexPass = "^[A-Za-z0-9 ]+$";

    private HashMap<String, Integer> candidates = new HashMap<>();

    private HashMap<String, String> users = new HashMap<>();
    private HashMap<String, ArrayList<String>> usersDetail = new HashMap<>();

    private HashMap<Object, Integer> placeNik = new HashMap<>();

    // * todo : save the cadidates object
    public DataPemilih() {
        candidates.put("Kandidat A", 0);
        candidates.put("Kandidat B", 0);
        candidates.put("Kandidat C", 0);
    }

    // ! I continued to the side, and thats that
    // * todo : display Menu
    public void Menu() {
        System.out.println("Selamat datang di sistem Voting Online");
        System.out.println("Pilih Menu :");
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.println("3. Hasil Vote");
        System.out.print("Pilihan Anda: ");

        int Pilih = input.nextInt();
        input.nextLine();

        switch (Pilih) {
            case 1: { // * todo : login
                login();
                break;
            }
            case 2: { // * todo : register
                register();
                break;
            }
            case 3: { // * todo : display data
                DisplayData();
                break;
            }
            default: {
                System.out.println("Really 💀💀💀 <- skull emote");
                System.out.println("Pilihan tidak tersedia, terima kasih\n");
                Menu();
                break;
            }
        }
    }

    // * todo : register
    private void register() {

        System.out.println("Masukan data anda");
        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Nik : ");
        String nik = input.nextLine();

        System.out.print("Email : ");
        String email = input.nextLine();

        System.out.print("Password : ");
        String pass = input.nextLine();

        if (nama.matches(regexName) && nik.matches(regexNik) && email.matches(regexEmail) && pass.matches(regexPass)) {

            if (users.containsKey(email)) {
                System.out.println("!!! Email telah terdaftar !!!\n");
                Menu();
            } else if (placeNik.containsKey(nik)) {
                System.out.println("!!! Nik telah terdaftar !!!\n");
                Menu();
            } else {
                ArrayList<String> list = new ArrayList<>();
                users.put(email, pass);

                list.add(nama);
                list.add(nik);

                placeNik.put(nik, 1);

                usersDetail.put(email, list);

                System.out.println("berhasil mendaftar\n");
                Menu();
            }

        } else {
            System.out.println("Gagal Daftar\n");
            Menu();
        }
    }

    // * todo : Login
    private void login() {
        System.out.print("Masukan email : ");
        String email = input.nextLine();
        System.out.print("Masukan password : ");
        String pass = input.nextLine();

        if (!email.matches(regexEmail) || !pass.matches(regexPass)) {
            System.out.println("\nsomething isn't right");
            System.out.println("Format tidak sesuai\n");
            Menu();
        } else if (email.matches(regexEmail) && pass.matches(regexPass)) {
            if (users.containsKey(email) && users.get(email).equals(pass)) {
                
                String Nama = usersDetail.get(email).toArray()[0].toString();
                String Nik = usersDetail.get(email).toArray()[1].toString();
                int Suara = placeNik.get(Nik);
                
                System.out.println("| Login berhasil |");
                System.out.println("| Nama : " + Nama + " | " + "Nik : " + Nik + " |");
                System.out.println("| Suara untuk voting : " + Suara);

                if (placeNik.get(Nik) == 1) {
                    boolean repeat = true;
                    while (repeat) {
                        System.out.println("\nPilih kandidat yang ingin anda dukung : ");
                        System.out.println("- Kandidat A");
                        System.out.println("- Kandidat B");
                        System.out.println("- Kandidat C");
                        System.out.print("Masukan nama Kandidat (atau ketik 'selesai' untuk keluar): ");
                        String kandidat = input.nextLine();

                        if (candidates.containsKey(kandidat)) {
                            candidates.put(kandidat, candidates.get(kandidat) + placeNik.get(Nik));
                            System.out.println("terimakasih suara anda telah direkam.\n");
                            placeNik.put(Nik, 0);
                            repeat = false;
                            Menu();
                        } else if (kandidat.toLowerCase().equals("selesai")) {
                            System.out.println("Suara anda belum di rekam\n");
                            repeat = false;
                            Menu();
                        } else {
                            System.out.println("Pilihan tidak tersedia bruh ");
                        }
                    }

                } else {
                    System.out.println("| Telah Melakukan voting |\n");
                    boolean repeat = true;
                    while (repeat) {
                        System.out.println("Pilih menu");
                        System.out.println("1. Menu Awal");
                        System.out.println("2. Logout");
                        System.out.print("Menu : ");
                        int Pilih = input.nextInt();
                        if (Pilih == 1) {
                            repeat = false;
                            Menu();
                        } else if (Pilih == 2) {
                            logout();
                        } else {
                            System.out.println("Pilihan tidak tersedia");
                        }
                    }
                }

            } else {
                System.out.println("gagal login\n");
                Menu();
            }
        }
    }

    // * todo : Display data
    private void DisplayData() {
        System.out.println("\n======== Hasil Suara ========\n");
        for (String i : candidates.keySet()) {
            System.out.println(i + " : " + candidates.get(i) + " Suara");
        }
        System.out.println("=============================\n");
        Menu();
    }

    // * todo : logout
    private void logout() {
        System.exit(0);
    }
}
