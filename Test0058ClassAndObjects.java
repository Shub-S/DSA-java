class Complex{
	int real,imag;
	void print(){
		System.out.println(real+"+i"+imag);
	}
	Complex(int r,int i){
		real = r;
		imag = i;
	}
	void add(Complex C){
		real = real + C.real;
		imag = imag + C.imag;
	}
}
public class Test0058ClassAndObjects{
	public static void main (String...args){
		Complex C1 = new Complex(10,20);
		C1.print();
		Complex C2 = new Complex(20,30);
		C1.add (C2);
		C1.print();
	}
}