// Aluno: Lucas Martins da Silva Sena - RA: a2348098

public class Conta {
   // Atributos do objeto 
   private double saldo;
   private String banco;
   private String agencia;
   private String digito;
   private String numeroCartao;
   private String operacao;
   
   // Atributos da classe 
   private static int totalContas;

   // Declaração do construtor
   public Conta() {
      Conta.totalContas++;
      this.saldo = 0;
      this.banco = "";
      this.agencia = "";
      this.digito = "";
      this.numeroCartao = "";
      this.operacao = "";
   }

   // sobrecarga do construtor
   public Conta(String banco, String agencia, String digito, String numeroCartao, String operacao) {
      Conta.totalContas++;
      this.banco = banco;
      this.agencia = agencia;
      this.digito = digito;
      this.numeroCartao = numeroCartao;
      this.operacao = operacao;
   }

   // Métodos do objeto 
   public boolean saca(double valor) {
      if (this.saldo >= valor) {
         this.saldo -= valor;
         return true;
      }
      System.out.println("Saldo insuficiente");
      this.consultarSaldo();
      return false;
   }

   public void deposita(double valor) {
      this.saldo += valor;
      System.out.println("Depósito realizado com sucesso");
      this.consultarSaldo();
   }

   public boolean transfere(double valor, Conta destino) {
      if (this.saca(valor)) {
         destino.deposita(valor);
         System.out.println("Transferência realizada com sucesso");
         this.consultarSaldo();
         return true;
      } 
      System.out.println("Saldo insuficiente");
      this.consultarSaldo();
      return false;
   }

   public void consultarSaldo() {
      System.out.println("Saldo Atual: " + this.saldo);
   }

   // Métodos da classe / estáticos
   public static int getTotalContas() {
      return Conta.totalContas;
   }

   // métodos sobreescritos

   // Métodos sobrecarregados 

   // interfaces

   // Getters and Setters
   public String getBanco() {
      return this.banco;
   }

   public void setBanco(String banco) {
      this.banco = banco;
   }

   public String getAgencia() {
      return this.agencia;
   }

   public void setAgencia(String agencia) {
      this.agencia = agencia;
   }

   public String getDigito() {
      return this.digito;
   }

   public void setDigito(String digito) {
      this.digito = digito;
   }

   public String getNumeroCartao() {
      return this.numeroCartao;
   }

   public void setNumeroCartao(String numeroCartao) {
      this.numeroCartao = numeroCartao;
   }

   public String getOperacao() {
      return this.operacao;
   }

   public void setOperacao(String operacao) {
      this.operacao = operacao;
   }   
}