package traversingListsandCustomTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class traversingLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>  animals = new ArrayList<String>();
		animals.add("lion");
		animals.add("dog");
		animals.add("mouse");
		animals.add("cat");
//		
////		for(String animal: animals){
////			System.out.println(animals);
////		}
//    
//		
//		for (int i = 0; i<animals.size(); i++){
//			System.out.println(animals.get(i));
//		}
//		
//		for(String animal: animals){
//			System.out.println(animal);
//		}
		
//		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
//		
//		
//		vehicles.add(new Vehicle("honda", "accord",12000, false));
//		
//		vehicles.add(new Vehicle("durrang", "wrangler", 25000, true));
//		
//		for (Vehicle car: vehicles){
//			System.out.println(car);
//		}
		
		
	LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		
		
		vehicles.add(new Vehicle("honda", "accord",12000, false));
		
		vehicles.add(new Vehicle("durrang", "wrangler", 25000, true));
		
		for (Vehicle car: vehicles){
			System.out.println(car);
		}
		
		
		printElements(vehicles);
		printElements(animals);
		
	}
	public static void printElements(List someList){
		for(int i = 0; i< someList.size(); i++){
			System.out.println(someList.get(i));
		}
	}

}
