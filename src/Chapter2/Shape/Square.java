package Chapter2.Shape;

import java.util.Objects;

public class Square extends Shape{
	
	int x;
	
	@Override
	public int hashCode() {
		return Objects.hash(x);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return x == other.x;
	}

	@Override
	void erase(int x, int y) {
		System.out.println("Square is ereasing.");
	}

	@Override
	void draw(int x, int y) {
		System.out.println("Square is drawing");
		
	}

	@Override
	double calculateArea(double base, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double calculateCircumference(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
