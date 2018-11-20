package tests;

import org.junit.Test;
import BFS.Grafo;

public class testsBFS {
	
	@Test
	public void ejCarpetaNodo0() {
		Grafo gDFS = new Grafo(13);
		gDFS.setUnion(0, 1);
		gDFS.setUnion(0, 8);
		gDFS.setUnion(1, 2);
		gDFS.setUnion(1, 5);
		gDFS.setUnion(2, 3);
		gDFS.setUnion(5, 4);
		gDFS.setUnion(5, 6);
		gDFS.setUnion(5, 9);
		gDFS.setUnion(6, 7);
		gDFS.setUnion(4, 8);
		gDFS.setUnion(8, 9);
		gDFS.setUnion(9, 10);
		gDFS.setUnion(11, 12);

		int[] vecHoops = gDFS.calcularBFS(0);
		System.out.println("Saltos para llegar del nodo 0 a otros nodos: ");
		for (int i = 0; i < vecHoops.length; i++) {
			System.out.println("al Nodo: " + i + "  Saltos:  " + vecHoops[i]);
		}
	}
	
	@Test
	public void ejCarpetaNodo7() {
		Grafo gDFS = new Grafo(13);
		gDFS.setUnion(0, 1);
		gDFS.setUnion(0, 8);
		gDFS.setUnion(1, 2);
		gDFS.setUnion(1, 5);
		gDFS.setUnion(2, 3);
		gDFS.setUnion(5, 4);
		gDFS.setUnion(5, 6);
		gDFS.setUnion(5, 9);
		gDFS.setUnion(6, 7);
		gDFS.setUnion(4, 8);
		gDFS.setUnion(8, 9);
		gDFS.setUnion(9, 10);
		gDFS.setUnion(11, 12);

		int[] vecHoops = gDFS.calcularBFS(7);
		System.out.println("Saltos para llegar del nodo 7 a otros nodos: ");
		for (int i = 0; i < vecHoops.length; i++) {
			System.out.println("al Nodo: " + i + "  Saltos:  " + vecHoops[i]);
		}
	}
	
	@Test
	public void ejCarpetaNodo9() {
		Grafo gDFS = new Grafo(13);
		gDFS.setUnion(0, 1);
		gDFS.setUnion(0, 8);
		gDFS.setUnion(1, 2);
		gDFS.setUnion(1, 5);
		gDFS.setUnion(2, 3);
		gDFS.setUnion(5, 4);
		gDFS.setUnion(5, 6);
		gDFS.setUnion(5, 9);
		gDFS.setUnion(6, 7);
		gDFS.setUnion(4, 8);
		gDFS.setUnion(8, 9);
		gDFS.setUnion(9, 10);
		gDFS.setUnion(11, 12);

		int[] vecHoops = gDFS.calcularBFS(9);
		System.out.println("Saltos para llegar del nodo 9 a otros nodos: ");
		for (int i = 0; i < vecHoops.length; i++) {
			System.out.println("al Nodo: " + i + "  Saltos:  " + vecHoops[i]);
		}
	}
	
	
}
