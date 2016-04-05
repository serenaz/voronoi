// an edge on the Voronoi diagram
public class Edge {

	Point start;
	Point end;
	Point site_left;
	Point site_right;
	Point direction; // edge is really a vector normal to left and right points
	
	Edge neighbor; // the same edge, but pointing in the opposite direction
	
	double slope;
	double yint;
	
	public Edge (Point first, Point left, Point right) {
		start = first;
		site_left = left;
		site_right = right;
		direction = new Point(right.y - left.y, - (right.x - left.x));
		end = null;		
		slope = (right.x - left.x)/(left.y - right.y);
		Point mid = new Point ((right.x + left.x)/2, (left.y+right.y)/2);
		yint = mid.y - slope*mid.x;
	}
	
	public String toString() {
		return start + ", " + end;
	}
}
