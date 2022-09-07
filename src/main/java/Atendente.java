// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

public class Atendente extends Staff implements Imprimi {
   // Atributos do objeto 

   // Atributos da classe 

   // Declaração do construtor
   public Atendente() {
      super();
   }

   public Atendente(int idStaff, float salario, String cargo, String nCarteiraTrabalho, String nome, String sobrenome, String cpf, int idade, String email, String telefone, Endereco endereco, Conta conta) {
      super(idStaff, salario, cargo, nCarteiraTrabalho, nome, sobrenome, cpf, idade, email, telefone, endereco, conta);
   }

   // Métodos do objeto 
   public final void abrirChamado() {
      System.out.println("Chamado aberto com sucesso!");
   }

   public final void responderChamado() {
      System.out.println("Chamado respondido com sucesso!");
   }

   public final void fecharChamado() {
      System.out.println("Chamado fechado com sucesso!");
   }

   // Métodos da classe / estáticos

   // métodos sobreescritos
   public void cadastrar() {
      System.out.println("Cadastro realizado com sucesso!");
   }

   public void excluir() {
      System.out.println("Cadastro excluído com sucesso!");
   }

   public void alterar() {
      System.out.println("Cadastro alterado com sucesso!");
   }

   public void consultar() {
      System.out.println("Cadastro consultado com sucesso!");
   }

   // Métodos sobrecarregados 

   // interfaces

   // Getters and Setters
}