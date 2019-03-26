package examen.ejercicio1;

import java.awt.image.BufferedImage;

public class Sprite implements Movible{

	private BufferedImage bitmap;
	private double x;
	private double y;
	
	public Sprite(BufferedImage bitmap, double x, double y) {
		super();
		this.bitmap = bitmap;
		this.x = x;
		this.y = y;
	}

	public BufferedImage getBitmap() {
		return bitmap;
	}

	public void setBitmap(BufferedImage bitmap) {
		this.bitmap = bitmap;
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

	@Override
	public String toString() {
		return "Sprite [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void mover(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
}
