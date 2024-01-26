class Parent{
	void fun(){System.out.println("Parent's fun");}
}
class Child extends Parent{
	void fun(){System.out.println("Child's fun");}
}
class GrandChild extends Child{
	void fun(){System.out.println("GrandChild's fun");}
}
public class Test0072MoreOnMethodOverriding{
	public static void main(String[]args){
		Parent p1 = new Child();
		Parent p2 = new GrandChild();
		p1.fun();
	}
}