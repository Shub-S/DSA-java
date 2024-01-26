class Point{
	int x,y;
	Point(int x , int y){
		this x = x;
		this y = y;
	}
	Point set x(int x ){
		this x=x;
		return this;
	}
	Point set y(int y){
		this y=y;
		return this;
	}
}

public class Test0060ThisReference{
	public static void main(String...args){
		Point p1 = new Point(10,20);
		Point p2 = new Point(5,15);
		p1.set x(2).set y(3);
	}
}