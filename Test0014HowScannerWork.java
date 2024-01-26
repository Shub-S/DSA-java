import java.util.Scanner;

public class Test0014HowScannerWork{
	public static void main(String ...args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a string:");
		String s = scanner.nextLine();
		System.out.println("You Entered String "+ s);
		
		System.out.println("Enter a integer:");
		int x = scanner.nextInt();
		System.out.println("You Entered Integer "+ x);
		
		System.out.println("Enter a float:");
		float f = scanner.nextFloat();
		System.out.println("You Entered Float "+ f);
	}
}