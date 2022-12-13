package Chapter2.Shape;

import java.util.Objects;

public class Triangle extends Shape {

	int x;
	int y;
	int z;
	
	

	public Triangle(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y, z);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return x == other.x && y == other.y && z == other.z;
	}

	@Override
	void draw(int x, int y) {

		System.out.println("Triangle is drawing");

		for (int i = 1; i < x; i++) {
			for (int k = 0; k < y - 1 / 2; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			y--;
			System.out.println();
		}
	}

	@Override
	void erase(int x, int y) {
		System.out.println("Triangle is ereasing.");
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
