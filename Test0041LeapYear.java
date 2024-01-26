import java.util.Scanner;
public class Test0041LeapYear{
	public static void main(String ...args){
		Scanner scanner = new Scanner (System.in);
		int year = scanner.nextInt();
		if (year % 4 == 0 && year % 100 != 0){
			System.out.print("Yes");
		}else if (year % 400 == 0){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}