class Base{
	private int x=10;
	public int getX(){
		return x;
	}
}
class Derived extends Base{
	int y=20;
	void print(){
		System.out.println(getX());
		System.out.println(y);
	}
}
class Test0069AccessingPrivateDataMembers{
	public static void main(String[]args){
		Derived d = new Derived();
		d.print();
	}
}