package logica;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;

import modelo.Colores;

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
		
		/*Datos datos= new Datos();
		ArrayList<Colores> repetidos= new ArrayList<Colores>();
		repetidos.add(Colores.rojo);
		repetidos.add(Colores.azul);
		repetidos.add(Colores.naranja);
		repetidos.add(Colores.amarillo);
		repetidos.add(Colores.verde);
		for (int i = 0; i < 100; i++) {
			System.out.println((datos.sortearColor(repetidos)).toString());
		}*/
		
		/*Datos datos= new Datos();
		datos.getPilaUno().apilar(Colores.rojo);
		datos.getPilaUno().apilar(Colores.azul);
		datos.getPilaDos().apilar(Colores.amarillo);
		datos.getPilaDos().apilar(Colores.rojo);
		datos.getPilaDos().apilar(Colores.naranja);
		LinkedList<Colores> pilaParcial= new LinkedList<Colores>();
		LinkedList<Colores> pilaBlancos= new LinkedList<Colores>();
		datos.equilibrarPilas();
		System.out.println(datos.getPilaUno().getPila().toString());
		System.out.println(datos.getPilaDos().getPila().toString());*/
	
		/*datos.equilibrarPilas();
		System.out.println(datos.getPilaUno().getPila().toString()+"\n"+datos.getPilaDos().getPila().toString());*/
		
		/*Datos datos= new Datos();
		System.out.println(datos.getCola().getCola().toString());*/
		
		/*Acciones acciones= new Acciones();
		acciones.entrarColorPila(Colores.verde);
		System.out.println(acciones.getDato().getPilaUno().getPila());
		System.out.println(acciones.getDato().getPilaDos().getPila());*/
		
		Datos datos= new Datos();
		datos.getLista().addLista(Colores.rojo);
		datos.getLista().addLista(Colores.rojo);
		datos.getLista().addLista(Colores.rojo);
		datos.getLista().addLista(Colores.rojo);
		datos.getLista().addLista(Colores.azul);
		System.out.println(datos.getLista().getLista().toString());
		datos.getLista().recorrerListaAutomatico();
		System.out.println(datos.getLista().getLista().toString());
		System.out.println(datos.getLista().getLista().size());
		
	
	}
	
}

