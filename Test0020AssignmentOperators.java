public class Test0020AssignmentOperators{
	public static void main(String ...args){
		int x=10, y=5, z ;
		x += y;
		System.out.println("x = "+x);
		x %= y;
		System.out.println("x = "+x);
		z=x=y;
		System.out.println("z = "+z);
	}
}