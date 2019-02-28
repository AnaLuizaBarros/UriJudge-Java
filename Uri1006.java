/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1006;

import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       float media;
      float A = in.nextFloat();

      float B = in.nextFloat();

      float C = in.nextFloat();
  
      media = (float) ((A*2/10) + (B*3/10)+ (C*5/10));
         System.out.printf("MEDIA = %.1f\n",media);
    }
    
}
