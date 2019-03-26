package examen.ejercicio1;

import java.util.Comparator;

public class ComparatorRellenoPerimetro implements Comparator<Figura> {

	@Override
	public int compare(Figura f1, Figura f2) {
		if (!f1.isRellena() && f2.isRellena())
			return -1;
		else if (f1.isRellena() && !f2.isRellena())
			return 1;
		else {
			if (f1.getPerimetro() < f2.getPerimetro())
				return -1;
			else if (f1.getPerimetro() > f2.getPerimetro())
				return 1;
			return 0;
		}
	}

}
