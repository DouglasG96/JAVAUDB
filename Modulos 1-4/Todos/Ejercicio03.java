/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josaphat.com.ejercicios;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.text.DecimalFormat;

public class Ejercicio03 extends javax.swing.JFrame {

    /**
     * Creates new form GuiaEjercicio003
     */
    public Ejercicio03() {
        initComponents();        
        DeshabilitaCamposPago(); 
        DeshabilitaCamposPedido();        
    }
//
    public void DeshabilitaCamposPago() {
        this.txtPagoTotal.setEditable(false); 
        this.txtPagoTotal.setEnabled(false); 
        this.txtPagoRecibido.setEditable(false); 
        this.txtPagoRecibido.setEnabled(false); 
        this.txtPagoCambio.setEditable(false); 
        this.txtPagoCambio.setEnabled(false);        
    }

    public void DeshabilitaCamposPedido() {
        this.txtPedidoHamburguesa.setEditable(false); 
        this.txtPedidoHamburguesa.setEnabled(false); 
        this.txtPedidoPapa.setEditable(false); 
        this.txtPedidoPapa.setEnabled(false);   
        this.txtPedidoRefresco.setEditable(false); 
        this.txtPedidoRefresco.setEnabled(false); 
        this.txtPedidoPizza.setEditable(false); 
        this.txtPedidoPizza.setEnabled(false);         
        this.txtPedidoGaseosa.setEditable(false); 
        this.txtPedidoGaseosa.setEnabled(false); 
        this.txtPedidoEnsalada.setEditable(false); 
        this.txtPedidoEnsalada.setEnabled(false);        
        this.txtPedidoYogurt.setEditable(false); 
        this.txtPedidoYogurt.setEnabled(false); 
        this.txtPedidoAgua.setEditable(false); 
        this.txtPedidoAgua.setEnabled(false);        
    }   
    
    public void HabilitaCamposPedido() {
        this.txtPedidoHamburguesa.setEditable(true); 
        this.txtPedidoHamburguesa.setEnabled(true); 
        this.txtPedidoPapa.setEditable(true); 
        this.txtPedidoPapa.setEnabled(true);   
        this.txtPedidoRefresco.setEditable(true); 
        this.txtPedidoRefresco.setEnabled(true); 
        this.txtPedidoPizza.setEditable(true); 
        this.txtPedidoPizza.setEnabled(true);         
        this.txtPedidoGaseosa.setEditable(true); 
        this.txtPedidoGaseosa.setEnabled(true); 
        this.txtPedidoEnsalada.setEditable(true); 
        this.txtPedidoEnsalada.setEnabled(true);        
        this.txtPedidoYogurt.setEditable(true); 
        this.txtPedidoYogurt.setEnabled(true); 
        this.txtPedidoAgua.setEditable(true); 
        this.txtPedidoAgua.setEnabled(true);        
    }    
//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbxComboHanburguesa = new javax.swing.JRadioButton();
        cbxComboPizza = new javax.swing.JRadioButton();
        cbxComboEnsalada = new javax.swing.JRadioButton();
        cbxComboOtro = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        txtPedidoHamburguesa = new javax.swing.JTextField();
        txtPedidoPapa = new javax.swing.JTextField();
        txtPedidoRefresco = new javax.swing.JTextField();
        txtPedidoPizza = new javax.swing.JTextField();
        txtPedidoGaseosa = new javax.swing.JTextField();
        txtPedidoEnsalada = new javax.swing.JTextField();
        txtPedidoYogurt = new javax.swing.JTextField();
        txtPedidoAgua = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPagoTotal = new javax.swing.JTextField();
        txtPagoRecibido = new javax.swing.JTextField();
        txtPagoCambio = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnCalcularPago = new javax.swing.JButton();
        btnCalcularCambio = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Combos"));

