import java.util.Scanner;
public class Test0035SumOfNNaturalNumber{
	public static int getsum(int n){
		return n*(n+1)/2;
	}
	public static void main (String ...args){
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		System.out.println("Sum of n Term ="+getsum(n));
	}
}