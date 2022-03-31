package com.perpus;

import java.util.concurrent.TimeUnit;

/**
 * @author Bagus
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Absensi mhs1 = new Absensi("Bagus", "2015061003", 'A', 2020, "Aktif");
        
        //Absensi;
        mhs1.daftarAnggota(new Peminjaman(mhs1));
        System.out.println("\nPeminjaman ke : " + Peminjaman.id_anggota);

        //EKSEKUSI BUKU
        Katalog buku1 = new Katalog("Naruto Shippuden", "Masashi Kishimoto", "komik", 100, 10);
        buku1.show();
        System.out.println("\n==================================");  
        System.out.println("\n\tsedang diproses");
        System.out.println("\n==================================");
        TimeUnit.SECONDS.sleep(5);
        mhs1.anggota.pinjamBuku(buku1);
        TimeUnit.SECONDS.sleep(2);
        mhs1.anggota.kembalikanBuku(buku1);

        // Syarat Pengajuan surat pengajuan bebas perpustakaan
        SuratBebas wisuda = new SuratBebas("Bagus", "2015061003", "Teknik", "Teknik Informatika", "Pringsewu", "087772765896" , true, true);
        wisuda.show();
    }

    
    
}
