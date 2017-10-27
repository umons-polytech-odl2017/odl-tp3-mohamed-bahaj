package exercice1;

public class Point implements Drawable {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distanceTo(Point p) {
		return Math.sqrt((double)((this.x - p.getX()) * (this.x - p.getX()) + (this.y - p.getY()) * (this.y - p.getY())));
	}

	public static double distanceBetween(Point p1, Point p2) {
		return Math.sqrt((double)((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY())));
	}

	public Point[] getVertices(){
		return null;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}
