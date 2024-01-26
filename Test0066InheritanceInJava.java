class Employee{
	int id;
	int salary;
	Employee(int i, int s){
		id = i;
		salary = s;
	}
}

class SalesEmp extends Employee{
	int salesInc;
	SalesEmp(int i, int s, int si){
		super(i,s);
		salesInc = si;
	}
}

class Test0066InheritanceInJava{
	public static void main(String [] args){
		SalesEmp se = new SalesEmp(101,30000,10000);
		System.out.println(se.salary);
		System.out.println(se.id);
		System.out.println(se.salesInc);
	}
}