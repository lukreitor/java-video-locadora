// Aluno: Lucas Martins da Silva Sena - RA: a2348098 

public class Staff extends Pessoa implements Imprimi {
   // Declaração de variáveis / atributos da classe
   private int idStaff;
   private float salario;
   private String Cargo;
   private String nCarteiraTrabalho;

   // Declaração do construtor
   public Staff() {
      super();
      this.idStaff = -1;
      this.salario = 0;
      this.Cargo = "";
      this.nCarteiraTrabalho = "";
   }

   public Staff(int idStaff, float salario, String cargo, String nCarteiraTrabalho, String nome, String sobrenome, String cpf, int idade, String email, String telefone, Endereco endereco, Conta conta) {
      super(nome, sobrenome, cpf, idade, email, telefone, endereco, conta);
      this.idStaff = idStaff;
      this.salario = salario;
      this.Cargo = cargo;
      this.nCarteiraTrabalho = nCarteiraTrabalho;
   }

   // Declaração dos métodos da classe
   public void consultarSalario() { // talvez o método sejam em locacao
      // calcula o salário
      int salarioLiquido = (int) (this.salario - (this.salario * 0.11));
      System.out.println("O salário do funcionário é de R$ " + salarioLiquido);
   }

   // Declaração dos métodos abstratos e herdados
   public void imprimir() {
      System.out.println("\n\n----------------------STAFF-------------------------");

      System.out.println("  Nome:              " + super.getNome() + "\n  Sobrenome:         " + super.getSobrenome()
            + "\n  CPF:               " + super.getCpf() + "\n  Idade:             " + super.getIdade()
            + "\n  Email:             " + super.getEmail() +
             "\n  Telefone:          " + super.getTelefone() + "\n  Cidade:            " + super.getEndereco().getCidade());

      System.out.println("  Id Empresa:        " + this.idStaff + "\n  Salario:          " + this.salario
            + "\n  Cargo:             " + this.Cargo + "\n  Carteira Trabalho: " + this.nCarteiraTrabalho);

      System.out.println("----------------------------------------------------\n\n");
   }


   public void cadastrar() {
      System.out.println("novo membro da staff cadastrado com sucesso! Seja bem vindo " + super.getNome() + " " + super.getSobrenome());
   }

   public void excluir() {
      System.out.println("membro da staff excluído com sucesso! Até a próxima " + super.getNome() + " " + super.getSobrenome());
   }

   public void alterar() {
      System.out.println("Dados alterados com sucesso! Volte sempre " + super.getNome() + " " + super.getSobrenome());
   }

   public void consultar() {
      System.out.println("Aqui estão seus dados: " + super.getNome() + " " + super.getSobrenome());
      imprimir();
   }

   // Declaração de métodos getters e setters
   public float getSalario() { return salario; }

   public String getCargo() { return Cargo; }
   public void setCargo(String Cargo) { 
      this.Cargo = Cargo; 
   }

   public String getNCarteiraTrabalho() { return nCarteiraTrabalho; }
   public void setNCarteiraTrabalho(String nCarteiraTrabalho) { 
      this.nCarteiraTrabalho = nCarteiraTrabalho; 
   }

   public int getIdStaff() { return this.idStaff; }
   
   public void setIdStaff(int idStaff) { this.idStaff = idStaff; }
   public void setSalario(float salario) { this.salario = salario; }

}
