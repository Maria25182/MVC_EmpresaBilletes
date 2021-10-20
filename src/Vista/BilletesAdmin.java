package Vista;

import ModeloArr.Billetes;
import ModeloArr.Empresa;
import ModeloArr.Materiales;
import ModeloArr.Pais;
import java.awt.Color;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class BilletesAdmin extends javax.swing.JFrame {

    Billetes[] ArrBilletes;

//    Billetes bill = new Billetes();
    int indiceBuscar;

    public BilletesAdmin(Billetes[] ArrBilletes) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Registro Billetes");
        setSize(647, 551);
        this.getContentPane().setBackground(Color.WHITE);
        this.ArrBilletes = ArrBilletes;
         try {
            setIconImage(new ImageIcon(getClass().getResource("../imagenes/notas.png")).getImage());
        } catch (Exception ex) {
        }
   
        
        MenuAdmin.Arrmateriales.cargarMateriales();
        MenuAdmin.ArrEmpresa.CargarEmp(MenuAdmin.Arrpais);
        this.cargarpaisempres();

  
        /**
         * abrimos el archivo seleccionado
         */

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoUnidad = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAlto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtAncho = new javax.swing.JTextField();
        cmbPais = new javax.swing.JComboBox<>();
        cmbEmpresa = new javax.swing.JComboBox<>();
        cmbMaterial = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtDenominacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDolar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCaract1 = new javax.swing.JTextField();
        txtCaract2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        radioCentimetros = new javax.swing.JRadioButton();
        radioPulgadas = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtElementSeguri = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAnioEdicion = new javax.swing.JTextField();
        txtBanco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbPaisEmpresa = new javax.swing.JComboBox<>();
        bttImagen1 = new javax.swing.JButton();
        btImagen2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Medida alto billete: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COLECCIONISTA DE BILLETES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gestionar Billetes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));
        getContentPane().add(txtAlto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Código Billete:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Medida ancho billete: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, -1));
        getContentPane().add(txtAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 60, -1));

        cmbPais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pais:" }));
        cmbPais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbPaisFocusGained(evt);
            }
        });
        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, -1));

        cmbEmpresa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la Empresa:", " " }));
        cmbEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbEmpresaFocusGained(evt);
            }
        });
        cmbEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbEmpresaMouseClicked(evt);
            }
        });
        getContentPane().add(cmbEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, 30));

        cmbMaterial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione material: ", " ", " " }));
        cmbMaterial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbMaterialFocusGained(evt);
            }
        });
        getContentPane().add(cmbMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Valor Denominación: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 130, 20));
        getContentPane().add(txtDenominacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Valor Dolar: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, -1));
        getContentPane().add(txtDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Caracateristicas Lado 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 130, 20));
        getContentPane().add(txtCaract1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 160, -1));
        getContentPane().add(txtCaract2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Caracateristicas Lado 1:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 130, 20));

        grupoUnidad.add(radioCentimetros);
        radioCentimetros.setText("Centimetros");
        getContentPane().add(radioCentimetros, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        grupoUnidad.add(radioPulgadas);
        radioPulgadas.setText("Pulgadas");
        getContentPane().add(radioPulgadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 130, 40));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 130, 30));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 130, 30));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Elementos de seguridad: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 140, -1));
        getContentPane().add(txtElementSeguri, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 60, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Año de Edición:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 120, -1));
        getContentPane().add(txtAnioEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 60, -1));
        getContentPane().add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 160, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Banco Emisor");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        cbPaisEmpresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbPaisEmpresaFocusGained(evt);
            }
        });
        cbPaisEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaisEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(cbPaisEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 140, 30));

        bttImagen1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen.png"))); // NOI18N
        bttImagen1.setText("Imagen Lado 1");
        bttImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttImagen1ActionPerformed(evt);
            }
        });
        getContentPane().add(bttImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        btImagen2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen.png"))); // NOI18N
        btImagen2.setText("Imagen Lado 2");
        btImagen2.setToolTipText("");
        btImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImagen2ActionPerformed(evt);
            }
        });
        getContentPane().add(btImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarDatos();

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        String[] NomEp = new String[MenuAdmin.Arrbillete.posAct];

        int i = 0;
        while (i < NomEp.length) {
            NomEp[i] = (MenuAdmin.Arrbillete.getArrBilletes()[i].getValorDenominacion());
            i++;

        }
        int pos = JOptionPane.showOptionDialog(
                null, "SELECCIONE EL BILLETE A ELIMINAR",
                "eliminar billete",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, NomEp, NomEp[0]);

        MenuAdmin.Arrbillete.eliminar(pos);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbPaisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPaisFocusGained
        cmbPais.removeAllItems();
        int i = 0;
        while (i < MenuAdmin.Arrpais.getPosAct()) {
            cmbPais.addItem(MenuAdmin.Arrpais.getArrPais()[i].getPais());
            i++;
        }
    }//GEN-LAST:event_cmbPaisFocusGained

    private void cmbMaterialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMaterialFocusGained
        cmbMaterial.removeAllItems();
        int i = 0;
        while (i < MenuAdmin.Arrmateriales.getPosAct()) {
            cmbMaterial.addItem(MenuAdmin.Arrmateriales.getArrMateriales()[i].getNombreMaterial());
            i++;
        }
    }//GEN-LAST:event_cmbMaterialFocusGained

    private void cmbEmpresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEmpresaFocusGained
        cmbEmpresa.removeAllItems();
        int i = 0;
        while (i < MenuAdmin.ArrEmpresa.getPosAct()) {
            cmbEmpresa.addItem(MenuAdmin.ArrEmpresa.getArrEmp()[i].getNombreEmpresa());
         
            i++;

        }
    }//GEN-LAST:event_cmbEmpresaFocusGained

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEmpresaMouseClicked

