package HomeworksChapter12;

public class Shape {
	
	int x;
	int y;

	
	
	void draw(int x, int y) {
		
	}
	
	
	
	void erase(int x, int y) {
			System.out.println("Shape is ereasing.");
	}
	
	
	double calculateArea(double base, double height) {
		double area = base * height;
		System.out.println("area: " + area);
		return area;
	}
	
	
	double calculateCircumference(int x, int y) {
		double circumference = (2 * (x + y));
		System.out.println("Circumference: " + circumference);
		return circumference;
	}



	
	
	
}
