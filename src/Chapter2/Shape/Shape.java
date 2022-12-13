package Chapter2.Shape;

public abstract class Shape {
	
	int x;
	int y;

	
	
	abstract void draw(int x, int y);
	
	
	
	abstract void erase(int x, int y);
	
	
	abstract double calculateArea(double base, double height);
	
	
	abstract double calculateCircumference(int x, int y);



	
	
	
}
