
package Modelo;

import java.sql.*;

public class mUser {
    Connection conex = conx.getConexion();
    crypt encrypt = new crypt();
    PreparedStatement ps;
    ResultSet rs;
    
    public ResultSet VerificarUsuario(String usuario) throws SQLException {
        String cm = "select * from tbUsuarios where usuario=? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        try {
            ps = conex.prepareStatement(cm);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            e.printStackTrace(); 
            System.out.println(e.toString());
            return null; 
        }
    }
    
    public ResultSet SelecionarUser (String usuario, String contra) throws SQLException {
        String cm = "SELECT * FROM tbUsuarios WHERE usuario = ? COLLATE SQL_Latin1_General_CP1_CS_AS \n"
                + " AND contra = ? COLLATE SQL_Latin1_General_CP1_CS_AS;";
        try {

            ps = conex.prepareStatement(cm);
            ps.setString(1, usuario);
            ps.setString(2, contra);
            rs = ps.executeQuery();

            return rs;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.toString());
            return null;
        }
    }
    
        public ResultSet SelecionarNivel(int idTipoU, int idUser) throws SQLException {
        String cm = "SELECT * FROM tbAdministradores WHERE idUsuario = ?;";
        System.out.println(idUser + " " + idTipoU);
        try {

            if (idTipoU == 1) {
                cm = "SELECT * FROM tbUsuarios WHERE idUsuario = ?;";
            }
            if (idTipoU == 2) {
                cm = "SELECT * FROM tbMecanicos WHERE idUsuario = ?;";
            }
            if (idTipoU == 3) {
                cm = "SELECT * FROM tbContadores WHERE idUsuario = ?;";
            }
            if (idTipoU == 4) {
                cm = "SELECT * FROM tbRecepcionistas WHERE idUsuario = ?;";
            }
            ps = conex.prepareStatement(cm);
            ps.setInt(1, idUser);
            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            e.printStackTrace(); 
            System.out.println(e.toString());
            return null;
        }
    }

    
}
