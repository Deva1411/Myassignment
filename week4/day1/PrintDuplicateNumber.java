package week4.day1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumber {
public static void main(String[] args) {
	 // Problem Statement : Print only duplicate values
	 // Expected output: 4 and 8
	int[] data = {4,3,6,8,29,1,2,4,7,8};
	 // How to solve?
	 // 1) Regular for loop
	 // 2) Using Set
	  
	 // Using Set  
	 // a) Add every element into Set
	 // b) If it is already there in the Set -> Print duplicate
	 
	Set<Integer> unique=new TreeSet<Integer>();
	 for (int i=0;i<data.length;i++){
		if( !unique.add(data[i])){
			System.out.println(data[i]);
	 
	 }	
}
}
}