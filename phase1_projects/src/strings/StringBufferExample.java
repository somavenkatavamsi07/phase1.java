package strings;

public class StringBufferExample {
	
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Started Java");
	    
		s.append(" Phasel");
		System.out.println(s);
		
		s.delete(2, 3);
		System.out.println(s);
		
		s.replace(7,12,"Python");
		System.out.println(s);
		
		s.insert(7,"language");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		System.out.println(s.charAt(9));

	}

}
