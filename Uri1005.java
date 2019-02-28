/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1005;


import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float a, b, m;
  Scanner in = new Scanner(System.in);
  a = in.nextFloat();
  b = in.nextFloat();

  m = (float) ((a/11 * 3.5) + (b/11 * 7.5));

  System.out.printf("MEDIA = %.5f\n", m);
 
 
       
       


    }
    
}
