package Tugas.PartOne;

public class Contact<Nama, Kontak> {

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