//        int posEmp = MenuAdmin.ArrEmpresa.buscaremp(cmbEmpresa.getSelectedItem().toString());
//        if (posEmp != -1) {
//            txtPaisEmpFab.setText(MenuAdmin.ArrEmpresa.getArrEmp()[posEmp].getPaisEmpresa().getPais());
//        }
    }//GEN-LAST:event_cmbEmpresaMouseClicked

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaisActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        ModificarBillete Mod = new ModificarBillete();
        Mod.setVisible(true);

    }//GEN-LAST:event_btnEditarMouseClicked

    private void cbPaisEmpresaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbPaisEmpresaFocusGained
        
        
    }//GEN-LAST:event_cbPaisEmpresaFocusGained

    private void cbPaisEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaisEmpresaActionPerformed

    }//GEN-LAST:event_cbPaisEmpresaActionPerformed

    private void bttImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttImagen1ActionPerformed
             
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(null);
        MenuAdmin.Arrbillete.setImg1(file.getSelectedFile().getPath());
    }//GEN-LAST:event_bttImagen1ActionPerformed

    private void btImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImagen2ActionPerformed
              
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(null);
        MenuAdmin.Arrbillete.setImg2(file.getSelectedFile().getPath());
    }//GEN-LAST:event_btImagen2ActionPerformed
