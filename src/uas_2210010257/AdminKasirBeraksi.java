
package uas_2210010257;

import java.util.Scanner;
public class AdminKasirBeraksi {
    public static void main(String[] args) {
        //error hendling
        try {
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            //array
            AdminKasirDetail[] admin = new AdminKasirDetail[2];
            //perulangan
            for (int i = 0; i < admin.length; i++) {
                System.out.print("Masukan Nama Barang " + (i + 1) + ": ");
                String barang = scanner.nextLine();
                System.out.print("Masukan Code Barang " + (i + 1) + ": ");
                String code = scanner.nextLine();
                System.out.print("Masukan Harga Barang " + (i + 1) + ": ");
                double harga = scanner.nextDouble();
                System.out.print("Masukan Jumlah Barang " + (i + 1) + ": ");
                double jumlah = scanner.nextDouble();
                System.out.println("");
                scanner.nextLine(); // Konsumsi karakter newline
                //objek
                admin[i] = new AdminKasirDetail(barang, code, harga, jumlah);
            }
            for (AdminKasirDetail data : admin) {
                System.out.println("=================");
                System.out.println("Daftar Harga Pembelian Barang");
                System.out.println(data.displayInfo());
                System.out.println("Total Tagihan Anda : Rp."+data.getDiskon());
//                System.out.println("Total Tagihan Anda : Rp."+data.getBayar());
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Nomor: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Code: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }

}
