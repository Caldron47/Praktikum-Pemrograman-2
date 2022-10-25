/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {   
        Scanner keyboard = new Scanner(System.in);        
        Dadu daduObj = new Dadu();
        
        daduObj.setDadu(keyboard.nextInt());
        daduObj.acakNilai();
        daduObj.getDadu();
    }
    
}