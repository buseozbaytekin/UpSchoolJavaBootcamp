package HomeworksChapter12;

import java.util.Objects;

public class Triangle extends Shape{
	
	int x;
	int y;
	int z;
	
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
		
		for(int i = 1; i < x; i++) {
			for(int k = 0; k < y - 1 / 2; k++) {
			System.out.print(" ");
			}
			for(int j = 0; j < 2 * i - 1; j++) {
			System.out.print("*");
			}
			y--;
			System.out.println();
			}
	}
	
//	@Override
//	double calculateArea(int base, int height) {
//		double area = 2 / (base * height);
//		
//		return area;
//	}
	
	@Override
	void erase(int x, int y) {
		System.out.println("Triangle is ereasing.");
	}
	

}
