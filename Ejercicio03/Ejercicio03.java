package com.josaphat.com.ejercicios;

import java.text.DecimalFormat;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Ejercicio03 extends javax.swing.JFrame {
    
    public Ejercicio03() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtComboDos = new javax.swing.JRadioButton();
        rbtComboTres = new javax.swing.JRadioButton();
        rbtOtros = new javax.swing.JRadioButton();
        rbtComboUno = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtRecibido = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtHamburgesa = new javax.swing.JTextField();
        txtPapas = new javax.swing.JTextField();
        txtRefresco = new javax.swing.JTextField();
        txtPizza = new javax.swing.JTextField();
        txtGaseosa = new javax.swing.JTextField();
        txtEnsalada = new javax.swing.JTextField();
        txtYogurt = new javax.swing.JTextField();
        txtAgua = new javax.swing.JTextField();
        lblHamburguesa = new javax.swing.JLabel();
        lblPapas = new javax.swing.JLabel();
        lblRefresco = new javax.swing.JLabel();
        lblPizza = new javax.swing.JLabel();
        lblGaseosa = new javax.swing.JLabel();
        lblEnsalada = new javax.swing.JLabel();
        lblYogurt = new javax.swing.JLabel();
        lblAgua = new javax.swing.JLabel();
        btnCalcularPago = new javax.swing.JButton();
        btnCalcularCambio = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente: Walter Hernandez");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("PIZZERIA SALVADOREÑA");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("COMBOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(rbtComboDos);
        rbtComboDos.setText("Pizza, gaseosa");
        rbtComboDos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtComboDosStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtComboTres);
        rbtComboTres.setText("Ensalada, yogurt y agua");
        rbtComboTres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtComboTresStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtOtros);
        rbtOtros.setText("Otras opciones");
        rbtOtros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtOtrosStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtComboUno);
        rbtComboUno.setText("Hamburgesa, papas, refresco");
        rbtComboUno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtComboUnoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtComboUno)
                    .addComponent(rbtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtComboDos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtComboTres, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rbtComboUno)
                .addGap(18, 18, 18)
                .addComponent(rbtComboDos)
                .addGap(18, 18, 18)
                .addComponent(rbtComboTres)
                .addGap(18, 18, 18)
                .addComponent(rbtOtros)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("PAGOS");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Total: ");

        jLabel5.setText("Recibido: ");

        jLabel6.setText("Cambio: ");

        txtTotal.setEditable(false);
        txtTotal.setEnabled(false);

        txtRecibido.setEditable(false);
        txtRecibido.setEnabled(false);

        txtCambio.setEditable(false);
        txtCambio.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotal)
                    .addComponent(txtRecibido)
                    .addComponent(txtCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("PEDIDOS");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtHamburgesa.setEditable(false);

        txtPapas.setEditable(false);

        txtRefresco.setEditable(false);

        txtPizza.setEditable(false);

        txtGaseosa.setEditable(false);

        txtEnsalada.setEditable(false);

        txtYogurt.setEditable(false);

        txtAgua.setEditable(false);

        lblHamburguesa.setText("Hamburguesa $2.50");

        lblPapas.setText("Papas $0.50");

        lblRefresco.setText("Refresco $0.50");

        lblPizza.setText("Pizza $4.00");

        lblGaseosa.setText("Gaseosa $0.60");

        lblEnsalada.setText("Ensalada $3.00");

        lblYogurt.setText("Yogurt $0.50");

        lblAgua.setText("Agua $0.60");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHamburgesa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPapas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYogurt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblHamburguesa, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(lblPapas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblYogurt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHamburgesa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblHamburguesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPapas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPapas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRefresco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPizza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGaseosa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnsalada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYogurt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYogurt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgua))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnCalcularPago.setText("Calcular Pago");
        btnCalcularPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcularPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPagoActionPerformed(evt);
            }
        });

        btnCalcularCambio.setText("Calcular Cambio");
        btnCalcularCambio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcularCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCambioActionPerformed(evt);
            }
        });

        btnNuevaVenta.setText("Nueva venta");
        btnNuevaVenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcularPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcularCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcularPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcularCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevaVenta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtComboUnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtComboUnoStateChanged
        if(rbtComboUno.isSelected() == true){
            txtHamburgesa.setText("1");
            txtPapas.setText("1");
            txtRefresco.setText("1");
        }else{
            txtHamburgesa.setText("");
            txtPapas.setText("");
            txtRefresco.setText("");
        }
    }//GEN-LAST:event_rbtComboUnoStateChanged

    private void rbtComboDosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtComboDosStateChanged
        if(rbtComboDos.isSelected() == true){
            txtPizza.setText("1");
            txtGaseosa.setText("1");
        }else{
            txtPizza.setText("");
            txtGaseosa.setText("");
        }
    }//GEN-LAST:event_rbtComboDosStateChanged

    private void rbtComboTresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtComboTresStateChanged
        if(rbtComboTres.isSelected() == true){
            txtEnsalada.setText("1");
            txtYogurt.setText("1");
            txtAgua.setText("1");
        }else{
            txtEnsalada.setText("");
            txtYogurt.setText("");
            txtAgua.setText("");
        }
    }//GEN-LAST:event_rbtComboTresStateChanged

    private void rbtOtrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtOtrosStateChanged
        if(rbtOtros.isSelected() == true){
            txtHamburgesa.setEditable(true);
            txtPapas.setEditable(true);
            txtRefresco.setEditable(true);
            txtPizza.setEditable(true);
            txtGaseosa.setEditable(true);
            txtEnsalada.setEditable(true);
            txtYogurt.setEditable(true);
            txtAgua.setEditable(true);
        }else{
            txtHamburgesa.setEditable(false);
            txtPapas.setEditable(false);
            txtRefresco.setEditable(false);
            txtPizza.setEditable(false);
            txtGaseosa.setEditable(false);
            txtEnsalada.setEditable(false);
            txtYogurt.setEditable(false);
            txtAgua.setEditable(false);
        }
    }//GEN-LAST:event_rbtOtrosStateChanged

    private void btnCalcularPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPagoActionPerformed
        DecimalFormat resultado = new DecimalFormat("#######0.00");
        String texto = "";
        Double pago = 0.00d;
        
        texto = txtHamburgesa.getText();
        if(texto.equals("")){
            texto = "0";}
        pago = pago + Double.parseDouble(texto)*2.50;
        
        texto = txtPapas.getText();
        if(texto.equals("")){
            texto = "0";}
        pago = pago + Double.parseDouble(texto)*0.50;
        
        texto = txtRefresco.getText();
        if(texto.equals("")){
            texto = "0";}
        pago = pago + Double.parseDouble(texto)*0.50;
        
        texto = txtPizza.getText();
        if(texto.equals("")){
            texto = "0";}
        pago = pago + Double.parseDouble(texto)*4.00;
        
        texto = txtGaseosa.getText();
        if(texto.equals("")){
            texto = "0";}
        pago = pago + Double.parseDouble(texto)*0.60;
        
        texto = txtEnsalada.getText();
        if(texto.equals("")){
            texto = "0";}
        pago = pago + Double.parseDouble(texto)*3.00;
        
        texto= txtYogurt.getText();
        if(texto.equals("")){
            texto = "0";}
        pago = pago + Double.parseDouble(texto)*0.50;
        
        texto = txtAgua.getText();
        if(texto.equals("")){
            texto = "0";}
        pago = pago + Double.parseDouble(texto)*0.60;
        
        this.txtTotal.setText(resultado.format(pago));
        this.txtRecibido.setEditable(true);
        this.txtRecibido.setEnabled(true);
        this.txtRecibido.requestFocus();
    }//GEN-LAST:event_btnCalcularPagoActionPerformed

    private void btnCalcularCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCambioActionPerformed
        String texto = "";
        Double cobro = 0.00d;
        Double recibido = 0.00d;
        DecimalFormat resultado = new DecimalFormat("########0.00");
        txtCambio.setEnabled(true);
        
        texto = txtTotal.getText();
        if(texto.equals("")){
            texto = "0";}
        cobro = Double.parseDouble(texto);
        
        texto = txtRecibido.getText();
        if(texto.equals("")){
            texto = "0";}
        recibido = Double.parseDouble(texto);
        
        if(recibido >= cobro){
            this.txtCambio.setText(resultado.format(recibido - cobro)); 
        }else{
            JOptionPane optionPane = new JOptionPane("El monto recibido no puede ser menor al total",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error!");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnCalcularCambioActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        //BORRANDO VALORES Y DESABILITANDO RESULTADOS
        this.txtTotal.setText("");
        this.txtTotal.setEditable(false);
        this.txtRecibido.setText("");
        this.txtRecibido.setEditable(false);
        this.txtRecibido.setEnabled(false);
        this.txtCambio.setText("");
        this.txtCambio.setEditable(false);
        this.txtCambio.setEnabled(false);
        
        //BORRANDO VALORES Y DESABILITANDO ETIQUETAS
        this.txtHamburgesa.setText("");
        this.txtHamburgesa.setEditable(false);
        this.txtPapas.setText("");
        this.txtPapas.setEditable(false);
        this.txtRefresco.setText("");
        this.txtRefresco.setEditable(false);
        this.txtPizza.setText("");
        this.txtPizza.setEditable(false);
        this.txtGaseosa.setText("");
        this.txtGaseosa.setEditable(false);
        this.txtEnsalada.setText("");
        this.txtEnsalada.setEditable(false);
        this.txtYogurt.setText("");
        this.txtYogurt.setEditable(false);
        this.txtAgua.setText("");
        this.txtAgua.setEditable(false);
        
        //LIMPIANDO LA SELECCION DEL RADIO BUTTON
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCambio;
    private javax.swing.JButton btnCalcularPago;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblEnsalada;
    private javax.swing.JLabel lblGaseosa;
    private javax.swing.JLabel lblHamburguesa;
    private javax.swing.JLabel lblPapas;
    private javax.swing.JLabel lblPizza;
    private javax.swing.JLabel lblRefresco;
    private javax.swing.JLabel lblYogurt;
    private javax.swing.JRadioButton rbtComboDos;
    private javax.swing.JRadioButton rbtComboTres;
    private javax.swing.JRadioButton rbtComboUno;
    private javax.swing.JRadioButton rbtOtros;
    private javax.swing.JTextField txtAgua;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtEnsalada;
    private javax.swing.JTextField txtGaseosa;
    private javax.swing.JTextField txtHamburgesa;
    private javax.swing.JTextField txtPapas;
    private javax.swing.JTextField txtPizza;
    private javax.swing.JTextField txtRecibido;
    private javax.swing.JTextField txtRefresco;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtYogurt;
    // End of variables declaration//GEN-END:variables
}
