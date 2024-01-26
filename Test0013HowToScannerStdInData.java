import java.util.Scanner;

public class Test0013HowToScannerStdInData{

	public static void main(String ...args) {
		Scanner scanner = new Scanner(System.in);
		String line=scanner.nextLine();
		System.out.println(line);	
		int a = scanner.nextInt();
	    int b = scanner.nextInt();
		System.out.println(a+" + "+b+":"+(a+b));
		
	}
}