package api;

import java.util.HashMap;
import java.util.Map;

public class MapAPI {
    /**
     * @author Jahiudl Islam
     * Read Map and HashMap JDK 8 API documantation to be read and Map and HashMap source code to be viewed
     * Demonastrate your understanding on Map and HashMap after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     *
     * */

    public void stringToHashMap() {
        String name = "Asif";
        char nameToChar[] = name.toCharArray();
        int size = nameToChar.length;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        while (i != size){
            if(map.containsKey(nameToChar[i]) == false){
                map.put(nameToChar[i],1);
            } else
            {
                int oldValue = map.get(nameToChar[i]);
                int newValue = oldValue+1;
                map.put(nameToChar[i], newValue);
            }
            ++i;
        }

    }

    public static void hashMapDemo(){
        HashMap <String, String> demo = new HashMap<>();
        demo.put("User1", "Mimi");
        demo.put("user2", "Asif");
        demo.put("user1", "Mimi");
        demo.put("User1","Fahmida");
        System.out.println(demo);

        demo.remove("user1");
        System.out.println(demo);

        System.out.println(demo.containsKey("user2"));
        System.out.println(demo.size());

    }

    public static void main(String[] args) {
        hashMapDemo();
    }
}
