/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.MostrarDatosTabla;
import Modelo.mCliente;
import Modelo.conx;
import Modelo.mUsuario;

import Vista.pnlRegistroGen;
import Vista.vRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Modelo.crypt;
/**
 *
 * @author Fran
 */
public class cRegistro implements ActionListener{
    private mUsuario modeloUsuario;
    private pnlRegistroGen vistaRegistro;
    
        public cRegistro(pnlRegistroGen vistaRegistro, mUsuario modeloUsuario) {
        this.modeloUsuario = modeloUsuario;
        this.vistaRegistro = vistaRegistro;
        this.vistaRegistro.btnUser.addActionListener(this);

    }
        
        private void limpiarCamposTextoUsuario() {

         vistaRegistro.txtCorre.setText("");
         vistaRegistro.txtContras.setText("");
    }
        
     //   private void cargarTiposUsuarios() {
    //    try {
      //      PreparedStatement ps = conx.prepareStatement("SELECT idTipo, tipo FROM tbTipoUsuarios");
     //       ResultSet rs = ps.executeQuery();
//
     //       ArrayList<String> tiposUsuarios = new ArrayList<>();
    //        while (rs.next()) {
    //            int idTipo = rs.getInt("idTipo");
    //            String tipo = rs.getString("tipo");
     //           tiposUsuarios.add(idTipo + " - " + tipo);
    //        }

            // Convertir el ArrayList a un arreglo de Strings y asignarlo al ComboBox
    //        String[] tiposArray = tiposUsuarios.toArray(new String[0]);
     //       vistaRegistro.cbLista.setModel(new DefaultComboBoxModel<>(tiposArray));
    //    } catch (SQLException ex) {
    //        ex.printStackTrace();
    //        JOptionPane.showMessageDialog(vistaRegistro, "Error al cargar los tipos de usuarios.");
    //    }
    //}
        
       // private int obtenerIdTipoSeleccionado() {
       // String seleccionado = vistaRegistro.cbLista.getSelectedItem().toString();
    //    String[] partes = seleccionado.split(" - ");
        // Integer.parseInt(partes[0]);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == vistaRegistro.btnUser) {
            String idTipoUsuario = vistaRegistro.txtIdUser.getText(); 
            String usuario = vistaRegistro.txtUs.getText();
            String contra = vistaRegistro.txtContras.getText();
            String correo = vistaRegistro.txtCorre.getText();
            int tipoUs = Integer.parseInt(idTipoUsuario);

            if (usuario.isEmpty() || contra.isEmpty() || correo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos.");
            } else {
                String encryptedPassword = crypt.encryptPassword(contra);
                modeloUsuario.setIdTipo(tipoUs);
                modeloUsuario.setUsuario(usuario);
                modeloUsuario.setContra(encryptedPassword);
                modeloUsuario.setCorreo(correo);

                if (modeloUsuario.AgregarUsuario(modeloUsuario)) {
                    JOptionPane.showMessageDialog(vistaRegistro, "Usuario registrado exitosamente.");
                    limpiarCamposTextoUsuario();
                } else {
                    JOptionPane.showMessageDialog(vistaRegistro, "Error al registrar el usuario.");
                }
            }
        }
    }
    
    
    
}
