package datastructure;

public class TwoDimensionalArrayDemo {

    /**
     * @author Jahidul Islam
     * Construct Two Dimensional array reference variable and
     * store all the data of testData.xlsx from data directory
     * You do not have to read xlsx file only the similar data need to be
     * stored in 2D Array reference variable
     * Later get those value by index and also by using any iteration process
     *
     *  */

    public static void main(String[] args) {
        int[][] array = { { 1, 2 }, { 3, 4 } };

        for (int x = 0; x < 2; x++)
            for (int y = 0; y < 2; y++)
                System.out.println("array [" + x + "][" + y + "] = " + array[x][y]);
    }

}
