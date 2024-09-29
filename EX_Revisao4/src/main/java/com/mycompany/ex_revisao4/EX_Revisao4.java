/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_revisao4;

/**
 *
 * @author franq
 */
import java.util.Scanner;
public class EX_Revisao4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        double lado1,lado2,lado3;
        
        System.out.println("Digite o primeiro lada:");
         lado1 = sc.nextDouble();
        System.out.println("Digite o segundo lado:");
         lado2 = sc.nextDouble();
        System.out.println("Digite o terceiro lado:");
         lado3 = sc.nextDouble();
        
          if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero.");
             }
              else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
              {
                System.out.println("Triângulo Isósceles.");
               } 
                else 
                { 
                 System.out.println("Triângulo Escaleno.");
                 }
                } 
                else
                 {
                   System.out.println("Os valores não formam um triângulo.");
        }
    }
}
