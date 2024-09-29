/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_revisao6;

/**
 *
 * @author franq
 */
import java.util.Scanner;
public class EX_Revisao6 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
       
       int numero;
       
       System.out.println("Digite um numero inteiro:");
        numero = sc.nextInt();
        
         while (numero != 0) {
           
            if (numero > 0) {
                System.out.println("O número " + numero + " é positivo.");
            } else {
                System.out.println("O número " + numero + " é negativo.");
            }

            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
        }
        
    }
}
