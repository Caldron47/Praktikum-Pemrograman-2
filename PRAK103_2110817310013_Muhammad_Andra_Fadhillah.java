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
public class PRAK103_2110817310013_Muhammad_Andra_Fadhillah {
    public static void main(String args[]) {
         int ulang, deret, a;
    
    Scanner keyboard = new Scanner(System.in);
    
    deret = keyboard.nextInt();
    ulang = 1;
    do {
    a = deret;
    if (deret % 7 == 0) {
        ulang++;
        deret--;
        continue;
    } else if (ulang == 5) {
        System.out.print(a);
    } else {
        System.out.print(a + ", ");
    }
    ulang++;
    deret--;
    } while (ulang <= 5);
   }
}
