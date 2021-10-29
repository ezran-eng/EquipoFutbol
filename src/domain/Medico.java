package domain;

public class Medico extends Persona{

    //Atributos
    private String titulacion;
    private int aniosExperiencia;

    //constructores y modulos

    public Medico(String titulacion, int aniosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    

    public String getTitulacion() {
        return this.titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return this.aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Asiste al partido de futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Asiste al entrenamiento");
    }

    public void curarLesion() {
        System.out.println("Cura la lesion");
    }

    @Override
    public String toString() {
        return super.toString() + "\nMedico:" + "\ntitulacion=" + titulacion + ",\naniosExperiencia=" + aniosExperiencia;
    }
    
}
