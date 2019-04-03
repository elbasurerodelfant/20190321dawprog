package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado(Color color, double x, double y, boolean rellena, double lado) {
		super(color, x, y, rellena);
		this.lado = lado;
	}

	public Cuadrado(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
	}

	public Cuadrado(Color color, double x, double y, double lado) {
		super(color, x, y);
		this.lado = lado;
	}

	public Cuadrado(double x, double y, boolean rellena, double lado) {
		super(x, y, rellena);
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}

	@Override
	public double getPerimetro() {
		return 4 * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setRadio(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]" + super.toString();
	}

}
