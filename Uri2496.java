/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2496;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author estudante
 */
public class Uri2496 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         char[] letra;
       char[] vetor;
       
        Scanner in = new Scanner (System.in);
            int  N = in.nextInt();
            while(N>0){
                int j=0;
            int M = in.nextInt();
            vetor = new char[M];
            letra = new char[M];
            String cadeia = in.next();
                for(int i=0;i<M;i++){ 
                   vetor[i]=cadeia.charAt(i);
                       letra[i]=cadeia.charAt(i);
                }
            Arrays.sort(letra);
            for(int i=0;i<vetor.length;i++){ 
                if(vetor[i]!=letra[i])  
                    j+=1;
            }
 
            if(j>2)
                System.out.println("There aren't the chance.");
            else
             System.out.println("There are the chance.");
            
         N--; 
         
            }
       }
    }
    

