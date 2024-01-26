import java.util.Scanner;
public class Test0042Calculator{
	public static void main (String ...args){
		Scanner scanner = new Scanner (System.in);
		System.out.print("SELECT THE OPERATION:\n 1 for Addition \n 2 for Substraction \n 3 for Multiplication \n= ");
		int operation = scanner.nextInt();
		if (operation !=1 && operation !=2 && operation != 3){
			System.out.print("Invalid Input");
		}else{
			System.out.print("Enter first number:");
			int a = scanner.nextInt();
			System.out.print("Enter second number:");
			int b = scanner.nextInt();
			if (operation == 1){
				System.out.print(a+b);
			}else if (operation == 2){
				System.out.print(a-b);
			}else if (operation == 3){
				System.out.print(a*b);
			}else{
				System.out.print("Invalid Input");
			}
		}
	}
}
		