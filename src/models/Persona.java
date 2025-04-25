package models;

public class Persona {
    private String name;
    private int edad;
    private Direccion direccion;
    public Persona(String name, int edad, Direccion direccion) {
        this.name = name;
        this.edad = edad;
        this.direccion = direccion;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public int getCodigoDireccion(Persona persona){
        return direccion.getCodigo();
    }
    public boolean compareCodigoDireccion(Persona persona){
        boolean condicion= direccion.getCodigo()>persona.getDireccion().getCodigo();
        return condicion;
    }
    public boolean compareCodigoDireccion(int codigoDireccion){
        boolean condicion=direccion.getCodigo()>codigoDireccion;
        return condicion;
    }
    public boolean equalsByCodigoDireccion(Persona persona){
        boolean condicion=direccion.getCodigo()==persona.getDireccion().getCodigo();
        return condicion;
    }
    public boolean equalsByCodigoDireccion(int codigoDireccion){
        boolean condicion=direccion.getCodigo()==codigoDireccion;
        return condicion;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+name+", Edad: "+edad+", Direccion: "+direccion;
    }
}
