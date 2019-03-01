/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1017;

import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float tempo = in.nextInt();
        float velocidade = in.nextInt();
        System.out.printf("%.3f",((tempo*velocidade)/12));
    }
    
}
