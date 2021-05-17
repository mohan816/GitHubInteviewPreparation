package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {
		//Declare String Array
		
		 String[] str1= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		int length = str1.length;
		Arrays.sort(str1);
		
		//List<String> li=new ArrayList<String>(str1);
		//for(int i=0;i<=length-1;i++) {
			//li.add(length);
		List<String> n =new ArrayList<String>();
		 //Set<String> n=new LinkedHashSet<String>();
				 //System.out.println(str1);
		 for( int i=length-1;i>=0;i--) {
			 n.add(str1[i]);
			 
		 }
		 for (String sorting : n) {
			 System.out.println(sorting);
			
		}
		}

	}


