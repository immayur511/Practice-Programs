package programs.string;

public class Reverse_number {

	public static void main(String[] args) 
	{
		
		int num=598;
		//int rev=0;
		System.out.println("Number: "+num);
		
			/*while(num!=0) 
			{
			rev=rev*10+num%10;
			num=num/10;
		    }*/
		
		StringBuilder sbl=new StringBuilder(num);
		sbl.append(num);
		StringBuilder re=sbl.reverse();
		
		System.out.println("Reversed number: "+re);
	
	}	
}
