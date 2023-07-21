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
            String url = "jdbc:sqlite:bd/trabajadores.bd";  
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
    
    public void insertarTrabajador(Trabajador worker) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Trabajador (nombre, "
                    + "cedula, correo, mesSueldo, sueldo) "
                    + "values ('%s','%s','%s','%s','%.2f')", 
                    worker.obtenerNombre(),
                    worker.obtenerCedula(),
                    worker.obtenerCorreo(),
                    worker.obtenerMesSuelo(),
                    worker.obtenerSueldo());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {  
            
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Trabajador> obtenerDataTrabajador() { 
        
        ArrayList<Trabajador> lista = new ArrayList<>();
        
        try{  
            
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Trabajador;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                
                Trabajador t = new Trabajador(rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("correo"),
                        rs.getString("mesSueldo"),
                        rs.getDouble("sueldo"));
                
                lista.add(t);
                
            }
            
            obtenerConexion().close();
            
        } catch (SQLException e) { 
            
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
    
}
