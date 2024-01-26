class Point{
	void fun(){System.out.println("Parent's fun");}
}
class Child extends Point{
	//@Override//
	void fun(){
		super.fun();
		System.out.println("Child's fun");
	}
}
class Test0074CallParentFunUsingSuper{
	public static void main(String[]args){
		Point p = new Child();
		p.fun();
	}
}