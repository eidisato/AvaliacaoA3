
package com.mycompany.AvaliacaoA3;


public class Index extends javax.swing.JFrame {

  
    public Index() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BConsultar = new javax.swing.JButton();
        BApagar = new javax.swing.JButton();
        BAlterar = new javax.swing.JButton();
        BCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BConsultar.setText("Consultar");
        BConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConsultarActionPerformed(evt);
            }
        });

        BApagar.setText("Apagar");
        BApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BApagarActionPerformed(evt);
            }
        });

        BAlterar.setText("Alterar");
        BAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlterarActionPerformed(evt);
            }
        });

        BCadastrar.setText("Cadastrar");
        BCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BConsultar)
                    .addComponent(BApagar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAlterar)
                    .addComponent(BCadastrar))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConsultarActionPerformed
        // TODO add your handling code here:
        
       Consultar c = new Consultar();
       c.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BConsultarActionPerformed

    private void BApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BApagarActionPerformed
        // TODO add your handling code here:
        Deletar d = new Deletar();
        d.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_BApagarActionPerformed

    private void BAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarActionPerformed

        Alterar a = new Alterar();
        a.setVisible(true);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_BAlterarActionPerformed

    private void BCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarActionPerformed
        
        Pessoa p = new Pessoa();
        Cadastro c = new Cadastro();
        c.setVisible(true);
        this.dispose();

        

        // TODO add your handling code here:
    }//GEN-LAST:event_BCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterar;
    private javax.swing.JButton BApagar;
    private javax.swing.JButton BCadastrar;
    private javax.swing.JButton BConsultar;
    // End of variables declaration//GEN-END:variables
}
