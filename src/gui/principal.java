
package gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.uv.cliente.model.Pedido;
import org.uv.cliente.resource.Request;

/**
 *
 * @author gabhs
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    private Pedido producto;
    private final Request REQUEST;
    DefaultTableModel modelo = new DefaultTableModel();

    public principal() {
        initComponents();
        REQUEST = new Request();
    }
    
    public void limpiar() {
        txt_direccion.setText("");
        txt_especificaciones.setText("");
        txt_costo.setText("");
        txt_tipo.getSelectedIndex();
        txt_cliente.setText("");
        txt_telefono.setText("");
        
    }
    
    public void limpiarTabla() {
        int numDatos = modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            modelo.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_costo = new javax.swing.JTextField();
        txt_especificaciones = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btobuscar = new javax.swing.JButton();
        btoeliminar = new javax.swing.JButton();
        btoguardar = new javax.swing.JButton();
        btolistar = new javax.swing.JButton();
        btomodificar = new javax.swing.JButton();
        txt_fecha1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Pedidos");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Especificaciones:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Direccion:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Telefono:");

        txt_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastel tres leches", "Pastel americano", "Pastel de queso", "Pastel de cajeta", "Pastel de frutas", "Pastel napolitano" }));
        txt_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipoActionPerformed(evt);
            }
        });

        tblproductos.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        tblproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Telefono", "Direccion", "Tipo de pastel", "Especificaciones", "Costo", "Fecha de entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblproductos);
        if (tblproductos.getColumnModel().getColumnCount() > 0) {
            tblproductos.getColumnModel().getColumn(0).setMinWidth(10);
            tblproductos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Cliente:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setText("Costo:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setText("Fecha de entrega:");

        btobuscar.setText("Buscar");
        btobuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btobuscar.setFocusable(false);
        btobuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btobuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btobuscarActionPerformed(evt);
            }
        });

        btoeliminar.setText("Eliminar");
        btoeliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoeliminar.setFocusable(false);
        btoeliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoeliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoeliminarActionPerformed(evt);
            }
        });

        btoguardar.setText("Guardar");
        btoguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoguardar.setFocusable(false);
        btoguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoguardarActionPerformed(evt);
            }
        });

        btolistar.setText("Listar");
        btolistar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btolistar.setFocusable(false);
        btolistar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btolistar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btolistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btolistarActionPerformed(evt);
            }
        });

        btomodificar.setText("Modificar");
        btomodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btomodificar.setFocusable(false);
        btomodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btomodificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btomodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btomodificarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setText("Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txt_especificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5)
                                    .addGap(4, 4, 4)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btoguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btolistar)
                        .addGap(18, 18, 18)
                        .addComponent(btomodificar)
                        .addGap(18, 18, 18)
                        .addComponent(btoeliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btobuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_especificaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btoguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btolistar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btomodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btoeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoguardarActionPerformed
        try {
            producto = new Pedido();
            producto.setNombreCliente(txt_cliente.getText());
            producto.setTelefono(txt_telefono.getText());
            producto.setDireccion(txt_direccion.getText());
            String tipo = (String) txt_tipo.getSelectedItem();
            producto.setTipo(tipo);
            producto.setEspecificaciones(txt_especificaciones.getText());
            producto.setCosto(txt_costo.getText());
            producto.setFecha(txt_id.getText());

            limpiar();
        } catch (Exception ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btoguardarActionPerformed

    private void btoeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoeliminarActionPerformed
        try {
            REQUEST.delete(txt_id.getText());
        } catch (Exception ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btoeliminarActionPerformed

    private void btomodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btomodificarActionPerformed
        try {
            producto = new Pedido();
            producto.setNombreCliente(txt_cliente.getText());
            producto.setTelefono(txt_telefono.getText());
            producto.setDireccion(txt_direccion.getText());
            String tipo = (String) txt_tipo.getSelectedItem();
            producto.setTipo(tipo);
            producto.setEspecificaciones(txt_especificaciones.getText());
            producto.setCosto(txt_costo.getText());
            producto.setFecha(txt_id.getText());
            JSONObject json = new JSONObject(producto);
            REQUEST.update(json.toString(),txt_id.getText());
            limpiar();
        } catch (Exception ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btomodificarActionPerformed

    private void btolistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolistarActionPerformed

        try {
            jsonArray = new JSONArray(REQUEST.getAll());
            modelo = ((DefaultTableModel) tblproductos.getModel());
            limpiarTabla();
            limpiar();
            Object[] ob = new Object[6];
            for (int i = 0; i < jsonArray.length(); i++) {
                ob[0] = jsonArray.getJSONObject(i).getString("id");
                ob[1] = jsonArray.getJSONObject(i).getString("nombreCliente");
                ob[2] = jsonArray.getJSONObject(i).getString("descripcion");
                ob[3] = jsonArray.getJSONObject(i).getString("precio");
                ob[4] = jsonArray.getJSONObject(i).getString("categoria");
                ob[5] = jsonArray.getJSONObject(i).getInt("cantidad");
                modelo.addRow(ob);
            }
        } catch (Exception ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btolistarActionPerformed

    private void btobuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btobuscarActionPerformed
        
        JSONObject json;
        try {
            json = new JSONObject(REQUEST.getById(txt_id.getText()));
            modelo = ((DefaultTableModel) tblproductos.getModel());
            limpiarTabla();
            limpiar();
            modelo.addRow(new Object[]{
                json.get("id"), 
                json.get("nombre"), 
                json.get("descripcion"), 
                json.get("precio"),
                json.get("categoria"),
                json.get("cantidad")});
        } catch (Exception ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btobuscarActionPerformed

    private void txt_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipoActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btobuscar;
    private javax.swing.JButton btoeliminar;
    private javax.swing.JButton btoguardar;
    private javax.swing.JButton btolistar;
    private javax.swing.JButton btomodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblproductos;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_especificaciones;
    private javax.swing.JTextField txt_fecha1;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JComboBox<String> txt_tipo;
    // End of variables declaration//GEN-END:variables
}
