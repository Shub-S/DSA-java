interface MyInt{
	default void fun1(){
		System.out.println("fun1()");
	}
	static void fun2(){
		System.out.println("fun2()");
	}
	void fun3();
}
public class Test0077InterfaceInJava implements MyInt{
	public void fun3(){
		System.out.println("fun3()");
	}
	public static void main(String[]args){
		Test0077InterfaceInJava t = new Test0077InterfaceInJava();
		t.fun1();
		MyInt.fun2();
		t.fun3();
	}
}
