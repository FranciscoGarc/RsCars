/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fran
 */
public class mCliente {
    public int idCliente;
    public int idUsuario;
    public String nombre ;
    public String apellido;
    public String dui;
    public String nacimiento;
    public String sexo;
    public String direccion;
    private JTable ta;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String telefono;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
    
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    public boolean AgregarCliente(mCliente clienteModelo){
        
        try{
            PreparedStatement addReserva = conx.getConexion().prepareStatement("insert into tbClientes(idUsuario, nombre, apellido, telefono, direccion, dui) values(?, ?, ?, ?, ?, ?)");
            addReserva.setInt(1, clienteModelo.getIdUsuario());
            addReserva.setString(2, clienteModelo.getNombre());            
            addReserva.setString(3, clienteModelo.getApellido());
            addReserva.setString(4, clienteModelo.getTelefono());
            addReserva.setString(5, clienteModelo.getDireccion());
            addReserva.setString(6, clienteModelo.getDui());
            
            
            addReserva.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
        
    }
    
    public boolean UpdateUsuario(mCliente clienteModelo){
    
        
         int filaSeleccionada = ta.getSelectedRow();
        //Obtenemos el id de la fila seleccionada
        String miId = ta.getValueAt(filaSeleccionada, 0).toString();
        String nom = clienteModelo.getNombre();
        String apel = clienteModelo.getApellido();
        String tel = clienteModelo.getTelefono();
        String direccion = clienteModelo.getDireccion();
        String dui = clienteModelo.getDui();

        try {

            PreparedStatement deleteUser = conx.getConexion().prepareStatement("update tbCliente set nombre = '" + nom + "',"
                    + " apellido = '"+ apel +"', telefono = '"+tel+"', direccion = '"+direccion+"', dui = '"+dui+"' where idCliente = '"+ miId+"';");

            deleteUser.executeUpdate();

        } catch (Exception e) {

         System.out.println(e.toString());

        }
        return false;


    }
    
    public void Mostrar(JTable tableUser) throws SQLException{

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object []{"idCliente", "idUsuario", "Nombre","Telefono","Dirección","DUI"});
        ta = tableUser;
        try{
            Statement statement = conx.getConexion().createStatement();
            String query = "Select idUsuario, idCliente, CONCAT(nombre, ' ', apellido) AS 'Nombre', telefono AS 'Telefono', direccion AS 'Dirección', dui AS 'DUI'\n" +
        "From tbClientes;";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                modelo.addRow(new Object[] { 
                    rs.getString("idUsuario"),rs.getString("idCliente"), rs.getString("nombre"), rs.getString("apellido"), 
                    rs.getString("telefono"), rs.getString("direccion"), rs.getString("dui")});
            }
            tableUser.setModel(modelo);
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }

    public boolean EliminarUsuario(mCliente clienteModelo){
        try {       
         int filaSeleccionada = ta.getSelectedRow();
        //Obtenemos el id de la fila seleccionada
        String miId = ta.getValueAt(filaSeleccionada, 0).toString();        
        //borramos        
            if (miId == "") {
                  JOptionPane.showMessageDialog(null, "Debe de seleccionar un campo de la tabla");
                    return false;
            }
            else{
                PreparedStatement deleteUser = conx.getConexion().prepareStatement("delete from tbClientes where idCliente ='" + miId + "'");
                deleteUser.executeUpdate();
                 return true;
            }

        } catch (Exception e) {

            System.out.println(e.toString());
            
            return false;
        }
    }
}
