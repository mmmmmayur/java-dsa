public class recursionn {
    public static void main(String[] args) {
        //int sum = 0;
        int n;
        //System.out.println(fibbo(4));
        //numbers(0); //numbers(5);
        //concept(5);
        //System.out.println(fact(5));
        //System.out.println(sumofdigit(5698));
        revno(8345);
        System.out.println(sum);
      //  System.out.println(isPallindrom(6589));

    }

    static int fibbo(int n) {
        if (n < 2) {
            return n;
        }
        return fibbo(n - 1) + fibbo(n - 2);

    }

    static void numbers(int n) {
        if (n == 6) {
            //System.out.println(n);
            return;
        }
        System.out.println(n);
        numbers(n + 1);
        System.out.println(n);/*here when stack is getting empty then  the numbers get prints.In recursion it call the function into function it goes until base condition reaced
                                and then one by one stack is getting empty one by one call is getting close.in this way recursion works.refer notes*/


    }

    public static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // concept(n--);  // here it print only 5 in every call,*stack overflow*
        concept(--n);
    }

    static int sumofdigit(int n) {
        if (n % 10 == 0) {
            return 0;
        }
        return n % 10 + sumofdigit(n / 10);

    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);

    }

    static int sum = 0;

    public static void revno(int n){
        if (n ==0) {
            return ;
        }

        int rem = n%10;
        sum = sum *10+rem;
         revno(n/10);

    }
    /*public static boolean isPallindrom(int n){
       // return  (n==revno(n));{

        }*/
    }


