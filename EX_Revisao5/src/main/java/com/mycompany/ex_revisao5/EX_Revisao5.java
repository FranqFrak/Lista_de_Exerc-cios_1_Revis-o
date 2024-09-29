/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_revisao5;

/**
 *
 * @author franq
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class EX_Revisao5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        String nomeLutador;
        double peso;
        
        System.out.println("Digite seu nome lutador:");
          nomeLutador = sc.next();
        System.out.println("Digite seu peso:");
          peso = sc.nextDouble();
          
          if(peso < 65){
            System.out.println("Peso pena");
          }
          else if(peso >= 65 && peso < 72){
            System.out.println("peso leve");
          }
          else if(peso >= 72 && peso < 79){
            System.out.println("peso lingeiro");
          }
          else if(peso >= 79 && peso < 86){
            System.out.println("meio medio");
          }
          else if(peso >= 86 && peso < 93){
            System.out.println("medio");
          }
          else if(peso >= 93 && peso < 100){
            System.out.println("meio pesado");
          }
          else{
            System.out.println("pesado");
          }
       
        FileWriter fileWriter = new FileWriter("lutador.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("O lutador " + nomeLutador + " pesa " + peso);
        printWriter.close();
        fileWriter.close();

        System.out.println("Os dados foram gravados no arquivo 'lutador.txt'.");
       
          
          
    }   
}
