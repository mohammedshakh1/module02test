package datastructure;

import java.util.HashMap;

public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<String, Integer>();

        students.put("Fahmida", 13);
        students.put("Shakib", 11);
        students.put("Rana", 22);

        for (String i : students.keySet()) {
            System.out.println("Student Name: " + i + " Age: " + students.get(i));
        }
        for (int x : students.values()) {
            System.out.println(x);
        }
    }

}
