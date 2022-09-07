// Aluno: Lucas Martins da Silva Sena - RA: a2348098

public class Endereco {
   // Declaração de atributos do objeto
   private String cidade;
   private String estado;
   private String rua;
   private String bairro;
   private String cep;
   private String numero;   

   // Declaração do construtor
   public Endereco() {
      this.cidade = "";
      this.estado = "";
      this.rua = "";
      this.bairro = "";
      this.numero = "0";
      this.cep = "";
   }

   // sobrecarga do construtor
   public Endereco(String cidade, String estado, String rua, String bairro, String numero, String cep) {
      this.cidade = cidade;
      this.estado = estado;
      this.rua = rua;
      this.bairro = bairro;
      this.numero = numero;
      this.cep = cep;
   }

   // Declaração de métodos getters e setters
   public String getCidade() { return cidade; }
   public final void setCidade(String cidade) { 
      this.cidade = cidade; 
   }

   public String getEstado() { return estado; }
   public final void setEstado(String estado) { 
      this.estado = estado; 
   }

   public String getRua() { return rua; }
   public final void setRua(String rua) { 
      this.rua = rua; 
   }

   public String getBairro() { return bairro; }
   public final void setBairro(String bairro) { 
      this.bairro = bairro; 
   }

   public String getCep() { return cep; }
   public final void setCep(String cep) { 
      this.cep = cep; 
   }

   public String getNumero() { return numero; }
   public final void setNumero(String numero) {
      this.numero = numero;
   }
}
