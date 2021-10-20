package Vista;

import ModeloArr.ArrBillete;
import ModeloArr.ArrEmpFab;
import ModeloArr.ArrMateriales;
import ModeloArr.ArrPais;
import ModeloArr.Billetes;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class MenuAdmin extends javax.swing.JFrame {

    public static ArrPais Arrpais = new ArrPais();
    public static ArrMateriales Arrmateriales = new ArrMateriales();
    public static ArrEmpFab ArrEmpresa = new ArrEmpFab();
     public static ArrBillete Arrbillete = new ArrBillete();
    Billetes bill = new Billetes();

    public MenuAdmin() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Menú Principal");
        setSize(453, 336);
        this.getContentPane().setBackground(Color.lightGray);
        
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(null);
        MenuAdmin.Arrpais.setNomArchivo(file.getSelectedFile().getPath());

        MenuAdmin.Arrpais.asignarPaises();
         try {
            setIconImage(new ImageIcon(getClass().getResource("../imagenes/notas.png")).getImage());
        } catch (Exception ex) {
        }

        
        
        
      
      
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMateriales = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        btnBilletes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMateriales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subcontratacion.png"))); // NOI18N
        btnMateriales.setText("Gestionar Empresa");
        btnMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterialesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMateriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 270, 30));

        btnEmpresa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estuche (1).png"))); // NOI18N
        btnEmpresa.setText("Gestionar Materiales");
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 270, 30));

        btnBilletes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBilletes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notas.png"))); // NOI18N
        btnBilletes.setText("Gestionar Billetes");
        btnBilletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBilletesActionPerformed(evt);
            }
        });
        getContentPane().add(btnBilletes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 270, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COLECCIONISTA DE BILLETES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Menú Administrador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterialesActionPerformed

        EmpresasAdmi menuAdminGUI = new EmpresasAdmi();
        menuAdminGUI.setVisible(true);


    }//GEN-LAST:event_btnMaterialesActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed

        MaterialesAdmi menuAdminGUI = new MaterialesAdmi();
        menuAdminGUI.setVisible(true);

    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void btnBilletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilletesActionPerformed
        BilletesAdmin billetesAdminGUI = new BilletesAdmin(Arrbillete.getArrBilletes()); 
        billetesAdminGUI.setVisible(true);

    }//GEN-LAST:event_btnBilletesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBilletes;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnMateriales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
