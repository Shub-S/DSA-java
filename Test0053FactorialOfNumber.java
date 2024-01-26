import java.util.Scanner;
public class Test0053FactorialOfNumber{
	public static void main(String ...args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i =1;
		while (n>0){
			i=i*n;
			n--;
		}
		System.out.println(i);
	}
}