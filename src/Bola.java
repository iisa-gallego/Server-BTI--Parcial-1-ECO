import processing.core.PApplet;
import processing.core.PImage;

public class Bola {

	public int bolaX;
	public int bolaY;
	PImage bola;

	public Bola(int x, int y, PApplet app) {// constructor
		this.bolaX = 40;
		this.bolaY = 350;
		bola = app.loadImage("bola.png");

	}

	public void pintar(PApplet app) { // app cuenta como objeto de PApplet
		app.imageMode(app.CENTER);
		app.image(bola, bolaX, bolaY);
		app.imageMode(app.CORNER);
	}

	public int getBolaX() {
		return bolaX;
	}

	public void setBolaX(int bolaX) {
		this.bolaX = bolaX;
	}

	public int getBolaY() {
		return bolaY;
	}

	public void setBolaY(int bolaY) {
		this.bolaY = bolaY;
	}

	public PImage getBola() {
		return bola;
	}

	public void setBola(PImage bola) {
		this.bola = bola;
	}

}
