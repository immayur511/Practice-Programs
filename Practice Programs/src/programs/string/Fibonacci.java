package programs.string;

public class Fibonacci {

	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13 21
		//0+1=1 1+1=2 1+2=3 2+3=5 3+5=3....
		
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" "+n2);
		//n1+n2=sum----0+1
		//n1=n2-----1
		//n2=sum----1
		for(int i=2;i<=10;i++) 
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		
		
	}
}
