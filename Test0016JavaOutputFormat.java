public class Test0016JavaOutputFormat{
	public static void main(String ...args)
	{
		int x=100, y=200;
		System.out.format("Value of x is %d \n",x);
		float z = (float)Math.PI;
		System.out.println(z);
		System.out.format("Value of PI = %.2f \n",z);
		System.out.format("Value of PI = % 5.2f \n",z);
		System.out.format("Value of PI = % 05.2f \n",z);
		System.out.printf("x=%d, y=%d", x,y);
	}	
}