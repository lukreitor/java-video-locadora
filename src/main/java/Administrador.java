// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

public final class Administrador extends Staff implements Imprimi {
   // Atributos do objeto  

   // Atributos da classe 

   // Declaração do construtor
   public Administrador() {
      super();
   }


   // sobrecarga
   public Administrador(int idStaff, float salario, String cargo, String nCarteiraTrabalho, String nome, String sobrenome, String cpf, int idade, String email, String telefone, Endereco endereco, Conta conta) {
      super(idStaff, salario, cargo, nCarteiraTrabalho, nome, sobrenome, cpf, idade, email, telefone, endereco, conta);
   }

   // polimorfismo
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

   // métodos do objeto
   public static void adcionarFilme(Filme filme) {
      System.out.println("Filme adicionado com sucesso!");
   }

   public static void removerFilme(Filme filme) {
      System.out.println("Filme removido com sucesso!");
   }

   // Métodos da classe / estáticos

   // métodos sobreescritos / interfaces / polimorfismo

   public final void imprimir() {
      System.out.println("\n\n--------------------Administrador-------------------------");

      System.out.println("  Nome:              " + super.getNome() + "\n  Sobrenome:         " + super.getSobrenome()
            + "\n  CPF:               " + super.getCpf() + "\n  Idade:             " + super.getIdade()
            + "\n  Email:             " + super.getEmail() +
            "\n  Telefone:          " + super.getTelefone() + "\n  CEP:               " + super.getEndereco().getCep());

      System.out.println("\n  id do Administrador: " + this.getIdStaff() + "\n  Salario:              " + this.getSalario() + "\n  Cargo:                " + this.getCargo()
            + "\n  Numero da carteira:    " + this.getNCarteiraTrabalho() + "\n  Banco:                 " + super.conta.getBanco()
            + "\n  Agencia:               " + super.conta.getAgencia() + "\n  Digito:                " + super.conta.getDigito()
            + "\n  Numero da conta:       " + this.conta.getNumeroCartao() + "\n  Operacao:              " + super.conta.getOperacao());
      System.out.println("----------------------------------------------------\n\n");
   }

   // Métodos sobrecarregados 

   // interfaces

   // Getters and Setters
}