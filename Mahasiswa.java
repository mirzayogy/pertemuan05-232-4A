public class Mahasiswa{
    String npm;
    String nama;
    int jumlahSks;
    double ipk;

    void tampilkanInfo(){
        System.out.println("Nama :" + nama);
        System.out.println("NPM :" + npm);
        System.out.println("JumlahSKS :" + jumlahSks);
        System.out.println("IPK :" + ipk);
    }

    void create(){
        System.out.println("SELECT * FROM mahasiswa");
    }

    void delete(int id) {
        System.out.println("DELETE FROM mahasiswa WHERE id = " +id);
    }
}