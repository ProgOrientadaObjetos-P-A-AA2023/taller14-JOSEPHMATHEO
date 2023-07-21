package paquete02;


public class Trabajador {
    
    private String cedula;
    private String nombre;
    private String correo;
    private String mesSuelo;
    private double sueldo;
    
    public Trabajador(String c, String n, String cr, String m, double s){
        
        cedula = c;
        nombre = n; 
        correo = cr;       
        mesSuelo = m;
        sueldo = s;
                
    }

    public void establecerCedula(String s) {
        cedula = s;
    }

    public void establecerNombre(String s) {
        
        nombre = s;
        
    }

    public void establecerCorreo(String s) {
        
        correo = s;
        
    }

    public void establecerMesSuelo(String s) {
        
        mesSuelo = s;
        
    }

    public void establecerSueldo(double f) {
        
        sueldo = f;
        
    }

    public String obtenerCedula() {
        
        return cedula;
        
    }

    public String obtenerNombre() {
        
        return nombre;
        
    }

    public String obtenerCorreo() {
        
        return correo;
        
    }

    public String obtenerMesSuelo() {
        
        return mesSuelo;
        
    }

    public double obtenerSueldo() {
        
        return sueldo;
        
    }
    
    public String toString(){
        
        String cadena = String.format("\tNombre: %s\n"
                + "\tCedula: %s\n"
                + "\tCorreo: %s\n"
                + "\tMes Sueldo: %s\n"
                + "\tSueldo: %.2f",
                nombre,
                cedula,
                correo,
                mesSuelo,
                sueldo);
    
        return cadena;
        
    }
    
}
