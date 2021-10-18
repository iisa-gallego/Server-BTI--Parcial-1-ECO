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

}

