/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Soal1Main {
    public static void main(String[] args) {
        String judul, penulis;
        Integer tahun;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Judul; ");
        judul = keyboard.nextLine();
        System.out.print("Penulis: ");
        penulis = keyboard.nextLine();
        System.out.print("Tahun Terbit: ");
        tahun = keyboard.nextInt();
        
        Buku bukuSaya = new Buku(judul, penulis, tahun);
        bukuSaya.display();
    }
}
