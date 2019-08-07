package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>words = new ArrayList<String>();
		words.add("hello");
		words.add("there");
//		words.add(1);
//		words.add(2);
		
       String item1 = (String)words.get(0);
       String item2 = (String)words.get(1);
      
       
       System.out.println(item1 + item2);
       
       
       LinkedList<Integer> numbers = new LinkedList<Integer>();
       numbers.add(100);
       numbers.add(200);
       numbers.add(300);
       numbers.add(400);
       numbers.add(500);
       numbers.removeFirst();
//       System.out.println(numbers);
       
       for(int number: numbers){
    	   System.out.println(numbers); 
       }
	}

}
