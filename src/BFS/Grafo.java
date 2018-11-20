package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Grafo {

	private List<Nodo> nodos;
	private int cantDeNodos;
	private ListaDeAdyacencia listaDeAdyacencia;

	private static final int INFINITO = 2147483647;

	public Grafo(int cantDeNodos) {
		this.cantDeNodos = cantDeNodos;
		this.nodos = new ArrayList<>();
		this.listaDeAdyacencia = new ListaDeAdyacencia(cantDeNodos);

		for (int i = 0; i < cantDeNodos; i++) {
			this.nodos.add(new Nodo(i));
		}

	}

	public void setUnion(int nodoI, int nodoJ) {
		this.listaDeAdyacencia.setUnion(nodoI, nodoJ);
	}

	// Calcula la distancia desde un nodo a los demás, medidos
	// en saltos o cantidad de aristas (hoops).

	public int[] calcularBFS(int nodoInicial) {
		int[] vecHoops = new int[this.cantDeNodos];
		Queue<Integer> colaDeNodos = new LinkedList<>();
		int nodoActual = nodoInicial;

		// Inicializo vector con inifinitos
		for (int i = 0; i < vecHoops.length; i++) {
			vecHoops[i] = Grafo.INFINITO;
		}

		//Cargo el nodo y el primero le pongo 0 en sus saltos
		colaDeNodos.add(nodoActual);
		vecHoops[nodoActual] = 0;

		while (!colaDeNodos.isEmpty()) {

			nodoActual = colaDeNodos.poll();
			for (Integer i : this.listaDeAdyacencia.getListaUniones(nodoActual)) {
				if (vecHoops[i] == Grafo.INFINITO) {
					colaDeNodos.add(i);
					vecHoops[i] = vecHoops[nodoActual] + 1;
				}
			}
		}

		return vecHoops;
	}

}
