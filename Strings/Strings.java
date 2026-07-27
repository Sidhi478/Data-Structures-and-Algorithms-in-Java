package Strings;
import java.util.*;

public class Strings {
	public static void printetters(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char arr[]= {'a','b','c',};
//		String str="abcd";
//		String str2=new String("xyz@#1234");
//		
//		//strings are immutable 
//		
//		Scanner sc=new Scanner(System.in);
//		String name;
//		name=sc.nextLine();
//		System.out.println(name);
//		
//		String fullName="tony stark";
//		System.out.println(fullName.length());
//		
		//concatenation
		String Firstname="shardha";
		String LastName="khapra";
		String FullName=Firstname+" "+LastName;
		System.out.println(FullName.charAt(0));
		printetters(FullName);
	}

}
