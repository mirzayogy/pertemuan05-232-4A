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

    void read(){
        System.out.println("SELECT * FROM mahasiswa");
    }

    void delete(int id) {
        System.out.println("DELETE FROM mahasiswa WHERE id = " +id);
    }

    void create(String npm, String nama, int jumlahSks, double ipk){
        String insertSql = "INSERT INTO mahasiswa VALUES (";
        insertSql += "'" + nama +"',";
        insertSql += "'" + npm + "',";
        insertSql += jumlahSks + ",";
        insertSql += ipk +")";

        System.out.println(insertSql);
    }

    void create() {
        String insertSql = "INSERT INTO mahasiswa VALUES (";
        insertSql += "'" + this.nama + "',";
        insertSql += "'" + this.npm + "',";
        insertSql += this.jumlahSks + ",";
        insertSql += this.ipk + ")";

        System.out.println(insertSql);
    }
}