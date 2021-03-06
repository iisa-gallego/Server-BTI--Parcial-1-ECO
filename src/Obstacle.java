import processing.core.PApplet;
import processing.core.PImage;

public class Obstacle {

	public int objX;
	public int objY;
	PImage enemy;

	public Obstacle(int x, int y, PApplet app) {// constructor
		this.objX = 40;
		this.objY = 350;
		enemy = app.loadImage("obstacle.png");

	}

	public void pintar(PApplet app) { // app cuenta como objeto de PApplet
		app.imageMode(app.CENTER);
		app.image(enemy, objX, objY);
		app.imageMode(app.CORNER);
	}

	public int getObjX() {
		return objX;
	}

	public void setObjX(int objX) {
		this.objX = objX;
	}

	public int getObjY() {
		return objY;
	}

	public void setObjY(int objY) {
		this.objY = objY;
	}

	public PImage getEnemy() {
		return enemy;
	}

	public void setEnemy(PImage enemy) {
		this.enemy = enemy;
	}

}