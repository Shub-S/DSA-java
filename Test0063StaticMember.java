class Player{
	String name;
	int id;
	static int playerCount=0;
	Player(String name){
		this.name = name;
		id = ++playerCount;
	}
	void printDetails(){
		System.out.println(id+":"+name);
	}
}
public class Test0063StaticMember{
	public static void main(String...args){
		Player p1 = new Player("xyz");
		Player p2 = new Player("abc");
		p1.printDetails();
		p2.printDetails();
	}
}