//
    public void cargarpaisempres() {
        cbPaisEmpresa.removeAllItems();
        for (Empresa arrEmp : MenuAdmin.ArrEmpresa.getArrEmp()) {
            if (arrEmp == null) {
                continue;
            }
            Pais paisEmpresa = arrEmp.getPaisEmpresa();
            if (paisEmpresa == null) {
                continue;
            }
            cbPaisEmpresa.addItem(paisEmpresa.getPais());
        }
    }

    public void guardarDatos() {//No permita que se continue si no se llenan todos los campos
        String pais1 = cmbPais.getSelectedItem().toString();
        if (txtCodigo.getText().equals("") || txtAncho.getText().equals("") || txtAlto.getText().equals("") || cmbPais.getSelectedItem().toString().equals("")
                || cmbMaterial.getSelectedItem().toString().equals("") || cmbEmpresa.getSelectedItem().toString().equals("") || txtBanco.getText().equals("") || txtDenominacion.getText().equals("")
                || txtDolar.getText().equals("") || txtCaract1.getText().equals("") || txtCaract2.getText().equals("") || txtElementSeguri.getText().equals("") || txtAnioEdicion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS SON OBLIGATORIOS", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int codigo = Integer.parseInt(txtCodigo.getText());
            String unidad = "";
            if (radioCentimetros.isSelected())//Los botones radio de punticos
            {
                unidad = "Centimetros";
            } else if (radioPulgadas.isSelected()) {
                unidad = "Pulgadas";
            }
            double ancho = Double.parseDouble(txtAncho.getText());
            double alto = Double.parseDouble(txtAlto.getText());

            Pais pai = new Pais();
            int indicePais = cmbPais.getSelectedIndex();// seleccione del combo
            String pais = cmbPais.getItemAt(indicePais);//lo ponga en el combo
            pai = MenuAdmin.Arrpais.getArrPais()[indicePais];

            Materiales materi = new Materiales();
            int indiceMaterial = cmbMaterial.getSelectedIndex();
            String material = cmbMaterial.getItemAt(indiceMaterial);
            materi.setNombreMaterial(material);

            Empresa empres = new Empresa();
            int indiceEmpresa = cmbEmpresa.getSelectedIndex();
            String empresa = cmbEmpresa.getItemAt(indiceEmpresa);
            empres= MenuAdmin.ArrEmpresa.getArrEmp()[indiceEmpresa];

//            Banco banc = new Banco();
//            int indiceBanco = cmbBanco.getSelectedIndex();
//            String banco = cmbBanco.getItemAt(indiceBanco);
//            banc.setNombreBanco(banco);
            String banco = txtBanco.getText();
            String denominacion = txtDenominacion.getText();
            double dolar = Double.parseDouble(txtDolar.getText());
            String caract1 = txtCaract1.getText();
            String caract2 = txtCaract2.getText();
            int anio = Integer.parseInt(txtAnioEdicion.getText());
            String elemSeguri = txtElementSeguri.getText();
            String imagen1 = bttImagen1.getText();
            String imagen2 = btImagen2.getText();
            

            Billetes billetClass = new Billetes(codigo, ancho, alto, unidad, materi, empres, banco, caract1, caract2, pai, denominacion, dolar, anio, elemSeguri,imagen1,imagen2);

            MenuAdmin.Arrbillete.insertarBilletes(billetClass);
            limpiarDatos();
            JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO!", "Información", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "INFORMACIÓN"
                    + "\nCódigo: " + codigo
                    + "\nAncho: " + ancho
                    + "\nAlto: " + alto
                    + "\nUnidad de Medida: " + unidad
                    + "\nMateria: " + materi
                    + "\nFabricante: " + empres
                    + "\nBanco Emisor: " + banco
                    + "\nCaracteristica Lado 1: " + caract1
                    + "\nCaracteristica Lado 2: " + caract2
                    + "\nPais: " + pai
                    + "\nDenominación: " + denominacion
                    + "\nValor en Dolar: " + dolar + " dolares"
                    + "\nAño de Edición: " + anio
                    + "\nElementos de Seguridad: " + elemSeguri);
        }

    }

    public void limpiarDatos() {//Para que al momento de guaradar me quede vacio de nuevo los campos
        txtCodigo.setText("");
        grupoUnidad.clearSelection();
        txtAncho.setText("");
        txtAlto.setText("");
        cmbPais.setSelectedIndex(0);
        cmbMaterial.setSelectedIndex(0);
        cmbEmpresa.setSelectedIndex(0);
        txtBanco.setText("");
        txtDenominacion.setText("");
        txtDolar.setText("");
        txtCaract1.setText("");
        txtCaract2.setText("");
        txtAnioEdicion.setText("");
        txtElementSeguri.setText("");

    }

    public void buscarDatos() {
        String stringIdBuscar = JOptionPane.showInputDialog("DIGITE EL CÓDIGO DEL BILLETE");
        if (stringIdBuscar != null && stringIdBuscar != "") {
            int codBuscar = Integer.parseInt(stringIdBuscar);
            boolean buscar = false;
            for (int i = 0; i < MenuAdmin.Arrbillete.posAct; i++) {
                if (MenuAdmin.Arrbillete.getArrBilletes()[i].getCodigoBillete() == codBuscar) {
                    indiceBuscar = i;
                    mostrarDatos();
                    buscar = true;

                } else {
                    if (!buscar) {
                        JOptionPane.showMessageDialog(this, "El billete no existe", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        }

    }

    public void mostrarDatos() {

        JOptionPane.showMessageDialog(this, "INFORMACIÓN"
                + "\nNúmero Billete: " + (indiceBuscar + 1)
                + "\nCódigo: " + ArrBilletes[indiceBuscar].getCodigoBillete()
                + "\nAncho: " + ArrBilletes[indiceBuscar].getAncho()
                + "\nAlto: " + ArrBilletes[indiceBuscar].getAlto()
                + "\nUnidad de Medida: " + ArrBilletes[indiceBuscar].getUnidadMedida()
                + "\nMateria: " + ArrBilletes[indiceBuscar].getMaterial()
                + "\nFabricante: " + ArrBilletes[indiceBuscar].getFabricante()
                + "\nBanco Emisor: " + ArrBilletes[indiceBuscar].getBanco()
                + "\nCaracteristica Lado 1: " + ArrBilletes[indiceBuscar].getCaractLado1()
                + "\nCaracteristica Lado 2: " + ArrBilletes[indiceBuscar].getCaractLado2()
                + "\nPais: " + ArrBilletes[indiceBuscar].getPais()
                + "\nDenominación: " + ArrBilletes[indiceBuscar].getValorDenominacion()
                + "\nValor en Dolar: " + ArrBilletes[indiceBuscar].getValorDolar() + " dolares"
                + "\nAño de Edición: " + ArrBilletes[indiceBuscar].getAnioEdicion()
                + "\nElementos de Seguridad: " + ArrBilletes[indiceBuscar].getElementosSeg());
    }

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
            java.util.logging.Logger.getLogger(BilletesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BilletesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BilletesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BilletesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btImagen2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton bttImagen1;
    private javax.swing.JComboBox<String> cbPaisEmpresa;
    private javax.swing.JComboBox<String> cmbEmpresa;
    private javax.swing.JComboBox<String> cmbMaterial;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.ButtonGroup grupoUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton radioCentimetros;
    private javax.swing.JRadioButton radioPulgadas;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtAnioEdicion;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCaract1;
    private javax.swing.JTextField txtCaract2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDenominacion;
    private javax.swing.JTextField txtDolar;
    private javax.swing.JTextField txtElementSeguri;
    // End of variables declaration//GEN-END:variables
}
