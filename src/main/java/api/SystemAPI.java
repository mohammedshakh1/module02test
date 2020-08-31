package api;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SystemAPI {

    /**
     * @author Jahidul Islam
     * Read System JDK 8 API documantation to be read and System source code to be viewed
     * Demonastrate your understanding on System after reading the documentation
     * Show some uses of System Class
     * Explain, what is System.out.println()?
     * List all the members of the System class, such as class variable, instance variables, local variables
     * method type etc
     *
     * */

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World");


        System.err.println(" Error");


        System.setOut(new PrintStream(new FileOutputStream("testData.txt")));
        System.out.println("How is the weather today");
        System.out.println("Added Stuff");
        System.err.println("Display how is the weather today?");

    }


}
