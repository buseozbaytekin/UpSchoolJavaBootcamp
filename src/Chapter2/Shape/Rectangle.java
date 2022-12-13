package Chapter2.Shape;

import java.util.Objects;

public class Rectangle extends Shape {

	int x;
	int y;

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return x == other.x && y == other.y;
	}

	@Override
	void draw(int x, int y) {

		System.out.println("Rectangle is drawing");

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (i == 0 | i == x - 1) {
					System.out.print("*");
				} else {
					if (j == 0 | j == y - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}

		}
	}

	@Override
	void erase(int x, int y) {
		System.out.println("Rectangle is ereasing.");
	}

	@Override
	double calculateArea(double base, double height) {
		double area = base * height;
		System.out.println("area: " + area);
		return area;
	}

	@Override
	double calculateCircumference(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
}
