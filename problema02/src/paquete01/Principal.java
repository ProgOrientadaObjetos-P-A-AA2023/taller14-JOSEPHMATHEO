package paquete01;

import java.util.ArrayList;
import paquete02.*;

public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Estudiante> lista = new ArrayList<>();
        Enlace c = new Enlace();
        c.establecerConexion();
            
            
        for (int i = 0; i < c.obtenerDataEstudainte().size(); i++) {
            
            System.out.printf("%s\n", c.obtenerDataEstudainte().get(i));
            
        }
        
    }
    
}
