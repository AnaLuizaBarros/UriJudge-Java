/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1013;

import java.util.Scanner;
public class Uri1013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
     int A,B,ABS,MaiorAB;
     A = entrada.nextInt();
     B = entrada.nextInt();
     ABS=entrada.nextInt();

     MaiorAB=(A+B+ABS-(A-B))/2;
     System.out.println(MaiorAB + " eh o maior");
    
    }

   
    
}
