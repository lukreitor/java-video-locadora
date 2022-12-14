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
public class CadLocacao extends javax.swing.JFrame {

    private Locacao locacao;
    private GerEntidades gerEntidades = new GerEntidades();

    private static CadLocacao unicoCadLocacao;

    private CadLocacao() {
        initComponents();
    }

    public static CadLocacao getCadLocacao() {
        if (unicoCadLocacao == null) {
            unicoCadLocacao = new CadLocacao();
        }
        return unicoCadLocacao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocacao = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btListarFilmes = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        lblFilme = new javax.swing.JLabel();
        ctCpfCliente = new javax.swing.JTextField();
        lblCpfCliente = new javax.swing.JLabel();
        lblMppc = new javax.swing.JLabel();
        ctMppc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar Dados");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        tblLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Filme", "Valor", "Vencimento"
            }
        ));
        jScrollPane1.setViewportView(tblLocacao);
        if (tblLocacao.getColumnModel().getColumnCount() > 0) {
            tblLocacao.getColumnModel().getColumn(2).setHeaderValue("Valor");
            tblLocacao.getColumnModel().getColumn(3).setHeaderValue("Vencimento");
        }

        btExcluir.setText("Excluir Conta");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btListarFilmes.setText("Consultar Filmes");
        btListarFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarFilmesActionPerformed(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btCadastrar.setText("ALUGAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Pagar Locacao");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lblFilme.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFilme.setText("ALUGAR FILME");

        lblCpfCliente.setBackground(new java.awt.Color(0, 0, 0));
        lblCpfCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCpfCliente.setText("CPF:");

        lblMppc.setBackground(new java.awt.Color(0, 0, 0));
        lblMppc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMppc.setText("MPPC:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFilme)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btListarFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btExcluir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(98, 98, 98)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btConsultar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btAlterar))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCpfCliente)
                        .addGap(29, 29, 29)
                        .addComponent(ctCpfCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMppc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctMppc, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblFilme)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCliente)
                    .addComponent(ctCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMppc)
                    .addComponent(ctMppc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(btListarFilmes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btListarFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarFilmesActionPerformed
        listarFilmes();
        abreListaFilmes();
    }//GEN-LAST:event_btListarFilmesActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarLocacao();
        listarTabela();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed

    }//GEN-LAST:event_btConsultarActionPerformed

    public void removeLocacao(Locacao locacao) {
      locacao = new Locacao();
      locacao.setCpfCliente(ctCpfCliente.getText());
      locacao.setMppc(Integer.parseInt(ctMppc.getText()));
      locacao = gerEntidades.consultaLocacao(locacao);

      if (locacao != null) {
         int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Exclus??o de Locacao", JOptionPane.YES_NO_OPTION);
         if (x == JOptionPane.YES_OPTION) {
            gerEntidades.removeLocacao(locacao);
            JOptionPane.showMessageDialog(null, "Locacao excluida com sucesso!", "Exclus??o de Locacao", JOptionPane.INFORMATION_MESSAGE);
         }
         else {
            JOptionPane.showMessageDialog(null, "Locacao n??o excluida", "Exclus??o de Locacao", JOptionPane.ERROR_MESSAGE);
         }
      }
      else {
         JOptionPane.showMessageDialog(null, "Locacao n??o encontrada", "Erro de Remo????o", 0);
      }
   }

    public void cadastrarLocacao() {
        locacao = new Locacao();
        try {
            locacao.setMppc(Integer.parseInt(ctMppc.getText()));
            locacao.setCpfCliente(ctCpfCliente.getText());

            locacao = gerEntidades.cadastraLocacao(locacao);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O MPPC deve ser um n??mero", "Erro de MPPC", 0);
            ctMppc.setText("");
            ctMppc.requestFocus();
        }
    }

    public void abreListaFilmes() {
        ListaFilmes.getListaFilmes(gerEntidades).setVisible(true);
    }

    public void listarFilmes() {
        DefaultTableModel modelo = (DefaultTableModel) tblLocacao.getModel();
        int posLinha = 0; // indice para percorrer a tabela

        modelo.setRowCount(posLinha); // indica a primeira linha da tabela

        for (Filme filme : gerEntidades.getBdFilme()) {
            modelo.insertRow(posLinha, new Object[]{filme.getTitulo(), filme.getMppc()});
            posLinha++;
        }
    }

    public void listarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblLocacao.getModel();
        int posLinha = 0; // indice para percorrer a tabela

        modelo.setRowCount(posLinha); // indica a primeira linha da tabela

        for (Locacao locacao : gerEntidades.getBdLocacao()) {
            modelo.insertRow(posLinha, new Object[]{locacao.getCpfCliente(), locacao.getMppc(), locacao.getValor(), locacao.getDataDevolucao()});
            posLinha++;
        }
    }

    public void sair() {
        // yes = 0
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Sa??da", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        ctCpfCliente.setText("");
        ctMppc.setText("");
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
            java.util.logging.Logger.getLogger(CadLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadLocacao().setVisible(true);
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
    private javax.swing.JTextField ctCpfCliente;
    private javax.swing.JTextField ctMppc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JLabel lblMppc;
    private javax.swing.JTable tblLocacao;
    // End of variables declaration//GEN-END:variables
}
