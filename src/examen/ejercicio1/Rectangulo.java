package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends Figura {

	private double base;
	private double altura;

	public Rectangulo(Color color, double x, double y, boolean rellena, double base, double altura) {
		super(color, x, y, rellena);
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(double x, double y, double base, double altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Color color, double x, double y, double base, double altura) {
		super(color, x, y);
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(double x, double y, boolean rellena, double base, double altura) {
		super(x, y, rellena);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return base * altura;
	}

	@Override
	public double getPerimetro() {
		return 2 * (base + altura);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]" + super.toString();
	}

}
