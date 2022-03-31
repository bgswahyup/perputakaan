package com.perpus;

import java.util.concurrent.TimeUnit;

public class SuratBebas {
    String nama;
    String NPM;
    String fakultas;
    String programStudi;
    String alamat;
    String noTelepon;
    Boolean fotoSlipSPP, fotoKTM;
    
    SuratBebas(String nama, String nPM, String fakultas, String programStudi, String alamat, String noTelepon, Boolean fotoSlipSPP, Boolean fotoKTM) {
        this.nama = nama;
        NPM = nPM;
        this.fakultas = fakultas;
        this.programStudi = programStudi;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.fotoSlipSPP = fotoSlipSPP;
        this.fotoKTM = fotoKTM;
    }

    void show() throws InterruptedException {
      // String statusAnggota = (this.status == true ? "terdaftar" : "blm terdaftar");
      System.out.println("\nPENGAJUAN SURAT BEBAS PERPUTAKAAN\n==================================\n");
      System.out.printf("Nama           : %s\n", this.nama);
      System.out.printf("NPM            : %s\n", this.NPM);
      System.out.printf("Fakultas       : %s\n", this.fakultas);
      System.out.printf("Program Studi  : %s\n", this.programStudi);
      System.out.printf("ALamat         : %s\n", this.alamat);
      System.out.printf("Foto Slip SPP  : %s\n", this.fotoSlipSPP);
      System.out.printf("Foto KTM Asli  : %s\n", this.fotoKTM);
      System.out.println("\n==================================");  
      System.out.println("\n\tsedang diproses");
      System.out.println("\n==================================");
      TimeUnit.SECONDS.sleep(5);
      System.out.println("\n==================================");  
      System.out.println("\n\tSilahkan konfirmasi ke \n\tpetugas layanan Sirkulasi");
      System.out.println("\n==================================");

   }
}
