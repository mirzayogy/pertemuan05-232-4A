import java.util.Scanner;

public class PAksi {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang();

        Scanner s = new Scanner(System.in);
        p.panjang = s.nextDouble();
        p.lebar = s.nextDouble();

        p.cetakLuas();
        p.cetakKeliling();

        p.setPanjang(10);
        p.cetakLuas();

        PersegiPanjang p2 = new PersegiPanjang();
        p2.cetakLuas();

        PersegiPanjang p3 = new PersegiPanjang(70,32);
        p3.cetakLuas();


        //Class
        //Object
        //Atribut
        //Method
        //Parameter
        //Constructor
    }
}
