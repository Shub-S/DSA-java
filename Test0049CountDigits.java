import java.util.Scanner;
public class Test0049CountDigits{
	public static void main(String ...args){
		Scanner scanner= new Scanner (System.in);
		int n = scanner.nextInt();
		int count = 0;
		while (n>0){
			n = n/10;
			count = count + 1;
		}
			System.out.print(count);
	}
}