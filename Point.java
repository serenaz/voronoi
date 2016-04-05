// a point in 2D, sorted by y-coordinate
public class Point implements Comparable <Point>{
	
	double x;
	double y;
	
	public Point (double x0, double y0) {
		x = x0;
		y = y0;
	}
	
	public int compareTo (Point other) {
		if (this.y == other.y) {
			if (this.x == other.x) return 0;
			else if (this.x > other.x) return 1;
			else return -1;
		}
		else if (this.y > other.y) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
