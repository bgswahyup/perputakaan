package com.perpus;

/**
 * @author Bagus
 */
public class Absensi{ 
    String nama;
    String NPM;
    char kelas;
    int angkatan;
    String status;
    Peminjaman anggota;
    
    public Absensi(String nama, String npm, char kelas, int angkatan, String status) {
        this.nama = nama;
        this.NPM = npm;
        this.kelas = kelas;
        this.angkatan = angkatan;
        this.status = status;
    }

    void daftarAnggota(Peminjaman anggota) {
      this.anggota = anggota;
      this.anggota.setAktif(true);
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNPM(){
        return NPM;
    }
    public void setNPM(String NPM){
        this.NPM = NPM;
    }

}
