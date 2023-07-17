/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.mCliente;
import java.sql.*;

/**
 *
 * @author Fran
 */
public class cCliente {
    public int idCliente;
    public int idUsuario;
    public String nombre ;
    public String apellido;
    public String telefono;
    public String direccion;
    public String dui;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
    
    mCliente modeloCliente = new mCliente();
    
        public ResultSet CargarCliente() {
        return modeloCliente.cargarCliente(nombre);
    }
        public ResultSet SeleccionarCliente() {
        return modeloCliente.seleccionarCliente(idCliente);
    }
        

    public boolean AgregarC() {
        return modeloCliente.Insert(idUsuario,nombre, apellido,telefono,direccion,dui);
    }

    public boolean Actua() {
        return modeloCliente.Actualizar(idCliente,nombre, apellido, telefono,direccion,dui);
    }

    public boolean Eliminar() {
        return modeloCliente.Eliminar(idCliente);
    }
    
}
