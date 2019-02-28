/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1012;

import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        System.out.printf("TRIANGULO: %.3f\n",(a*c/2));
        System.out.printf("CIRCULO: %.3f\n",(pi*Math.pow(c,2)));
        System.out.printf("TRAPEZIO: %.3f\n",(((a*c)/2))+((b*c)/2));
        System.out.printf("QUADRADO: %.3f\n",Math.pow(b,2));
        System.out.printf("RETANGULO: %.3f\n",(a*b));
        
    }
    
}
