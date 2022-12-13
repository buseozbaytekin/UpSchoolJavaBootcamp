package HomeworksChapter8.Point;

public class Point {

	int x;
	int y;
	
	public Point (int x, int y) {
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
	
	
	public double DistanceToOrigin(int x, int y) {
		
		double distanceToOrigin = Math.sqrt((x * x) + (y * y));
		System.out.println("Point(" + x + "," + y + ") to origin: " + distanceToOrigin);
		return distanceToOrigin;
	}
	
	
	
	
	public double DistanceTo(int x, int y) {
		
		double distanceTo = Math.sqrt(((x - this.getX()) * (x - this.getX())) + ((y - this.getY()) * (y - this.getY())));
		System.out.println("Point(" + x + "," + y + ") to point ("+ this.x + "," + this.y + "): " + distanceTo);
		return distanceTo;
	}
	
	
	
//	public void clone(int x, int y) {
//		
//		return;
//	}
	
	
	public void move(int x, int y) {
		
		if(x == 'x')
			this.x += x;
		else if (y == 'y')
			this.y += y;
		System.out.println("Point(" + this.x + "," + this.y + ") move to point ("+ x + "," + y + "): " + "(" + (this.x + x) + "," + (this.y + y) + ")");
	
	}
	
}
