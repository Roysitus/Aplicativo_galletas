
package Principal;

public class Principal_interfaz extends javax.swing.JFrame {

    public Principal_interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        boton_salida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        consulta_alfajor = new javax.swing.JMenuItem();
        modificar_alfajor = new javax.swing.JMenuItem();
        listar_alfajor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        boton_Vender = new javax.swing.JMenuItem();
        boton_Generar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        configurar_Descuento = new javax.swing.JMenuItem();
        boton_obsequio = new javax.swing.JMenuItem();
        boton_optimo = new javax.swing.JMenuItem();
        boton_premio = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        boton_acercaTienda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tienda 1.0");

        jMenu1.setText("Archivo");

        boton_salida.setText("Salir");
        boton_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salidaActionPerformed(evt);
            }
        });
        jMenu1.add(boton_salida);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        consulta_alfajor.setText("Consultar Galleta");
        consulta_alfajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_alfajorActionPerformed(evt);
            }
        });
        jMenu2.add(consulta_alfajor);

        modificar_alfajor.setText("Modificar Galleta");
        modificar_alfajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_alfajorActionPerformed(evt);
            }
        });
        jMenu2.add(modificar_alfajor);

        listar_alfajor.setText("Listar Galleta");
        listar_alfajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_alfajorActionPerformed(evt);
            }
        });
        jMenu2.add(listar_alfajor);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ventas");

        boton_Vender.setText("Vender");
        boton_Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VenderActionPerformed(evt);
            }
        });
        jMenu3.add(boton_Vender);

        boton_Generar.setText("Generar Reportes");
        boton_Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_GenerarActionPerformed(evt);
            }
        });
        jMenu3.add(boton_Generar);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configuracion");

        configurar_Descuento.setText("Configurar Descuento");
        configurar_Descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurar_DescuentoActionPerformed(evt);
            }
        });
        jMenu4.add(configurar_Descuento);

        boton_obsequio.setText("Configurar Obsequio");
        boton_obsequio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_obsequioActionPerformed(evt);
            }
        });
        jMenu4.add(boton_obsequio);

        boton_optimo.setText("Configurar cantidad óptima de alfajores vendidos");
        boton_optimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_optimoActionPerformed(evt);
            }
        });
        jMenu4.add(boton_optimo);

        boton_premio.setText("Configurar premio sorpresa");
        boton_premio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_premioActionPerformed(evt);
            }
        });
        jMenu4.add(boton_premio);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ayuda");

        boton_acercaTienda.setText("Acerca de Tienda");
        boton_acercaTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_acercaTiendaActionPerformed(evt);
            }
        });
        jMenu5.add(boton_acercaTienda);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modificar_alfajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_alfajorActionPerformed
        Modificar_Yogurt mostrar = new Modificar_Yogurt();
        mostrar.setVisible(true);
    }//GEN-LAST:event_modificar_alfajorActionPerformed

    private void boton_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salidaActionPerformed
        System.exit(0); // funcion salida
    }//GEN-LAST:event_boton_salidaActionPerformed

    private void consulta_alfajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_alfajorActionPerformed
        /*
        Se llama al frame se crea un mostrar para posertiormente usar el
        setVisible(true) y hacer visible la el jframefrom
        */
        Consulta_Yogurt mostrar = new Consulta_Yogurt();
        mostrar.setVisible(true);
    }//GEN-LAST:event_consulta_alfajorActionPerformed

    private void listar_alfajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_alfajorActionPerformed
        Listar_Yogurt mostrar = new Listar_Yogurt();
        mostrar.setVisible(true);
    }//GEN-LAST:event_listar_alfajorActionPerformed

    private void boton_acercaTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_acercaTiendaActionPerformed
        Ayuda mostrar = new Ayuda();
        mostrar.setVisible(true);
    }//GEN-LAST:event_boton_acercaTiendaActionPerformed

    private void boton_VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_VenderActionPerformed
        Vender mostrar = new Vender();
        mostrar.setVisible(true);
    }//GEN-LAST:event_boton_VenderActionPerformed

    private void boton_GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_GenerarActionPerformed
        GenerarReportes mostrar = new GenerarReportes();
        mostrar.setVisible(true);
    }//GEN-LAST:event_boton_GenerarActionPerformed

    private void configurar_DescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurar_DescuentoActionPerformed
        ConfigurarDescuentos mostrar = new ConfigurarDescuentos();
        mostrar.setVisible(true);
    }//GEN-LAST:event_configurar_DescuentoActionPerformed

    private void boton_obsequioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_obsequioActionPerformed
        ConfigurarObsequio mostrar = new ConfigurarObsequio();
        mostrar.setVisible(true);
    }//GEN-LAST:event_boton_obsequioActionPerformed

    private void boton_optimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_optimoActionPerformed
        CantidadOptima mostrar = new CantidadOptima();
        mostrar.setVisible(true);
    }//GEN-LAST:event_boton_optimoActionPerformed

    private void boton_premioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_premioActionPerformed
        ConfigurarPremio mostrar = new ConfigurarPremio();
        mostrar.setVisible(true);
    }//GEN-LAST:event_boton_premioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem boton_Generar;
    private javax.swing.JMenuItem boton_Vender;
    private javax.swing.JMenuItem boton_acercaTienda;
    private javax.swing.JMenuItem boton_obsequio;
    private javax.swing.JMenuItem boton_optimo;
    private javax.swing.JMenuItem boton_premio;
    private javax.swing.JMenuItem boton_salida;
    private javax.swing.JMenuItem configurar_Descuento;
    private javax.swing.JMenuItem consulta_alfajor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listar_alfajor;
    private javax.swing.JMenuItem modificar_alfajor;
    // End of variables declaration//GEN-END:variables
}
