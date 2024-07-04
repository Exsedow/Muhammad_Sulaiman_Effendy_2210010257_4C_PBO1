# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. *Class* adalah template atau blueprint dari object. Pada kode ini, AdminKasir, AdminKasirDetail, dan AdminKasirBeraksi adalah contoh dari class.

```bash
public class AdminKasir {
    ...
}

public class AdminKasirDetail extends AdminKasir {
    ...
}

public class AdminKasirBeraksi {
    ...
}
```

2. *Object* adalah instance dari class. Pada kode ini, admin[i] = new AdminKasirDetail(barang, code, harga, jumlah); adalah contoh pembuatan object.

```bash
admin[i] = new AdminKasirDetail(barang, code, harga, jumlah);
```


3. *Atribut* adalah variabel yang ada dalam class. Pada kode ini, barang, code, harga dan jumlah adalah contoh atribut.

bash
String barang;
String code;
double harga;
doubel jumlah;


4. *Constructor* adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class AdminKasir dan AdminKasieDetail.

bash
 public AdminKasir(String barang, String code, double harga, double jumlah) {
        this.barang = barang;
        this.code = code;
        this.harga = harga;
        this.jumlah = jumlah;
    }
public AdminKasirDetail(String barang, String code, double harga, double jumlah) {
        super(barang, code, harga, jumlah);
    }


5. *Mutator* atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setBarang, seCode ,setHarga, setJumlah adalah contoh method mutator.

bash
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


6. *Accessor* atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getBarang,getCode,getHarga,getJumlah,getTanggal,getBulan,getTahun,getTanggal1,getBulan,getDiskon adalah contoh method accessor.

bash
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



7. *Encapsulation* adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut barang , code, harga,jumlah dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

bash
    private String barang;
    private String code;
    private double harga;
    private double jumlah;


8. *Inheritance* adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, AdminKasirDetail mewarisi AdminKasir dengan sintaks extends.

bash
public class AdminKasirDetail extends AdminKasir {
}


9. *Polymorphism* adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method displayInfo(String) di AdminKasir merupakan overloading method displayInfo dan displayInfo di AdminKasirDetailDetail merupakan override dari method displayInfo di AdminKaisr.

bash
public String displayInfo(){
        return "Barang :"+getBarang()+
                "\nCode :"+getCode()+
                "\nHarga :"+getHarga()+
                "\nJumlah Barang :"+getJumlah();
    }

@Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTanggal Pesanan: " + getTanggal1() +
                "\nBulan Pesanan: " + getBulan1() +
                "\nTahun Pesanan: " + getTahun();
    }


10. *Seleksi* adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam method getTanggal1,getBulan,getDiskon.

bash
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


11. *Perulangan* adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

bash
for (int i = 0; i < admin.length; i++) {
    ...
}


12. *Input Output Sederhana* digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

bash
                System.out.print("Masukan Nama Barang " + (i + 1) + ": ");
                String barang = scanner.nextLine();
                System.out.print("Masukan Code Barang " + (i + 1) + ": ");
                String code = scanner.nextLine();
                System.out.print("Masukan Harga Barang " + (i + 1) + ": ");
                double harga = scanner.nextDouble();
                System.out.print("Masukan Jumlah Barang " + (i + 1) + ": ");
                double jumlah = scanner.nextDouble();
                System.out.println("");
                scanner.nextLine();

                System.out.println("=================");
                System.out.println("Daftar Harga Pembelian Barang");
                System.out.println(data.displayInfo());
                System.out.println("Total Tagihan Anda : Rp."+data.getDiskon());



13. *Array* adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, AdminKasirDetail[] admin = new AdminKasirDetail[2]; adalah contoh penggunaan array.

bash
AdminKasirDetail[] admin = new AdminKasirDetail[2];


14. *Error Handling* digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.

bash
try {
    // code that might throw an exception
          catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Nomor: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Code: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | *TOTAL*      | *100* |

## Pembuat

Nama: Muhammad Sulaiman Effendy
NPM: 2210010257
