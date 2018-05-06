package modelo;

import java.util.ArrayList;

public interface Listable {

	/**
	 * Añade un color a la lista
	 * @param color
	 */
	public void addLista(Colores color);
	
	/**
	 * Borra color en todas sus posiciones y actualiza monedas
	 * @param posiciones
	 * @return
	 */
	public void borrarColores(Colores color);
	
	/**
	 * recorre la lista y devuelve las posiciones con colores repetidos en tres posiciones seguidas
	 * @return numero de monedas
	 */
	public ArrayList<Integer> recorrerAutomatico();
	
	/**
	 * Busca x color y devuelve las posiciones donde lo encuentra
	 * @param color
	 * @return
	 */
	//public ArrayList<Integer> busquedaColor(Colores color);
}
