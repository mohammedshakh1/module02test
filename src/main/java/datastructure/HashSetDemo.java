package datastructure;

import java.util.HashSet;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */

    public static void main(String[] args) {


        HashSet<String> phones = new HashSet<String>();
        phones.add("iPhone 6S");
        phones.add("iPhone XS Max");
        phones.add("iPhone 8 Plus");
        phones.add("iPhone XS");
        phones.add("iPhone Pro Max");
        System.out.println(phones);
        phones.remove("iPhone 6S");
        phones.contains("iPhone Pro Max");
        phones.clear();
        for (String i : phones) {
            System.out.println(i);
        }
    }


}
