/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK201_2110817310013_Muhammad_Andra_Fadhillah;

/**
 *
 * @author DELL
 */
public class Mangga {
    String namaMangga;
    float berat;
    int jumlahBeli, harga;
 
    public void Mangga(String namaMangga, float berat, int jumlahBeli, int harga){
        this.namaMangga = namaMangga;
        this.berat = berat;
        this.jumlahBeli = jumlahBeli;
        this.harga = harga;
}
    
    public void info() {
        System.out.println("Nama Mangga : " + namaMangga);
        System.out.println("Berat : " + berat + " kg");
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Total Berat : " + berat * jumlahBeli + " kg");
        System.out.println("Total Harga : Rp. " + harga * jumlahBeli);
        System.out.println("");
    }
}