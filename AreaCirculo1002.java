
package areacirculo.pkg1002;


import java.util.Scanner;


public class AreaCirculo1002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Raio, Area;
        Raio = entrada.nextDouble();
        Area = 3.14159 * Math.pow(Raio, 2);
        System.out.printf("A=%.4f%n",Area);
        System.out.println();
    }
    
}
