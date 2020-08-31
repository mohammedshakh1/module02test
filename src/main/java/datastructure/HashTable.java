package datastructure;


import java.util.Hashtable;


public class HashTable {

    /**
     * SHow your understanding on HashTable
     * Use some methods from HashTable Class
     * */

    public static void main(String[] args) {
        Hashtable<Integer, String> x =
                new Hashtable<Integer, String>();

        Hashtable<Integer, String> y =
                new Hashtable<Integer, String>();

        x.put(9, "Germ-x");
        x.put(10, "aimedGerm-x");
        x.put(11, "isValuable");

        System.out.println(x.size());
        System.out.println(x.toString());

        y = (Hashtable<Integer, String>)x.clone();

        System.out.println("Sanitizer Values: " + y);

        x.clear();

        System.out.println(x);
    }


}
