package uas_2210010257;

public class AdminKasirDetail extends AdminKasir {
    public AdminKasirDetail(String barang, String code, double harga, double jumlah) {
        super(barang, code, harga, jumlah);
    }
    
    public int getTanggal() {
        return Integer.parseInt(getCode().substring(0, 2));
    }
    
    public int getBulan() {
        return Integer.parseInt(getCode().substring(2, 4));
    }
    
    public int getTahun() {
        return Integer.parseInt(getCode().substring(4)) + 2000;
    }
    
    public int getTanggal1 (){
        if (getTanggal() >= 0 && getTanggal() <= 31){
        return getTanggal();
            
        }
        else{
            System.out.println("====================");
            System.out.println("Tanggal Tidak Ada!!!");
            System.out.println("====================");
            return 0;
        }
    }
    public int getBulan1 (){
        if (getBulan() >= 0 && getBulan() <= 12){
        return getBulan();
            
        }
        else{
            System.out.println("====================");
            System.out.println("Bulan Tidak Ada!!!");
            System.out.println("====================");
            return 0;
        }
    }
    
//    public double getBayar() {
//        double jmlhBarang = getJumlah();
//        if (jmlhBarang >= 1) {
//            double total = jmlhBarang * getHarga();
//            return total;
//        } else {
//            System.out.println("Tolong Masukan Jumlah Barang!");
//            return 0;
//        }
//    }
    //selksi if else
    public double getDiskon() {
                double jmlhBarang = getJumlah();
        if (jmlhBarang >= 1) {
            double total = jmlhBarang * getHarga();
                if (total >= 50000 && total < 100000) {
                    double diskon = 0.1 * total;
                    double hasil = total - diskon;
                    System.out.println("Diskon Anda: " + diskon);
                    return hasil;
                } else if (total >= 100000) {
                    double diskon = 0.3 * total;
                    double hasil = total - diskon;
                    System.out.println("Diskon Anda: " + diskon);
                    return hasil;
                } else {
                    System.out.println("Maaf, Anda Tidak Mendapatkan Diskon");
                    return total;
                }
        } else {
            System.out.println("Tolong Masukan Jumlah Barang!");
            return 0;
        }
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTanggal Pesanan: " + getTanggal1() +
                "\nBulan Pesanan: " + getBulan1() +
                "\nTahun Pesanan: " + getTahun();
    }
}
