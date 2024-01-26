import java.util.Scanner;

public class Test0021LogicalOperators{
	public static void main(String ...args){
		String abc="Singh", xyz="SINGH";
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter Passwaord : ");
		String iu = scanner.nextLine();
		String ip = scanner.nextLine();
		
		if (abc.equals(iu) && xyz.equals(ip))
			System.out.println("Welcome");
		else
			System.out.println("Try Again");
	}
}