/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;
import java.lang.Math;
import java.util.LinkedList;
/**
 *
 * @author DELL
 */
public class Dadu {
    private int jumlahDadu;
    int sum;
    
    LinkedList<Integer> simpanDadu = new LinkedList<Integer>();

    public void setDadu(int jumlahDadu) {
        this.jumlahDadu = jumlahDadu;        
    }
    
    void acakNilai() {
        for (int i=0; i<this.jumlahDadu; i++) {
            simpanDadu.add((int)(Math.random()*(6-1+1)+1));
        }
    }
    
    public void getDadu() {
        for (int i = 1; i<=this.jumlahDadu; i++) {
            System.out.println("Dadu ke-" + i + " bernilai " + simpanDadu.get(i-1));
            sum += simpanDadu.get(i-1);
        }
        System.out.println("Total nilai dadu keseluruhan " + sum);
    }
    
}
