/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1007;

import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
     int A,B,C,D;
     A = entrada.nextInt();
     B = entrada.nextInt();
     C = entrada.nextInt();
     D = entrada.nextInt();
     System.out.println("DIFERENCA = "+(A*B-C*D));
    }
    
}
