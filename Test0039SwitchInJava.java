import java.util.Scanner;
public class Test0039SwitchInJava{
	public static void main (String ...args){
		int x=0,y=0;
		System.out.println("Enter a move");
		Scanner scanner = new Scanner (System.in);
		while(true) {
			char move = scanner.next().charAt(0);
			switch (move){
				case 'A':
					x--;
					break;
				case 'D':
					x++;
					break;
				case 'W':
					y++;
					break;
				case 'S':
					y--;
					break;
				default:
					System.out.println("Invalid");
					System.exit(0);
				
			}
			System.out.println("Mouse Position(X, Y): ("+x+", "+y+")");
		}
	}
}