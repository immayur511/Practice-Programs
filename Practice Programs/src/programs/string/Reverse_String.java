package programs.string;

public class Reverse_String {

	public static void main(String[] args) {
		
		String str="orange";
		//String rev="";
		System.out.println("Original String :"+str);
		/*for(int i=str.length()-1;i>=0;i--) 
		{
			
			rev=rev+str.charAt(i);
		}*/
		
		StringBuilder scl=new StringBuilder(str);
		
		StringBuilder re_string=scl.reverse();
		
		
		
		System.out.println("Reversed String :"+re_string);
		
		
		
	}
	
}
