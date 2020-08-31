package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * You can use any other retrieval process
		 * Use any databases[ Postgresql] to store data and retrieve data.
		 */

		Map<Integer,String> studentInfo=new HashMap<>();
		studentInfo.put(101,"Fahmida");
		studentInfo.put(102,"Shakib");
		studentInfo.put(103,"Rana");

		System.out.println(studentInfo.size());
		System.out.println(studentInfo.get(101));

		for (Map.Entry<Integer,String> entry:studentInfo.entrySet()){
			System.out.println("ID: "+ entry.getKey()+" and Name: "+ entry.getValue());
		}

		HashMap<Integer, String> city = new HashMap<Integer, String>();
		city.put(1,"New York");
		city.put(2, "Niagara Falls");
		city.put(3, "Buffalo");
		city.put(4, "Albany");
		city.put(5, "Rochester");
		System.out.println("Five different cities in New York State: "+ city);

		city.remove(5);
		System.out.println("After removing Rochester: "+ city);

	}

}
