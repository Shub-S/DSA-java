class Parent{
	static void fun(){System.out.println("Parent's fun");}
}
class Child extends Parent{
	static void fun(){System.out.println("Child's fun");}
}
public class Test0073StaticMethodsAreNotOverriden{
	public static void main(String[]args){
		Parent p = new Child();
		p.fun();
	}
}