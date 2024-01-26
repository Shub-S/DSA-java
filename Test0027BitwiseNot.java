import java.util.Scanner;
public class Test0027BitwiseNot{
	public static void main(String ...args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter x value :");
		int x = scanner.nextInt();
		System.out.println(~x);
	}
}