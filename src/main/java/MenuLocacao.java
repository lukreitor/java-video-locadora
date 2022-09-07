// Aluno: Lucas Martins da Silva Sena - RA: a2348098

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


public class MenuLocacao {
      private Cliente cliente;
      private Filme filme;
      private Locacao locacao;
      private Administrador Administrador;
      private Atendente atendente;
      private Pessoa p1 = new Cliente();

      private List<Cliente> bdCliente = new ArrayList<Cliente>();
      private List<Filme> bdFilme = new ArrayList<Filme>();
      private List<Locacao> bdLocacao = new ArrayList<Locacao>();
      private List<Administrador> bdAdministrador = new ArrayList<Administrador>();
      private List<Atendente> bdAtendente = new ArrayList<Atendente>();

      private GerEntidades geraEntidades = new GerEntidades();

   public List<Cliente> getBdCliente() {
       return bdCliente;
   }
   
   public List<Filme> getBdFilme() {
       return bdFilme;
   }
   
   public List<Locacao> getBdLocacao() {
       return bdLocacao;
   }
   
   public List<Administrador> getBdAdministrador() {
       return bdAdministrador;
   }
   
   public List<Atendente> getBdAtendente() {
       return bdAtendente;
   }
   
   public void criaMenuLocacao() {
      // Declaração de variáveis
      int slctMenu = 0;
      int slctMenuC = 0; 
      int slctMenuL = 0;
      int contC = 1; int contS = 1; int contL = 1;
      String resp = "";

      String cpf = ""; int senha;
      int index = -1;

      String titulo;

      int opcaoStaff = 0;

      // Declaração dos Objetos
      Leitura l = new Leitura();
      

      
      do {
         // Exibe menu de opções
         System.out.println("\n\n----------------------MENU-------------------------");
         System.out.println("\n  1 - Menu Cliente");
         System.out.println("  2 - Menu Filme");
         System.out.println("  3 - Menu Admnistracao");
         System.out.println("  4 - Menu Atendente");
         System.out.println("  5 - Menu Locacao");
         System.out.println("  6 - Sair");
         System.out.println("-----------------------------------------------------\n\n");
         slctMenu = Integer.parseInt(l.entDados("Digite a opcao desejada: "));

         
         switch(slctMenu) {
            case 1: 
               System.out.println("\n\n----------------------Menu Cliente-------------------------");
               System.out.println("\n  1 - Cadastrar Cliente");
               System.out.println("  2 - Consultar Dados");
               System.out.println("  3 - Alterar Dados");
               System.out.println("  4 - Excluir Conta");
               System.out.println("  5 - voltar");
               System.out.println("-----------------------------------------------------\n\n");
               slctMenuC = Integer.parseInt(l.entDados("Digite a opcao desejada: "));

               switch(slctMenuC) {
                  case 1: 
                     Cliente cliente = new Cliente();
                     cpf = l.entDados("Digite o CPF do cliente: ");
                     if (geraEntidades.verificaCpf(cpf) == false) {
                        System.out.println("\n\n----------------------Cadastrar Cliente-------------------------");
                        cliente.setIdCliente(contC);
                        cliente.setNome(l.entDados("Nome: "));
                        cliente.setSobrenome(l.entDados("Sobrenome: "));
                        cliente.setNickname(l.entDados("Nickname: "));
                        cliente.setCpf(l.entDados("CPF: "));
                        cliente.setIdade(Integer.parseInt(l.entDados("Idade: ")));
                     
                        try {
                         cliente.setEmail(l.entDados("Email: "));
                        } 
                        catch(EmailFormatException efe){
                           efe.impEmailFormat();
                           p1 = efe.reparaEmailFormat(p1);
                        }
                        try {
                           cliente.setTelefone(l.entDados("Telefone: "));
                        } 
                        catch(TelefoneFormatException tfe){
                           tfe.impTelefoneFormat();
                           p1 = tfe.reparaTelefoneFormat(p1);
                        }

               
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
                        System.out.print("-----------------------------------------------------\n\n");
                        contC++;

                        geraEntidades.bdCliente.add(cliente);
                     }
                     else {
                        System.out.println("CPF já está cadastrado");
                     }
                  break;

                  case 2: 
                     System.out.println("\n\n----------------------Consultar Dados-------------------------");
                     cpf = l.entDados("Digite o CPF do cliente: ");
                     if (geraEntidades.verificaCpf(cpf) == true) {
                        geraEntidades.imprimeCliente(cpf);
                     }
                     System.out.println("\n\nCliente nao encontrado\n\n");
                  break;

                  case 3:
                     System.out.println("\n\n----------------------Alterar Dados-------------------------");
                     cpf = l.entDados("Digite o CPF do cliente: ");
                     if (geraEntidades.verificaCpf(cpf) == true) {
                        geraEntidades.alterarClienteCpf(geraEntidades.retornaCliente(cpf));
                     }
                     System.out.println("\n\nCliente nao encontrado\n\n");
                  break;

                  case 4:
                     System.out.println("\n\n----------------------Excluir Conta-------------------------");
                     cpf = l.entDados("Digite o CPF do cliente: ");
                     if (geraEntidades.verificaCpf(cpf) == true) {
                        System.out.println("Tem certeza que deseja excluir a conta? (S/N)");
                        resp = l.entDados("");
                        if (resp.equals("S") || resp.equals("s")) {
                           geraEntidades.bdCliente.remove(geraEntidades.retornaCliente(cpf));
                           break;
                        }                 
                     } else {
                        System.out.println("\n\nCliente nao encontrado\n\n");
                     }
                  break;
            }
            break;
            case 2: 
               System.out.println("\n\n----------------------Menu Filme-------------------------");
               System.out.println("\n  1 - Cadastrar Filme");
               System.out.println("  2 - Consultar Filme");
               System.out.println("  3 - Alterar Filme");
               System.out.println("  4 - Excluir Filme");
               System.out.println("  5 - voltar");
               System.out.println("-----------------------------------------------------\n\n");
               slctMenuC = Integer.parseInt(l.entDados("Digite a opcao desejada: "));

               switch(slctMenuC) {
                  case 1: 
                     Filme filme = new Filme();
                     filme.setMppc(Integer.parseInt(l.entDados("Digite o MPPC: ")));
                     filme.setTitulo(l.entDados("Titulo: "));
                     filme.setIdioma(l.entDados("Idioma: "));
                     filme.setDescricao(l.entDados("Descricao: "));
                     filme.setDuracao(Integer.parseInt(l.entDados("Duracao: ")));
                     filme.setCategoria(l.entDados("Categoria: "));

                     geraEntidades.bdFilme.add(filme);
                  break;

                  case 2: 
                     System.out.println("\n\n----------------------Consultar Filme-------------------------");
                     titulo = l.entDados("Digite o titulo do filme: ");
                     if (geraEntidades.verificaFilme(titulo) == true) {
                        geraEntidades.imprimeFilme(titulo);
                     } else {
                        System.out.println("\n\nFilme nao encontrado\n\n");
                     }
                  break;

                  case 3:
                     System.out.println("\n\n----------------------Alterar Filme-------------------------");
                     titulo = l.entDados("Digite o titulo do filme: ");
                     if (geraEntidades.verificaFilme(titulo) == true) {
                        geraEntidades.alterarFilme(geraEntidades.retornaFilme(titulo));
                        System.out.println("\n\nFilme alterado com sucesso\n\n");
                        geraEntidades.imprimeFilme(titulo);
                     } else {
                        System.out.println("\n\nFilme nao encontrado\n\n");
                     }
                  break;

                  case 4:
                     System.out.println("\n\n----------------------Excluir Filme-------------------------");
                     titulo = l.entDados("Digite o titulo do filme: ");
                     if (geraEntidades.verificaFilme(titulo) == true) {
                        System.out.println("Tem certeza que deseja excluir o filme? (S/N)");
                        resp = l.entDados("");
                        if (resp.equals("S") || resp.equals("s")) {
                           bdFilme.remove(geraEntidades.retornaFilme(titulo));
                           break;
                        }                 
                     } else {
                        System.out.println("\n\nFilme nao encontrado\n\n");
                     }
               }
            break;

            case 3: 
               System.out.println("\n\n----------------------Menu Administrador-------------------------");
               System.out.println("\n  1 - Cadastrar Administrador");
               System.out.println("  2 - Consultar Administrador");
               System.out.println("  3 - Alterar Administrador");
               System.out.println("  4 - Excluir Administrador");
               System.out.println("  5 - voltar");
               System.out.println("-----------------------------------------------------\n\n");
               slctMenuC = Integer.parseInt(l.entDados("Digite a opcao desejada: "));

               switch(slctMenuC) {
                  case 1: 
                     Administrador administrador = new Administrador();
                     administrador.setNome(l.entDados("Nome: "));
                     administrador.setSobrenome(l.entDados("Sobrenome: "));
                     administrador.setCpf(l.entDados("CPF: "));
                     administrador.setIdade(Integer.parseInt(l.entDados("Idade: ")));
                     try {
                        administrador.setEmail(l.entDados("Email: "));
                     }
                      catch(EmailFormatException efe){
                        efe.impEmailFormat();
                        p1 = efe.reparaEmailFormat(p1);
                     }
                     try {
                        administrador.setTelefone(l.entDados("Telefone: "));
                     }
                      catch(TelefoneFormatException tfe){
                        tfe.impTelefoneFormat();
                        p1 = tfe.reparaTelefoneFormat(p1);
                     }

                     administrador.getEndereco().setCidade(l.entDados("Cidade: "));
                     administrador.getEndereco().setEstado(l.entDados("Estado: "));
                     administrador.getEndereco().setRua(l.entDados("Rua: "));
                     administrador.getEndereco().setBairro(l.entDados("Bairro: "));
                     administrador.getEndereco().setCep(l.entDados("CEP: "));
                     administrador.getEndereco().setNumero(l.entDados("Numero: "));

                     System.out.print("Dados Bancarios: "); 
                     administrador.getConta().setBanco(l.entDados("Banco: "));
                     administrador.getConta().setAgencia(l.entDados("Agencia: "));
                     administrador.getConta().setDigito(l.entDados("Digito: "));
                     administrador.getConta().setNumeroCartao(l.entDados("Conta: "));
                     administrador.getConta().setOperacao(l.entDados("Operacao: "));

                     administrador.setIdStaff(contS);
                     administrador.setSalario(Float.parseFloat(l.entDados("Salario: ")));
                     administrador.setCargo(l.entDados("Cargo: "));
                     administrador.setNCarteiraTrabalho(l.entDados("Numero da Carteira de Trabalho: "));

                     contS++;
                     geraEntidades.bdAdministrador.add(administrador);
                  break;

                  case 2: 
                     System.out.println("\n\n----------------------Consultar Administrador-------------------------");
                     cpf = l.entDados("Digite o CPF do administrador: ");
                     if (geraEntidades.verificaAdministrador(cpf) == true) {
                        System.out.println("funcionou");
                        geraEntidades.imprimeAdministrador(cpf);
                     } else {
                        System.out.println("\n\nAdministrador nao encontrado\n\n");
                     }
                  break;

                  case 3:
                     System.out.println("Funcao sera implementada na versao final");
                   break;

                  case 4:
                     System.out.println("Funcao sera implementada na versao final");
                   break;
               }
            break;

            case 4:
               System.out.println("\n\n----------------------Menu Atendente-------------------------");
               System.out.println("\n  1 - Cadastrar Atendente");
               System.out.println("  2 - Consultar Atendente");
               System.out.println("  3 - Alterar Atendente");
               System.out.println("  4 - Excluir Atendente");
               System.out.println("  5 - voltar");
               System.out.println("-----------------------------------------------------\n\n");
               slctMenuC = Integer.parseInt(l.entDados("Digite a opcao desejada: "));

               switch(slctMenuC) {
                  case 1: 
                     Atendente atendente = new Atendente();
                     atendente.setIdStaff(contS);
                     atendente.setNome(l.entDados("Nome: "));
                     atendente.setSobrenome(l.entDados("Sobrenome: "));
                     atendente.setCpf(l.entDados("CPF: "));
                     atendente.setIdade(Integer.parseInt(l.entDados("Idade: ")));
                     try {
                        atendente.setEmail(l.entDados("Email: "));
                     } 
                     catch(EmailFormatException efe){
                        efe.impEmailFormat();
                        p1 = efe.reparaEmailFormat(p1);
                     }
                     
                     try {
                        atendente.setTelefone(l.entDados("Telefone: "));
                     }
                      catch(TelefoneFormatException tfe){
                        tfe.impTelefoneFormat();
                        p1 = tfe.reparaTelefoneFormat(p1);
                     }
                     atendente.setCargo(l.entDados("Cargo: "));
                     atendente.setSalario(Float.parseFloat(l.entDados("Salario: ")));
                     atendente.setNCarteiraTrabalho(l.entDados("Numero da Carteira de Trabalho: "));

                     atendente.getEndereco().setCidade(l.entDados("Cidade: "));
                     atendente.getEndereco().setEstado(l.entDados("Estado: "));
                     atendente.getEndereco().setRua(l.entDados("Rua: "));
                     atendente.getEndereco().setBairro(l.entDados("Bairro: "));
                     atendente.getEndereco().setCep(l.entDados("CEP: "));
                     atendente.getEndereco().setNumero(l.entDados("Numero: "));

                     atendente.getConta().setBanco(l.entDados("Banco: "));
                     atendente.getConta().setAgencia(l.entDados("Agencia: "));
                     atendente.getConta().setDigito(l.entDados("Digito: "));
                     atendente.getConta().setNumeroCartao(l.entDados("Conta: "));
                     atendente.getConta().setOperacao(l.entDados("Operacao: "));

                     atendente.setIdStaff(contS);

                     contS++;
                     geraEntidades.bdAtendente.add(atendente);
                     break;
                  case 2:
                     System.out.println("\n\n----------------------Consultar Atendente-------------------------");
                     cpf = l.entDados("Digite o CPF do atendente: ");
                     if (geraEntidades.verificaAtendente(cpf) == true) {
                        System.out.println("funcionou");
                        geraEntidades.imprimeAtendente(cpf);
                     } else {
                        System.out.println("\n\nAtendente nao encontrado\n\n");
                     }
                     break;
                  case 3:
                     System.out.println("Funcao sera implementada na versao final");
                     break;
                  case 4:
                     System.out.println("Funcao sera implementada na versao final");
                     break;
               }

            break;

            case 5:
               System.out.println("\n\n----------------------Menu Locacao-------------------------");
               System.out.println("\n  1 - Ver Lista de Filmes");
               System.out.println("  2 - Locar Filme");
               System.out.println("  3 - Consultar Débitos");
               System.out.println("  4 - Pagar Locacao");
               System.out.println("  5 - voltar");
               System.out.println("-----------------------------------------------------\n\n");
               slctMenuL = Integer.parseInt(l.entDados("Digite a opcao desejada: "));

               switch(slctMenuL) {
                  case 1: 
                     geraEntidades.imprimirFilmesDisponiveis();
                     break;
                  case 2:
                     Locacao locacao = new Locacao();

                     System.out.println("\n\n----------------------Locar Filme-------------------------");
                     cpf = l.entDados("Digite o CPF do cliente: ");
                     titulo = l.entDados("Digite o nome do filme: ");
                     if ((geraEntidades.verificaCpf(cpf) == true) && (geraEntidades.verificaFilme(titulo) == true)) {
                        locacao.setCpfCliente(cpf);
                        locacao.setMppc(geraEntidades.retornaIdFilme(titulo));
                        locacao.setIdStaff(geraEntidades.retornaAtendente());
                        locacao.setIdLocacao(Integer.toString(contL));
                        contL++;
                        geraEntidades.bdLocacao.add(locacao);
                     } 
                     contL++;
                     break;
               }
         } 
       }while (slctMenu != 6);
   }  
}