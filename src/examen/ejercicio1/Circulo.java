package examen.ejercicio1;

import java.awt.Color;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(Color color, double x, double y, boolean rellena, double radio) {
		super(color, x, y, rellena);
		this.radio = radio;
	}

	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	public Circulo(Color color, double x, double y, double radio) {
		super(color, x, y);
		this.radio = radio;
	}

	public Circulo(double x, double y, boolean rellena, double radio) {
		super(x, y, rellena);
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]" + super.toString();
	}
	
	

}
