package logica;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import modelo.Cola;
import modelo.Colores;
import modelo.Lista;
import modelo.Pila;
import utiles.Constantes;

public class Datos {

	private Lista lista = new Lista();
	private Cola cola = new Cola(generarCola());
	private Pila pilaUno = new Pila(generarPilaUno());
	private Pila pilaDos = new Pila(generarPilaDos());

	public Datos(){
		super();
	}

	public Lista getLista() {
		return lista;
	}

	public void setLista(Lista lista) {
		this.lista = lista;
	}

	public Cola getCola() {
		return cola;
	}

	public void setCola(Cola cola) {
		this.cola = cola;
	}

	public Pila getPilaUno() {
		return pilaUno;
	}

	public void setPilaUno(Pila pilaUno) {
		this.pilaUno = pilaUno;
	}

	public Pila getPilaDos() {
		return pilaDos;
	}

	public void setPilaDos(Pila pilaDos) {
		this.pilaDos = pilaDos;
	}

	/**
	 * coge las dos pilas y las deja del mismo tamaño (y si es impar el primero lo deja mas peque) funciona perfecto
	 */
	public void equilibrarPilas() {
		int largo= (this.pilaUno.getPila().size()+this.pilaDos.getPila().size())/2;
		LinkedList<Colores> pilaParcial= new LinkedList<Colores>();
		rellenarPilaParcial(pilaParcial);
		desordenarColores(pilaParcial);
		rellenarDeNuevoPilas(pilaParcial, largo);
		
		
	}
	
	/**
	 * Desordena una lista de colores para entrarlas en las pilas y que estén desordenadas.
	 * @param pilaParcial
	 */
	private void desordenarColores(LinkedList<Colores> pilaParcial){

		for (int i = 0; i < 100; i++) {
			int aleatorio= (int) (Math.random()*pilaParcial.size());
			Colores color= pilaParcial.remove(aleatorio);
			pilaParcial.add(color);
		}
	}
	
	/**
	 * Rellena las pilas (la primera es la corta en caso de impar) con los colores de la pila parcial
	 * @param pilaParcial
	 * @param largo
	 */
	private void rellenarDeNuevoPilas(LinkedList<Colores>pilaParcial,int largo){
		int numeroParcial=0;
		for (Iterator iterator = pilaParcial.iterator(); iterator.hasNext();) {
			Colores color = (Colores) iterator.next();
			if(numeroParcial<largo){
				this.pilaUno.apilar(color);
				
			}
			else{
				this.pilaDos.apilar(color);
			}
			numeroParcial++;
		}
	}
	
	/**
	 * Rellena una pila parcial con las dos pilas para poder desordenarla.
	 * @param pilaParcial
	 */
	private void rellenarPilaParcial(LinkedList<Colores>pilaParcial)
	{

		for (Iterator iterator = pilaUno.getPila().iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			pilaParcial.add(pilaUno.getPila().getFirst());
			iterator.remove();
		}
		
		for (Iterator iterator = pilaDos.getPila().iterator(); iterator.hasNext();) {
			Colores colores = (Colores) iterator.next();
			pilaParcial.add(pilaDos.getPila().getFirst());
			iterator.remove();
			
		}
	}

	/**
	 * Una cola de diez posiciones con colores aleatorios
	 * @return
	 */
	public LinkedList<Colores> generarCola() {
		
		LinkedList<Colores> ColaParcial=new LinkedList<Colores>();
		for (int i = 0; i < Constantes.tamanioCola; i++) {
			int aleatorio= (int)(Math.random()*Constantes.numeroColores);
			ColaParcial.add(Constantes.colores[aleatorio]);
		}
		return ColaParcial;
	}
	
	public LinkedList<Colores> generarPilaUno(){
		LinkedList<Colores> PilaParcial= new LinkedList<Colores>();
		for (int i = 0; i < Constantes.tamanioPilaUno; i++) {
			PilaParcial.add(Colores.blanco);
		}
		return PilaParcial;
	}
	
	public LinkedList<Colores> generarPilaDos(){
		LinkedList<Colores> PilaParcial= new LinkedList<Colores>();
		for (int i = 0; i < Constantes.tamanioPilaDos; i++) {
			PilaParcial.add(Colores.blanco);
		}
		return PilaParcial;
	}
	
	/**
	 * Devuelve un color teniendo en cuenta que no puede devolver un repetido
	 * @param repetidos
	 * @return
	 */
	public Colores sortearColor(ArrayList<Colores> repetidos) {
		boolean salir= true;
		int index=0;
		do{
			index = (int) (Math.random()*(Colores.getCantidadElementos()));
			
			salir=true;
			for (int i = 0; i < repetidos.size(); i++) {
				if(Colores.getElement(index).equals(repetidos.get(i))){
					salir= false;
				}
			}
			
		}while(!salir);
	
		return Colores.values()[index];
	}
}
