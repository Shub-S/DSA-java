import java.util.Scanner;
public class Test0038DecideTheInputNumber{
	public static void main (String ...args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter a number ");
		int n = scanner.nextInt();
		if (n>0){
			System.out.print("Positive ");
			if (n%2==0){
				System.out.print("Even \n");
			}else{
				System.out.print("Odd \n");
			}
		}
		else if (n<0){
			System.out.print("Negative ");
			if (n%2==0){
				System.out.print("Even \n");
			}else{
				System.out.print("Odd \n");
			}
		}
		else{
			System.out.println("Zero");
		}
	}
}