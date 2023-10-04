import java.util.*;
public class linearsearch {

    public static int largest_no( int Numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i = 0; i< Numbers.length;i++){
            if(largest < Numbers[i]){
                largest = Numbers[i];
            }
            if (smallest > Numbers[i])
            { smallest = Numbers[i];
            }

            }
        System.out.println("smallest no is "+ smallest);


        return largest;
    }
    public static void main(String args[]){
        int Numbers[] = {5,6,8,4,7};
        System.out.println("largest no is" + " " + largest_no(Numbers));

    }
}
