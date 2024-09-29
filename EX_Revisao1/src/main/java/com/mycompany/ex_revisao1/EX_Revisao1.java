/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_revisao1;

/**
 *
 * @author franq
 */
import java.util.Scanner;
public class EX_Revisao1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
      int num1,num2,resultado=0;
      
      System.out.println("Digite um número:");
       num1 = sc.nextInt();
      System.out.println("Digite outro número:");
       num2 = sc.nextInt();
       
       resultado = num1+num2;
       
       System.out.println("A soma de "+num1+" + "+num2+" e:"+resultado);
    }
}
