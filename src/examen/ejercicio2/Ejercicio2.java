package examen.ejercicio2;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.ComparatorRellenoPerimetro;
import examen.ejercicio1.Figura;
import examen.ejercicio1.Movible;
import examen.ejercicio1.Sprite;

public class Ejercicio2 {

	public static void main(String[] args) {
		Set<Movible> set = new HashSet<>();
		set.add(new Circulo(10, 10, 50));
		set.add(new Sprite(new BufferedImage(200, 100, BufferedImage.TYPE_INT_ARGB), 100, 100));

		set.forEach((m) -> {
			m.mover(10, 10);
		});

		for (Movible m : set)
			m.mover(10, 10);

		Iterator<Movible> i = set.iterator();
		while (i.hasNext())
			i.next().mover(10, 10);

		List<Figura> lista = new ArrayList<>();
		// Añadir figuras a la lista;
		Collections.sort(lista);
		Collections.sort(lista, Collections.reverseOrder());
		Comparator<Figura> comparador = new ComparatorRellenoPerimetro();
		Collections.sort(lista, comparador);
		Collections.sort(lista, Collections.reverseOrder(comparador));
	}

}
