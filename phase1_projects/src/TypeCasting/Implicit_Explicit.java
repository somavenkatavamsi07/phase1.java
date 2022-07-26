package TypeCasting;

public class Implicit_Explicit {
	public static void main(String[] args){
		
		float a=12.25f;
		long b=(long) a;
		System.out.println("float a:"+a);
		System.out.println("long b:"+b);
		System.out.println("\n");
		
		double c= 65.7;
		long d= (long)c;
		int e= (int)d;
		char f= (char)e;
		System.out.println("double d:"+d);
		System.out.println("long d:"+d);
		System.out.println("int e:"+e);
		System.out.println("char f:"+f);
		System.out.println("\n");
		
		long g= 6247282842948429L;
		byte h=(byte) g;
		System.out.println("long g:"+g);
		System.out.println("byte h:"+h);
		System.out.println("\n");
		
		int i=1116778;
		double j=i;
		long k = (long)j;
		System.out.println("int i:"+i);
		System.out.println("double j:"+j);
		System.out.println("long k:"+k);	
	}

}