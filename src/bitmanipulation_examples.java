public class  bitmanipulation_examples {
    public static int countSetbit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;

        }
        return count;
    }
    public static boolean  ispoweroftwo(int n){
        return (n&(n-1)) == 0;
    }
    public static int clearIthbit(int n,int i){
        int bitMask = ~0<<i;
        return n&bitMask;
    }
    public static void main(String args[]){
        int n,i;
        n = 5;
        i = 3;

        System.out.println(clearIthbit(n,i));
        System.out.println(ispoweroftwo(n));
        System.out.println(countSetbit(n));

    }
}
