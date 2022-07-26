package Methods;

public class AreaaofRectangle {
	void display(int length,int breadth){
		int area;
		area=length*breadth;
		System.out.println("Area of rectangle is: "+area);
	}
	public static void main(String[] args){
		AreaaofRectangle ob = new AreaaofRectangle();
		ob.display(10, 20);
	}
	

}
