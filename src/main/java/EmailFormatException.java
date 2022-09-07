// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

import javax.swing.JOptionPane;

// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok
public class EmailFormatException extends Exception {
   
   Leitura l = new Leitura();

   public void impEmailFormat(){
      JOptionPane.showMessageDialog(null, "O EMAIL deve conter @ e .", "Erro - Formato de Email", JOptionPane.ERROR_MESSAGE);
   }

   public Pessoa reparaEmailFormat(Pessoa p1){
      try{
         String email = JOptionPane.showInputDialog(null, "Exemplo de Email: lucas@gmail.com", "Formato de Email Incorreto", JOptionPane.INFORMATION_MESSAGE);
         p1.setEmail(email);
      }

      catch(EmailFormatException efe){
         efe.impEmailFormat();
         p1 = efe.reparaEmailFormat(p1);
      }

      catch(NumberFormatException nfe){
         JOptionPane.showMessageDialog(null, "EMAIL deve ser uma String", "Erro - Formato de Email", JOptionPane.ERROR_MESSAGE);
      }

      return p1;
   }
}