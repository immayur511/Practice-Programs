package programs.string;

import java.util.Scanner;

public class Pallindrom_String {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		String org=str;
		System.out.println("Original String :"+str);
		for(int i=str.length()-1;i>=0;i--) 
		{
			
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String :"+rev);
		if(rev.equalsIgnoreCase(org)) {
			System.out.println("String is pallindrom");
		}
		else {
			System.out.println("String is not pallindrom");
		}
	}
}
