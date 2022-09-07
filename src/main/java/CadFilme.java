// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lucas_Sena
 */
public class CadFilme extends javax.swing.JFrame {
    
    private Filme filme;
    private GerEntidades gerEntidades = new GerEntidades();
    
    private static CadFilme unicoCadFilme;
  
    private CadFilme() {
        initComponents();
    }
    
    public static CadFilme getCadFilme() {
        if (unicoCadFilme == null) {
            unicoCadFilme = new CadFilme();
        }
        return unicoCadFilme;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdioma = new javax.swing.JLabel();
        lblMPPC = new javax.swing.JLabel();
        ctMPPC = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        ctTitulo = new javax.swing.JTextField();
        lblIdioma1 = new javax.swing.JLabel();
        ctIdioma = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        ctDescricao = new javax.swing.JTextField();
        lblDuracao = new javax.swing.JLabel();
        ctDuracao = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        ctCategoria = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmes = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lblTituloForm = new javax.swing.JLabel();
        btListarFilmes = new javax.swing.JButton();

        lblIdioma.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblIdioma.setText("DURACAO");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Filmes");

        lblMPPC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMPPC.setText("MPPC:");

        ctMPPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctMPPCActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTitulo.setText("TÍTULO: ");

        ctTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTituloActionPerformed(evt);
            }
        });

        lblIdioma1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblIdioma1.setText("IDIOMA:");

        ctIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdiomaActionPerformed(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDescricao.setText("DESCRIÇÃO:");

        ctDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctDescricaoActionPerformed(evt);
            }
        });

        lblDuracao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDuracao.setText("DURACAO:");

        ctDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctDuracaoActionPerformed(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCategoria.setText("CATEGORIA:");

        ctCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCategoriaActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar FIlme");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        tblFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "MPPC"
            }
        ));
        jScrollPane1.setViewportView(tblFilmes);

        btAlterar.setText("Alterar Filme");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir Filme");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lblTituloForm.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTituloForm.setText("FILME");

        btListarFilmes.setText("Consultar Filmes");
        btListarFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarFilmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDuracao)
                                    .addComponent(lblCategoria))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ctCategoria)
                                    .addComponent(ctDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo)
                                    .addComponent(lblDescricao)
                                    .addComponent(lblIdioma1)
                                    .addComponent(lblMPPC))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ctDescricao)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ctIdioma, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ctMPPC, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ctTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btConsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btAlterar))
                                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btListarFilmes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btExcluir))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTituloForm)
                        .addGap(236, 236, 236))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloForm)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMPPC)
                    .addComponent(ctMPPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(ctTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdioma1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblDuracao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ctDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(ctCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btListarFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTituloActionPerformed

    private void ctIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdiomaActionPerformed

    private void ctDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctDescricaoActionPerformed

    private void ctDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctDuracaoActionPerformed

    private void ctCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCategoriaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarFilme();
        listarTabela(); // mostra o objeto cadastrado na tabela do formulário
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarFilme();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterarFilme();
        listarTabela();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void ctMPPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctMPPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctMPPCActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirFilme();
        listarTabela();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btListarFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarFilmesActionPerformed
        abreListaFilmes();
    }//GEN-LAST:event_btListarFilmesActionPerformed
    
    public void abreListaFilmes() {
        ListaFilmes.getListaFilmes(gerEntidades).setVisible(true);
    }
    
    public void excluirFilme() {
        filme = new Filme();
        filme.setTitulo(ctTitulo.getText());
        filme = gerEntidades.consultaFilmeTitulo(filme);
        
        if (filme != null) {
            ctMPPC.setText(Integer.toString(filme.getMppc()));
            ctTitulo.setText(filme.getTitulo());
            ctIdioma.setText(filme.getIdioma());
            ctDuracao.setText(Integer.toBinaryString(filme.getDuracao()));
            ctCategoria.setText(filme.getCategoria());
            ctDescricao.setText(filme.getDescricao());
            
            int x = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Filme", "Excluir Filme", JOptionPane.YES_NO_CANCEL_OPTION);
            if (x == 0) {
                gerEntidades.removeFilmeTitulo(filme);
                JOptionPane.showMessageDialog(null, "Filme excluido com sucesso!", "Exclusão de Filme", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Filme não encontrado", "Busca de Filme", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void alterarFilme() {
        filme = new Filme();
        filme.setTitulo(ctTitulo.getText());
        filme = gerEntidades.alterarFilme(filme);
        
        if (filme != null) {
            ctMPPC.setText(Integer.toString(filme.getMppc()));
            ctTitulo.setText(filme.getTitulo());
            ctIdioma.setText(filme.getIdioma());
            ctDuracao.setText(Integer.toBinaryString(filme.getDuracao()));
            ctCategoria.setText(filme.getCategoria());
            ctDescricao.setText(filme.getDescricao());
            
            JOptionPane.showMessageDialog(null, "Filme alterado com sucesso!", "Atualização de Filme", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        }
        else {
            JOptionPane.showMessageDialog(null, "Filme não encontrado!", "Atualização de Filme", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void listarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblFilmes.getModel();
        int posLinha = 0; // indice para percorrer a tabela
        
        modelo.setRowCount(posLinha); // indica a primeira linha da tabela
        
        for (Filme filme : gerEntidades.getBdFilme()) {
            modelo.insertRow(posLinha, new Object []{filme.getTitulo(), filme.getMppc()});
            posLinha++;
        }
    }
    
    public void consultarFilme() {
        filme = new Filme();
        filme.setTitulo(ctTitulo.getText());
        filme = gerEntidades.consultaFilmeTitulo(filme);
        
        if (filme != null) {
            ctMPPC.setText(Integer.toString(filme.getMppc()));
            ctTitulo.setText(filme.getTitulo());
            ctIdioma.setText(filme.getIdioma());
            ctDuracao.setText(Integer.toBinaryString(filme.getDuracao()));
            ctCategoria.setText(filme.getCategoria());
            ctDescricao.setText(filme.getDescricao());
            
            JOptionPane.showMessageDialog(null, "Filme encontrado", "Busca de Filme", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Filme não encontrado", "Busca de Filme", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void cadastrarFilme() {
        filme = new Filme();
        
        try {
            filme.setMppc(Integer.parseInt(ctMPPC.getText()));
            filme.setTitulo(ctTitulo.getText());
            filme.setIdioma(ctIdioma.getText());
            filme.setDescricao(ctDescricao.getText());
            filme.setCategoria(ctCategoria.getText());
            try {
                filme.setDuracao(Integer.parseInt(ctDuracao.getText()));
                filme = gerEntidades.cadastraFilme(filme);
                if (filme != null) {
                    JOptionPane.showMessageDialog(null, "Filme Cadastrado com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    limpar();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Já existe esse Título", "Erro de Cadastro", 0);
                    limpar();
                }
            }
            catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "A Duração é um valor númerico", "Erro na Duração", 0);
                ctDuracao.setText("");
                ctDuracao.requestFocus();
            }
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O MPPC deve ser um número", "Erro de MPPC", 0);
            ctMPPC.setText("");
            ctMPPC.requestFocus();
        }
     
        
        
        
        
   }
    
    public void sair() {
        // yes = 0
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (resp == 0) {
            this.dispose();
        }
    }
    
    public void limpar() {
        ctTitulo.setText("");
        ctMPPC.setText("");
        ctIdioma.setText("");
        ctDuracao.setText("");
        ctDescricao.setText("");
        ctCategoria.setText("");
        ctMPPC.requestFocus();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListarFilmes;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctCategoria;
    private javax.swing.JTextField ctDescricao;
    private javax.swing.JTextField ctDuracao;
    private javax.swing.JTextField ctIdioma;
    private javax.swing.JTextField ctMPPC;
    private javax.swing.JTextField ctTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblIdioma1;
    private javax.swing.JLabel lblMPPC;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloForm;
    private javax.swing.JTable tblFilmes;
    // End of variables declaration//GEN-END:variables
}