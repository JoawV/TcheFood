/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.pedidos;

import Model.ModelPedido;
import Model.ModelUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.prompt.PromptSupport;
import view.JFRMenu;
import static view.pedidos.JDAlterarPedido.JTFAlterarFormaPagamentoID;
import static view.pedidos.JDAlterarPedido.JTFAlterarStatusPagamento;
import static view.pedidos.JDAlterarPedido.JTFAlterarStatusPedido;
import static view.pedidos.JDAlterarPedido.JTFAlterarTotal;
import static view.pedidos.JDAlterarPedido.JTFAlterarUsuarioID;
import view.usuario.jdGerenciarUsuario;
import static view.usuario.jdGerenciarUsuario.JTConsulta;

/**
 *
 * @author Vaio
 */
public class JDGerenciarPedidos extends javax.swing.JDialog {

    /**
     * Creates new form JDGerenciarPedidos
     */
    public JDGerenciarPedidos(java.awt.Frame parent, boolean modal) {
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

        JTFPesquisar = new javax.swing.JTextField();
        JBExcluir = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTPedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JTFPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPesquisarActionPerformed(evt);
            }
        });

        JBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clean.png"))); // NOI18N
        JBExcluir.setText("Excluir");
        JBExcluir.setEnabled(false);
        JBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcluirActionPerformed(evt);
            }
        });

        JBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/paper.png"))); // NOI18N
        JBAlterar.setText("Alterar");
        JBAlterar.setEnabled(false);
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        JTPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido id", "Usuário id", "Forma de pagamento id", "Data", "Status de pagamento", "Status do pedido", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTPedidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(JBPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBExcluir)
                .addGap(19, 19, 19))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBExcluir)
                    .addComponent(JBAlterar)
                    .addComponent(JBPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
        );

        PromptSupport.setPrompt("Pesquisar por nome ...", JTFPesquisar);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, JTFPesquisar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPesquisarActionPerformed
        try {
            // TODO add your handling code here:

            String pesquisa = JTFPesquisar.getText();

            ArrayList<ModelPedido> pedidos = DAO.PedidoDAO.consultar(pesquisa);

            if (pedidos.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nao há usuários cadastrados");
                this.dispose();
            } else {

                JBAlterar.setEnabled(true);
                JBExcluir.setEnabled(true);

                DefaultTableModel modelo = (DefaultTableModel) JTPedidos.getModel();

                modelo.setNumRows(0);

               
                    for (Model.ModelPedido modelPedido : DAO.PedidoDAO.consultar(pesquisa)) {
                        modelo.addRow(new Object[]{
                            modelPedido.getId(), modelPedido.getUsuarioId().getId(), modelPedido.getFormaPagamentoId().getId(), modelPedido.getDataHora(), 
                            modelPedido.getStatusPagamento(), modelPedido.getStatusPedido(), modelPedido.getTotal()

                        });
                    }
                
                        JTPedidos.setModel(modelo);
            }
        } catch (Exception PESQUISAR) {
            throw new RuntimeException(PESQUISAR);
        }
    }//GEN-LAST:event_JTFPesquisarActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed

        try {
            
        int linha = (int) (JTPedidos.getValueAt(JTPedidos.getSelectedRow(), 0));
        
        ModelPedido model = new ModelPedido();
        model.setId(linha);
        
        ((DefaultTableModel) JTPedidos.getModel()).removeRow(JTPedidos.getSelectedRow());

        int id;
        
            if (DAO.PedidoDAO.isIdValido(model)) {
                ModelPedido pedido = new ModelPedido();
                pedido.setId(linha);
                
                id = DAO.PedidoDAO.getPedidoPorId(linha);
                
                DAO.PedidoDAO.deletar(pedido);
                JOptionPane.showMessageDialog(this, "Excluido com Sucesso " + id);

            } else {
                System.err.println("Pedido não encontrado");
            }
      
        }catch(Exception EXCLUIR){
            throw new RuntimeException(EXCLUIR);
        }
    }//GEN-LAST:event_JBExcluirActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed

        try {
            
        JDAlterarPedido alterar = new JDAlterarPedido(null, true);

        int selectedRowIndex = JTPedidos.getSelectedRow();

        String usuarioId = (String) JTPedidos.getValueAt(selectedRowIndex, 1);
        String formaPagamentoId = (String) JTPedidos.getValueAt(selectedRowIndex, 2);
        String statusPagamento = (String) JTPedidos.getValueAt(selectedRowIndex, 3);
        String statusPedido = (String) JTPedidos.getValueAt(selectedRowIndex, 4);
        String total = (String) JTPedidos.getValueAt(selectedRowIndex, 5);
        

        JTFAlterarUsuarioID.setText(usuarioId);
        JTFAlterarFormaPagamentoID.setText(formaPagamentoId);
        JTFAlterarStatusPagamento.setText(statusPagamento);
        JTFAlterarStatusPedido.setText(statusPedido);
        JTFAlterarTotal.setText(total);

        alterar.setVisible(true);
        
        }catch(Exception GerenciarAlterar){
            throw new RuntimeException(GerenciarAlterar);
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        
        try {

            String pesquisa = JTFPesquisar.getText();

            ArrayList<ModelPedido> dados = DAO.PedidoDAO.consultar(pesquisa);

            if (dados.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Não há pedidos cadastrados");
                this.dispose();
            } else {

                JBAlterar.setEnabled(true);

                JBExcluir.setEnabled(true);

                DefaultTableModel modelo = (DefaultTableModel) JTPedidos.getModel();

                modelo.setNumRows(0);

                    for (Model.ModelPedido modelPedido : DAO.PedidoDAO.consultar(pesquisa)) {
                        modelo.addRow(new Object[]{
                            modelPedido.getId(), modelPedido.getUsuarioId().getId(), modelPedido.getFormaPagamentoId().getId(), modelPedido.getDataHora(), modelPedido.getStatusPagamento(), 
                            modelPedido.getStatusPedido(), modelPedido.getTotal()

                        });
                    }
                        JTPedidos.setModel(modelo);
                }
        }catch(Exception PESQUISAR){
            throw new RuntimeException(PESQUISAR);
        }
    }//GEN-LAST:event_JBPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JDGerenciarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDGerenciarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDGerenciarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDGerenciarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDGerenciarPedidos dialog = new JDGerenciarPedidos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JTextField JTFPesquisar;
    public static javax.swing.JTable JTPedidos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
