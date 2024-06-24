import model.*;
public class KomikAksi {
    public static void main(String[] args) {
        Komik k = new Komik();
        k.setJudul("Spy X Family");
        k.setTahunTerbit(2022);
        k.setVolume(2);

        Buku b = new Buku();
        b.setJudul("Koala Kumal");
        b.setTahunTerbit(2023);

        //b.setVolume(2) tidak jalan karena dari subclass

        Mahasiswa m = new Mahasiswa();


    }
}
