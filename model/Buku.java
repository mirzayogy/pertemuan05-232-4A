package model;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private double harga;


    //Getter and Setter
    public String getJudul(){
        return this.judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }

    public int getTahunTerbit(){
        return this.tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
}
