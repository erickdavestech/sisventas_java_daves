package presentacion;

import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import negocio.CategoriaControl;

public class FrmCategoria extends javax.swing.JInternalFrame {

    private final CategoriaControl CONTROL;
    private String accion;
    private String nombreAnt;

    public FrmCategoria() {
        initComponents();
        this.CONTROL = new CategoriaControl();
        this.listar(""); // se envia al metodo listar
        //Controla los TabPane al Inicio del sistema
        tabPaneCategoria.setEnabledAt(1, false);
        this.accion = "guardar";
        this.txtIdCategoriaMan.setVisible(false);
    }

    // Se recibe en el metodo listar como String texto
    private void listar(String texto) {
        tablaListado.setModel(this.CONTROL.listar(texto));
        // Para listar o organizar los datos segun las colunas que se le haga click
        TableRowSorter ordenartabla = new TableRowSorter(tablaListado.getModel());
        tablaListado.setRowSorter(ordenartabla);

        lblTotalRegistros.setText("Mostrando " + this.CONTROL.totalMostrados() + " de un total de " + this.CONTROL.total() + " registros ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPaneCategoria = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblTotalRegistros = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnNuevoCategoria = new javax.swing.JButton();
        btnEditarCategoria = new javax.swing.JButton();
        btnActivarRegistro = new javax.swing.JButton();
        btnDesativarRegistro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCategoriaMan = new javax.swing.JTextField();
        txtDescripcionCategoriaMan = new javax.swing.JTextField();
        btnGuardarCategoriaMan = new javax.swing.JButton();
        btnCancelarCategoriaMan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCategoriaMan = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Categorias");

        lblTotalRegistros.setText("Registros");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaListado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaListado);

        jLabel2.setText("Nombre");

        btnNuevoCategoria.setText("Nueva Categoria");
        btnNuevoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCategoriaActionPerformed(evt);
            }
        });

        btnEditarCategoria.setText("Editar");
        btnEditarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCategoriaActionPerformed(evt);
            }
        });

        btnActivarRegistro.setText("Activar Registro");
        btnActivarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarRegistroActionPerformed(evt);
            }
        });

        btnDesativarRegistro.setText("Desactivar Registro");
        btnDesativarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 246, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnActivarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1043, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(btnDesativarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(963, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActivarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(532, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(510, 510, 510)
                    .addComponent(btnDesativarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );

        tabPaneCategoria.addTab("Listado", jPanel1);

        jLabel4.setText("(*) Nombre");

        jLabel5.setText("Descripcion");

        btnGuardarCategoriaMan.setText("Guardar");
        btnGuardarCategoriaMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCategoriaManActionPerformed(evt);
            }
        });

        btnCancelarCategoriaMan.setText("Cancelar");
        btnCancelarCategoriaMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCategoriaManActionPerformed(evt);
            }
        });

        jLabel6.setText("(*) indica que es un Campo Obligatorio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardarCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDescripcionCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(574, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(txtNombreCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(764, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcionCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(txtNombreCategoriaMan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(509, Short.MAX_VALUE)))
        );

        tabPaneCategoria.addTab("Mantenimiento", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneCategoria)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaneCategoria))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarCategoriaManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCategoriaManActionPerformed

        tabPaneCategoria.setEnabledAt(0, true);
        tabPaneCategoria.setEnabledAt(1, false);
        tabPaneCategoria.setSelectedIndex(0);
        this.LimpiarCamposTexto();
    }//GEN-LAST:event_btnCancelarCategoriaManActionPerformed
    //
    private void btnNuevoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCategoriaActionPerformed
        tabPaneCategoria.setEnabledAt(0, false);
        tabPaneCategoria.setEnabledAt(1, true);
        tabPaneCategoria.setSelectedIndex(1);
        this.accion = "guardar";
        btnGuardarCategoriaMan.setText("Guardar");

    }//GEN-LAST:event_btnNuevoCategoriaActionPerformed
    private void LimpiarCamposTexto() {
        txtIdCategoriaMan.setText("");
        txtDescripcionCategoriaMan.setText("");
    }

    private void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Sistema", JOptionPane.ERROR_MESSAGE);
    }

    private void mensajeOK(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    //Boton BUSCAR
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.listar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Boton Guardar hace dos funciones, Guardar y Actualizar las categorias
    private void btnGuardarCategoriaManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCategoriaManActionPerformed
        //Validando campo vacio del nombre
        if (txtNombreCategoriaMan.getText().length() == 0 || txtNombreCategoriaMan.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Debes de Ingresar un Nombre Es Obligatorio y No debe ser mayor que 20 caracteres", "Sistema", JOptionPane.WARNING_MESSAGE);
            txtNombreCategoriaMan.requestFocus();
            return;
        }
        if (txtNombreCategoriaMan.getText().length() > 255) {
            JOptionPane.showMessageDialog(this, "Debes de Ingresar un Nombre Es Obligatorio y No debe ser mayor que 255 caracteres", "Sistema", JOptionPane.WARNING_MESSAGE);
            txtNombreCategoriaMan.requestFocus();
            return;
        }
        String resp;
        if (this.accion.equals("editar")) {
            resp = this.CONTROL.actualizar(Integer.parseInt(txtIdCategoriaMan.getText()), txtNombreCategoriaMan.getText(), this.nombreAnt, txtDescripcionCategoriaMan.getText());
            if (resp.equals("OK")) {
                this.mensajeOK("Actualizado correctamente");
                this.LimpiarCamposTexto();
                this.listar("");
                tabPaneCategoria.setSelectedIndex(0);
                tabPaneCategoria.setEnabledAt(1, false);
                tabPaneCategoria.setEnabledAt(0, true);
            } else {
                this.mensajeError(resp);
            }

        } else {
            resp = this.CONTROL.insertar(txtIdCategoriaMan.getText(), txtDescripcionCategoriaMan.getText());
            if (resp.equals("OK")) {
                this.mensajeOK("Registrado Correctamente");
                this.LimpiarCamposTexto();
                this.listar("");
            } else {
                this.mensajeError(resp);
            }
        }
    }//GEN-LAST:event_btnGuardarCategoriaManActionPerformed

    private void btnEditarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCategoriaActionPerformed
        if (tablaListado.getSelectedRowCount() == 1) {
            String id = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 0));
            String nombre = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 1));
            this.nombreAnt = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 1));
            String descripcion = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 2));

            txtIdCategoriaMan.setText(id);
            txtNombreCategoriaMan.setText(nombre);
            txtDescripcionCategoriaMan.setText(descripcion);

            tabPaneCategoria.setEnabledAt(0, false);
            tabPaneCategoria.setEnabledAt(1, true);
            tabPaneCategoria.setSelectedIndex(1);
            this.accion = "editar";
            btnGuardarCategoriaMan.setText("Editar");

        } else {
            this.mensajeError("Seleccione 1 registro para editar !");
        }
    }//GEN-LAST:event_btnEditarCategoriaActionPerformed

    private void btnActivarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarRegistroActionPerformed
        if (tablaListado.getSelectedRowCount() == 1) {
            String id = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 0));
            String nombre = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 1));
            if (JOptionPane.showConfirmDialog(this, "Deseas Activar el Registro: " + nombre + " ?", "Activar", JOptionPane.YES_NO_OPTION) == 0) {
                String resp = this.CONTROL.activar(Integer.parseInt(id));
                if (resp.equals("OK")) {
                    this.mensajeOK("Registro Activado");
                    this.listar("");
                } else {
                    this.mensajeError(resp);
                }
            }
        } else {
            this.mensajeError("Seleccione 1 Registro a Activar");
        }

    }//GEN-LAST:event_btnActivarRegistroActionPerformed

    private void btnDesativarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarRegistroActionPerformed
        if (tablaListado.getSelectedRowCount() == 1) {
            String id = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 0));
            String nombre = String.valueOf(tablaListado.getValueAt(tablaListado.getSelectedRow(), 1));
            if (JOptionPane.showConfirmDialog(this, "Deseas Desactivar el Registro: " + nombre + " ?", "Desactivar", JOptionPane.YES_NO_OPTION) == 0) {
                String resp = this.CONTROL.desactivar(Integer.parseInt(id));
                if (resp.equals("OK")) {
                    this.mensajeOK("Registro Desactivado");
                    this.listar("");
                } else {
                    this.mensajeError(resp);
                }
            }
        } else {
            this.mensajeError("Seleccione 1 Registro a Desactivar");
        }


    }//GEN-LAST:event_btnDesativarRegistroActionPerformed
// <editor-fold defaultstate="collapsed" desc="javax.swing">     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarRegistro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarCategoriaMan;
    private javax.swing.JButton btnDesativarRegistro;
    private javax.swing.JButton btnEditarCategoria;
    private javax.swing.JButton btnGuardarCategoriaMan;
    private javax.swing.JButton btnNuevoCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTabbedPane tabPaneCategoria;
    private javax.swing.JTable tablaListado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDescripcionCategoriaMan;
    private javax.swing.JTextField txtIdCategoriaMan;
    private javax.swing.JTextField txtNombreCategoriaMan;
    // End of variables declaration//GEN-END:variables
}// </editor-fold>     
