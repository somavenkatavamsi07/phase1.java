package functionoverloading;

public class overloading {
	
	public int calculate(int a,int b){
		int c;
		c=a+b;
		return c;
	}
	public int calculate1(int x, int y){
		int z;
		z=(int) (3.14*x*y);
		return z;
	}
	public int calculate2(int i,int j){
		int k;
		k=i*j;
		return k;
	}
	public int calculate3(int p,int q){
		int r;
		r=p*q;
		return r;
	}
	public static void main(String[] args){
		overloading ob = new overloading();
		overloading ob1 = new overloading();
		overloading ob2 = new overloading();
		overloading ob3 = new overloading();
		
		int add = ob.calculate(1, 2);
		int circle = ob1.calculate1(2,4);
		int rectangle = ob2.calculate2(4,8);
		int square = ob3.calculate3(9, 8);
		
		System.out.println( "add is :"+add);
		System.out.println("area of circle is :"+circle);
		System.out.println("area of rectangle is :"+rectangle);
		System.out.println("area of aquare is :"+square);
		
		
	}

}
