package examen.ejercicio1;

import java.awt.Color;

public abstract class Figura implements Movible, Comparable<Figura> {

	private Color color = Color.BLACK;
	private double x;
	private double y;
	private boolean rellena = false;

	public Figura(Color color, double x, double y, boolean rellena) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.rellena = rellena;
	}

	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Figura(Color color, double x, double y) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public Figura(double x, double y, boolean rellena) {
		super();
		this.x = x;
		this.y = y;
		this.rellena = rellena;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean isRellena() {
		return rellena;
	}

	public void setRellena(boolean rellena) {
		this.rellena = rellena;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + ", x=" + x + ", y=" + y + ", rellena=" + rellena + "]";
	}

	public abstract double getArea();

	public abstract double getPerimetro();

	public void mover(double dx, double dy) {
		x += dx;
		y += dy;
	}

	@Override
	public int compareTo(Figura o) {
		if (getArea() < o.getArea())
			return -1;
		else if (getArea() > o.getArea())
			return 1;
		return 0;
	}

}
