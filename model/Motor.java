package model;

public class Motor {
    private String brand;
    private String warna;
    private String jenis;

    public Motor(){

    }
    
    public Motor(String brand){
        this.brand = brand;
    }

    public Motor(String brand, String warna){
        this.brand = brand;
        this.warna = warna;
    }

    //ini contoh duplicate
    // public Motor(String jenis, String warna) {
    //     this.brand = jenis;
    //     this.warna = warna;
    // }

    public Motor(String brand, String warna, String jenis){
        this.brand = brand;
        this.warna = warna;
        this.jenis = jenis;
    }

    public void delete(int id){

    }

    public void delete(String brand){

    }

    // ini contoh duplicate
    // public void delete(String warna){

    // }

    public void delete(String warna, int id){

    }

    public void delete(int id, String jenis) {

    }
}
