package HomeworksChapter9.Point;

import HomeworksChapter8.Point.Point;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(1,1);		
		Point point2 = new Point(2,2);
		
		
		point1.DistanceTo(2, 2);
		point1.DistanceToOrigin(3, 1);
		point1.move(3,3);
		
		System.out.println();
		
		point2.DistanceTo(4, 4);
		point2.DistanceToOrigin(6, 5);
		point2.move(5, 5);
	}

}
