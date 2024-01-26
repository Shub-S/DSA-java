import java.util.Scanner;
public class Test0034NthTermOfGP{
	public static int nthTerm(int firstTerm, int commonRatio, int numOfTerm){
		int nthTerm=firstTerm*(int)(Math.pow(commonRatio,numOfTerm-1));
		return nthTerm;
	}
	public static void main (String ...args){
		Scanner scanner = new Scanner (System.in);
		int firstTerm = scanner.nextInt();
		int commonRatio = scanner.nextInt();
		int numOfTerm = scanner.nextInt();
		System.out.println(nthTerm(firstTerm,commonRatio,numOfTerm));
	}
}