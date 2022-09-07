// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class GerEntidades {
    // Declaração de Atributos da classe

    private Cliente cliente;
    private Filme filme;
    private Locacao locacao;
    private Administrador Administrador;
    private Atendente atendente;
    private Pessoa p1 = new Cliente();

    protected List<Cliente> bdCliente = new ArrayList<Cliente>();
    protected List<Filme> bdFilme = new ArrayList<Filme>();
    protected List<Locacao> bdLocacao = new ArrayList<Locacao>();
    protected List<Administrador> bdAdministrador = new ArrayList<Administrador>();
    protected List<Atendente> bdAtendente = new ArrayList<Atendente>();

    Leitura l = new Leitura();

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

    // Declaração de Métodos da classe
    //              CLIENTE
    public boolean verificaCpf(String cpf) {
        for (Cliente cliente : bdCliente) {
            if (cliente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void imprimeCliente(String cpf) {
        for (Cliente cliente : bdCliente) {
            if (cliente.getCpf().equals(cpf)) {
                cliente.imprimir();
            }
        }
    }

    public Cliente retornaCliente(String cpf) {
        for (Cliente cliente : bdCliente) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public String retornaCpfCliente(String cpf) {
        for (Cliente cliente : bdCliente) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente.getCpf();
            }
        }
        return null;
    }

    public int getIdCliente(String cpf) {
        for (Cliente cliente : bdCliente) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente.getIdCliente();
            }
        }
        return 0;
    }

    public void atualizarCliente(Cliente cliente) {
        cliente.setNome(l.entDados("Nome: "));
        cliente.setSobrenome(l.entDados("Sobrenome: "));
        cliente.setIdade(Integer.parseInt(l.entDados("Idade: ")));
        try {
            cliente.setEmail(l.entDados("Email: "));
        } catch (EmailFormatException efe) {
            efe.impEmailFormat();
            p1 = efe.reparaEmailFormat(p1);
        } catch (NumberFormatException nfe) {
            System.out.println("\nEMAIL deve ser um String");
        }

        try {
            cliente.setTelefone(l.entDados("Telefone: "));
        } catch (TelefoneFormatException tfe) {
            tfe.impTelefoneFormat();
            p1 = tfe.reparaTelefoneFormat(p1);
        } catch (NumberFormatException nfe) {
            System.out.println("\nTELEFONE deve ser um String");
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
    }

    // métodos no padrão das aulas 
    public Cliente consultaClienteCpf(Cliente cliente) {
        for (int i = 0; i < bdCliente.size(); i++) {
            if (bdCliente.get(i).getCpf().equals(cliente.getCpf())) {
                return bdCliente.get(i);
            }
        }
        return null;
    }

    public Cliente cadastraCliente(Cliente cliente) {
        if (consultaClienteCpf(cliente) == null) {
            bdCliente.add(cliente);
            return cliente;
        } else {
            System.out.println("\nJá existe um cliente cadastrado com esse CPF!");
            return null;
        }
    }

    public Cliente removeClienteCpf(Cliente cliente) {
        cliente = consultaClienteCpf(cliente);
        if (cliente != null) {
            bdCliente.remove(cliente);
            return cliente;
        } else {
            System.out.println("\nNão existe um cliente cadastrado com esse CPF!");
            return null;
        }
    }

    public Cliente alterarClienteCpf(Cliente cliente) {
        for (int i = 0; i < bdCliente.size(); i++) {
            if (bdCliente.get(i).getCpf().equals(cliente.getCpf())) {
                String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome do cliente:", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                cliente.setNome(nome);
                cliente.setSobrenome(sobrenome);
                try {
                    String email = JOptionPane.showInputDialog(null, "Digite o Email do cliente:", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                    cliente.setEmail(email);
                } catch (EmailFormatException efe) {
                    efe.impEmailFormat();
                    p1 = efe.reparaEmailFormat(p1);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Email deve ser String", "Alterar Cliente", JOptionPane.ERROR_MESSAGE);
                }

                try {
                    String telefone = JOptionPane.showInputDialog(null, "Digite o novo telefone: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                    cliente.setTelefone(telefone);
                } catch (TelefoneFormatException tfe) {
                    tfe.impTelefoneFormat();
                    p1 = tfe.reparaTelefoneFormat(p1);
                } catch (NumberFormatException nfe) {
                    System.out.println("\nTELEFONE deve ser um String");
                }
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova idade: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE));
                String nickname = JOptionPane.showInputDialog(null, "Digite o novo nickname: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String filmesFavoritos = JOptionPane.showInputDialog(null, "Digite os filmes favoritos: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);

                String cidade = JOptionPane.showInputDialog(null, "Digite a nova cidade: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String estado = JOptionPane.showInputDialog(null, "Digite o novo estado: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String rua = JOptionPane.showInputDialog(null, "Digite a nova rua: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String cep = JOptionPane.showInputDialog(null, "Digite o novo cep: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String bairro = JOptionPane.showInputDialog(null, "Digite o novo bairro: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String numero = JOptionPane.showInputDialog(null, "Digite o novo numero: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);

                String banco = JOptionPane.showInputDialog(null, "Digite o nome do novo banco: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String agencia = JOptionPane.showInputDialog(null, "Digite a nova agencia: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String digito = JOptionPane.showInputDialog(null, "Digite o novo digito: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String Operacacao = JOptionPane.showInputDialog(null, "Digite a nova operacao: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String numeroCartao = JOptionPane.showInputDialog(null, "Digite o novo numero do cartão: ", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);

                cliente.setIdade(idade);
                cliente.setNickname(nickname);
                cliente.setFavoritos(filmesFavoritos);

                cliente.getEndereco().setCidade(cidade);
                cliente.getEndereco().setEstado(estado);
                cliente.getEndereco().setRua(rua);
                cliente.getEndereco().setCep(cep);
                cliente.getEndereco().setBairro(bairro);
                cliente.getEndereco().setNumero(numero);

                cliente.getConta().setBanco(banco);
                cliente.getConta().setAgencia(agencia);
                cliente.getConta().setDigito(digito);
                cliente.getConta().setOperacao(Operacacao);
                cliente.getConta().setNumeroCartao(numeroCartao);

                bdCliente.set(i, cliente);
                return bdCliente.get(i);
            }
        }
        return null;
    }

    //             FILME
    public boolean verificaFilme(String titulo) {
        for (Filme filme : bdFilme) {
            if (filme.getTitulo().equals(titulo)) {
                return true;
            }
        }
        return false;
    }

    public void imprimeFilme(String titulo) {
        for (Filme filme : bdFilme) {
            if (filme.getTitulo().equals(titulo)) {
                filme.imprimir();
            }
        }
    }

    public Filme retornaFilme(String titulo) {
        for (Filme filme : bdFilme) {
            if (filme.getTitulo().equals(titulo)) {
                return filme;
            }
        }
        return null;
    }

    // exibir nome dos filmes disponiveis
    public void imprimirFilmesDisponiveis() {
        for (Filme filme : bdFilme) {
            System.out.println("\t\t\t\t\t" + filme.getTitulo() + "\t\t\t\t\t");
        }
    }

    public int retornaIdFilme(String titulo) {
        for (Filme filme : bdFilme) {
            if (filme.getTitulo().equals(titulo)) {
                return filme.getMppc();
            }
        }
        return 0;
    }

    public int getMppcFilme(String titulo) {
        for (Filme filme : bdFilme) {
            if (filme.getTitulo().equals(titulo)) {
                return filme.getMppc();
            }
        }
        return 0;
    }

    // métodos no padrão das aulas 
    public Filme consultaFilmeTitulo(Filme filme) {
        for (int i = 0; i < bdFilme.size(); i++) {
            if (bdFilme.get(i).getTitulo().equals(filme.getTitulo())) {
                return bdFilme.get(i);
            }
        }
        return null;
    }

    public Filme cadastraFilme(Filme filme) {
        if (consultaFilmeTitulo(filme) == null) {
            bdFilme.add(filme);
            return filme;
        } else {
            System.out.println("\nFilme já cadastrado");
            return null;
        }
    }

    public Filme removeFilmeTitulo(Filme filme) {
        filme = consultaFilmeTitulo(filme);
        if (filme != null) {
            bdFilme.remove(filme);
            return filme;
        } else {
            System.out.println("\nFilme não cadastrado");
            return null;
        }
    }

    public Filme alterarFilme(Filme filme) {
        for (int i = 0; i < bdFilme.size(); i++) {
            if (bdFilme.get(i).getTitulo().equals(filme.getTitulo())) {
                String titulo = JOptionPane.showInputDialog(null, "Digite o novo título: ", "Alterar Filme", JOptionPane.QUESTION_MESSAGE);
                int mppc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo MPPC: ", "Alterar Filme", JOptionPane.QUESTION_MESSAGE));
                String categoria = JOptionPane.showInputDialog(null, "Digite a nova categoria: ", "Alterar Filme", JOptionPane.QUESTION_MESSAGE);
                String descricao = JOptionPane.showInputDialog(null, "Digite a nova descrição: ", "Alterar Filme", JOptionPane.QUESTION_MESSAGE);
                int duracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova duração: ", "Alterar Filme", JOptionPane.QUESTION_MESSAGE));
                String idioma = JOptionPane.showInputDialog(null, "Digite o novo idioma: ", "Alterar Filme", JOptionPane.QUESTION_MESSAGE);

                filme.setTitulo(titulo);
                filme.setMppc(mppc);
                filme.setCategoria(categoria);
                filme.setDescricao(descricao);
                filme.setDuracao(duracao);
                filme.setIdioma(idioma);

                bdFilme.set(i, filme);
                return bdFilme.get(i);
            }
        }
        return null;
    }

//              administrador
    public boolean verificaAdministrador(String cpf) {
        for (Administrador administrador : bdAdministrador) {
            if (administrador.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void imprimeAdministrador(String cpf) {
        for (Administrador administrador : bdAdministrador) {
            if (administrador.getCpf().equals(cpf)) {
                administrador.imprimir();
            }
        }
    }

    public Administrador retornaAdministrador(String cpf) {
        for (Administrador administrador : bdAdministrador) {
            if (administrador.getCpf().equals(cpf)) {
                return administrador;
            }
        }
        return null;
    }

    public int getIdAdministrador(String cpf) {
        for (Administrador administrador : bdAdministrador) {
            if (administrador.getCpf().equals(cpf)) {
                return administrador.getIdStaff();
            }
        }
        return 0;
    }

    // métodos no formato das aulas
    public Administrador consultaAdministrador(Administrador administrador) {
        for (int i = 0; i < bdAdministrador.size(); i++) {
            if (bdAdministrador.get(i).getCpf().equals(administrador.getCpf())) {
                return bdAdministrador.get(i);
            }
        }
        return null;
    }

    public Administrador CadastraAdministrador(Administrador administrador) {
        if (consultaAdministrador(administrador) == null) {
            bdAdministrador.add(administrador);
            return administrador;
        } else {
            JOptionPane.showMessageDialog(null, "Administrador já cadastrado!", "Cadastro de Administrador", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Administrador removeAdministrador(Administrador administrador) {
        administrador = consultaAdministrador(administrador);
        if (administrador != null) {
            bdAdministrador.remove(administrador);
            return administrador;
        } else {
            JOptionPane.showMessageDialog(null, "Administrador não cadastrado!", "Remoção de Administrador", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Administrador alterarAdministrador(Administrador administrador) {
        for (int i = 0; i < bdAdministrador.size(); i++) {
            if (bdAdministrador.get(i).getCpf().equals(administrador.getCpf())) {
                String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);
                String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome do cliente:", "Alterar Cliente", JOptionPane.QUESTION_MESSAGE);

                try {
                    String email = JOptionPane.showInputDialog(null, "Digite o Email do Administrador:", "Alterar Administrador", JOptionPane.QUESTION_MESSAGE);
                    administrador.setEmail(email);
                } catch (EmailFormatException efe) {
                    efe.impEmailFormat();
                    p1 = efe.reparaEmailFormat(p1);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Email deve ser String", "Alterar Administrador", JOptionPane.ERROR_MESSAGE);
                }

                try {
                    String telefone = JOptionPane.showInputDialog(null, "Digite o novo telefone: ", "Alterar Administrador", JOptionPane.QUESTION_MESSAGE);
                    administrador.setTelefone(telefone);
                } catch (TelefoneFormatException tfe) {
                    tfe.impTelefoneFormat();
                    p1 = tfe.reparaTelefoneFormat(p1);
                } catch (NumberFormatException nfe) {
                    System.out.println("\nTELEFONE deve ser um String");
                }
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova idade: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE));
                String cargo = JOptionPane.showInputDialog(null, "Digite o novo cargo: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String nCarteiraTrabalho = JOptionPane.showInputDialog(null, "Digite o novo número de carteira de trabalho: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);

                String cidade = JOptionPane.showInputDialog(null, "Digite a nova cidade: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String estado = JOptionPane.showInputDialog(null, "Digite o novo estado: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String rua = JOptionPane.showInputDialog(null, "Digite a nova rua: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String cep = JOptionPane.showInputDialog(null, "Digite o novo cep: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String bairro = JOptionPane.showInputDialog(null, "Digite o novo bairro: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String numero = JOptionPane.showInputDialog(null, "Digite o novo numero: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);

                String banco = JOptionPane.showInputDialog(null, "Digite o nome do novo banco: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String agencia = JOptionPane.showInputDialog(null, "Digite a nova agencia: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String digito = JOptionPane.showInputDialog(null, "Digite o novo digito: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String Operacacao = JOptionPane.showInputDialog(null, "Digite a nova operacao: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);
                String numeroCartao = JOptionPane.showInputDialog(null, "Digite o novo numero do cartão: ", "Alterar administrador", JOptionPane.QUESTION_MESSAGE);

                administrador.setNome(nome);
                administrador.setSobrenome(sobrenome);
                administrador.setIdade(idade);
                administrador.setCargo(cargo);
                administrador.setNCarteiraTrabalho(nCarteiraTrabalho);

                administrador.getEndereco().setCidade(cidade);
                administrador.getEndereco().setEstado(estado);
                administrador.getEndereco().setRua(rua);
                administrador.getEndereco().setCep(cep);
                administrador.getEndereco().setBairro(bairro);
                administrador.getEndereco().setNumero(numero);

                administrador.getConta().setBanco(banco);
                administrador.getConta().setAgencia(agencia);
                administrador.getConta().setDigito(digito);
                administrador.getConta().setOperacao(Operacacao);
                administrador.getConta().setNumeroCartao(numeroCartao);

                bdAdministrador.set(i, administrador);
                return bdAdministrador.get(i);
            }
        }
        return null;
    }

//             atendente
    public boolean verificaAtendente(String cpf) {
        for (Atendente atendente : bdAtendente) {
            if (atendente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void imprimeAtendente(String cpf) {
        for (Atendente atendente : bdAtendente) {
            if (atendente.getCpf().equals(cpf)) {
                atendente.imprimir();
            }
        }
    }

    public Atendente retornaAtendente(String cpf) {
        for (Atendente atendente : bdAtendente) {
            if (atendente.getCpf().equals(cpf)) {
                return atendente;
            }
        }
        return null;
    }

    public int getIdAtendente(String cpf) {
        for (Atendente atendente : bdAtendente) {
            if (atendente.getCpf().equals(cpf)) {
                return atendente.getIdStaff();
            }
        }
        return 0;
    }

    // retorna o idStaff do atendente aleatoriamente
    public String retornaAtendente() {
        Random gerador = new Random();
        int id = gerador.nextInt(bdAtendente.size());
        return bdAtendente.get(id).getCpf();
    }

    public String getAtendenteCpfAleatorio() {
        Random gerador = new Random();
        int id = gerador.nextInt(bdAtendente.size());
        return bdAtendente.get(id).getCpf();
    }

    // métodos no padrão das aulas 
    public Atendente consultaAtendente(Atendente atendente) {
        for (int i = 0; i < bdAtendente.size(); i++) {
            if (bdAtendente.get(i).getCpf().equals(atendente.getCpf())) {
                return bdAtendente.get(i);
            }
        }
        return null;
    }

    public Atendente cadastraAtendente(Atendente atendente) {
        if (consultaAtendente(atendente) == null) {
            bdAtendente.add(atendente);
            return atendente;
        } else {
            JOptionPane.showMessageDialog(null, "Atendente já cadastrado", "Cadastro de Atendente", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Atendente removeAtendente(Atendente atendente) {
        atendente = consultaAtendente(atendente);
        if (atendente != null) {
            bdAtendente.remove(atendente);
            return atendente;
        } else {
            JOptionPane.showMessageDialog(null, "Atendente não cadastrado", "Remover Atendente", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Atendente alterarAtendente(Atendente atendente) {
        for (int i = 0; i < bdAtendente.size(); i++) {
            if (bdAtendente.get(i).getCpf().equals(atendente.getCpf())) {
            
                String nome = JOptionPane.showInputDialog(null, "Digite o nome do atendente:", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome do atendente:", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);

                try {
                    String email = JOptionPane.showInputDialog(null, "Digite o Email do atendente:", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                    atendente.setEmail(email);
                } catch (EmailFormatException efe) {
                    efe.impEmailFormat();
                    p1 = efe.reparaEmailFormat(p1);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Email deve ser String", "Alterar atendente", JOptionPane.ERROR_MESSAGE);
                }

                try {
                    String telefone = JOptionPane.showInputDialog(null, "Digite o novo telefone: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                    atendente.setTelefone(telefone);
                } catch (TelefoneFormatException tfe) {
                    tfe.impTelefoneFormat();
                    p1 = tfe.reparaTelefoneFormat(p1);
                } catch (NumberFormatException nfe) {
                    System.out.println("\nTELEFONE deve ser um String");
                }
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova idade: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE));
                String cargo = JOptionPane.showInputDialog(null, "Digite o novo cargo: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String nCarteiraTrabalho = JOptionPane.showInputDialog(null, "Digite o novo número de carteira de trabalho: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);

                String cidade = JOptionPane.showInputDialog(null, "Digite a nova cidade: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String estado = JOptionPane.showInputDialog(null, "Digite o novo estado: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String rua = JOptionPane.showInputDialog(null, "Digite a nova rua: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String cep = JOptionPane.showInputDialog(null, "Digite o novo cep: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String bairro = JOptionPane.showInputDialog(null, "Digite o novo bairro: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String numero = JOptionPane.showInputDialog(null, "Digite o novo numero: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);

                String banco = JOptionPane.showInputDialog(null, "Digite o nome do novo banco: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String agencia = JOptionPane.showInputDialog(null, "Digite a nova agencia: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String digito = JOptionPane.showInputDialog(null, "Digite o novo digito: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String Operacacao = JOptionPane.showInputDialog(null, "Digite a nova operacao: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);
                String numeroCartao = JOptionPane.showInputDialog(null, "Digite o novo numero do cartão: ", "Alterar atendente", JOptionPane.QUESTION_MESSAGE);

                atendente.setNome(nome);
                atendente.setSobrenome(sobrenome);
                atendente.setIdade(idade);
                atendente.setCargo(cargo);
                atendente.setNCarteiraTrabalho(nCarteiraTrabalho);

                atendente.getEndereco().setCidade(cidade);
                atendente.getEndereco().setEstado(estado);
                atendente.getEndereco().setRua(rua);
                atendente.getEndereco().setCep(cep);
                atendente.getEndereco().setBairro(bairro);
                atendente.getEndereco().setNumero(numero);

                atendente.getConta().setBanco(banco);
                atendente.getConta().setAgencia(agencia);
                atendente.getConta().setDigito(digito);
                atendente.getConta().setOperacao(Operacacao);
                atendente.getConta().setNumeroCartao(numeroCartao);

                bdAtendente.set(i, atendente);
                return bdAtendente.get(i);
            }
        }
        return null;
    }

//            locacao
    public boolean verificaLocacao(String id) {
        for (Locacao locacao : bdLocacao) {
            if (locacao.getIdLocacao().equals(id)) {
                return true;
            }
        }
        return false;
    }

    /*public void imprimeLocacao(int id) {
      for (Locacao locacao : bdLocacao) {
         if (locacao.getIdLocacao() == id) {
            locacao.imprimir();
         }
      }
   }*/
    public Locacao retornaLocacao(String id) {
        for (Locacao locacao : bdLocacao) {
            if (locacao.getIdLocacao().equals(id)) {
                return locacao;
            }
        }
        return null;
    }

    public String getIdLocacao(String id) {
        for (Locacao locacao : bdLocacao) {
            if (locacao.getIdLocacao().equals(id)) {
                return locacao.getIdLocacao();
            }
        }
        return "Não declarado";
    }

    public Locacao consultaLocacao(Locacao locacao) {
        for (int i = 0; i < bdLocacao.size(); i++) {
            if (bdLocacao.get(i).getIdLocacao().equals(locacao.getIdLocacao())) {
                JOptionPane.showMessageDialog(null, "Locacao cadastrada com sucesso!", "Cadastrar Locacao", JOptionPane.ERROR_MESSAGE);
                return bdLocacao.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Locacao não encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    public Locacao cadastraLocacao(Locacao locacao) {
        if (consultaLocacao(locacao) == null) {
            bdLocacao.add(locacao);
            return locacao;
        } else {
            JOptionPane.showMessageDialog(null, "Locacao ja cadastrada", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Locacao removeLocacao(Locacao locacao) {
        if (consultaLocacao(locacao) != null) {
            bdLocacao.remove(locacao);
            return locacao;
        } else {
            JOptionPane.showMessageDialog(null, "Locacao não encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Locacao alteraLocacao(Locacao locacao) {
        for (int i = 0; i < bdLocacao.size(); i++) {
            if (bdLocacao.get(i).getIdLocacao().equals(locacao.getIdLocacao())) {
                if (consultaLocacao(locacao) != null) {

                    String cpfCliente = JOptionPane.showInputDialog(null, "Digite o novo cpf: ", "Alterar Locacao", JOptionPane.QUESTION_MESSAGE);
                    String MPPC = JOptionPane.showInputDialog(null, "Digite o novo MPPC: ", "Alterar Locacao", JOptionPane.QUESTION_MESSAGE);
                    String idLocacao = cpfCliente + MPPC;
                    // buscar o id de um atendene e adicionar na variavel idStaff
                    String idStaff = getAtendenteCpfAleatorio();

                    locacao.setIdLocacao(idLocacao);
                    locacao.setIdStaff(idStaff);
                    locacao.setValor(30);
                    locacao.setCpfCliente(cpfCliente);
                    locacao.setMppc(Integer.parseInt(MPPC));

                    bdLocacao.set(i, locacao);
                    return bdLocacao.get(i);
                }
            } 
        }
        return null;
    }
}
