import processing.core.PApplet;
import processing.core.PImage;

public class Penguin_1 {

	public int pos1X;
	public int pos1Y;
	PImage luis;

	public Penguin_1(int x, int y, PApplet app) {// constructor
		this.pos1X = 40;
		this.pos1Y = 350;
		luis = app.loadImage("luis.png");

	}

	public void pintar(PApplet app) { // app cuenta como objeto de PApplet
		app.imageMode(app.CENTER);
		app.image(luis, pos1X, pos1Y);
		app.imageMode(app.CORNER);
	}

	public void mover(PApplet app) {// mover con las teclas
		switch (app.key) {
		case 'd':
			this.pos1X += 30;
			if (pos1X > 1060) {
				pos1X = 1051;
			}
			break;
		case 'a':
			this.pos1X -= 30;
			if (pos1X < 9) {
				pos1X = 10;
			}
			break;
		case 's':
			this.pos1Y += 30;
			if (pos1Y > 630) {
				pos1Y = 629;
			}
			break;
		case 'w':
			this.pos1Y -= 30;
			if (pos1Y < 70) {
				pos1Y = 71;
			}
			break;
		}

	}

}
