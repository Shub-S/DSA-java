import java.util.Scanner;
public class Test0055LCM{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int x = Math.max(a,b);
		int y = a*b;
		int ans = x;
		for(int i=x;i<=y;i++){
			if(i%a==0 && i%b==0){
				ans=i;
				break;
			}
		}
		System.out.print(ans);
	}
}