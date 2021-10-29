
package domain;


public class Futbolista extends Persona{
    
    //Atributos
    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Juega partido de Futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Entrena");
    }
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }

    @Override
    public String toString() {
        return super.toString() + "\nFutbolista" + "\ndorsal=" + dorsal + "\nposicion=" + posicion ;
    }
    
    
}
