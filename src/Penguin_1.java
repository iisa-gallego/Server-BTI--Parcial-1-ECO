import processing.core.PApplet;
import processing.core.PImage;

public class Penguin_1 {

	public int pos1X;
	public int pos1Y;
	PImage luis;

	public Penguin_1(int x, int y, PApplet app) {// constructor
		this.pos1X = 40;
		this.pos1Y = 350;
		luis = app.loadImage("Kruguer.png");
		
	}

}
