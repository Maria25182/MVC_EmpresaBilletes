/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author M
 */
public class PanelUsuario extends javax.swing.JFrame {

    /**
     * Creates new form PanelUsuario
     */
    public PanelUsuario() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Panel Usuario");
        setSize(731, 689);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        VerBilletesTabbed.setVisible(false);
        VerMaterialesTabbed.setVisible(false);
        VerEmpresasTabbed.setVisible(false);
        
        
         try {
            setIconImage(new ImageIcon(getClass().getResource("../imagenes/notas.png")).getImage());
        } catch (Exception ex) {
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

        jPanel1 = new javax.swing.JPanel();
        jMenu2 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        VerBilletesTabbed = new javax.swing.JTabbedPane();
        PanelBilletes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVerBilletes = new javax.swing.JTextArea();
        VerMaterialesTabbed = new javax.swing.JTabbedPane();
        PanelMateriales = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtvermateriales = new javax.swing.JTextArea();
        VerEmpresasTabbed = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVerEmpresas = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Ver = new javax.swing.JMenu();
        VerBilletes = new javax.swing.JMenuItem();
        VerMateriales = new javax.swing.JMenuItem();
        VerEmpresas = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("PANEL USUARIO");

        txtVerBilletes.setColumns(20);
        txtVerBilletes.setRows(5);
        jScrollPane1.setViewportView(txtVerBilletes);

        javax.swing.GroupLayout PanelBilletesLayout = new javax.swing.GroupLayout(PanelBilletes);
        PanelBilletes.setLayout(PanelBilletesLayout);
        PanelBilletesLayout.setHorizontalGroup(
            PanelBilletesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        PanelBilletesLayout.setVerticalGroup(
            PanelBilletesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );

        VerBilletesTabbed.addTab("Ver Billetes", PanelBilletes);

        txtvermateriales.setColumns(20);
        txtvermateriales.setRows(5);
        jScrollPane3.setViewportView(txtvermateriales);

        javax.swing.GroupLayout PanelMaterialesLayout = new javax.swing.GroupLayout(PanelMateriales);
        PanelMateriales.setLayout(PanelMaterialesLayout);
        PanelMaterialesLayout.setHorizontalGroup(
            PanelMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaterialesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        PanelMaterialesLayout.setVerticalGroup(
            PanelMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMaterialesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        VerMaterialesTabbed.addTab("Ver Materiales", PanelMateriales);

        txtVerEmpresas.setColumns(20);
        txtVerEmpresas.setRows(5);
        jScrollPane2.setViewportView(txtVerEmpresas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        VerEmpresasTabbed.addTab("Ver Empresas", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SELECCIONES QUE DESEEA VER DE LA BARRA DE MENU");

        Ver.setText("Ver");

        VerBilletes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_TAB, 0));
        VerBilletes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago.png"))); // NOI18N
        VerBilletes.setText("Ver Billetes");
        VerBilletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBilletesActionPerformed(evt);
            }
        });
        Ver.add(VerBilletes);

        VerMateriales.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        VerMateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estuche.png"))); // NOI18N
        VerMateriales.setText("Ver Materiales");
        VerMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMaterialesActionPerformed(evt);
            }
        });
        Ver.add(VerMateriales);

        VerEmpresas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        VerEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresa.png"))); // NOI18N
        VerEmpresas.setText("Ver Empresas");
        VerEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEmpresasActionPerformed(evt);
            }
        });
        Ver.add(VerEmpresas);

        jMenuBar1.add(Ver);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VerMaterialesTabbed))
                    .addComponent(VerBilletesTabbed, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VerEmpresasTabbed)))
                .addGap(0, 524, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(VerMaterialesTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(VerEmpresasTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VerBilletesTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerBilletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBilletesActionPerformed
        VerBilletesTabbed.setVisible(true);
        VerMaterialesTabbed.setVisible(false);
        txtVerBilletes.setText(MenuAdmin.Arrbillete.listarBilletes());
        VerEmpresasTabbed.setVisible(false);
        

    }//GEN-LAST:event_VerBilletesActionPerformed

    private void VerMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMaterialesActionPerformed
        VerMaterialesTabbed.setVisible(true);
        txtvermateriales.setText(MenuAdmin.Arrmateriales.listarMateriales());
        VerBilletesTabbed.setVisible(false);
        VerEmpresasTabbed.setVisible(false);

    }//GEN-LAST:event_VerMaterialesActionPerformed

    private void VerEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEmpresasActionPerformed
        VerBilletesTabbed.setVisible(false);
        VerMaterialesTabbed.setVisible(false);
        VerEmpresasTabbed.setVisible(true);
        txtVerEmpresas.setText(MenuAdmin.ArrEmpresa.listarEmpresas());
    }//GEN-LAST:event_VerEmpresasActionPerformed
    
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
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBilletes;
    private javax.swing.JPanel PanelMateriales;
    private javax.swing.JMenu Ver;
    private javax.swing.JMenuItem VerBilletes;
    private javax.swing.JTabbedPane VerBilletesTabbed;
    private javax.swing.JMenuItem VerEmpresas;
    private javax.swing.JTabbedPane VerEmpresasTabbed;
    private javax.swing.JMenuItem VerMateriales;
    private javax.swing.JTabbedPane VerMaterialesTabbed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtVerBilletes;
    private javax.swing.JTextArea txtVerEmpresas;
    private javax.swing.JTextArea txtvermateriales;
    // End of variables declaration//GEN-END:variables
}
