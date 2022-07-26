package ParameterizedCostructor;

public class Students {
	String name,n;
	int age,s1m=0,s2m,s3m,a;
	char section,s;
	char gender,g;
	float total;
	float percentage;
	
	Students(String name,int age,int s1m,int s2m, int s3m,char section,char gender){
		 total=(s1m+s2m+s3m);
		 percentage=(total/300)*100;
		 n=name;
		 a= age;
		 s=section;
		 g=gender;
		
	}
	Students(String name,int age,int s2m, int s3m,char section,char gender){
		 total=(s1m+s2m+s3m);
		 percentage=(total/300)*100;
		 n=name;
		 a= age;
		 s=section;
		 g=gender;
	}
void display(){
	System.out.println("student name is " +n );
	System.out.println(" age:"+a);
	System.out.println(" section:"+s);
	System.out.println(" gender:"+g);
	System.out.println(" total:"+total);
	System.out.println(" percentage:"+percentage);
	System.out.println("\n");
	
}
	public static void main(String[] args) {
		Students s1=new Students("Vamsi",27,93,98,86,'A','M');
		s1.display();
		Students s2=new Students("karthik",94,89,87,'B','M');
		s2.display();
		Students s3=new Students("Bhanu",85,81,99,'C','M');
		s3.display();
		Students s4=new Students("Rehan",89,89,95,'D','M');
		s4.display();
	}

}
