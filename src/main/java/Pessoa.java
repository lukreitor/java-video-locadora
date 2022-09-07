// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

public abstract class Pessoa {
   // Declaração de atributos do objeto
   private String nome;
   private String sobrenome;
   private String cpf;
   private int idade;
   private String email;
   private String telefone;
   protected Endereco endereco;
   protected Conta conta;

   // Declaração do construtor
   public Pessoa() {
      this.nome = "";
      this.sobrenome = "";
      this.cpf = "0";
      this.idade = 0;
      this.email = "";
      this.telefone = "";
      this.endereco = new Endereco();
      this.conta = new Conta();
   }

   public Pessoa(String nome, String sobrenome, String cpf, int idade, String email, String telefone, Endereco endereco, Conta conta) {
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.cpf = cpf;
      this.idade = idade;
      this.email = email;
      this.telefone = telefone;
      this.endereco = endereco;
      this.conta = conta;
   }

   // Declaração dos métodos abstratos 
   public abstract void cadastrar(); // mensagem informando que o cadastro foi realizado com sucesso
   public abstract void excluir(); // mensagem informando que o cadastro foi excluído com sucesso
   public abstract void alterar(); // mensagem informando que o cadastro foi alterado com sucesso
   public abstract void consultar(); // mensagem informando que o cadastro foi consultado com sucesso

   // Declaração de métodos getters e setters
   public String getNome() { return nome; }
   public void setNome(String nome) { 
      this.nome = nome; 
   }

   public String getSobrenome() { return sobrenome; }
   public void setSobrenome(String sobrenome) { 
      this.sobrenome = sobrenome; 
   }

   public String getCpf() { return cpf; }
   public void setCpf(String cpf) { 
      this.cpf = cpf; 
   }

   public int getIdade() { return idade; }
   public void setIdade(int idade) { 
      this.idade = idade; 
   }

   public String getEmail() { return email; }
   public void setEmail (String email) throws EmailFormatException { 
      if(email.contains("@") && email.contains(".")) {
         this.email = email;
      } else {
         throw new EmailFormatException();
      }
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone (String telefone) throws TelefoneFormatException {
      if(telefone.length() == 11) {
         if(telefone.charAt(2) == '9') {
            this.telefone = telefone;
         } else {
            throw new TelefoneFormatException();
         }
      }
      else {
         throw new TelefoneFormatException();
      }
   }

   public Endereco getEndereco() { return endereco; }
   public void setEndereco(Endereco endereco) { 
      this.endereco = endereco; 
   }

   public Conta getConta() { return conta; }
   public void setConta(Conta conta) { 
      this.conta = conta; 
   }
}
