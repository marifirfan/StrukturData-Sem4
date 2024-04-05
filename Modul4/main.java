
import java.util.HashMap;
import java.util.Scanner;

public class main {

    public static void cariBarang(HashMap<String, Integer> inventori, String barang){
        if (inventori.containsKey(barang)) {
            System.out.println("Stok " + barang + ": " + inventori.get(barang) + " unit");
        } else {
            System.out.println("Barang " + barang + " tidak tersedia di inventori");
        }
    }
    public static void main(String[] args) {
    
        HashMap<String, Integer> inventori = new HashMap<>();

        Scanner input = new Scanner(System.in);

        inventori.put("Pensil", 50);
        inventori.put("Buku", 35);
        inventori.put("Penghapus", 25);

        System.out.println("Inventori awal : " + inventori);

        inventori.put("Pensil", inventori.get("Pensil") + 20);

        inventori.remove("Penghapus");

        System.out.println("\nInventory setelah update : "+inventori);

        System.out.print("\nMasukan nama barang yang ingin di cari : ");
        String barang = input.nextLine();

        cariBarang(inventori, barang);

        input.close();

    }
}
