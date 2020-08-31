package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {
    /**
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     **/
    static void printPermutn(String str, String ans)
    {

        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            printPermutn(ros, ans + ch);
        }
    }
    public static void main(String[] args)
    {
        String s = "abb";
        printPermutn(s, "");
    }
}