        buttonGroup1.add(cbxComboHanburguesa);
        cbxComboHanburguesa.setText("Hamburguesa, Papa y Refresco");
        cbxComboHanburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComboHanburguesaActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbxComboPizza);
        cbxComboPizza.setText("Pizza y Gaseosa");
        cbxComboPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComboPizzaActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbxComboEnsalada);
        cbxComboEnsalada.setText("Ensalada, Yogurt y Agua");
        cbxComboEnsalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComboEnsaladaActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbxComboOtro);
        cbxComboOtro.setText("Otras Opciones");
        cbxComboOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComboOtroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxComboOtro)
                    .addComponent(cbxComboEnsalada)
                    .addComponent(cbxComboPizza)
                    .addComponent(cbxComboHanburguesa))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cbxComboHanburguesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxComboPizza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxComboEnsalada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxComboOtro)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos"));

        txtPedidoHamburguesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoHamburguesaKeyTyped(evt);
            }
        });

        txtPedidoPapa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoPapaKeyTyped(evt);
            }
        });

        txtPedidoRefresco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoRefrescoKeyTyped(evt);
            }
        });

        txtPedidoPizza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoPizzaKeyTyped(evt);
            }
        });

        txtPedidoGaseosa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoGaseosaKeyTyped(evt);
            }
        });

        txtPedidoEnsalada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoEnsaladaKeyTyped(evt);
            }
        });

        txtPedidoYogurt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoYogurtKeyTyped(evt);
            }
        });

        txtPedidoAgua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoAguaKeyTyped(evt);
            }
        });

        jLabel1.setText("Hamburguesa $2.50");

        jLabel2.setText("Papas $0.50");

        jLabel3.setText("Refresco $0.50");

        jLabel4.setText("Pizza $4.00");

        jLabel5.setText("Gaseosa $0.60");

        jLabel6.setText("Ensalada $3.00");

        jLabel7.setText("Yogurt 0.50");

        jLabel8.setText("Agua $0.60");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPedidoHamburguesa)
                    .addComponent(txtPedidoPapa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPedidoRefresco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPedidoPizza, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPedidoGaseosa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPedidoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPedidoYogurt)
                    .addComponent(txtPedidoEnsalada))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedidoHamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedidoPapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedidoRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedidoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedidoGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedidoEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedidoYogurt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedidoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagos"));

        jLabel9.setText("Recibido");

        jLabel10.setText("Cambio");

        jLabel11.setText("Total");

        txtPagoCambio.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPagoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(txtPagoRecibido)
                    .addComponent(txtPagoCambio))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtPagoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtPagoRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtPagoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnCalcularPago.setText("Calcular Pago");
        btnCalcularPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPagoActionPerformed(evt);
            }
        });

        btnCalcularCambio.setText("Calcular Cambio");
        btnCalcularCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCambioActionPerformed(evt);
            }
        });

        btnNuevaVenta.setText("Nueva Venta");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcularCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcularPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalcularPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcularCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevaVenta)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel13.setText("Pizzeria Salvador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPedidoHamburguesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoHamburguesaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume(); 
        }        
    }//GEN-LAST:event_txtPedidoHamburguesaKeyTyped

    private void txtPedidoPapaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoPapaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume(); 
        }        
    }//GEN-LAST:event_txtPedidoPapaKeyTyped

    private void txtPedidoRefrescoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoRefrescoKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume(); 
        }        
    }//GEN-LAST:event_txtPedidoRefrescoKeyTyped

    private void txtPedidoPizzaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoPizzaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume(); 
        }        
    }//GEN-LAST:event_txtPedidoPizzaKeyTyped

    private void txtPedidoGaseosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoGaseosaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume(); 
        }        
    }//GEN-LAST:event_txtPedidoGaseosaKeyTyped

    private void txtPedidoEnsaladaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoEnsaladaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume(); 
        }        
    }//GEN-LAST:event_txtPedidoEnsaladaKeyTyped

    private void txtPedidoYogurtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoYogurtKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume(); 
        }        
    }//GEN-LAST:event_txtPedidoYogurtKeyTyped

    private void txtPedidoAguaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoAguaKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume(); 
        }        
    }//GEN-LAST:event_txtPedidoAguaKeyTyped

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        // TODO add your handling code here:
        
        this.txtPagoTotal.setText("");
        this.txtPagoRecibido.setText("");
        this.txtPagoCambio.setText("");
        DeshabilitaCamposPago(); 

        this.txtPedidoHamburguesa.setText("");
        this.txtPedidoPapa.setText("");        
        this.txtPedidoRefresco.setText(""); 
        this.txtPedidoPizza.setText("");
        this.txtPedidoGaseosa.setText(""); 
        this.txtPedidoEnsalada.setText("");  
        this.txtPedidoYogurt.setText(""); 
        this.txtPedidoAgua.setText("");
        DeshabilitaCamposPedido();        
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void cbxComboHanburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComboHanburguesaActionPerformed
        // TODO add your handling code here:
        String text = "";
        Integer cantidad = 0;
        
        text = txtPedidoHamburguesa.getText();
        if (text.equals("")) {text = "0"; } 
        cantidad = Integer.parseInt (text)+1;
        this.txtPedidoHamburguesa.setText(cantidad.toString());        
        
        text = txtPedidoPapa.getText();
        if (text.equals("")) {text = "0"; } 
        cantidad = Integer.parseInt (text)+1;
        this.txtPedidoPapa.setText(cantidad.toString());  
        
        text = txtPedidoRefresco.getText();
        if (text.equals("")) {text = "0"; } 
        cantidad = Integer.parseInt (text)+1;
        this.txtPedidoRefresco.setText(cantidad.toString());         
    }//GEN-LAST:event_cbxComboHanburguesaActionPerformed

    private void cbxComboPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComboPizzaActionPerformed
        // TODO add your handling code here:
        String text = "";
        Integer cantidad = 0;     
        
        text = txtPedidoPizza.getText();
        if (text.equals("")) {text = "0"; } 
        cantidad = Integer.parseInt (text)+1;
        this.txtPedidoPizza.setText(cantidad.toString()); 

        text = txtPedidoGaseosa.getText();
        if (text.equals("")) {text = "0"; } 
        cantidad = Integer.parseInt (text)+1;
        this.txtPedidoGaseosa.setText(cantidad.toString());         
    }//GEN-LAST:event_cbxComboPizzaActionPerformed

    private void cbxComboEnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComboEnsaladaActionPerformed
        // TODO add your handling code here:
        String text = "";
        Integer cantidad = 0;     
        
        text = txtPedidoEnsalada.getText();
        if (text.equals("")) {text = "0"; } 
        cantidad = Integer.parseInt (text)+1;
        this.txtPedidoEnsalada.setText(cantidad.toString());    
        
        text = txtPedidoYogurt.getText();
        if (text.equals("")) {text = "0"; } 
        cantidad = Integer.parseInt (text)+1;
        this.txtPedidoYogurt.setText(cantidad.toString()); 
        
        text = txtPedidoAgua.getText();
        if (text.equals("")) {text = "0"; } 
        cantidad = Integer.parseInt (text)+1;
        this.txtPedidoAgua.setText(cantidad.toString());         
        
    }//GEN-LAST:event_cbxComboEnsaladaActionPerformed

    private void cbxComboOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComboOtroActionPerformed
        // TODO add your handling code here:
        HabilitaCamposPedido();
        btnCalcularPago.requestFocus();       
    }//GEN-LAST:event_cbxComboOtroActionPerformed

    private void btnCalcularPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPagoActionPerformed
        // TODO add your handling code here:
        String text = "";
        Double aPagar = 0.00d;
        DecimalFormat resultado = new DecimalFormat("########0.00");
        
        text = txtPedidoHamburguesa.getText();
        if (text.equals("")) {text = "0"; } 
        aPagar = Double.parseDouble (text)*2.5;  

        text = txtPedidoPapa.getText();
        if (text.equals("")) {text = "0"; } 
        aPagar = aPagar + Double.parseDouble (text)*0.50;         

        text = txtPedidoRefresco.getText();
        if (text.equals("")) {text = "0"; } 
        aPagar = aPagar + Double.parseDouble (text)*0.50;  

        text = txtPedidoPizza.getText();
        if (text.equals("")) {text = "0"; } 
        aPagar = aPagar + Double.parseDouble (text)*4.00;  

        text = txtPedidoGaseosa.getText();
        if (text.equals("")) {text = "0"; } 
        aPagar = aPagar + Double.parseDouble (text)*0.60;          

        text = txtPedidoEnsalada.getText();
        if (text.equals("")) {text = "0"; } 
        aPagar = aPagar + Double.parseDouble (text)*3.00;  

        text = txtPedidoYogurt.getText();
        if (text.equals("")) {text = "0"; } 
        aPagar = aPagar + Double.parseDouble (text)*0.50;  
        
        text = txtPedidoAgua.getText();
        if (text.equals("")) {text = "0"; } 
        aPagar = aPagar + Double.parseDouble (text)*0.60;          
        
        if (aPagar==0) {
            JOptionPane optionPane = new JOptionPane("No ha realizado ningún pedido. El valor a pagar es cero.",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog               
        } else {
            this.txtPagoTotal.setText(resultado.format(aPagar));
            
            this.txtPagoRecibido.setEditable(true); 
            this.txtPagoRecibido.setEnabled(true); 
        
            this.txtPagoRecibido.requestFocus();            
        }
        
    }//GEN-LAST:event_btnCalcularPagoActionPerformed

    private void btnCalcularCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCambioActionPerformed
        // TODO add your handling code here:
        String text = "";
        Double aCobrar = 0.00d;
        Double recibido = 0.00d;
        DecimalFormat resultado = new DecimalFormat("########0.00");
        
        text = txtPagoTotal.getText();
        if (text.equals("")) {text = "0"; } 
        aCobrar = Double.parseDouble (text);

        if (aCobrar==0) {
            JOptionPane optionPane = new JOptionPane("Presione el Botón <<Calcular Pago>>",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog            
        } 
        
        text = txtPagoRecibido.getText();
        if (text.equals("")) {text = "0"; }         
        recibido = Double.parseDouble (text);

        if (recibido >= aCobrar) {
            this.txtPagoCambio.setText(resultado.format(recibido-aCobrar));
        } else {
            JOptionPane optionPane = new JOptionPane("El valor recibido debe ser mayor que el valor total",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setAlwaysOnTop(true); // to show top of all other application
            dialog.setVisible(true); // to visible the dialog            
        }        
      
    }//GEN-LAST:event_btnCalcularCambioActionPerformed

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
    private javax.swing.JRadioButton cbxComboEnsalada;
    private javax.swing.JRadioButton cbxComboHanburguesa;
    private javax.swing.JRadioButton cbxComboOtro;
    private javax.swing.JRadioButton cbxComboPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtPagoCambio;
    private javax.swing.JTextField txtPagoRecibido;
    private javax.swing.JTextField txtPagoTotal;
    private javax.swing.JTextField txtPedidoAgua;
    private javax.swing.JTextField txtPedidoEnsalada;
    private javax.swing.JTextField txtPedidoGaseosa;
    private javax.swing.JTextField txtPedidoHamburguesa;
    private javax.swing.JTextField txtPedidoPapa;
    private javax.swing.JTextField txtPedidoPizza;
    private javax.swing.JTextField txtPedidoRefresco;
    private javax.swing.JTextField txtPedidoYogurt;
    // End of variables declaration//GEN-END:variables
}