/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ModeloArr.Empresa;
import ModeloArr.Materiales;
import ModeloArr.Pais;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author M
 */
public class EmpresasAdmi extends javax.swing.JFrame {

    /**
     * Creates new form MaterialesAdmi
     */
    int IndiceBuscarE;

    public EmpresasAdmi() {

        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro Empresas");
        setSize(606, 470);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNombremepresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbPaisEmpresa = new javax.swing.JComboBox<>();
        btCrearEmo = new javax.swing.JButton();
        btBuscarEmp = new javax.swing.JButton();
        btEliEmpre = new javax.swing.JButton();
        btModEmp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIDEmpresa = new javax.swing.JTextField();
        btMostrarEmpresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Asignar Pais a esa empresa");

        cmbPaisEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el pais:" }));
        cmbPaisEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbPaisEmpresaFocusGained(evt);
            }
        });

        btCrearEmo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCrearEmo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btCrearEmo.setText("Crear");
        btCrearEmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearEmoActionPerformed(evt);
            }
        });

        btBuscarEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btBuscarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        btBuscarEmp.setText("Buscar");
        btBuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEmpActionPerformed(evt);
            }
        });

        btEliEmpre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEliEmpre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N
        btEliEmpre.setText("Eliminar");
        btEliEmpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliEmpreActionPerformed(evt);
            }
        });

        btModEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btModEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btModEmp.setText("Modificar");
        btModEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModEmpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("COLECCIONISTA DE BILLETES");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Gestionar Empresa Fabricante");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombre Empresa");

        btMostrarEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btMostrarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/binoculares.png"))); // NOI18N
        btMostrarEmpresa.setText("Mostrar");
        btMostrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDEmpresa)
                                    .addComponent(txtNombremepresa)
                                    .addComponent(cmbPaisEmpresa, 0, 160, Short.MAX_VALUE)))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btCrearEmo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscarEmp)
                        .addGap(18, 18, 18)
                        .addComponent(btEliEmpre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btModEmp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btMostrarEmpresa)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombremepresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPaisEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btModEmp)
                    .addComponent(btEliEmpre)
                    .addComponent(btBuscarEmp)
                    .addComponent(btCrearEmo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMostrarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModEmpActionPerformed
        ModificarEmpresa MODEMP = new ModificarEmpresa();
        MODEMP.setVisible(true);
    }//GEN-LAST:event_btModEmpActionPerformed

    private void cmbPaisEmpresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPaisEmpresaFocusGained
        cmbPaisEmpresa.removeAllItems();
        int i = 0;
        while (i < MenuAdmin.Arrpais.getPosAct()) {
            cmbPaisEmpresa.addItem(MenuAdmin.Arrpais.getArrPais()[i].getPais());
            i++;
        }
    }//GEN-LAST:event_cmbPaisEmpresaFocusGained

    private void btCrearEmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearEmoActionPerformed
        Empresa empresa = new Empresa();
        Pais pais = new Pais();
//     
//            
            
            empresa.setPaisEmpresa(pais);
        if (!this.txtNombremepresa.toString().equals("")) {
            empresa.setNombreEmpresa(this.txtNombremepresa.getText().toString());
            empresa.setIDEmpresa(Integer.parseInt(this.txtIDEmpresa.getText()));
            MenuAdmin.ArrEmpresa.insetarEmpresa(empresa);
            JOptionPane.showMessageDialog(null, "Empresa Insertadao");
            this.txtNombremepresa.setText("");
//            this.comMaterialsimp.setSelectedIndex(0);
            this.txtIDEmpresa.setText("");
        }
        
    }//GEN-LAST:event_btCrearEmoActionPerformed

    private void btEliEmpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliEmpreActionPerformed
       String[] NomFab = new String[MenuAdmin.ArrEmpresa.posAct];

        int i = 0;
        while (i < NomFab.length) {
            NomFab[i] = (MenuAdmin.ArrEmpresa.getArrEmp()[i].getNombreEmpresa());
            i++;
        }

        int pos = JOptionPane.showOptionDialog(
                null, "Seleccione la empresa a eliminar",
                "eliminar empresa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, NomFab, NomFab[0]);

       MenuAdmin.ArrEmpresa.eliminarempresa(pos);
    

    }//GEN-LAST:event_btEliEmpreActionPerformed

    private void btBuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEmpActionPerformed
        buscarempresa();
    }//GEN-LAST:event_btBuscarEmpActionPerformed

    private void btMostrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarEmpresaActionPerformed
     
       JOptionPane.showMessageDialog(null,MenuAdmin.ArrEmpresa.listarEmpresas());
    }//GEN-LAST:event_btMostrarEmpresaActionPerformed
public void buscarempresa(){
       String stringIdBuscar = JOptionPane.showInputDialog("DIGITE EL ID DE LA EMPRESA","ID");
        if (stringIdBuscar != null && stringIdBuscar != "") {
            int codBuscar = Integer.parseInt(stringIdBuscar);
            boolean buscar = false;
            for (int i = 0; i < MenuAdmin.ArrEmpresa.posAct; i++) {
                if (MenuAdmin.ArrEmpresa.getArrEmp()[i].getIDEmpresa()== codBuscar) {
                    IndiceBuscarE = i;
                    JOptionPane.showMessageDialog(null, "Si existe");
                    
                    buscar = true;
                    
                } else {
                    if (!buscar) {
                        JOptionPane.showMessageDialog(this, "La empresa no existe", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
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
            java.util.logging.Logger.getLogger(EmpresasAdmi.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresasAdmi.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresasAdmi.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresasAdmi.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpresasAdmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarEmp;
    private javax.swing.JButton btCrearEmo;
    private javax.swing.JButton btEliEmpre;
    private javax.swing.JButton btModEmp;
    private javax.swing.JButton btMostrarEmpresa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbPaisEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtIDEmpresa;
    private javax.swing.JTextField txtNombremepresa;
    // End of variables declaration//GEN-END:variables

}