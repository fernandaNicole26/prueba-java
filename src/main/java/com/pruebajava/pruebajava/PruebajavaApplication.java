package com.pruebajava.pruebajava;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.pruebajava.pruebajava.models.Alumno;
import com.pruebajava.pruebajava.models.Profesor;
import java.util.Scanner;
import java.util.ArrayList;


@SpringBootApplication
public class PruebajavaApplication{

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno();
		Profesor profesor1 =new Profesor();
		ArrayList<Double> notas = new ArrayList<Double>();		
		Integer opcion;
		profesor1.setNombre("juan");

Scanner teclado = new Scanner(System.in);
		String nomAlum = "";  
		Integer cantNotas;
		
		do{
			System.out.print("Indique la cantidad de notas por alumnos: ");
			cantNotas = teclado.nextInt();
			if(cantNotas <= 0){
				System.out.print("La cantidad debe ser mayor a cero");
			}
		}while(cantNotas <= 0);
		
			System.out.print("Ingresa nombre del alumno: ");
			nomAlum = teclado.nextLine();
			alumno1.setNombre(nomAlum);
			for(int x = 1; x <= cantNotas; x++){
				System.out.print("Ingresa nota " +x+ " del alumno "+ nomAlum +": ");
				Double nota = teclado.nextDouble();
				notas.add(nota);
				alumno1.setNotas(notas);
			}
				

			do{
				System.out.println("**************Comienzo de Menú***************");
				System.out.println("Bienvenido/a");
				System.out.println("Seleccione 1 si quiere obtener el promedio de las notas por alumno.");
				System.out.println("Seleccione 2 si quiere ver la mejor nota del alumno");
				System.out.println("Seleccione 3 si quiere ver la peor nota del alumno");
				System.out.println("Seleccione 4 si quiere ver todas las notas del alumno");
				System.out.println("Seleccione 0 para salir del menú");
				System.out.print("Seleccione su opción: ");
				opcion = teclado.nextInt();
				teclado.close();		
			
		};
		
		while
	}
	