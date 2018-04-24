package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Prueba {

	public static void main(String[] args) {
	/*	Lista lista= new Lista();
		lista.addLista(Colores.amarillo);
		lista.addLista(Colores.azul);
		lista.addLista(Colores.azul);
		lista.addLista(Colores.azul);
		//System.out.println(lista.getLista().getFirst().toString()); 
		//System.out.println(lista.getLista().toString()); Para visualizarla toda
		
		//Busqueda color
		
		System.out.println(lista.busquedaColor(Colores.amarillo));
		
		//Borrar colores
		
		ArrayList<Integer> posiciones= new ArrayList<Integer>();
		posiciones.add(0);
		posiciones.add(1);
		System.out.println(lista.borrarColores(posiciones));*/
		
		Datos datos= new Datos();
		ArrayList<Colores> repetidos= new ArrayList<Colores>();
		repetidos.add(Colores.azul);
		repetidos.add(Colores.rojo);
		System.out.println(datos.sortearColor(repetidos));
			
		
		

	}
	
}

