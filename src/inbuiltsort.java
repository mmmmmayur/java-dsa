import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class inbuiltsort {
    public static void arrayrd(Integer numbers[]) {
        for (Integer k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + ",");
        }
    }
        public static void main (String args[]){
            Integer numbers[] = {12, 45, 2, 3, 12};
            //Arrays.sort(numbers,1,4);  //it sort the array from index 1 to 3 ,  index is excluded.
            Arrays.sort(numbers, Collections.reverseOrder());  /*when we use collections we have to use datatypes as Integer in full form.and collections.reverse
                                                                is used to reverse the array by inbuilt sorting.it is stored in
                                                                collections package.We can also give startin and ending index as we given in Array.sort() 1st vala.*/
            arrayrd(numbers);


        }
    }



