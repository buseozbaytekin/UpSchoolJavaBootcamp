package HomeworksChapter12;

import java.util.Objects;

public class Circle extends Shape{

	int r;
	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(r);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return r == other.r;
	}

	@Override
	double calculateArea(double base, double height) {
		
		double area = Math.PI * (height / 2) * (height / 2);
		
		System.out.println("Circle's area: " + area);
		
		return area;
	}
	
	@Override
	void erase(int x, int y) {
		System.out.println("Shape is ereasing.");
	}
}
