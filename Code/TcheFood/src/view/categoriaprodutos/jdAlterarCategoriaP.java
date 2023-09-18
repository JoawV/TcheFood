/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.categoriaprodutos;

import Model.ModelCategoriaProduto;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static view.categoriaprodutos.jdGerenciarCategoriaP.jtTabela;

/**
 *
 * @author Aluno TDS
 */
public class jdAlterarCategoriaP extends javax.swing.JDialog {

    /**
     * Creates new form jdAlterarCategoriaP
     */
    public jdAlterarCategoriaP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSalvar = new javax.swing.JButton();
        jlDescricao = new javax.swing.JLabel();
        tfAlterarProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Categoria do Produto");

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check.png"))); // NOI18N
        jbSalvar.setText("Atualizar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDescricao.setText("Descrição da Categoria do Produto:");

        tfAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlterarProdutoActionPerformed(evt);
            }
        });
        tfAlterarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAlterarProdutoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAlterarProdutoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfAlterarProduto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jbSalvar)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalvar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        String teste = tfAlterarProduto.getText();
        
        if (teste.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite alguma descrição!");
        } else {
        
        Model.ModelCategoriaProduto descricao = new ModelCategoriaProduto();
        int id = (int)(jtTabela.getValueAt(jtTabela.getSelectedRow(), 0));

        descricao.setId(id);
        descricao.setDescricao(tfAlterarProduto.getText());
        
        try {
            DAO.CategoriaProdutoDAO.atualizar(descricao);             
            JOptionPane.showMessageDialog(this, "Atualizado com Sucesso!");             
            this.dispose();
        }catch (Exception ex) {
            
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void tfAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlterarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlterarProdutoActionPerformed

    private void tfAlterarProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAlterarProdutoKeyReleased

    }//GEN-LAST:event_tfAlterarProdutoKeyReleased

    private void tfAlterarProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAlterarProdutoKeyTyped
                char texto = evt.getKeyChar();
        
        if(!Character.isAlphabetic(texto) && texto != KeyEvent.VK_SPACE) {
            JOptionPane.showMessageDialog(rootPane, "Digite apenas letras.");
            evt.consume();
        }
    }//GEN-LAST:event_tfAlterarProdutoKeyTyped

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
            java.util.logging.Logger.getLogger(jdAlterarCategoriaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdAlterarCategoriaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdAlterarCategoriaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdAlterarCategoriaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdAlterarCategoriaP dialog = new jdAlterarCategoriaP(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlDescricao;
    public static javax.swing.JTextField tfAlterarProduto;
    // End of variables declaration//GEN-END:variables
}
