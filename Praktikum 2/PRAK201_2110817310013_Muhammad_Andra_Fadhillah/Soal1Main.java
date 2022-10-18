/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK201_2110817310013_Muhammad_Andra_Fadhillah;

/**
 *
 * @author DELL
 */
public class Soal1Main {
    public static void main(String[] args) {
        Mangga arumanis = new Mangga();
        arumanis.Mangga("Arumanis", 0.3f, 13, 5000);
        arumanis.info();
        
        Mangga manalagi = new Mangga();
        manalagi.Mangga("Manalagi", 0.5f, 17, 7500);
        manalagi.info();
        
        Mangga manggaMadu = new Mangga();
        manggaMadu.Mangga("Mangga Madu", 0.375f, 12, 6500);
        manggaMadu.info();        
    }
    
}
