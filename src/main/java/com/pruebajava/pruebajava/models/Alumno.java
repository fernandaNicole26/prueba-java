package com.pruebajava.pruebajava.models;

import java.util.ArrayList;

public class Alumno extends Escuela{
    public ArrayList<Double> notas;

   

   /************Constructores****************/

   public Alumno() {
}


   public Alumno(String nombre, String asignatura, String curso) {
    super(nombre, asignatura, curso);
}



/******************Gettes and Settes**********/

public ArrayList<Double> getNotas() {
    return notas;
}


public void setNotas(ArrayList<Double> notas) {
    this.notas = notas;
}




/******************Funcionalidades**********/

public void notas(){
    System.out.println("La nota es: ");
}




}