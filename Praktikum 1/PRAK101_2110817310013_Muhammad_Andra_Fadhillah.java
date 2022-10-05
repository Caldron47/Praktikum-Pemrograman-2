/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andra;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PRAK101_2110817310013_Muhammad_Andra_Fadhillah {
       public static void main(String[] args)
   { 
    String namaLengkap, tempatLahir;
    int tanggalLahir, bulanLahir, tahunLahir, tinggiBadan;
    float beratBadan;
    String namaBulan = null;
    
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Masukkan Nama Lengkap: ");
    namaLengkap = keyboard.nextLine();
    
    System.out.print("Masukkan Tempat Lahir: ");
    
    tempatLahir = keyboard.nextLine();
    
    System.out.print("Masukkan Tanggal Lahir: ");
    tanggalLahir = keyboard.nextInt();
    
    System.out.print("Masukkan Bulan Lahir: ");
    bulanLahir = keyboard.nextInt();
    
    System.out.print("Masukkan Tahun Lahir: ");
    tahunLahir = keyboard.nextInt();
    
    System.out.print("Masukkan Tinggi Badan: ");
    tinggiBadan = keyboard.nextInt();
    
    System.out.print("Masukkan Berat Badan: ");
    beratBadan = keyboard.nextFloat();
    
           switch (bulanLahir) {
               case 1:
                   namaBulan = "Januari";
                   break;
               case 2:
                   namaBulan = "Februari";
                   break;
               case 3:
                   namaBulan = "Maret";
                   break;
               case 4:
                   namaBulan = "April";
                   break;
               case 5:
                   namaBulan = "Mei";
                   break;
               case 6:
                   namaBulan = "Juni";
                   break;
               case 7:
                   namaBulan = "Juli";
                   break;
               case 8:
                   namaBulan = "Agustus";
                   break;
               case 9:
                   namaBulan = "September";
                   break;
               case 10:
                   namaBulan = "Oktober";
                   break;
               case 11:
                   namaBulan = "November";
                   break;
               case 12:
                   namaBulan = "Desember";
                   break;
               default:
                   break;
           }
    
    System.out.println("Data telah ditambahkan.");
    System.out.println("Nama lengkap " + namaLengkap + ", lahir di " + tempatLahir + " pada tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
    System.out.print("Tinggi badan " + tinggiBadan + " cm dan berat badan " + beratBadan + " kilogram");
   }

}
