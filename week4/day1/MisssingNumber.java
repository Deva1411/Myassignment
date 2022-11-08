package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class MisssingNumber {
public static void main(String[] args) {
   int[] num = {1,2,3,4,5,6,7,8,8,10};
    
	//a) Remove the duplicates using Set
    Set<Integer> numbr=new TreeSet<Integer>();   
    numbr.add(num);
	//b) Make sure the set is in the ascending order
    System.out.println(numbr);
	//c) Iterate from the starting number and verify the next number is + 1
	//d) If did not match, that is the number
	  
	 
	  
}
}
