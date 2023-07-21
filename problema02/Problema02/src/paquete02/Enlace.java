package paquete02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Enlace {
    
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarEstudiante(Estudiante es) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre, "
                    + "apellido, calificacion1, calificacion2, calificacion3) "
                    + "values ('%s','%s','%.2f','%.2f','%.2f')", 
                    es.obtenerNombre(),
                    es.obtenerApellido(),
                    es.obtenerC1(),
                    es.obtenerC2(),
                    es.obtenerC3());
            
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {  
            
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Estudiante> obtenerDataEstudainte() { 
        
        ArrayList<Estudiante> lista = new ArrayList<>();
        
        try{  
            
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                
                Estudiante e = new Estudiante(rs.getString("nombre"),
                         rs.getString("apellido"),
                        rs.getDouble("calificacion1"),
                        rs.getDouble("calificacion2"),
                        rs.getDouble("calificacion3"));
                
                lista.add(e);
                
            }
            
            obtenerConexion().close();
            
        } catch (SQLException e) { 
            
             System.out.println("Exception: insertarEstudiante");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
    
}
