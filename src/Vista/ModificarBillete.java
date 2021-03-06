/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ModeloArr.Billetes;
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
public class ModificarBillete extends javax.swing.JFrame {

    /**
     * Creates new form ModificarBillete
     */
    public ModificarBillete() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Modificar Billete");
        setSize(733, 624);
        this.getContentPane().setBackground(Color.lightGray);
        MenuAdmin.Arrpais.asignarPaises();
        this.cargarMateriales();
        this.cargarBilletes();
         try {
            setIconImage(new ImageIcon(getClass().getResource("../imagenes/notas.png")).getImage());
        } catch (Exception ex) {
        }
   
       

//        this.cargarempresa();
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
        colemdo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCentimetrosN = new javax.swing.JRadioButton();
        radioPulgadasN = new javax.swing.JRadioButton();
        MedidaAnchNuevo = new javax.swing.JTextField();
        MedidaAltoNuevo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbPaisNuevo = new javax.swing.JComboBox<>();
        CmbMaterialNuevo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CmbEmpresaNueva = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBancoEmisorNuevo = new javax.swing.JTextField();
        txtValorDenNuevo = new javax.swing.JTextField();
        txtValorDNuevo = new javax.swing.JTextField();
        txtCarac2Nuevo = new javax.swing.JTextField();
        txtCarac1Nuevo = new javax.swing.JTextField();
        txtPaisEmpresaNuevo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtA??oNuevo = new javax.swing.JTextField();
        txtSeguridadNuevo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbCodigo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Codigo Billete");

        colemdo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        colemdo.setText("COLECCIONISTA DE BILLETES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Modificar Billetes");

        radioCentimetrosN.setText("Centimetros");

        radioPulgadasN.setText("Pulgadas");

        MedidaAnchNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedidaAnchNuevoActionPerformed(evt);
            }
        });

        MedidaAltoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedidaAltoNuevoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Medida Ancho Billete");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Medida Alto Billete");

        cmbPaisNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Pais:" }));
        cmbPaisNuevo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbPaisNuevoFocusGained(evt);
            }
        });

        CmbMaterialNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccion Material:" }));
        CmbMaterialNuevo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CmbMaterialNuevoFocusGained(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("Seleccione Pais");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Seleccione Material");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setText("Seleccione Empresa");

        CmbEmpresaNueva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Empresa:" }));
        CmbEmpresaNueva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CmbEmpresaNuevaFocusGained(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setText("Banco Emisor");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setText("Valor Denominacion");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("Valor Dolar ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel11.setText("Caracteristicas lado 1");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel12.setText("Caracteristicas Lado 2");

        txtBancoEmisorNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancoEmisorNuevoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel13.setText("A??o Edicion");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel14.setText("Elementos Seguridad");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbCodigo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCodigoItemStateChanged(evt);
            }
        });
        cbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(colemdo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioCentimetrosN)
                            .addComponent(radioPulgadasN))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(MedidaAnchNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                .addComponent(MedidaAltoNuevo)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(48, 48, 48)
                            .addComponent(CmbEmpresaNueva, 0, 169, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbPaisNuevo, 0, 169, Short.MAX_VALUE)
                                .addComponent(CmbMaterialNuevo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtValorDNuevo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txtValorDenNuevo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txtBancoEmisorNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtA??oNuevo)
                            .addComponent(txtSeguridadNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCarac2Nuevo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCarac1Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txtPaisEmpresaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colemdo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioCentimetrosN)
                            .addComponent(MedidaAnchNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioPulgadasN)
                                .addComponent(jLabel4))
                            .addComponent(MedidaAltoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPaisNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(txtA??oNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmbMaterialNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(txtSeguridadNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CmbEmpresaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaisEmpresaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtBancoEmisorNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtValorDenNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtCarac1Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtCarac2Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtValorDNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jButton1))
                    .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void MedidaAnchNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedidaAnchNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedidaAnchNuevoActionPerformed

    private void MedidaAltoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedidaAltoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedidaAltoNuevoActionPerformed

    private void txtBancoEmisorNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoEmisorNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBancoEmisorNuevoActionPerformed

    private void CmbMaterialNuevoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CmbMaterialNuevoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbMaterialNuevoFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int indicebillete = MenuAdmin.Arrbillete.getIndexBillete(
                Integer.parseInt(cbCodigo.getItemAt(cbCodigo.getSelectedIndex())));

        Billetes billeteEdit = MenuAdmin.Arrbillete.getArrBilletes()[indicebillete];
        //modificar atributos por los nuevos

        //capturar valores y hacer las validaciones
        double ancho = Double.parseDouble(MedidaAnchNuevo.getText());
        double alto = Double.parseDouble(MedidaAltoNuevo.getText());
        String banco = txtBancoEmisorNuevo.getText();
        String denominacion = txtValorDenNuevo.getText();
        double dolar = Double.parseDouble(txtValorDNuevo.getText());
        String caract1 = txtCarac1Nuevo.getText();
        String caract2 = txtCarac2Nuevo.getText();
        int anio = Integer.parseInt(txtA??oNuevo.getText());
        String elemSeguri = txtSeguridadNuevo.getText();

        Materiales materi = new Materiales();
        int indiceMaterial = CmbMaterialNuevo.getSelectedIndex();
        String material = CmbMaterialNuevo.getItemAt(indiceMaterial);
        materi.setNombreMaterial(material);

        Empresa empre = new Empresa();
        int indiceEmpresa = CmbEmpresaNueva.getSelectedIndex();
        String empresa = CmbEmpresaNueva.getItemAt(indiceMaterial);
        empre.setNombreEmpresa(empresa);

        Pais pais = new Pais();
        int IndicePais = cmbPaisNuevo.getSelectedIndex();
        String Pais = cmbPaisNuevo.getItemAt(IndicePais);
        pais.setPais(Pais);

        //asignar nuevos valores al objeto
        billeteEdit.setAncho(ancho);
        billeteEdit.setAlto(alto);
        billeteEdit.setBanco(banco);
        billeteEdit.setValorDolar(dolar);
        billeteEdit.setCaractLado1(caract1);
        billeteEdit.setCaractLado2(caract2);
        billeteEdit.setAnioEdicion(anio);
        billeteEdit.setElementosSeg(elemSeguri);
        billeteEdit.setMaterial(materi);
        billeteEdit.setFabricante(empre);
        billeteEdit.setPais(pais);

        //modifico el array para que quede editado
        MenuAdmin.Arrbillete.getArrBilletes()[indicebillete] = billeteEdit;
        JOptionPane.showMessageDialog(null, "modificacion exitosa");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbPaisNuevoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPaisNuevoFocusGained
        cmbPaisNuevo.removeAllItems();
        int i = 0;
        while (i < MenuAdmin.Arrpais.getPosAct()) {
            cmbPaisNuevo.addItem(MenuAdmin.Arrpais.getArrPais()[i].getPais());
            i++;

    }//GEN-LAST:event_cmbPaisNuevoFocusGained

    }
    private void CmbEmpresaNuevaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CmbEmpresaNuevaFocusGained
        CmbEmpresaNueva.removeAllItems();
        int i = 0;
        while (i < MenuAdmin.ArrEmpresa.getPosAct()) {
            CmbEmpresaNueva.addItem(MenuAdmin.ArrEmpresa.getArrEmp()[i].getNombreEmpresa());
            i++;
}
    }//GEN-LAST:event_CmbEmpresaNuevaFocusGained

    private void cbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCodigoActionPerformed

    private void cbCodigoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCodigoItemStateChanged
  String elemento = cbCodigo.getItemAt(cbCodigo.getSelectedIndex());
        if (elemento.indexOf("Seleccione") != -1) {
            return;
        }

        //cargar los datos del formulario
        Billetes billete = MenuAdmin.Arrbillete.buscarBillete(Integer.parseInt(elemento));

        if (billete.getUnidadMedida().equals("Centimetros")) {
            radioCentimetrosN.setSelected(true);
            radioPulgadasN.setSelected(false);
        } else {
            radioPulgadasN.setSelected(true);
            radioCentimetrosN.setSelected(false);
        }

        MedidaAnchNuevo.setText("" + billete.getMedidaLado1());
        MedidaAltoNuevo.setText("" + billete.getMedidaLado2());
        txtA??oNuevo.setText("" + billete.getAnioEdicion());
        txtBancoEmisorNuevo.setText(billete.getBanco());
        txtCarac1Nuevo.setText(billete.getCaractLado1());
        txtCarac2Nuevo.setText(billete.getCaractLado2());
        txtSeguridadNuevo.setText(billete.getElementosSeg());
        txtValorDNuevo.setText("" + billete.getValorDolar());
        txtValorDenNuevo.setText(billete.getValorDenominacion());
        CmbMaterialNuevo.setSelectedItem(billete.getMaterial());
        CmbEmpresaNueva.setSelectedItem(billete.getFabricante());
        cmbPaisNuevo.setSelectedItem(billete.getFabricante());
        txtPaisEmpresaNuevo.setText(billete.getPais().getPais());
    }//GEN-LAST:event_cbCodigoItemStateChanged
