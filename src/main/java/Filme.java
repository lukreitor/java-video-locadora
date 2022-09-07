// Aluno: Lucas Martins da Silva Sena - RA: a2348098

public class Filme implements Imprimi{
   // Declaração de variáveis / atributos da classe
   private int mppc;
   private String titulo;
   private String idioma; // Idioma era uma classe a parte no projeto inicial que foi acoplada a classe Filme
   private String descricao;
   private int duracao;
   private String categoria; // categoria era uma classse no projeto inicial que foi acoplada a classe Filme

   // Declaração do constructor
   public Filme() {
      this.mppc = 0;
      this.titulo = "";
      this.idioma = "";
      this.descricao = "";
      this.duracao = 0;
      this.categoria = "";
   }

   public Filme(int mppc, String titulo, String idioma, String descricao, int duracao, String categoria) {
      this.mppc = mppc;
      this.titulo = titulo;
      this.idioma = idioma;
      this.descricao = descricao;
      this.duracao = duracao;
      this.categoria = categoria;
   }

   // Declaração dos métodos do objeto
   public final void imprimir() {
      System.out.println("\n\n----------------------FILME-------------------------");

      System.out.println("  MPPC:              " + this.mppc + "\n  Titulo:            " + this.titulo
            + "\n  Idioma:            " + this.idioma + "\n  Descricao:         " + this.descricao
            + "\n  Duracao:           "
            + this.duracao + "\n  Categoria:         " + this.categoria);
      System.out.println("----------------------------------------------------\n\n");
   }

   public final static void alterarFilme(Filme filme) {
      Leitura l = new Leitura();
      filme.setTitulo(l.entDados("Digite o novo titulo: "));
      filme.setIdioma(l.entDados("Digite o novo idioma: "));
      filme.setDescricao(l.entDados("Digite a nova descricao: "));
      filme.setDuracao(Integer.parseInt(l.entDados("Digite a nova duracao: ")));
      filme.setCategoria(l.entDados("Digite a nova categoria: "));
   }

   // Declaração dos métodos de acesso
   public final int getMppc() { return mppc;}
   public final void setMppc(int mppc) {
      this.mppc = mppc;
   }

   public final String getTitulo() { return titulo;}
   public final void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public final String getIdioma() { return idioma;}
   public final void setIdioma(String idioma) {
      this.idioma = idioma;
   }

   public final String getDescricao() { return descricao;}
   public final void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public final int getDuracao() { return duracao;}
   public final void setDuracao(int duracao) {
      this.duracao = duracao;
   }

   public final String getCategoria() { return categoria;}
   public final void setCategoria(String categoria) {
      this.categoria = categoria;
   }
}
