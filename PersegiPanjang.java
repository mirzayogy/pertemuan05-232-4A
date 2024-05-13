public class PersegiPanjang {
    double panjang;
    double lebar;

    //code convention

    PersegiPanjang(){
        this.panjang = 3;
        this.lebar = 2;
    }

    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void setPanjang(double perubahan){
        this.panjang = perubahan;
    }

    void cetakLuas(){
        System.out.println(this.panjang * this.lebar);
    }

    void cetakKeliling(){
        System.out.println(2 * this.panjang + 2 * this.lebar);
    }

    double hitungLuas(double p, double l){
        return p*l;
    }
}
