/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_revisao7;

/**
 *
 * @author franq
 */
import java.util.Scanner;

public class EX_Revisao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        int maior = 0; 
        int menor = 0;
        int soma = 0;
        int quantidade = 0;

        System.out.println("Digite valores inteiros positivos (0 ou negativo para sair):");

       
        while (true) {
            valor = scanner.nextInt();

            
            if (valor <= 0) {
                break;
            }

            
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }

            
            soma += valor;
            quantidade++;
        }

        
        if (quantidade > 0) {
            double media = (double) soma / quantidade; 

            System.out.println("\nResultados:");
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Quantidade de valores: " + quantidade);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }

    }
}
