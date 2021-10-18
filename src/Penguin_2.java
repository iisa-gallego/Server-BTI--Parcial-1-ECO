import processing.core.PApplet;
import processing.core.PImage;

public class Penguin_2 {

	public int pos2X;
	public int pos2Y;
	PImage jorge;

	public Penguin_2(int x, int y, PApplet app) {// constructor
		this.pos2X = 40;
		this.pos2Y = 350;
		jorge = app.loadImage("jorge.png");

	}

}
