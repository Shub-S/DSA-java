class Point{
	int x, y;
	void print(){
		System.out.println("x="+x+",y="+y);
	}
}

public class Test0065ConstructionInJava{
	public static void main(String[]args){
		Point p = new Point();
		p.print();
	}
}