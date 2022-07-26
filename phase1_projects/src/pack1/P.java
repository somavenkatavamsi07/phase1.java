package pack1;

public class P {
	
    public void methodpublic(){
	    System.out.println("class P: public method");
    }
    void methoddefault(){
	    System.out.println("class P : defaultmethod");
    }
    private void methodprivate(){
	    System.out.println("class P: private method");
    }
    protected void methodprotected(){
	    System.out.println("class P: protected method");
    }

    public static void main(String[] args){
	    M ob=new M();
	    System.out.println("Variables of class M :");
	    System.out.println("long k="+ob.k);
	    System.out.println("protected float avg="+ob.avg);
	    System.out.println("\n");
	
	    //another method of variable of class M.
	
	    System.out.println(new M().k);
	    System.out.println(new M().avg);
	    System.out.println("\n");		
	
	
	    N ob1= new N();
	    System.out.println("Variables of class N :");
	    System.out.println("double d ="+ob1.d);
	    System.out.println("public int age ="+ob1.age);
	}
}