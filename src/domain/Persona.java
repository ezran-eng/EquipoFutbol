
package domain;


public abstract class Persona {
    
    //Atributos de la clase
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    //Constructores y metodos de la clase

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void viajar(){
        System.out.println("Viaja\n");
    }
    
    public abstract void partidoFutbol();
    
    public abstract void entrenamiento();

    @Override
    public String toString() {
        return "\nDatos de la persona" + "\nnombre=" + nombre + ",\napellido=" + apellido + ",\nedad=" + edad ;
    }
    
    
    
}
