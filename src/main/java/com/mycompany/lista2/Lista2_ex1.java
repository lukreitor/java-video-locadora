// Aluno: Lucas Martins da Silva Sena - RA: 2348098

package com.mycompany.lista2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lista2_ex1 {
   public static void main(String arg[]) {
      InputStreamReader c = new InputStreamReader(System.in);
      BufferedReader cd = new BufferedReader(c);

      // Declaração de variáveis locais
      String frase = "";
      char letra = '0';

      try {
         System.out.println("Digite uma frase:");
         frase = cd.readLine();
      }
      catch(IOException e) {
         System.out.println("Erro de entrada");
      }

      try {
         System.out.println("Digite a letra a ser procurada na frase:");
         letra = cd.readLine().charAt(0);
      }
      catch(IOException e) {
         System.out.println("Erro de entrada");
      }

      // Processamento
      int posicao[] =  new int[100]; // Posição da letra na frase
      //int posicao[] = {};
      int cont = 0, i; // Contador de ocorrências

      for (i = 0; i < frase.length(); i++) 
      {
         if (frase.charAt(i) == letra) 
         {
            posicao[cont] = i; 
            cont++;
         }
      }

      // Saída
      if (cont == 0) {
         System.out.println("A letra " + letra + " não foi encontrada na frase.");
      }
      else {
         System.out.println("A letra " + letra + " foi encontrada " + cont + " vezes na frase.");
         for (i = 0; i < cont; i++) 
         {
            System.out.println("Na posição " + posicao[i]);
         }
      }
   }
}
