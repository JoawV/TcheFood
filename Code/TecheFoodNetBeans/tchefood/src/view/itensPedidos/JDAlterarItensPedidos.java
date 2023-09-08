/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.itensPedidos;

import Model.ModelItensPedido;
import Model.ModelPedido;
import Model.ModelProduto;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static view.pedidos.JDCadastrarPedido.JTItensPedidos;

/**
 *
 * @author Vaio
 */
public class JDAlterarItensPedidos extends javax.swing.JDialog {

    /**
     * Creates new form JDAlterarItensPedidos
     */
    public JDAlterarItensPedidos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        JTFQuantidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFPedidoId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFProdutoId = new javax.swing.JTextField();
        JBAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Produto id:");

        JTFQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeActionPerformed(evt);
            }
        });
        JTFQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFQuantidadeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Pedido id:");

        JTFPedidoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPedidoIdActionPerformed(evt);
            }
        });
        JTFPedidoId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFPedidoIdKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade:");

        JTFProdutoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFProdutoIdActionPerformed(evt);
            }
        });
        JTFProdutoId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFProdutoIdKeyReleased(evt);
            }
        });

        JBAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check.png"))); // NOI18N
        JBAlterar.setText("Alterar");
        JBAlterar.setEnabled(false);
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFQuantidade)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(JTFPedidoId)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFProdutoId)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(JBAlterar)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFPedidoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFProdutoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBAlterar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeActionPerformed

    private void JTFQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFQuantidadeKeyReleased
        verificacaoQuantidade = validacao("\\d+", JTFQuantidade);
        visibilidade();
    }//GEN-LAST:event_JTFQuantidadeKeyReleased

    private void JTFPedidoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPedidoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPedidoIdActionPerformed

    private void JTFPedidoIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPedidoIdKeyReleased
        verificacaoPedidoId = validacao("\\d+", JTFPedidoId);
        visibilidade();
    }//GEN-LAST:event_JTFPedidoIdKeyReleased

    private void JTFProdutoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFProdutoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFProdutoIdActionPerformed

    private void JTFProdutoIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFProdutoIdKeyReleased
        verificacaoProdutoId = validacao("\\d+", JTFProdutoId);
        visibilidade();
    }//GEN-LAST:event_JTFProdutoIdKeyReleased

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed

        try {

            // Obtendo os valores dos campos de texto.

            ModelItensPedido itensPedido = new ModelItensPedido();
            
            int id = (int) (JTItensPedidos.getValueAt(JTItensPedidos.getSelectedRow(), 0));

            int pedidoId = Integer.parseInt(JTFPedidoId.getText());
            int produtoId = Integer.parseInt(JTFProdutoId.getText());
            int quantidade = Integer.parseInt(JTFQuantidade.getText());

            // Tentando converter.

            int verificarPedido = DAO.PedidoDAO.getPedidoPorId(pedidoId);
            int verificarProduto = DAO.ProdutoDAO.getProdutoPorId(produtoId);

            // Verificando se as instâncias não são nulas.

            if (verificarPedido != -1 || verificarProduto != -1) {

                ModelPedido pedido2 = new ModelPedido();
                pedido2.setId(verificarPedido);
                itensPedido.setPedidoId(pedido2);

                ModelProduto produto2 = new ModelProduto();
                produto2.setId(verificarProduto);
                itensPedido.setProdutoId(produto2);

                itensPedido.setQuantidade(quantidade);
                
                itensPedido.setId(id);
                
                if(DAO.ItensPedidoDAO.isIdValido(itensPedido)){
                    
                    DAO.ItensPedidoDAO.atualizar(itensPedido);
                    JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Id do iten do pedido não encontrado.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Id do pedido ou produto não encontrado.");
            }

        } catch (Exception ALTERAR) {
            throw new RuntimeException(ALTERAR);
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    
    private boolean verificacaoPedidoId;
    private boolean verificacaoProdutoId;
    private boolean verificacaoQuantidade;
    
    private void visibilidade(){
        if (verificacaoPedidoId && verificacaoProdutoId && verificacaoQuantidade){
            JBAlterar.setEnabled(true);
        } else {
            JBAlterar.setEnabled(false);
        }
    }
    
    private boolean validacao(String letrinha, JTextField field){
        String texto = field.getText();
        
        if(texto.matches(letrinha)){
            field.setForeground(Color.blue);
            return true;
        } else {
            field.setForeground(Color.red);
            field.requestFocus();
            return false;
        }
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
            java.util.logging.Logger.getLogger(JDAlterarItensPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAlterarItensPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAlterarItensPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAlterarItensPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAlterarItensPedidos dialog = new JDAlterarItensPedidos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBAlterar;
    public static javax.swing.JTextField JTFPedidoId;
    public static javax.swing.JTextField JTFProdutoId;
    public static javax.swing.JTextField JTFQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
