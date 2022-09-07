// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

import javax.swing.JOptionPane;

// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok
public class TelefoneFormatException extends Exception {

    Leitura l = new Leitura();

    public void impTelefoneFormat() {
        JOptionPane.showMessageDialog(null, "O TELEFONE deve conter 11 digitos e um 9 na terceira posicao!", "Erro - Formato de Telefone", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Exemplo de Telefone: 87999999999", "Formato de Telefone Incorreto", JOptionPane.INFORMATION_MESSAGE);
    }

    public Pessoa reparaTelefoneFormat(Pessoa p1) {
        try {
            String telefone = JOptionPane.showInputDialog(null, "Informe um número de Telefone: ", "Formato de Email Incorreto", JOptionPane.INFORMATION_MESSAGE);
            p1.setTelefone(telefone);
        } catch (TelefoneFormatException tfe) {
            tfe.impTelefoneFormat();
            p1 = tfe.reparaTelefoneFormat(p1);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "TELEFONE deve ser uma String", "Erro - Formato de Telefone", JOptionPane.ERROR_MESSAGE);
        }
        return p1;
    }

}
