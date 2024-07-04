
package uas_2210010257;


public class AdminKasir {
    //atribut dan encapsuled
    private String barang;
    private String code;
    private double harga;
    private double jumlah;
    
    //constructor

    public AdminKasir(String barang, String code, double harga, double jumlah) {
        this.barang = barang;
        this.code = code;
        this.harga = harga;
        this.jumlah = jumlah;
    }
   
    
    //mutator (setter)
    public void setBarang(String barang) {
        this.barang = barang;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    
    
    
    //accesor (getter)
    public String getBarang() {
        return barang;
    }

    public String getCode() {
        return code;
    }

    public double getHarga() {
        return harga;
    }

    public double getJumlah() {
        return jumlah;
    }
    
    
    //polymorpisme (overloading)
    public String displayInfo(){
        return "Barang :"+getBarang()+
                "\nCode :"+getCode()+
                "\nHarga :"+getHarga()+
                "\nJumlah Barang :"+getJumlah();
    }
}
