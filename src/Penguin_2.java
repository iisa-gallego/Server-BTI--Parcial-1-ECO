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

	public void pintar(PApplet app) { // app cuenta como objeto de PApplet
		app.imageMode(app.CENTER);
		app.image(jorge, pos2X, pos2Y);
		app.imageMode(app.CORNER);
	}

	public void mover(PApplet app) {// mover con las teclas
		switch (app.key) {
		case 'd':
			this.pos2X += 30;
			if (pos2X > 1060) {
				pos2X = 1051;
			}
			break;
		case 'a':
			this.pos2X -= 30;
			if (pos2X < 9) {
				pos2X = 10;
			}
			break;
		case 's':
			this.pos2Y += 30;
			if (pos2Y > 630) {
				pos2Y = 629;
			}
			break;
		case 'w':
			this.pos2Y -= 30;
			if (pos2Y < 70) {
				pos2Y = 71;
			}
			break;
		}

	}

}
