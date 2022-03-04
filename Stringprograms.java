package org.test.com;

public class Stringprograms {
	
	public void stringSwap() {
		String s1="Elakkiya";
		String s2="Dineshkumar";
		System.out.println("The value of s1 before swapping: "+ s1);
		System.out.println("The value of s2 before swapping: "+ s2);
		System.out.println();
		s1=s1.concat(s2); // s1= elakkiyadineshkumar s2: dineshkumar
		s2=s1.substring(0,s1.length()-s2.length()); //s2=elakkiyadineshkumar(0,19-11=8) s2=elakkiya
		s1=s1.substring(s2.length());//s1-elakkiyadineshkumar  - so its starts fromindex 8
		System.out.println("The s1 value after swapping:"+ s1);
		System.out.println("The s2 value after swapping:"+ s2);
		
	}
	
	public void strPalindrome() {
		String str1="malayalam";
		String strrev="";
		for(int i=str1.length()-1;i>=0;i--) {
			strrev=strrev+str1.charAt(i);
			if(i==str1.length()-1) {
				strrev=	strrev.toUpperCase();			
			} 
			
		System.out.println(strrev);
		}
	
//		System.out.println(str1);
//		System.out.println(strrev);
		if(str1.equalsIgnoreCase(strrev)){
			System.out.println("The given is palindrome");
		
		} else
			System.out.println("The given is not palindrome");
	}
	
	
	public void conveChar() {
		String str1= "No 110 rahiv gandhi nagar";
		char a[]=str1.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ') {
				System.out.println("space in " + i + "index");
				a[i]='-';
				System.out.println(a[i]); 
					
				}	
		} 
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i] + ": index " + i);	
				
		}
//	String finalstr=(String)a.toString();
//	System.out.println(finalstr);
	}
	public void swaping() {
	String str1="Rithik";
	String str2="Sanjana";
	System.out.println("Before Swap str1:" + str1);
	System.out.println("Before Swap str2:" + str2);
	str1=str1+str2; 
	System.out.println(str1); //RithikSanjana
	
	str2=str1.substring(0,str1.length()-str2.length()); // 13-7 -> 5

	str1=str1.substring(str2.length());
	
	System.out.println("After Swap str1:" + str1);
	
	System.out.println("After Swap str2:" + str2);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Stringprograms sp=new Stringprograms();
		sp.swaping();
		
	}

}
