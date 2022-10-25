/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal2;

import java.util.HashMap;

/**
 *
 * @author DELL
 */
public class Negara {
    private String nama, kepemimpinan, namaPemimpin;
    private int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
    
    public Negara(String nama, String kepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
        this.nama = nama;
        this.kepemimpinan = kepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKepemimpinan() {
        return kepemimpinan;
    }

    public void setKepemimpinan(String kepemimpinan) {
        this.kepemimpinan = kepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public void setNamaPemimpin(String namaPemimpin) {
        this.namaPemimpin = namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public void setTanggalKemerdekaan(int tanggalKemerdekaan) {
        this.tanggalKemerdekaan = tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public void setBulanKemerdekaan(int bulanKemerdekaan) {
        this.bulanKemerdekaan = bulanKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }

    public void setTahunKemerdekaan(int tahunKemerdekaan) {
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
    
    public void informasiNegara(){
        HashMap<Integer, String> bulan = new HashMap<>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
        System.out.println();
        System.out.print("Negara " + getNama());
        String[] jenisKepemimpinanPisah  = getKepemimpinan().split(" ");
        String jenisKepemimpinanUpCase = "";
        for (String smntr: jenisKepemimpinanPisah){
            jenisKepemimpinanUpCase = jenisKepemimpinanUpCase + smntr.substring(0,1).toUpperCase() + smntr.substring(1).toLowerCase() + " ";
        }
        if (getTanggalKemerdekaan() != 0){
            System.out.print(" mempunyai " + jenisKepemimpinanUpCase);
            System.out.println("bernama " + getNamaPemimpin());            
            System.out.print("Deklarasi Kemerdekaan pada Tanggal " + getTanggalKemerdekaan()); 
            System.out.print(" " + bulan.get(getBulanKemerdekaan()));
            System.out.println(" " + getTahunKemerdekaan());
        }
        else {
            System.out.print(" mempunyai Raja");
            System.out.println(" bernama " + getNamaPemimpin());               
        }
    }
    
}