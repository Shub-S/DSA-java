//PolymorphismInJava//
class Test0070Sum{
	public int sum(int x, int y){
		return (x+y);
	}
	public int sum(int x, int y, int z){
		return (x+y+z);
	}
	public double sum(double x, double y){
		return (x+y);
	}
	public static void main(String[]args){
		Test0070Sum s = new Test0070Sum();
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(10.5,20.5));
	}
}