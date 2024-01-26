import java.util.Scanner;
public class Test0040LargestOfThreeNumber{
	public static void main(String ...args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int ans1 = Math.max(a,b);
		int ans = Math.max(ans1,c);
		System.out.print(ans);
	}
}