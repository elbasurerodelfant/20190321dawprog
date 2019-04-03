package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado2 extends Rectangulo {

	public Cuadrado2(Color color, double x, double y, boolean rellena, double lado) {
		super(color, x, y, rellena, lado, lado);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado2(double x, double y, double lado) {
		super(x, y, lado, lado);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado2(Color color, double x, double y, double lado) {
		super(color, x, y, lado, lado);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado2(double x, double y, boolean rellena, double lado) {
		super(x, y, rellena, lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setBase(double base) {
		super.setBase(base);
		setAltura(base);
	}

	@Override
	public void setAltura(double altura) {
		super.setAltura(altura);
		setBase(altura);
	}

	public void setLado(double lado) {
		setAltura(lado);
		setBase(lado);
	}

	public double getLado() {
		return getBase();
	}

}
