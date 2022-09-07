// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Locacao {
   // Declaração de variáveis / atributos da classe;
   private String idLocacao;
   private float valor;
   private int dias; // número de dias o qual durará a locação segundo o próprio cliente
   private LocalDate dataAtual;
   private LocalDate dataDevolucao;
   private boolean ativo;
   private boolean situacaoPagamento;
   private int mppc;
   private String idStaff;
   private String cpfCliente;
   private String titulo;

   // Declaração do construtor
   public Locacao() {
      this.idLocacao = "";
      this.valor = 50;
      this.dias = 30;
      // pegar a data do sistema e alocar na variável dataAtual
      this.dataAtual = LocalDate.now();
      this.dataDevolucao = LocalDate.now().plusDays(30);
      this.mppc = 0;
      this.idStaff = "";
      this.cpfCliente = "";
      this.titulo = "";
   }
   
   public Locacao(String cpfCliente, int mppc) {
      //idlocacao = cpfCliente concatenado mppc;
      // converter mppc em string e concatenar com cpfCliente
      this.idLocacao =  Integer.toString(mppc) + cpfCliente;
      this.valor = 50;
      this.dias = 30;
      this.dataAtual = LocalDate.now();
      this.dataDevolucao = LocalDate.now().plusDays(dias);
      this.ativo = true;
      this.situacaoPagamento = false;
      this.mppc = mppc;
      this.idStaff = idStaff;
      this.cpfCliente = cpfCliente;
   }   
   
   // Declaração dos métodos do objeto
   protected final float calcJuros() {
      LocalDate dataAtual = LocalDate.now();
      if (dataAtual.isAfter(this.dataDevolucao)) {
         int diasAtraso = (int) ChronoUnit.DAYS.between(dataAtual, this.dataDevolucao);
         float juros = ((this.dias * this.valor) / 100) * diasAtraso;
         this.setValor(juros);
         return juros;
      } else {
         return 0;
      }
   }

   public final void pagarLocacao(float valor) {
      if (valor >= this.valor) {
         this.setSituacaoPagamento(true);
         System.out.println("Pagamento realizado com sucesso!");
      } else {
         this.setSituacaoPagamento(false);
         System.out.println("Pagamento não realizado!");
      }
   }

   private final String verificarPagamento() {
      if (this.situacaoPagamento == true) {
         return "Pago";
      } else {
         return "Não pago";
      }
   }

   public final void ConsultarDebitos() {
      System.out.println("\n\n----------------------DADOS-------------------------");
      System.out.println("\n  Data de devolucao:  "
            + this.getDataDevolucao() + "\n  Valor do aluguel:  " + this.getValor() + " Juros: " + this.calcJuros() + "  Total a pagar: " + (this.getValor() + this.calcJuros()));
      System.out.println("----------------------------------------------------\n\n");

      System.out.println("\n\n----------------------PAGAMENTO-------------------------");
      System.out.println("\n  Situacao do pagamento:  " + this.verificarPagamento());
      System.out.println("----------------------------------------------------\n\n");
   }

   public final void imprimir(Filme filme, Cliente cliente, Staff staff) {
      System.out.println("\n\n----------------------DADOS-------------------------");
      System.out.println("\n  Filme:  " + filme.getTitulo());
      System.out.println("\n Data de Volacao:  " + this.getDataAtual());
      System.out.println("  Cliente:  " + cliente.getNome());
      System.out.println("  Atendente:  " + staff.getNome());
   }

   // Declaração dos métodos getters e setters
   public String getIdLocacao() {
      return this.idLocacao;
   }

   public void setIdLocacao(String idLocacao) {
      this.idLocacao = idLocacao;
   }

   public final float getValor() { return valor; }
   public final void setValor(float valor) { 
      this.valor = valor;;
   }

   public final int getDias() { return dias; }
   public final void setDias(int dias) { 
      this.dias = dias; 
   }

   public final LocalDate getDataAtual() { return dataAtual; }
   protected final void setDataAtual(LocalDate dataAtual) { 
      this.dataAtual = dataAtual; 
   }

   public final LocalDate getDataDevolucao() { return dataDevolucao; }
   protected final void setDataDevolucao(LocalDate dataDevolucao) { 
      this.dataDevolucao = dataDevolucao; 
   }

   private final void setSituacaoPagamento(boolean situacaoPagamento) 
   { 
      this.situacaoPagamento = situacaoPagamento; 
   }

   public final void setMppc(int mppc) { this.mppc = mppc; }
   public final int getMppc() { return mppc; }

   public final void setIdStaff(String idStaff) { this.idStaff = idStaff; }
   public final String getIdStaff() { return idStaff; }

   public final void setCpfCliente(String cpfCliente) { this.cpfCliente = cpfCliente; }
   public final String getCpfCliente() { return cpfCliente; }
   
}
