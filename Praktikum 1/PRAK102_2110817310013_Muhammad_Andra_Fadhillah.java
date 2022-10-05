/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andra;

/**
 *
 * @author DELL
 */
import java.util.*;

public class PRAK102_2110817310013_Muhammad_Andra_Fadhillah {
    public static void main(String args[]) {
         int ulang, deret, a;
    
    Scanner keyboard = new Scanner(System.in);
    
    deret = keyboard.nextInt();
    ulang = 1;
    while (ulang <= 7) {
    a = deret;
    if (deret % 2 == 0) {
        a = a / 2;
        a--;
        if (ulang != 7) {
            System.out.print(a + ", ");
        } else {
            System.out.println(a);
        }
        ulang += 1;
        deret += 1;
        continue;
    } 
    if (ulang != 7) {
            System.out.print(a + ", ");
        } else {
            System.out.println(a);
        }
    ulang += 1;
    deret++;
    }
   }
   
}
