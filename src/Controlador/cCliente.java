/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.mCliente;
import Vista.pnlControlClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Fran
 */
public class cCliente implements  ActionListener, MouseListener{
    private mCliente modeloCliente;
    private pnlControlClientes vistaClientes;
    
    public cCliente(pnlControlClientes vistasClientes, mCliente modloCliente){
       this.modeloCliente = modloCliente;
       this.vistaClientes = vistasClientes;
       this.vistaClientes.btnRegistrar.addActionListener(this);
       this.vistaClientes.btnActualizar.addActionListener(this);
       this.vistaClientes.btnEliminar.addActionListener(this);
       this.vistaClientes.tbDatosCl.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == vistaClientes.btnRegistrar){
            
            int idUs = Integer.parseInt(vistaClientes.txtSearch.getText());
            String name = vistaClientes.txtName.getText();
            String apel = vistaClientes.txtApe.getText();
            String tel = vistaClientes.txtTel.getText();
            String dir = vistaClientes.txtDirec.getText();
            String dui = vistaClientes.txtDui.getText();
            
            if (name.isEmpty()||apel.isEmpty()||tel.isEmpty()||dir.isEmpty()||dui.isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Llene todos los campos");
            
            }
            else{
                    modeloCliente.setIdUsuario(Integer.parseInt(vistaClientes.txtSearch.getText().trim()));
                    modeloCliente.setNombre(vistaClientes.txtName.getText().trim());
                    modeloCliente.setApellido(vistaClientes.txtApe.getText().trim());
                    modeloCliente.setTelefono(vistaClientes.txtTel.getText().trim());
                    modeloCliente.setDireccion(vistaClientes.txtDirec.getText().trim());
                    modeloCliente.setDui(vistaClientes.txtDui.getText().trim());

                try {

                    modeloCliente.AgregarCliente(modeloCliente);
                    modeloCliente.Mostrar(vistaClientes.tbDatosCl);
                    vistaClientes.txtName.setText("");
                    vistaClientes.txtApe.setText("");
                    vistaClientes.txtDirec.setText("");
                    vistaClientes.txtTel.setText("");
                    vistaClientes.txtDui.setText("");

                } catch (SQLException ex) {
                    Logger.getLogger(cCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
        }      
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
   
}
