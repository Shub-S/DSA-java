class Base {
	void fun(){
		System.out.println("Base's fun");
	}
}
class Derived extends Base{
	//@Override//
	void fun (){
		System.out.println("Derived's fun");
	}
}
class Test0071MethodOverridingExample{
	public static void main(String[]args){
		Base b = new Derived();
		b.fun();
	}
}