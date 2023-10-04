import java.util.*;
public class basic_sorting {

    public static void insertion_sort(int numbers[]){

        for (int i = 1;i < numbers.length; i++){
            int curr = numbers[i];
            int prev = i-1;
            while(prev >=0 && curr < numbers[prev]) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = curr;
        }


    }
    public static void selection_sort(int numbers[]){
        for(int i = 0; i <numbers.length-1;i++){
            int minpos = i;
            for(int j = i+1; j<numbers.length; j++){
                if ( numbers[i] > numbers[j] ){

                    minpos = j;
                }
            }
            //swap
            int temp = numbers[minpos];
            numbers[minpos] = numbers[i];
            temp = numbers[minpos];
        }
    }



    public static void bubble_sort(int numbers[]) {
        for (int turns = 0; turns < numbers.length - 1; turns++) {
            for (int j = 0; j < numbers.length - 1 - turns; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
        public static void arrayrd(int numbers[]){
            for(int k=0;k <numbers.length;k++){
                System.out.print(numbers[k]+",");
            }

    }
    public static void main(String args[]){
        int numbers[]={2,10,6,5,3};
        //insertion_sort(numbers);
        //bubble_sort(numbers);
        bubble_sort(numbers);
        arrayrd(numbers);


    }

}
