package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
 


public static void main(String[] args) {
//		Declare a String as PayPal India
	   String text="PayPal India";
      
//		Convert it into a character array
	   char[] character=text.toCharArray();

//		Declare a Set as charSet for Character
	   
	Set<Character>charSet=new TreeSet<Character>();
        for(int i=0;i<character.length;i++) {
        charSet.add(character[i]);
        }
        System.out.println(charSet);
//		Declare a Set as dupCharSet for duplicate Character
    //Set<duplicateCharacter>deoCharset=new TreeSet<>();
//		Iterate character array and add it into charSet
     
//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it

	
}
}
