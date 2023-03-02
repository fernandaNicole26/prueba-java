package com.pruebajava.pruebajava.models;

public class Escuela {
  public String nombre;
  public String asignatura;
  public String curso;


  /************Constructores********/

  public Escuela() {
}


public Escuela(String nombre, String asignatura, String curso) {
    this.nombre = nombre;
    this.asignatura = asignatura;
    this.curso = curso;
}


/******************Gettes and Settes**********/

public void promedio(){
    System.out.println("El promedio es: ");

}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getAsignatura() {
    return asignatura;
}


public void setAsignatura(String asignatura) {
    this.asignatura = asignatura;
}


public String getCurso() {
    return curso;
}


public void setCurso(String curso) {
    this.curso = curso;
}


/******************Funcionalidades**********/



}


