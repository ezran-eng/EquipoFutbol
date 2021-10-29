
package domain;

public class Entrenador extends Persona{
    
    //Atributos
    private String estrategia;
    
    //Metodos y constructores

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return this.estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Dirige partido");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Entrena a los jugadores");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planifica entrenamiento");
    }

    @Override
    public String toString() {
        return super.toString() + "\nEntrenador:" + "\nestrategia=" + estrategia;
    }
    
}
