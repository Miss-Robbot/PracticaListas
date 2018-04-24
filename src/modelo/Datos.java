package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Datos {

	private Lista lista = new Lista();
	private Cola cola = new Cola(generarCola());
	private Pila pilaUno = new Pila();
	private Pila pilaDos = new Pila();

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
	 * coge las dos pilas y las deja del mismo tama�o
	 */
	public void EquilibrarPila() {

	}

	public LinkedList<Colores> generarCola() {
		return null;
	}
	
	public Colores sortearColor(ArrayList<Colores> repetidos) {
		boolean salir= true;
		int index=0;
		do{
			index = (int) (Math.random()*(Colores.getCantidadElementos()-1))+1;
			
			salir=true;
			for (int i = 0; i < repetidos.size(); i++) {
				if(Colores.getElement(index).equals(repetidos.get(i))){
					salir= false;
				}
			}
			
		}while(!salir);
	
		return Colores.values()[index];//k
	}
}
