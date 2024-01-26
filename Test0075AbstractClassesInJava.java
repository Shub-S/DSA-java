abstract class Shape{
	int color;
	int getcolor(){return color;}
	Shape(int c){color = c;}
	abstract double getArea();
}
class Square extends Shape{
	double side;
	Square(int c, double s){
		super(c);
		side=s;
	}
	double getArea(){return side*side;}
}
public class Test0075AbstractClassesInJava{
	public static void main(String[]args){
		Square s = new Square(5,10.0);
		System.out.println(s.getArea());
	}
}