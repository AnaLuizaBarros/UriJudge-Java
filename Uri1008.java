/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1008;

import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int number = in.nextInt();
       int horas = in.nextInt();
       float trabalho = in.nextFloat();
       System.out.println("NUMBER = "+number);
       System.out.printf("SALARY = U$ %.2f\n",(horas*trabalho));
    }
    
}
