/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1010;

import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int peca1 = in.nextInt();
      int quant1 = in.nextInt();
      float preco1 = in.nextFloat();
      int peca2 = in.nextInt();
      int quant2 = in.nextInt();
      float preco2 = in.nextFloat();
      System.out.printf("VALOR A PAGAR: R$ %.2f\n",((quant1*preco1)+(quant2*preco2)));
      
      
    }
    
}
