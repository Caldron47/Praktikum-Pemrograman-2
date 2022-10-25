/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Negara> simpanInfoNegara = new LinkedList<>();               
        Scanner keyboard = new Scanner(System.in);
        int jumlahNegara = keyboard.nextInt();
        keyboard.nextLine();
        for (int i=0;i < jumlahNegara;i++){  
            String nama = keyboard.nextLine();
            String jenisKepemimpinan = keyboard.nextLine();
            String namaPemimpin = keyboard.nextLine();
            if (jenisKepemimpinan.equalsIgnoreCase("monarki")){
                simpanInfoNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, 0 , 0, 0));
            } 
            else {
                int tanggalKemerdekaan = keyboard.nextInt();
                int bulanKemerdekaan = keyboard.nextInt();
                int tahunKemerdekaan = keyboard.nextInt();
                keyboard.nextLine();
                simpanInfoNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));                  
            }         
        }               
        for (int i=0; i < jumlahNegara; i++){
            simpanInfoNegara.get(i).informasiNegara();            
        }        
    }    
    
}