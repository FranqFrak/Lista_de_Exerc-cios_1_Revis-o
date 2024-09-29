/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_revisao3;

import java.util.Scanner;

/**
 *
 * @author franq
 */
public class EX_Revisao3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
      int num1,num2,resultado;
      
      System.out.println("Digite um número:");
       num1 = sc.nextInt();
      System.out.println("Digite outro número:");
       num2 = sc.nextInt();
       
         if ((num1 >= 0 && num2 >= 0) || (num1 < 0 && num2 < 0)) {
             resultado = num1 + num2;
             System.out.println("A soma de "+num1+" + "+num2+" e:"+resultado);
        } else {
            System.out.println("Dados de Entrada são Inválidos");
        }
       
       
    }
}
