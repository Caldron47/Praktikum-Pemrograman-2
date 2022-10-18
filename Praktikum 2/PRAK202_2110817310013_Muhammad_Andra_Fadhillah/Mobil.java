/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK202_2110817310013_Muhammad_Andra_Fadhillah;

import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author DELL
 */
public class Mobil {
    String merek, pemilikMobil, tahun_keluaran;
    int harga, kapasitas, pajak;
    
    public void info() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " + NumberFormat.getNumberInstance(Locale.US).format(harga));
        System.out.println("Tahun Keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas + "cc");
    }
    
    public void setPemilik(String pemilikMobil) {
        this.pemilikMobil = pemilikMobil;
    }
            
    public String getPemilik() {
        return this.pemilikMobil;
    }
    
    public String getPajak() {
        return NumberFormat.getNumberInstance(Locale.US).format(this.harga*0.02);
    }
}

