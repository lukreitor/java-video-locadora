// Aluno: Lucas Martins da Silva Sena - RA: a2348098 - ok 

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Leitura {

   // Declaração de métodos da classe
   public String entDados(String rotulo)
   {
      System.out.print(rotulo);

      // Declaração de variáveis / atributos do método
      String entrada = ""; // String que receberá a entrada do usuário

      // Conteúdo da aula
      InputStreamReader tec = new InputStreamReader(System.in); // tec = teclado, InputStream oferece a funcionalidade para leitura de byte ou sequencia de bytes
      BufferedReader in = new BufferedReader(tec); // in = entrada, melhora a eficiencia da velocidade de leitura e escrita

      try {
         entrada = in.readLine(); // lê a entrada do usuário
      } catch (IOException ioe) { // e ou ieo = IOException, erro de entrada e saida
         System.out.println("\nErro na leitura da entrada do usuário");
      }

      return entrada;
   }
}
