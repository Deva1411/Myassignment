package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		int[] data= {4,3,6,8,29,1,2,4,7,8};
		/*
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List 
		 */
      Set<Integer> empty=new TreeSet<Integer>();
      for(int i=0;i<data.length;i++) {
    	  empty.add(data[i]);
      }System.out.println(empty);
      List<Integer> num=new ArrayList<Integer>();

      
      
	}

}
