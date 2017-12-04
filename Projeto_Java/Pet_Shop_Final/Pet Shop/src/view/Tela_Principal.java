/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.dao.AnimalDAO;
import modelo.bean.Animal;

/**
 *
 * @author Alecsander
 */
public class Tela_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    public Tela_Principal() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jtAnimais.getModel();
        jtAnimais.setRowSorter(new TableRowSorter(modelo));

        lerTela_Principal();

    }

    public void lerTela_Principal() {

        DefaultTableModel modelo = (DefaultTableModel) jtAnimais.getModel();
        modelo.setNumRows(0);
        AnimalDAO adao = new AnimalDAO();

        for (Animal a : adao.ler()) {

            modelo.addRow(new Object[]{
                a.getIdAnimal(),
                a.getNomeAnimal(),
                a.getTipo(),
                a.getRaca(),
                a.getIdade(),
                a.getNomeDono(),
                a.getCelular(),});

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtAnimais = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jfNomeAnimal = new javax.swing.JTextField();
        jfTipo = new javax.swing.JTextField();
        jfRaca = new javax.swing.JTextField();
        jfIdade = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jfNomeDono = new javax.swing.JTextField();
        jBotaoCadastro = new javax.swing.JButton();
        jfCelular = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jBotaoExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PET SHOP - VAMO PASSAR DIRETO, BIRL!");

        jtAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do Animal", "Nome do Animal", "Tipo", "Raça", "Idade", "Nome do Dono", "Número do Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAnimaisMouseClicked(evt);
            }
        });
        jtAnimais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtAnimaisKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtAnimais);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Animal"));

        jLabel1.setText("Nome");

        jLabel2.setText("Tipo");

        jLabel3.setText("Raça");

        jLabel4.setText("Idade");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jfNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jfRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dono do Animal"));

        jLabel5.setText("Nome");

        jLabel6.setText("Número do Celular");

        jBotaoCadastro.setText("Cadastrar");
        jBotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoCadastroActionPerformed(evt);
            }
        });

        try {
            jfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jfNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBotaoCadastro))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBotaoCadastro)
                .addContainerGap())
        );

        jBotaoExcluir.setText("Excluir");
        jBotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jbAlterar)
                .addGap(18, 18, 18)
                .addComponent(jBotaoExcluir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoExcluir)
                    .addComponent(jbAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoCadastroActionPerformed

        Animal a = new Animal();
        AnimalDAO dao = new AnimalDAO();

        a.setNomeAnimal(jfNomeAnimal.getText());
        a.setTipo(jfTipo.getText());
        a.setRaca(jfRaca.getText());
        a.setIdade(jfIdade.getText());
        a.setNomeDono(jfNomeDono.getText());
        a.setCelular(jfCelular.getText());
        
        dao.criar(a);

        jfNomeAnimal.setText("");
        jfTipo.setText("");
        jfRaca.setText("");
        jfIdade.setText("");
        jfNomeDono.setText("");
        jfCelular.setText("");

        lerTela_Principal();

//        DefaultTableModel dtmAnimais = (DefaultTableModel) jtAnimais.getModel();
//        Object [] dados = {jfNomeAnimal.getText(), jfTipo.getText(), jfRaca.getText(), jfIdade.getText(), jfNomeDono.getText(), jffCelular.getText()};
//        dtmAnimais.addRow(dados);

    }//GEN-LAST:event_jBotaoCadastroActionPerformed

    private void jBotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoExcluirActionPerformed

        if (jtAnimais.getSelectedRow() != -1) {

            Animal a = new Animal();
            AnimalDAO dao = new AnimalDAO();

            a.setIdAnimal((int) jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 0));
            
            dao.excluir(a);

            jfNomeAnimal.setText("");
            jfTipo.setText("");
            jfRaca.setText("");
            jfIdade.setText("");
            jfNomeDono.setText("");
            jfCelular.setText("");

            lerTela_Principal();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um animal para exlcuir...");
        }

    }//GEN-LAST:event_jBotaoExcluirActionPerformed

    private void jtAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAnimaisMouseClicked

        if (jtAnimais.getSelectedRow() != -1) {

            jfNomeAnimal.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 1).toString());
            jfTipo.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 2).toString());
            jfRaca.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 3).toString());
            jfIdade.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 4).toString());
            jfNomeDono.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 5).toString());
            jfCelular.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 6).toString());

        }

    }//GEN-LAST:event_jtAnimaisMouseClicked

    private void jtAnimaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnimaisKeyReleased

        if (jtAnimais.getSelectedRow() != -1) {

            jfNomeAnimal.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 1).toString());
            jfTipo.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 2).toString());
            jfRaca.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 3).toString());
            jfIdade.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 4).toString());
            jfNomeDono.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 5).toString());
            jfCelular.setText(jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 6).toString());

        }

    }//GEN-LAST:event_jtAnimaisKeyReleased

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed

        if (jtAnimais.getSelectedRow() != -1) {

            Animal a = new Animal();
            AnimalDAO dao = new AnimalDAO();

            a.setNomeAnimal(jfNomeAnimal.getText());
            a.setTipo(jfTipo.getText());
            a.setRaca(jfRaca.getText());
            a.setIdade(jfIdade.getText());
            a.setNomeDono(jfNomeDono.getText());
            a.setCelular(jfCelular.getText());
            a.setIdAnimal((int) jtAnimais.getValueAt(jtAnimais.getSelectedRow(), 0));
            
            dao.alterar(a);

            jfNomeAnimal.setText("");
            jfTipo.setText("");
            jfRaca.setText("");
            jfIdade.setText("");
            jfNomeDono.setText("");
            jfCelular.setText("");

            lerTela_Principal();

        }

    }//GEN-LAST:event_jbAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoCadastro;
    private javax.swing.JButton jBotaoExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JFormattedTextField jfCelular;
    private javax.swing.JTextField jfIdade;
    private javax.swing.JTextField jfNomeAnimal;
    private javax.swing.JTextField jfNomeDono;
    private javax.swing.JTextField jfRaca;
    private javax.swing.JTextField jfTipo;
    private javax.swing.JTable jtAnimais;
    // End of variables declaration//GEN-END:variables
}
