interface Printable{
	void print();
}
class MyClass implements Printable{
	public void print(){
		System.out.println("MyClass");
	}
}
public class Test0076InterfaceInJava{
	public static void main(String[]args){
		MyClass m = new MyClass();
		m.print();
	}
}