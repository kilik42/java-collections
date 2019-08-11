package hashset_linkedhashset;

import java.util.HashSet;

import traversingListsandCustomTypes.Animal;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      HashSet<Integer> values = new HashSet<Integer>();
//      values.add(12);
//      values.add(23);
//      values.add(43);
//      values.add(43);
//      values.add(34);
//      
//      for(Integer value: values){
//    	  System.out.println(value);
//      }
      HashSet<Animal> animals = new HashSet<Animal>();
      Animal animal1 = new Animal("Dog", 24);
      Animal animal2 = new Animal("Do3", 26);
      Animal animal3 = new Animal("Dog6", 25);
      Animal animal4 = new Animal("Dog7", 23);
      animals.add(animal1);
      animals.add(animal2);
      animals.add(animal3);
      animals.add(animal4);
      
      System.out.println(animal1.equals(animal4));
      
      for (Animal animal: animals){
    	  System.out.println(animal);
      }
      
      
	}

}
