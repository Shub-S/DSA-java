class Base{
	int x=10;
}
class Derived extends Base{
	int x=20;
	void print(){
		System.out.println(super.x);
		System.out.println(x);
	}
}
class Test0068SuperKeywordInJava{
	public static void main(String[]args){
		Derived d = new Derived();
		d.print();
	}
}