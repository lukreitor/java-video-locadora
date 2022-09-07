// Aluno: Lucas Martins da Silva Sena - RA: a2348098

public final class Cliente extends Pessoa implements Imprimi {
   // Declaração de variáveis locais / atributos da classe

   private int idCliente;
   private String nickname;
   private String favoritos;
   private boolean status;
   

   // Declaração do construtor
   public Cliente() {
      super();
      this.status = false;
      this.nickname = "";
      this.favoritos = "";
   }

   public Cliente(String nickname, String favoritos, String nome, String sobrenome, String cpf, int idade, String email, String telefone, Endereco endereco, Conta conta) {
      super(nome, sobrenome, cpf, idade, email, telefone, endereco, conta);
      this.idCliente = Integer.parseInt(super.getCpf());
      this.nickname = nickname;
      this.favoritos = favoritos;
      this.status = true;
   }

   // Declaração dos métodos do objeto
   public final void consultarFavoritos() {
      System.out.println("Os favoritos do cliente são: " + this.favoritos);
   }

   public final void AdcionarFavoritos(String favoritos) {
      this.setFavoritos(this.favoritos + " " + favoritos);
      System.out.println("Favoritos adicionados com sucesso!");
      this.consultarFavoritos();
   }

   // Declaração dos métodos do objeto
   public final void imprimir() {
      System.out.println("\n\n----------------------Cliente-------------------------");

      System.out.println("  Nome:              " + super.getNome() + "\n  Sobrenome:         " + super.getSobrenome()
            + "\n  CPF:               " + super.getCpf() + "\n  Idade:             " + super.getIdade()
            + "\n  Email:             " + super.getEmail() +
            "\n  Telefone:          " + super.getTelefone() + "\n  CEP:               " + super.getEndereco().getCep());

      System.out.println("\n  Nickname:     " + this.getNickname() + "\n  favoritos:            " + this.getFavoritos() + "\n  Banco:                 " + super.conta.getBanco()
            + "\n  Agencia:               " + super.conta.getAgencia() + "\n  Digito:                " + super.conta.getDigito()
            + "\n  Numero da conta:       " + this.conta.getNumeroCartao() + "\n  Operacao:              " + super.conta.getOperacao());
      System.out.println("----------------------------------------------------\n\n");

      // imprimir o id do cliente
      System.out.println("  ID do cliente: " + this.getIdCliente());
   }

   public void cadastrar() {
      System.out.println("Cadastro realizado com sucesso! Seja bem vindo" + super.getNome() + "!");
   }

   public void alterar() {
      System.out.println("Alteração realizada com sucesso!");
   }

   // sobrecarga
   public static void alterar(Cliente cliente) {
      Leitura l = new Leitura();
      cliente.setNome(l.entDados("Nome: "));
      cliente.setSobrenome(l.entDados("Sobrenome: "));
      cliente.setIdade(Integer.parseInt(l.entDados("Idade: ")));

      cliente.getEndereco().setCidade(l.entDados("Cidade: "));
      cliente.getEndereco().setEstado(l.entDados("Estado: "));
      cliente.getEndereco().setRua(l.entDados("Rua: "));
      cliente.getEndereco().setCep(l.entDados("Cep: "));
      cliente.getEndereco().setBairro(l.entDados("Bairro: "));
      cliente.getEndereco().setNumero(l.entDados("Numero: "));

      cliente.getConta().setBanco(l.entDados("Banco: "));
      cliente.getConta().setAgencia(l.entDados("Agencia: "));
      cliente.getConta().setDigito(l.entDados("Digito: "));
      cliente.getConta().setNumeroCartao(l.entDados("Numero: "));
      cliente.getConta().setOperacao(l.entDados("Operacao: "));
   }

   public void excluir() {
      System.out.println("Cliente excluido com sucesso! Até mais " + super.getNome() + "!");
   }

   public void consultar() {
      System.out.println("Aqui estão seus dados: " + super.getNome() + "!");
      imprimir();
   }

   // interface / métodos sobrescritos

   // Declaração de métodos getters e setters
   public final String getNickname() { return this.nickname; }
   public final void setNickname(String nickname) { 
      this.nickname = nickname; 
   }

   public final String getFavoritos() { return this.favoritos; }
   public final void setFavoritos(String favoritos) { 
      this.favoritos = favoritos; 
   }

   public final int getIdCliente() { return this.idCliente; }
   public final void setIdCliente(int idCliente) { 
      this.idCliente = idCliente; 
   }

   public final boolean getStatus() { return this.status; }
   public final void setStatus(boolean status) { 
      this.status = status; 
   }
}
