// Aluno: Lucas Martins da Silva Sena - RA: 2348098

package com.mycompany.lista2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lista2_ex3 {
   public static void main(String arg[]) {
      InputStreamReader c = new InputStreamReader(System.in);
      BufferedReader cd = new BufferedReader(c);

      // Declaração de variáveis locais
      int lin = 0, col = 0;

      // Processamento
      try {
         System.out.print("Digite o número de linhas da matriz:");
         lin = Integer.parseInt(cd.readLine());
         System.out.print("Digite o número de colunas da matriz:");
         col = Integer.parseInt(cd.readLine());
      } catch (IOException e) {
         System.out.println("Erro de entrada");
      }

      int vtr[][] = new int[lin][col]; // Cria uma matrix de inteiros com o tamanho digitado pelo usuário

      System.out.println("Matrix[ " + lin + " ][ " + col + " ]");

      // preenchendo a matrix com valores
      for (int i = 0; i < vtr.length; i++) {
         for (int j = 0; j < vtr[i].length; j++) {
            try {
               System.out.println("Digite o valor da matriz na posição " + i + "," + j + ":");
               vtr[i][j] = Integer.parseInt(cd.readLine());
            } catch (IOException e) {
               System.out.println("Erro de entrada");
            }
         }
      }

      // Saída - exibir a matrix
      System.out.println("****** MATRIX ******");
      for (int i = 0; i < vtr.length; i++) {
         for (int j = 0; j < vtr[i].length; j++) {
            System.out.print(vtr[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("********************");

      // Saída - Matrix invertida
      System.out.println("****** MATRIX INVERTIDA ******");
      for (int i = 0; i < vtr.length; i++) {
         for (int j = 0; j < vtr[i].length; j++) {
            System.out.print(vtr[vtr.length - i - 1][vtr[i].length - j - 1] + " ");
         }
         System.out.println();
      }
      System.out.println("*****************************");
   }
}