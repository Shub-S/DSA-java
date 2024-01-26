
public class Test0006SwapTwoNumbers{
	public static void main (String [] args){
		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("Before Swaping :");
		System.out.println ("a = " + a);
		System.out.println ("b = " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swaping :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}