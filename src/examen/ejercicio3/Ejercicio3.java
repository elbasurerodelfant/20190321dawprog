package examen.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		do {
			System.out.print("> ");
			try {
				n = Integer.valueOf(in.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Se esperaba un número entero");
			}
		} while (n == 0);

		Set<String> elementos = new HashSet<>();
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			String linea = in.readLine();
			Set<String> compuesto = new HashSet<>();
			String[] a = linea.split(" ");
			for (String s : a)
				compuesto.add(s);
			elementos.addAll(compuesto);
		}
		System.out.println(elementos);
	}
}
