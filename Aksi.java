public class Aksi {
    public static void main(String[] args) {

        //Class object = new Constructor()
        Mahasiswa mirza = new Mahasiswa();
        Mahasiswa yogy = new Mahasiswa();

        mirza.nama = "Mirza";
        mirza.npm = "001";
        mirza.jumlahSks = 144;
        mirza.ipk = 3.89;
        

        yogy.tampilkanInfo();;
        mirza.tampilkanInfo();

        yogy.create("002","Yogy",123,3.9);
        mirza.create();       
    }
}
