import java.util.Scanner;

public class Test0081UdemyArray4{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Size: ");
		int n =scanner.nextInt();
		
		int[]A = new int[n];
		A[0] = 2;
		
		System.out.println("Enter"+(n-1)+"elements: ");
		
		for (int i=1; i<n; i++){
			A[i]=scanner.nextInt();
		}
		
		System.out.println("Elements entered: ");
		
		for(int x:A){
			System.out.println(x);
		}
		
		scanner.close();
	}
}