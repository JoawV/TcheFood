/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.usuario;

import Model.ModelUsuario;
import java.awt.Color;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author Aluno TDS
 */
public class jdcadastrarUsuario extends javax.swing.JDialog {


    /**
     * Creates new form jdcadastrarUsuario
     */
    public jdcadastrarUsuario(java.awt.Frame parent, boolean modal) {
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
        txtCadastrarusuarioNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCadastrarusuarioEmail = new javax.swing.JTextField();
        txtCadastrarusuarioSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCadastrarusuarioPapel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtCadastrarusuarioTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Usuario");
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                formInputMethodTextChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        txtCadastrarusuarioNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCadastrarusuarioNomeFocusLost(evt);
            }
        });
        txtCadastrarusuarioNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCadastrarusuarioNomeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Email:");

        txtCadastrarusuarioEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCadastrarusuarioEmailKeyReleased(evt);
            }
        });

        txtCadastrarusuarioSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCadastrarusuarioSenhaKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Senha:");

        txtCadastrarusuarioPapel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCadastrarusuarioPapelFocusLost(evt);
            }
        });
        txtCadastrarusuarioPapel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCadastrarusuarioPapelKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Papel:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Telefone:");

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

        txtCadastrarusuarioTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCadastrarusuarioTelefoneKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(txtCadastrarusuarioPapel)
                    .addComponent(txtCadastrarusuarioSenha)
                    .addComponent(txtCadastrarusuarioEmail)
                    .addComponent(txtCadastrarusuarioNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(txtCadastrarusuarioTelefone))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastrarusuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastrarusuarioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastrarusuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastrarusuarioPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastrarusuarioTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCadastrarusuarioEmail, txtCadastrarusuarioNome, txtCadastrarusuarioPapel, txtCadastrarusuarioSenha});

        PromptSupport.setPrompt("Insira o nome ...", txtCadastrarusuarioNome);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtCadastrarusuarioNome);
        PromptSupport.setPrompt("Insira o Email ...", txtCadastrarusuarioEmail);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtCadastrarusuarioEmail);
        PromptSupport.setPrompt("Insira a senha ...", txtCadastrarusuarioSenha);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtCadastrarusuarioSenha);
        PromptSupport.setPrompt("Insira o acesso ...", txtCadastrarusuarioPapel);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtCadastrarusuarioPapel);
        PromptSupport.setPrompt("Insira o telfone ...", txtCadastrarusuarioTelefone);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtCadastrarusuarioTelefone);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String Cripto(String senhaOriginal) throws NoSuchAlgorithmException{
             MessageDigest md;
              md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1,md.digest(senhaOriginal.getBytes()));
            String senhaCripto = hash.toString(16);
            return senhaCripto;
    }
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
           
         String senhaOriginal = txtCadastrarusuarioSenha.getText();
        
        
        
  
       
            ModelUsuario a = new ModelUsuario();
            a.setNome(txtCadastrarusuarioNome.getText());
            a.setEmail(txtCadastrarusuarioEmail.getText());
        try {
            a.setSenha(Cripto(senhaOriginal));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(jdcadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
            a.setPapel(txtCadastrarusuarioPapel.getText());
            a.setTelefone(txtCadastrarusuarioTelefone.getText());

            try {
                DAO.DAOUsuario.salvar(a);
                JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                this.dispose();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(jdcadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        


    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtCadastrarusuarioEmail.setText(null);
        txtCadastrarusuarioNome.setText(null);
        txtCadastrarusuarioPapel.setText(null);
        txtCadastrarusuarioSenha.setText(null);
        txtCadastrarusuarioTelefone.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCadastrarusuarioNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCadastrarusuarioNomeFocusLost

    }//GEN-LAST:event_txtCadastrarusuarioNomeFocusLost

    private void txtCadastrarusuarioPapelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCadastrarusuarioPapelFocusLost

    }//GEN-LAST:event_txtCadastrarusuarioPapelFocusLost

    private void formInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formInputMethodTextChanged

    }//GEN-LAST:event_formInputMethodTextChanged
   private boolean b;
   private boolean a;
   private boolean c;
   private boolean d;
   private boolean e;


    private void txtCadastrarusuarioNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadastrarusuarioNomeKeyReleased

        a = adawd("[a-zA-Z]+", txtCadastrarusuarioNome);
        teste();
    }//GEN-LAST:event_txtCadastrarusuarioNomeKeyReleased

    private void txtCadastrarusuarioPapelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadastrarusuarioPapelKeyReleased
        // TODO add your handling code here:
        b = adawd("[a-zA-Z]+", txtCadastrarusuarioPapel);
        teste();
    }//GEN-LAST:event_txtCadastrarusuarioPapelKeyReleased

    private void txtCadastrarusuarioEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadastrarusuarioEmailKeyReleased
        // TODO add your handling code here:
        d = !txtCadastrarusuarioEmail.getText().isEmpty();
          teste();
        
    }//GEN-LAST:event_txtCadastrarusuarioEmailKeyReleased

    private void txtCadastrarusuarioSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadastrarusuarioSenhaKeyReleased
        // TODO add your handling code here:
       e = !txtCadastrarusuarioSenha.getText().isEmpty();
         teste();
    }//GEN-LAST:event_txtCadastrarusuarioSenhaKeyReleased

    private void txtCadastrarusuarioTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadastrarusuarioTelefoneKeyReleased
       
               c = adawd("[0-9]+", txtCadastrarusuarioTelefone);
        teste();
        
        
    }//GEN-LAST:event_txtCadastrarusuarioTelefoneKeyReleased

    private void teste() {
        if (a && b && c && d && e) {
            jbSalvar.setEnabled(true);
        } else {
            jbSalvar.setEnabled(false);
        }

    }

    private boolean adawd(String regex, JTextField abc) {

        String tx = abc.getText();
        if (tx.matches(regex)) {
            abc.setForeground(Color.black);
            return true;
        } else {
            abc.setForeground(Color.red);
            abc.requestFocus();
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
            java.util.logging.Logger.getLogger(jdcadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdcadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdcadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdcadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdcadastrarUsuario dialog = new jdcadastrarUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField txtCadastrarusuarioEmail;
    private javax.swing.JTextField txtCadastrarusuarioNome;
    private javax.swing.JTextField txtCadastrarusuarioPapel;
    private javax.swing.JTextField txtCadastrarusuarioSenha;
    public static javax.swing.JTextField txtCadastrarusuarioTelefone;
    // End of variables declaration//GEN-END:variables
}
