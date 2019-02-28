/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1009;

import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        float fixo = in.nextFloat();
        float vendido = in.nextFloat();
        System.out.printf("TOTAL = R$ %.2f\n", fixo+(vendido*0.15));
        
    }
    
}
