package paquete01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import paquete02.*;

public class Principal {
    
    public static void main(String[] args) throws SQLException {
        
        String nombre;
        String cedula;
        String correo;
        String mes;
        double sueldo;
        String respuesta;
        boolean flag = true;
        
        Scanner lm = new Scanner(System.in);
        ArrayList<Trabajador> lista = new ArrayList<>();
        Enlace c = new Enlace();
        
        System.out.println("---Datos de Trabajadores---");
        
        while(flag){
        
            System.out.print("\nIngrese el Nombre del Trabajador: ");
            nombre = lm.nextLine();
            
            System.out.print("Ingrese la cedula del Trabajador: ");
            cedula = lm.nextLine();
            
            System.out.print("Ingrese el Correo del Trabajador: ");
            correo = lm.nextLine();
            
            System.out.print("Ingrese el Mes del pago al Trabajador: ");
            mes = lm.nextLine();
            
            System.out.print("Ingrese el Sueldo del Trabajador: ");
            sueldo = lm.nextDouble();
            
            Trabajador t = new Trabajador(nombre, cedula, correo, 
                    mes, sueldo);
        
            c.insertarTrabajador(t);
            
            lm.nextLine();
        
            System.out.println("\nDesea ingresar los datos de otro "
                    + "trabajador? digite no para cancelar o cualquier "
                    + "tecla para continuar: ");
            
            respuesta = lm.nextLine();
            respuesta.toLowerCase();
            
            if(respuesta.equals("no")){
            
               flag = false;
            
            }else{
            
            
            }
        
        }
        
        System.out.println("Lista de Trabajadores");
        
        for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
            
            System.out.println("\n(" + (i+1) + ")Trabajador");
            System.out.printf("%s\n", c.obtenerDataTrabajador().get(i));
            
        }
        
    }
    
}
