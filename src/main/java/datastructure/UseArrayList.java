package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {

		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		int [] myArray = new int[5];
		myArray[0] = 12;

		List<Integer> studentsIdList = new ArrayList<>();
		String name = new String("Asif");
		System.out.println(name);
		//Another way
		// ArrayList studentsIdList=new ArrayList<Integer>();

		studentsIdList.add(11);
		studentsIdList.add(12);
		studentsIdList.add(13);
		studentsIdList.add(14);
		studentsIdList.add(null);
		studentsIdList.add(11);

		//List can hold null value
		//List allow duplicate value

		System.out.println("Element in index 0 : "+ studentsIdList.get(0));
		System.out.println("Length of this List: "+ studentsIdList.size());

		//for loop
		for(int i = 0; i <= studentsIdList.size() -1; i++){
			System.out.println("Element index "+ i + ":"+ studentsIdList.get(i));
		}

		//for each loop
		for(Integer x: studentsIdList){
			System.out.println(x);
		}
		studentsIdList.forEach(x -> System.out.println("ID: " + x));


		ArrayList<String> iPhones = new ArrayList<String>();
		iPhones.add("iPhone 6S");
		iPhones.add("iPhone 8 Plus");
		iPhones.add("iPhone Xs Max");
		iPhones.add("iPhone Pro Max");

		System.out.println(iPhones);
		System.out.println(iPhones.get(0));

		iPhones.set(0, "Value");
		iPhones.remove(0);
		System.out.println(iPhones.get(0));
		System.out.println(iPhones.size());
		for (String i : iPhones) {
			System.out.println(i);
		}
	

	}

}
