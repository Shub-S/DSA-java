import java.util.Scanner;
public class Test0037OddEven{
	public static void main(String ...args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scanner.nextInt();
		if (n%2==0){
			System.out.println("The number is Even");
		}else{ 
			System.out.println("The number is Odd");
		}
	}
}