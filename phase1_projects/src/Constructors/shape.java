package Constructors;

public class shape {
	
	int side1,side2;      //square
	long length,breadth; //rectangle
	float r1,r2;        //circle
	int r3,r4;           //r
	int base,height;     //triangle
	
	shape(){          //default constructor
		 r3=1;
		 r4=2;
		 base=2;
		 height=4;
		
		
	}
	shape(int a,int b){    //parameterized constructor
		side1=a;
		side2=b;
	}
	shape(long c,long d){
		length=c;
		length=d;    
	}
	shape(float e,float f){
		r1=e;
		r2=f;
	}
	
	public void methodssquare(int side1,int side2){
		System.out.println("Area of a square : "+(side1*side2));
	}
	public void methodrectangle(long length,long breadth){
		System.out.println("Area of a rectangle : "+(length*breadth));
	}
	public void methodcircle(float r1,float r2){
		System.out.println("Area of a circle : "+(3.14*r1*r2));
	}
	
	public void dispiay1(){
		System.out.println("Area of rhyombus :"+(0.5*r3*r4));
	}
	public void diaplay2(){
		System.out.println("Area of triangle :"+(base*height)/2);
	}
	
	
	public static void main(String[] args){
		shape a1=new shape();
		a1.methodssquare(1,2);
		
		shape a2=new shape();
		a2.methodrectangle(2343,1342223);
		
		shape a3=new shape();
		a3.methodcircle(12,23);
		
		shape ob=new shape();
		ob.dispiay1();
		
		shape ob1=new shape();
		ob1.diaplay2();
			
			
	}

}
