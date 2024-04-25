package Tugas.partTwoRevoke;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DataPemilih {

    Scanner input = new Scanner(System.in);

    private String regexName = "^[a-zA-Z][a-zA-Z ]*$";
    private String regexNik = "^[0-9]+$";
    private String regexEmail = "^[a-z][a-z0-9]*$"; // ? *@gmail.com$
    private String regexPass = "^[A-Za-z0-9 ]+$";

    HashMap<String, Integer> candidates = new HashMap<>();

    HashMap<String, String> users = new HashMap<>();
    HashMap<String, ArrayList<String>> usersDetail = new HashMap<>();

    HashMap<Object, Integer> placeNik = new HashMap<>();

    public DataPemilih() {
        candidates.put("Kandidat A", 0);
        candidates.put("Kandidat B", 0);
        candidates.put("Kandidat C", 0);
    }

    public void register() { // todo : register

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
                System.out.println("-> Email telah terdaftar <-\n");
            } else if (placeNik.containsKey(nik)) {
                System.out.println("-> nik telah terdaftar <-\n");
            } else {
                ArrayList<String> list = new ArrayList<>();
                users.put(email, pass);
                list.add(nama);
                list.add(nik);

                placeNik.put(nik, 1);

                usersDetail.put(email, list);

                System.out.println("berhasil mendaftar\n");
            }

        } else {
            System.out.println("Gagal Daftar\n");
        }
    }

    public void login() { // todo : Login
        System.out.print("Masukan email : ");
        String email = input.nextLine();
        System.out.print("Masukan password : ");
        String pass = input.nextLine();

        if (!email.matches(regexEmail) || !pass.matches(regexPass)) {
            System.out.println("something isn't right\n");
            System.out.println("Format tidak sesuai\n");
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
                        } else if (kandidat.toLowerCase().equals("selesai")) {
                            System.out.println("Suara anda belum di rekam\n");
                            repeat = false;
                        } else {
                            System.out.println("Pilihan tidak tersedia :( ");
                        }
                    }

                } else {
                    System.out.println("| anda sudah pernah voting\n");
                }

            } else {
                System.out.println("gagal login\n");
            }
        }
    }

    public boolean logout() { // todo : Logout
        return false;
    }

}
// "pain... this is why i fight" ~ jack the ripper