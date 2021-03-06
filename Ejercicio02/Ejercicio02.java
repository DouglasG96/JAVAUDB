/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josaphat.com.ejercicios;

import java.text.DecimalFormat;

/**
 *
 * @author Cecy
 */
public class Ejercicio02 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio02
     */
    public Ejercicio02() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        calculadora = new javax.swing.JPanel();
        txtValor1 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        lblSigno = new javax.swing.JLabel();
        rbtnSumar = new javax.swing.JRadioButton();
        rbtnResta = new javax.swing.JRadioButton();
        rbtnMultiplicacion = new javax.swing.JRadioButton();
        rbtnDivision = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calculadora.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese los valores y seleccione  el tipo de operación :"));

        lblResultado.setBackground(new java.awt.Color(180, 170, 175));

        buttonGroup1.add(rbtnSumar);
        rbtnSumar.setText("Sumar");
        rbtnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSumarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnResta);
        rbtnResta.setText("Restar");
        rbtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRestaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnMultiplicacion);
        rbtnMultiplicacion.setText("Multiplicación");
        rbtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMultiplicacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnDivision);
        rbtnDivision.setText("División");
        rbtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calculadoraLayout = new javax.swing.GroupLayout(calculadora);
        calculadora.setLayout(calculadoraLayout);
        calculadoraLayout.setHorizontalGroup(
            calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculadoraLayout.createSequentialGroup()
                .addGroup(calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(calculadoraLayout.createSequentialGroup()
                .addGroup(calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbtnSumar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnResta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, calculadoraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        calculadoraLayout.setVerticalGroup(
            calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculadoraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(rbtnSumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnResta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnMultiplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnDivision)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMultiplicacionActionPerformed
        // TODO add your handling code here:
        double valor1 =Double.parseDouble(txtValor1.getText());
        double valor2 =Double.parseDouble(txtValor2.getText());
        double multiplicacion=valor1*valor2;
        String resultado=String.valueOf(multiplicacion);
        this.lblSigno.setText("x");
        this.lblResultado.setText(resultado);
        
    }//GEN-LAST:event_rbtnMultiplicacionActionPerformed

    private void rbtnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSumarActionPerformed
        // TODO add your handling code here:
        
        double valor1 =Double.parseDouble(txtValor1.getText());
        double valor2 =Double.parseDouble(txtValor2.getText());
        double suma=valor1+valor2;
        String resultado=String.valueOf(suma);
        this.lblSigno.setText("+");        
        this.lblResultado.setText(resultado);
        
    }//GEN-LAST:event_rbtnSumarActionPerformed

    private void rbtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRestaActionPerformed
        // TODO add your handling code here:
          double valor1 =Double.parseDouble(txtValor1.getText());
        double valor2 =Double.parseDouble(txtValor2.getText());
        double resta=valor1-valor2;
        String resultado=String.valueOf(resta);
        this.lblSigno.setText("-");        
        this.lblResultado.setText(resultado);
    }//GEN-LAST:event_rbtnRestaActionPerformed

    private void rbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDivisionActionPerformed
        // TODO add your handling code here:
         double valor1 =Double.parseDouble(txtValor1.getText());
        double valor2 =Double.parseDouble(txtValor2.getText());
        double dividir=valor1/valor2;
        String resultado=String.valueOf(dividir);
        this.lblSigno.setText("/");        
        this.lblResultado.setText(resultado);
    }//GEN-LAST:event_rbtnDivisionActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel calculadora;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSigno;
    private javax.swing.JRadioButton rbtnDivision;
    private javax.swing.JRadioButton rbtnMultiplicacion;
    private javax.swing.JRadioButton rbtnResta;
    private javax.swing.JRadioButton rbtnSumar;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
