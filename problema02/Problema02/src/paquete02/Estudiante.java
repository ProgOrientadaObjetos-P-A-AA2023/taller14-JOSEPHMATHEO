package paquete02;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private double c1;
    private double c2;
    private double c3;
    private double promedio;
    
    public Estudiante(String n, String a, double cl1, double cl2, double cl3){
        
        nombre = n;
        apellido = a;
        c1 = cl1;
        c2 = cl2;
        c3 = cl3;
        
    }

    public void establecerNombre(String s) {
        
        nombre = s;
        
    }
    
    public void establecerApellido(String s) {
        
        apellido = s;
        
    }

    public void establecerC1(double f) {
        
        c1 = f;
        
    }

    public void establecerC2(double f) {
        
        c2 = f;
        
    }

    public void establecerC3(double f) {
        c3 = f;
    }

    public void calcularPromedio() {
        
        promedio = (c1 + c2 + c3)/3;
        
    }

    public String obtenerNombre() {
        
        return nombre;
        
    }
    
    public String obtenerApellido() {
        
        return nombre;
        
    }

    public double obtenerC1() {
        
        return c1;
        
    }

    public double obtenerC2() {
        
        return c2;
        
    }

    public double obtenerC3() {
        
        return c3;
        
    }

    public double obtenerPromedio() {
        
        return promedio;
        
    }
    
    public String toString(){
    
    String cadena = String.format("%s %s\n"
            + "  Calificaciones: \n"
            + "  %.2f\n"
            + "  %.2f\n"
            + "  %.2f\n"
            + "  Promedio: %.2f", 
            nombre,
            c1,
            c2,
            c3,
            promedio);
    
        return cadena;
    }
    
    
}
    

