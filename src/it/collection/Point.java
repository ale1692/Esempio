package it.collection;

public class Point implements Comparable<Point> {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean equals(Object point) {
		if (point instanceof Point) {
			Point p = (Point) point;
			return (x == p.x && y == p.y) ? true : false;
		} else
			return false;
	}

	public int hashCode() {
		return 1;
	}

	@Override
	public int compareTo(Point p) {

		if (this.x == p.x && this.y == p.y)
			return 0;
		else if (this.x > p.x || this.y > p.y)
			return 1;
		else
			return -1;
	}

}
