import java.util.Scanner;
public class Test0050TableOfANumber{
	public static void main(String ...args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i=1;
		while(i<=10){
			System.out.println(n + "*" + i + "=" + i*n);
			i=i+1;
		}
	}
}