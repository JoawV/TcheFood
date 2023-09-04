/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.pedidos;

import DAO.DAOUsuario;
import DAO.FormaPagamentoDAO;
import Model.ModelFormaPagamento;
import Model.ModelPedido;
import Model.ModelUsuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Vaio
 */
public class jdCadastrarPedido extends javax.swing.JDialog {

    /**
     * Creates new form jdCadastrarPedido
     */
    public jdCadastrarPedido(java.awt.Frame parent, boolean modal) {
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
        JTFUsuarioID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFStatusPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFStatusPagamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFTotal = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTFData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFFormaPagamentoID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Status do pagamento:");
        jLabel1.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFUsuarioID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFUsuarioIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Data:");
        jLabel2.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFStatusPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFStatusPedidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Status do pedido:");
        jLabel3.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFStatusPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFStatusPagamentoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total:");
        jLabel4.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTotalActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JTFData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDataActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Forma do pagamento id:");
        jLabel5.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFFormaPagamentoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFormaPagamentoIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Usuário id:");
        jLabel6.setPreferredSize(new java.awt.Dimension(44, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFUsuarioID)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFStatusPedido)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFStatusPagamento)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFData)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFFormaPagamentoID, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTFUsuarioID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFFormaPagamentoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFStatusPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFStatusPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFUsuarioIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFUsuarioIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFUsuarioIDActionPerformed

    private void JTFStatusPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFStatusPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFStatusPedidoActionPerformed

    private void JTFStatusPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFStatusPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFStatusPagamentoActionPerformed

    private void JTFTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTotalActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

       try {
           
    // Obtendo os valores dos campos de texto.
    
    ModelPedido pedido = new ModelPedido();
    
    int usuarioId = Integer.parseInt(JTFUsuarioID.getText());
    int formaPagamentoId = Integer.parseInt(JTFFormaPagamentoID.getText());
    String dataString = JTFData.getText();
    int statusPagamento = Integer.parseInt(JTFStatusPagamento.getText());
    int statusPedido = Integer.parseInt(JTFStatusPedido.getText());
    double total = Double.parseDouble(JTFTotal.getText());

    // Tentando converter.
    
    int usuario = DAOUsuario.getUsuarioId(usuarioId);
    int formaPagamento = FormaPagamentoDAO.getFormaPagamentoId(formaPagamentoId);
    
    // Tentando converter a data, mas está foda...
    
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    Date dataFormatada = formatoData.parse(dataString);

    java.sql.Date dataSql = new java.sql.Date(dataFormatada.getTime());
   

    // Verificando se as instâncias não são nulas.
    
    if (usuario != -1 || formaPagamento != -1) {
        
        ModelUsuario usuario2 = new ModelUsuario();
        usuario2.setId(usuario);
        pedido.setUsuarioId(usuario2);
        
        ModelFormaPagamento forma = new ModelFormaPagamento();
        forma.setId(formaPagamento);
        pedido.setFormaPagamentoId(forma);
    
        pedido.setDataHora(dataSql);
        pedido.setStatusPagamento(statusPagamento);
        pedido.setStatusPedido(statusPedido);
        pedido.setTotal(total);

        DAO.PedidoDAO.salvar(pedido);
        JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Id do usuário ou forma de pagamento não encontrado.");
    }
} catch (Exception e1) {
   throw new RuntimeException(e1);
}      
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JTFUsuarioID.setText(null);
        JTFFormaPagamentoID.setText(null);
        JTFData.setText(null);
        JTFStatusPagamento.setText(null);
        JTFStatusPedido.setText(null);
        JTFTotal.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTFDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataActionPerformed

    private void JTFFormaPagamentoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFormaPagamentoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFormaPagamentoIDActionPerformed

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
            java.util.logging.Logger.getLogger(jdCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdCadastrarPedido dialog = new jdCadastrarPedido(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField JTFData;
    private javax.swing.JTextField JTFFormaPagamentoID;
    private javax.swing.JTextField JTFStatusPagamento;
    private javax.swing.JTextField JTFStatusPedido;
    private javax.swing.JTextField JTFTotal;
    private javax.swing.JTextField JTFUsuarioID;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbSalvar;
    // End of variables declaration//GEN-END:variables
}
