
package coneccion1234;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Coneccion1234 {

    public static void main(String[] args) {
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/act77";
        Connection conexion = null;
        PreparedStatement preparedStatement;
        ResultSet rs;

        try {
            conexion = DriverManager.getConnection(url, usuario, password);
           
            
            
            // CONSULTA A LA BASE DE DATOS
            Statement Statement = conexion.createStatement();
            rs = Statement.executeQuery("SELECT * FROM inventario");
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
                }
            
            
            // INSERTAR datos en la tabla 'inventario'
            
               Statement.execute("INSERT INTO `inventario`(`nombre`, `cantidad`) VALUES ('valija','15')");
            System.out.println("");
            rs = Statement.executeQuery("SELECT * FROM inventario");
            while (rs.next()){
             System.out.println(rs.getString("nombre")+" "+rs.getInt("cantidad"));
             
             
             
             
             
             
            //ACTUALIZAR datos en la base de datos
            
      
            
               Statement.execute("UPDATE `inventario` SET `nombre` = 'discos_pulidora',`cantidad` = '31' WHERE `codigo` = '21' ");
            System.out.println("");
            rs = Statement.executeQuery("SELECT * FROM inventario");
            while (rs.next()){
             System.out.println(rs.getString("nombre")+" "+rs.getInt("cantidad"));
            
             
             //ELIMINAR datos en la base de datos
            
      
            
               Statement.execute("DELETE FROM `inventario` WHERE `codigo` = '23'  ");
            System.out.println("");
            rs = Statement.executeQuery("SELECT * FROM inventario");
            while (rs.next()){
             System.out.println(rs.getString("nombre")+" "+rs.getInt("cantidad"));
             
             
             
             
             
             
            }
            }
            }
            
            
   
            

         
} catch (SQLException ex) {
    Logger.getLogger(Coneccion1234.class.getName()).log(Level.SEVERE, "Error al insertar el registro.", ex);
}
    
    }
}
           




            
            
            
            
     // KEVIN ALFREDO GOMEZ SAAVEDRA ADSO 2758372    