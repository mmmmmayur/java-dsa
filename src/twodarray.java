import java.util.*;
public class twodarray {
    public static  boolean stairCasesearch( int matrix[][]){
        int row = 0 , coloumn = matrix[0].length-1;
        int key = 33;
        while (row < matrix.length && coloumn>=0){
            if (matrix[row][coloumn] == key ){
                System.out.println("fount key at (" + row + "," + coloumn + ")" );
                return true;
            }
             else if (key < matrix[row][coloumn]){
                 coloumn--;
             }
             else row ++;

        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40,},
                          {15,25,35,45,},
                          {27,29,37,48},
                          {32,33,39,50}};
        stairCasesearch(matrix);

    }

}
