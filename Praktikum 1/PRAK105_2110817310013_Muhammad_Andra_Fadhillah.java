/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andra;

/**
 *
 * @author DELL
 */

import java.util.Scanner;

public class PRAK105_2110817310013_Muhammad_Andra_Fadhillah {
    public static void main(String args[]) {
        float r, t, hasil;
        float phi = (float) 3.14;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari: ");
        r = keyboard.nextFloat();
        System.out.print("Masukkan Tinggi: ");
        t = keyboard.nextFloat();
        
        hasil = phi*r*r*t;
        System.out.printf("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah " + "%.3f m3", hasil);
    }
}
