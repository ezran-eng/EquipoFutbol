
/*
Crear un programa para simular un equipo de futbol (futbolista, entrenador y doctor),
para lo cual tendremos lo siguiente:

-> Una clase Persona, que tendra los siquientes datos: nombre, apellido, edad.
-> La sub clase Futbolista tendra los siguientes datos: dorsal y posicion.
-> La sub clsae Entrenador que tendra de dato la estrategia que utiliza
-> La sub clase Doctor, la titulacion y los años de experiencia.
Hacer un menu donde se tengan las siguientes opciones: Viaje de equipo,
entrenamiento, partido de futbol, planficar entrenamiento, entrevista, curar lession

 */
package test;

import domain.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Persona futbolista1 = new Futbolista(7, "Medio", "Cristiano", "Ronaldo", 36);
    static Persona futbolista2 = new Futbolista(10, "Delantero", "Leo", "Messi", 34);
    static Persona entrenador1 = new Entrenador("Ataque", "Carlos", "Bilardo", 83);
    static Persona medico = new Medico("Lic.en Fisioterapia", 20, "Juan", "Zara", 75);

    public static void main(String[] args) {

        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador1);
        persona.add(medico);
        //llamada al menu
        menu();
    }

    public static void menu() {
        int opc;
        do {
            opc = opcion();

            switch (opc) {
                case 1://Viaje de equipo
                    viajeEquipo();
                    break;

                case 2://Entrenamiento
                    entranarEquipo();
                    break;

                case 3://Partido de futbol
                    partidoFutbol();
                    break;

                case 4://Planificar entrenamiento
                    planificarEntrenamiento();
                    break;

                case 5://Entrevista
                    entrevistaFutbolista();
                    break;

                case 6://Curar lesion
                    curarLesion();
                    break;

                case 0://Salir
                    System.out.println("Programa cerrado con exito.");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        } while (opc != 0);

    }

    private static int opcion() {
        Scanner entrada = new Scanner(System.in);
        int opc;
        System.out.println("\t\t.:Menu:.");
        System.out.println("1 . Viaje de equipo");
        System.out.println("2 . Entrenamiento");
        System.out.println("3 . Partido de futbol");
        System.out.println("4 . Planificar entrenamiento");
        System.out.println("5 . Entrevista");
        System.out.println("6 . Curar Lesion");
        System.out.println("0 . Salir\n");
        System.out.print("Ingrese opcion:");
        opc = entrada.nextInt();

        return opc;
    }

    public static void viajeEquipo() {
        System.out.println("---Listado pesonas del plantel que viajan---");
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + equipo.getApellido() + "->");
            equipo.viajar();
        }
    }

    public static void entranarEquipo() {
        System.out.println("---Listado de personas en el entrenamiento---");
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + equipo.getApellido() + "->");
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbol() {
        System.out.println("---Plantel para el partido---");
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + equipo.getApellido() + "->");
            equipo.partidoFutbol();
        }
    }

    public static void planificarEntrenamiento() {
        System.out.println(entrenador1.getNombre() + " " + entrenador1.getApellido() + "->");
        ((Entrenador)entrenador1).planificarEntrenamiento();
    }

    public static void entrevistaFutbolista(){
        System.out.println(futbolista1.getNombre() + " " + futbolista1.getApellido() + "->");
        ((Futbolista)futbolista1).entrevista();
        
        System.out.println(futbolista2.getNombre() + " " + futbolista2.getApellido() + "->");
        ((Futbolista)futbolista2).entrevista();
    }
    
    public static void curarLesion(){
        System.out.println(medico.getNombre() + " " + medico.getApellido() + "->");
        ((Medico)medico).curarLesion();
    }
}
