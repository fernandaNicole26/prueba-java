package com.pruebajava.pruebajava.models;
import java.util.ArrayList;
public class Profesor extends Escuela {
    private String rut;

    
    /************Constructores**************/

    public Profesor() {
    }

   
    public Profesor(String nombre, String asignatura, String curso, String rut) {
    super(nombre, asignatura, curso);
    this.rut = rut;
}


/******************Gettes and Settes**********/
public String getRut() {
    return rut;
}


public void setRut(String rut) {
    this.rut = rut;
}
   

    /******************Funcionalidades**********/



public static Double promedioNotas(ArrayList<Double> notas){
    System.out.println("estoy en el promedio de notas");
    return 4.0;


    
}
}