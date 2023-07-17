/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class mCliente {
    Connection con = conx.getConexion();

    ResultSet rs;
    PreparedStatement ps;

    public ResultSet cargarCliente(String nombre) {
        String query = "Select idCliente, CONCAT(nombre, ' ', apellido) AS 'Nombre', telefono AS 'Telefono', direccion AS 'Dirección', dui AS 'DUI'\n" +
        "From tbClientes WHERE CONCAT (nombre, ' ', apellido) like ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, "%"+nombre+"%");
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); 
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; 
        }
    }
    
    public boolean Insert(int idUsuario, String nombre, String apellido,String tele, String direccion, String dui) {
        String query = "insert into tbClientes values(?,?,?,?,?,?);";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idUsuario);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, tele);
            ps.setString(5, direccion);
            ps.setString(6, dui);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Registrado");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); 
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; 
        }
    }
    
    public boolean Actualizar(int idCl, String nombre, String apellido, String tele, String direccion, String dui) {
        String query = "update tbClientes SET nombre=?,apellido=?,telefono=?,direccion=?,dui=? \n" +
        "where idCliente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, tele);
            ps.setString(4, direccion);
            ps.setString(5, dui);
            ps.setInt(6, idCl);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente actualizado");
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de la excepción SQLException
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false; //DIO ERROR
        }
    }
    
    public ResultSet seleccionarCliente(int idCliente) {
        String query = "select * from tbClientes where idCliente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idCliente);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace(); 
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return null; 
        }
    }

    public boolean Eliminar(int idCliente) {
        String query = "DELETE tbClientes where idCliente=?;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idCliente);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente eliminado");
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); 
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            return false;
        }
    }
}
