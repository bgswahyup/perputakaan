package com.perpus;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
/**
 * @author Bagus
 */
public class Peminjaman {   
   private boolean pinjam = false;
   private String nama;
   private String NPM;
   private boolean aktif = false;
   static int id_anggota  = 0;

   LocalDateTime myDateObj = LocalDateTime.now();  
   DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");   
   String formattedDate = myDateObj.format(myFormatObj);

   
   public Peminjaman(Absensi peminjam) {
      this.nama = peminjam.getNama();
      this.NPM = peminjam.getNPM();
      this.aktif = true;
      Peminjaman.id_anggota = 1;
   }

   public boolean isAktif() {
      return aktif;
   }

   public void setAktif(boolean aktif) {
      this.aktif = aktif;
   }

   public String getNPM() {
      return NPM;
   }

   public void setNPM(String nPM) {
      this.NPM = nPM;
   }

   public String getNama() {
      return nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public boolean isPinjam() {
      return pinjam;
   }

   public void setPinjam(boolean pinjam) {
      this.pinjam = pinjam;
   }

   void pinjamBuku(Katalog buku) {
      buku.kurangStock(1);
      buku.setStock("kurang" + 1);
      System.out.printf("\n==================================\n %s meminjam buku \n==================================\n", this.nama);
      System.out.println("Tanggal Peminjaman: " + formattedDate); 
      System.out.println("Pengembalian paling lambat 10 hari setelah peminjaman"); 
      System.out.println("\n==================================");
      this.pinjam = true;
   }

   void kembalikanBuku(Katalog buku) {
      buku.setStock("tambah" + 1);
      // if buku.stock
      System.out.printf("\n==================================\n %s mengembalikan buku \n==================================\n",this.nama);
      System.out.println("Tanggal Pengembalian: " + formattedDate); 
      System.out.println("\n==================================");
      this.pinjam = false;
   }
}