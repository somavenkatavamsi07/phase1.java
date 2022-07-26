package pack2;
import pack1.M;
import pack1.N;
import pack1.P;

public class Z extends M{
	
	public static void main(String[] args){
		System.out.println("methods of class M,N,P:");
		new Z().methodpublic();
		new Z().methodprotected();
		new N().methodpublic();
		new P().methodpublic();
		
		System.out.println("\n");
		System.out.println("Variables of class X :");
		X ob=new X();
	    System.out.println("public char gender=:"+ob.gender);
	    System.out.println("long p="+ob.p);
	    System.out.println("protected float w="+ob.w);

	}


}
