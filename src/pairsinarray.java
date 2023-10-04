public class pairsinarray {
    public static void pairinarray(int numbers[]){
        int paircount=0;
        for(int i = 0;i<numbers.length;i++){
            int curr = numbers[i];
            for (int j = i+1;j<numbers.length;j++){
                System.out.print("("+curr + "," +numbers[j]+")");
                paircount++;/*this is for to calculate no of pairs formed in the array .also there is formula for calculate no of pairs
                (n(n-1))/2   */
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {12,14,15,16,17};
        pairinarray(numbers);

    }
}
