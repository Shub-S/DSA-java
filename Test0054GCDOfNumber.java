import java.util.Scanner;
public class Test0054GCDOfNumber{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int ans = 1;
		int x = Math.min(a,b);
		for(int i=1;i<=x;i++){
			if(a%i==0 && b%i==0){
				ans=i;
			}
		}
		System.out.print(ans);
	}
}