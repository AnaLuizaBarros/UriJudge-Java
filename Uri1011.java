/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1011;

import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double pi = 3.14159; 
       int raio = in.nextInt();
       System.out.printf("VOLUME = %.3f\n",((4.0/3)*pi*Math.pow(raio,3)));
    }
    
}
