public class subarrays {
    public static void sbarray(int numbers[]){
        int count=0;
        int sum = 0;
        for (int i = 0;i < numbers.length;i++){
            for (int j=i;j<numbers.length;j++){
                sum = 0;
                for(int k=i;k<=j;k++){

                    System.out.print(numbers[k] +" ");

                    count++;
                   // System.out.println();

                }

               for(int m=0;m< numbers.length;m++ ) {
                    sum = sum + numbers[m];}

                    System.out.println("sum of subarray is "+sum);


                System.out.println();
            }
        }
        System.out.println("total no of subarray:  "+count);// we can also use formula (n(n+1))/2

    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        sbarray( numbers);



    }
}
