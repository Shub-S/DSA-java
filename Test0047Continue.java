import java.util.Scanner;
public class Test0047Continue{
	public static void main(String ...args){
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<5;i++){
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (y == 0)
				continue;
			System.out.println(x/y);
		}
	}
}