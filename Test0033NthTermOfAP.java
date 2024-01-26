import java.util.Scanner;
public class Test0033NthTermOfAP{
	public static int calcNthTerm(int firstTerm, int commonDiff, int numOfTerm){
		return firstTerm+(numOfTerm-1)*commonDiff;
	}
	public static void main (String ...args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first term:");
		int firstTerm =scanner.nextInt(); 
		System.out.println("Enter the common difference:");
		int commonDiff =scanner.nextInt();
		System.out.println("Enter the number of term:");
		int numOfTerm =scanner.nextInt();
		System.out.println("nth Term:"+calcNthTerm(firstTerm,commonDiff,numOfTerm));
	}
}

// actor , action