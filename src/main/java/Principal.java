// Aluno: lucas Martins da Silva Sena - RA: a2348098 - ok

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lucas_Sena
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAbreCadLocacao = new javax.swing.JButton();
        barMenuPrincipal = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();
        itMnCadAtendente = new javax.swing.JMenuItem();
        itMnCadAdministrador = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        itMnCadCliente = new javax.swing.JMenuItem();
        itiMnCadLocacao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        btAbreCadLocacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btAbreCadLocacao.setText("Alugar Filme");
        btAbreCadLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbreCadLocacaoActionPerformed(evt);
            }
        });

        menuPrincipal.setText("Menu Principal");

        itMnCadAtendente.setText("Cadastrar Atendente");
        itMnCadAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadAtendenteActionPerformed(evt);
            }
        });
        menuPrincipal.add(itMnCadAtendente);

        itMnCadAdministrador.setText("Cadastrar Administrador");
        itMnCadAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadAdministradorActionPerformed(evt);
            }
        });
        menuPrincipal.add(itMnCadAdministrador);

        barMenuPrincipal.add(menuPrincipal);

        menuCliente.setText("Cliente");

        itMnCadCliente.setText("Cadastrar Clientes");
        itMnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadClienteActionPerformed(evt);
            }
        });
        menuCliente.add(itMnCadCliente);

        itiMnCadLocacao.setText("Alugar Filme");
        itiMnCadLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itiMnCadLocacaoActionPerformed(evt);
            }
        });
        menuCliente.add(itiMnCadLocacao);

        barMenuPrincipal.add(menuCliente);

        setJMenuBar(barMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btAbreCadLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btAbreCadLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAbreCadLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbreCadLocacaoActionPerformed
        abreCadLocacao();
    }//GEN-LAST:event_btAbreCadLocacaoActionPerformed

    private void itMnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadClienteActionPerformed
        abreCadCliente();
    }//GEN-LAST:event_itMnCadClienteActionPerformed

    private void itMnCadAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadAtendenteActionPerformed
        abreCadAtendente();
    }//GEN-LAST:event_itMnCadAtendenteActionPerformed

    private void itMnCadAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadAdministradorActionPerformed
        abreCadAdministrador();
    }//GEN-LAST:event_itMnCadAdministradorActionPerformed

    private void itiMnCadLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itiMnCadLocacaoActionPerformed
        abreCadLocacao();
    }//GEN-LAST:event_itiMnCadLocacaoActionPerformed
    
    public void abreCadAtendente() {
        CadAtendente.getCadAtendente().setVisible(true);
    }
    
    public void abreCadAdministrador() {
        CadAdministrador.getCadAdministrador().setVisible(true);
    }
    
    public void abreCadCliente() {
        CadCliente.getCadCliente().setVisible(true);
    }
    
    public void abreCadLocacao() {
        CadLocacao.getCadLocacao().setVisible(true);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenuPrincipal;
    private javax.swing.JButton btAbreCadLocacao;
    private javax.swing.JMenuItem itMnCadAdministrador;
    private javax.swing.JMenuItem itMnCadAtendente;
    private javax.swing.JMenuItem itMnCadCliente;
    private javax.swing.JMenuItem itiMnCadLocacao;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
