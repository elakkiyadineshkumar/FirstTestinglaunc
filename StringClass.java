package org.test.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StringClass {
	
	public void uppper() {
		String str="dinesh";
		String str1=str.substring(0, 1).toUpperCase();	
	}

	public static void main(String[] args) {
		
		Map<String,String> mp= new HashMap<>();
		mp.put("name","Elakkiya");
		mp.put("edu", "BCA");
		mp.put("Company", "Microfocus");
		Set<Entry<String,String>> datas=mp.entrySet();
		
		for(Entry<String,String> values: datas) {
			System.out.println(values);
		}
		while(datas.isEmpty()) {
			
		}
		
		String s="Elakkiya Dineshkumar";
		System.out.println(s.charAt(s.length()-3));
		System.out.println(s.substring(s.lastIndexOf(' ')));
		String str="dinesh";
		String str1=str.substring(0, 1).toUpperCase();
		System.out.println(str1+str.substring(1, str.length()));
		System.out.println(str.charAt(0));
		int firstletter=str.indexOf('n');	
		int endletter=str.indexOf('s');
		System.out.println(str.substring(firstletter,endletter+1));
		s.equals(str);
		System.out.println(s.equals(str));
		
		
		System.out.println((int)(Math.random()*100));
		System.out.println(Math.random()+1);
		System.out.println(Math.random());
	}
	
	
}
