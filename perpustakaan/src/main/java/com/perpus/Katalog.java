package com.perpus;

/**
 * @author Bagus
 */
public class Katalog {
   private String judul, penulis, kategori;
   int jumlah_halaman;
   private int stock;

   Katalog (String judul, String penulis,String kategori, int jumlah_halaman, int stock) {
      this.judul = judul;
      this.penulis = penulis;
      this.kategori = kategori;
      this.jumlah_halaman = jumlah_halaman;
      this.stock = stock;
   }

   void show() {
      // String statusAnggota = (this.status == true ? "terdaftar" : "blm terdaftar");
      System.out.println("\n\tDETAIL BUKU\n==================================\n");
      System.out.printf("Judul      : %s\n", this.judul);
      System.out.printf("Penulis    : %s\n", this.penulis);
      System.out.printf("Kategori   : %s\n", this.kategori);
      System.out.printf("Jumlah hal : %s\n", this.jumlah_halaman + " hal");
      System.out.printf("Stock      : %s\n", this.stock + " item");
      System.out.println("\n==================================");
   }

   public String getKategori() {
      return kategori;
   }

   public void setKategori(String kategori) {
      this.kategori = kategori;
   }

   int getStock() {
      return this.stock;
   }

   void kurangStock(int proses) {
      this.stock -= proses;
   }

   void tambahStock(int proses) {
      this.stock += proses;
   }

   void setStock(String kondisi, int value) {
      this.stock = (kondisi == "tambah" ? this.stock + value : this.stock - value);
   }

   public void setStock(String string) {
   }
   
}