//
//    }

    private void cargarMateriales() {
        CmbMaterialNuevo.removeAllItems();
        int i = 0;
        while (i < MenuAdmin.Arrmateriales.getPosAct()) {
            CmbMaterialNuevo.addItem(MenuAdmin.Arrmateriales.getArrMateriales()[i].getNombreMaterial());
            i++;
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
            java.util.logging.Logger.getLogger(ModificarBillete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarBillete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarBillete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarBillete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarBillete().setVisible(true);
                //cargar billetes existentes
            }
        });
    }

    private void cargarBilletes() {
        cbCodigo.removeAllItems();
        int i = 0;
        cbCodigo.addItem("Seleccione un codigo de la lista");
        while (i < MenuAdmin.Arrbillete.getPosAct()) {
            cbCodigo.addItem("" + MenuAdmin.Arrbillete.getArrBilletes()[i].getCodigoBillete());
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbEmpresaNueva;
    private javax.swing.JComboBox<String> CmbMaterialNuevo;
    private javax.swing.JTextField MedidaAltoNuevo;
    private javax.swing.JTextField MedidaAnchNuevo;
    private javax.swing.JComboBox<String> cbCodigo;
    private javax.swing.JComboBox<String> cmbPaisNuevo;
    private javax.swing.JLabel colemdo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radioCentimetrosN;
    private javax.swing.JRadioButton radioPulgadasN;
    private javax.swing.JTextField txtA??oNuevo;
    private javax.swing.JTextField txtBancoEmisorNuevo;
    private javax.swing.JTextField txtCarac1Nuevo;
    private javax.swing.JTextField txtCarac2Nuevo;
    private javax.swing.JTextField txtPaisEmpresaNuevo;
    private javax.swing.JTextField txtSeguridadNuevo;
    private javax.swing.JTextField txtValorDNuevo;
    private javax.swing.JTextField txtValorDenNuevo;
    // End of variables declaration//GEN-END:variables
}
