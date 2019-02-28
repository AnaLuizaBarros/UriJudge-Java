/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1015;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author ASTRA
 */
public class Uri1015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1 = in.nextFloat();
        float x2 = in.nextFloat();
        float y1 = in.nextFloat();
        float y2 = in.nextFloat();
        float x = x2-x1;
        float y = y2-y1;
        
        System.out.printf("%.4f",sqrt((Math.pow(x,2) + Math.pow(y,2))));
        
    }
    
}
