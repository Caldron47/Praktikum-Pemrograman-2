/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andra;

/**
 *
 * @author DELL
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PRAK104_2110817310013_Muhammad_Andra_Fadhillah {
    public static void main(String args[]) 
            throws IOException
    {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        
        int kartuAndi[] = new int[3], kartuBudi[] = new int[3];
        int skorBudi = 0, skorAndi = 0, i = 0;
        String[] strKartu;
        
        System.out.print("Kartu Andi: ");
        strKartu = br.readLine().split(" ");
        
        while (i < strKartu.length) {
            kartuAndi[i] = Integer.parseInt(strKartu[i]);
            i++;
        }
        System.out.print("Kartu Budi: ");
        strKartu = br.readLine().split(" ");
        
        i = 0;
        while (i < strKartu.length) {
            kartuBudi[i] = Integer.parseInt(strKartu[i]);
            i++;
        }
        
        i=0;        
        while (i < 3) {
                if (kartuAndi[i] < 2 || kartuAndi[i] > 10) {
                    skorAndi = -1;
                    break;
                } else if (kartuBudi[i] < 2 || kartuBudi[i] > 10) {
                    skorBudi = -1;
                    break;
                } else 
                if (kartuAndi[i] < kartuBudi[i]) {
                    skorBudi++;
                } else if (kartuAndi[i] > kartuBudi[i]) {
                    skorAndi++;
                }
                i++;
            }
      
        if (skorAndi == -1 || skorBudi == -1) {
            System.out.println("Error, setiap pemain harus memasukkan 3 kartu yang masing-masing kartu nya bernilai 2 sampai 10");
        } else if (skorAndi > skorBudi) {
            System.out.println("Andi");
        } else if (skorAndi < skorBudi) {
            System.out.println("Budi");
        } else {
            System.out.println("Seri");
        }
        
    }
}
