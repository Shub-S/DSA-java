import java.util.Scanner;
public class Test0056AllDicisorsOfNumber{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i;
		for(i=1;i*i<n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
		for( ;i>=1;i--){
			if(n%i==0){
				System.out.println(n/i);
			}
		}
	}
}