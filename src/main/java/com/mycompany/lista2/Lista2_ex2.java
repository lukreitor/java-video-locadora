// Aluno: Lucas Martins da Silva Sena - RA: 2348098

package com.mycompany.lista2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lista2_ex2 {
   public static void main(String arg[]) {
      InputStreamReader c = new InputStreamReader(System.in);
      BufferedReader cd = new BufferedReader(c);

      // Declaração de variáveis locais
      int tamanho = 0;

      // Processamento
      try {
         System.out.println("Digite o Tamanho do vetor:");
         tamanho = Integer.parseInt(cd.readLine());
      } catch (IOException e) {
         System.out.println("Erro de entrada");
      }

      int vtr[] = new int[tamanho]; // Cria um vetor de inteiros com o tamanho digitado pelo usuário

      System.out.println("Tamanho do vetor: " + vtr.length);

      // preenchendo o vetor com valores
      for (int i = 0; i < vtr.length; i++) {
         try {
            System.out.println("Digite o valor do vetor na posição " + i + ":");
            vtr[i] = Integer.parseInt(cd.readLine());
         } catch (IOException e) {
            System.out.println("Erro de entrada");
         }
      }

      // Saída - exibir o vetor
      for (int i = 0; i < vtr.length; i++) {
         System.out.println("Posicao " + i + ": " + vtr[vtr.length - i - 1]);
      }
   }
}