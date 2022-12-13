package HomeworksChapter8.Circle;

public class Circle {

	double radius;
	
	public double calculateArea(double radius) {
		double area = (Math.PI) * radius * radius;
		return area;
	}
	
	public double circumference(double radius) {
		double circle = 2 * (Math.PI) * radius;
		return circle;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		System.out.println(circle.calculateArea(10));
		System.out.println(circle.circumference(10));
		
		
	}

}
