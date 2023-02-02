/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;


public class Modificar_Yogurt extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_Alfajor
     */
    public Modificar_Yogurt() {
        initComponents();
        seleccion.addItem("Rellenitas");
        seleccion.addItem("Oreo");
        seleccion.addItem("Casino");
        seleccion.addItem("Picaras");
        seleccion.addItem("Glacitas");
    }
   
    mantenimiento_modificar obj; // creacion de in objeto
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_cerrar = new javax.swing.JButton();
        boton_grabar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mostrar_precio = new javax.swing.JTextField();
        mostrar_cantidad = new javax.swing.JTextField();
        mostrar_peso = new javax.swing.JTextField();
        mostrar_sabor = new javax.swing.JTextField();
        seleccion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modificar Galleta");

        boton_cerrar.setText("Cerrar");
        boton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cerrarActionPerformed(evt);
            }
        });

        boton_grabar.setText("Grabar");
        boton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_grabarActionPerformed(evt);
            }
        });

        jLabel1.setText("Marca:");

        jLabel2.setText("Precio (S/):");

        jLabel3.setText("Contenido (und):");

        jLabel4.setText("Peso (g):");

        jLabel5.setText("Sabor:");

        seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrar_cantidad)
                    .addComponent(mostrar_peso)
                    .addComponent(mostrar_sabor)
                    .addComponent(seleccion, 0, 115, Short.MAX_VALUE)
                    .addComponent(mostrar_precio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_grabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_cerrar)
                    .addComponent(jLabel1)
                    .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_grabar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(mostrar_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mostrar_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mostrar_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mostrar_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_boton_cerrarActionPerformed

    private void boton_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_grabarActionPerformed
        String opcion;
        String marca = "", sabor = "";
        double precio = 0, peso = 0;
        int cantidad = 0;
        opcion = (String) seleccion.getSelectedItem();
        precio=Double.parseDouble(mostrar_precio.getText());
        peso=Double.parseDouble(mostrar_peso.getText());
        cantidad=Integer.parseInt(mostrar_cantidad.getText());
        sabor=mostrar_sabor.getText();
        obj=new mantenimiento_modificar(opcion, precio, peso,cantidad,sabor);
        dispose();
    }//GEN-LAST:event_boton_grabarActionPerformed

    private void seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionActionPerformed
        String opcion;
        String marca = "", sabor = "";
        double precio = 0, peso = 0;
        int cantidad = 0;
              opcion = (String) seleccion.getSelectedItem();
        if (opcion.equals("Rellenitas")) {
            mostrar_precio.setText(String.valueOf(obj.getPrecio_0()));
            mostrar_cantidad.setText(String.valueOf(obj.getCantidad_0()));
            mostrar_peso.setText(String.valueOf(obj.getPeso_0()));
            mostrar_sabor.setText(obj.getSabor_0());
        }
        if (opcion.equals("Oreo")) {
            mostrar_precio.setText(String.valueOf(obj.getPrecio_1()));
            mostrar_cantidad.setText(String.valueOf(obj.getCantidad_1()));
            mostrar_peso.setText(String.valueOf(obj.getPeso_1()));
            mostrar_sabor.setText(obj.getSabor_1());
        }
        if (opcion.equals("Casino")) {
            mostrar_precio.setText(String.valueOf(obj.getPrecio_2()));
            mostrar_cantidad.setText(String.valueOf(obj.getCantidad_2()));
            mostrar_peso.setText(String.valueOf(obj.getPeso_2()));
            mostrar_sabor.setText(obj.getSabor_2());
        }
        if (opcion.equals("Picaras")) {
            mostrar_precio.setText(String.valueOf(obj.getPrecio_3()));
            mostrar_cantidad.setText(String.valueOf(obj.getCantidad_3()));
            mostrar_peso.setText(String.valueOf(obj.getPeso_3()));
            mostrar_sabor.setText(obj.getSabor_3());
        }
        if (opcion.equals("Glacitas")) {
            mostrar_precio.setText(String.valueOf(obj.getPrecio_4()));
            mostrar_cantidad.setText(String.valueOf(obj.getCantidad_4()));
            mostrar_peso.setText(String.valueOf(obj.getPeso_4()));
            mostrar_sabor.setText(obj.getSabor_4());
        }
       
    }//GEN-LAST:event_seleccionActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_Yogurt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Yogurt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Yogurt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Yogurt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Yogurt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cerrar;
    private javax.swing.JButton boton_grabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mostrar_cantidad;
    private javax.swing.JTextField mostrar_peso;
    private javax.swing.JTextField mostrar_precio;
    private javax.swing.JTextField mostrar_sabor;
    private javax.swing.JComboBox<String> seleccion;
    // End of variables declaration//GEN-END:variables
}
