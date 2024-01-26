import java.util.Scanner;
public class Test0036FindLastDigit{
	public static void main (String ...args){
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		int y = Math.abs(n);
		int answer = y % 10;
		System.out.print(answer);
	}
}