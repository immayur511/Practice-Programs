package programs.string;

public class SwapNumber {

	public static void main(String[] args) {
		
		int a= 25, b=36;
		//a=a+b-----10+20=30
		//b=a-b-----30-20=10
		//a=a-b-----30-10=20
		//b=10 a=20
		
		System.out.println("Number Before Swapping :"+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Number After Swapping :"+a+" "+b);
		
		
	}

}
