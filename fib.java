package DynamicPrograming;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class fib {
    static final int MAX = 100;
    final int MIN = -1;
    static int[] lookup = new int[MAX];

    void initialise() {
        for (int i = 0; i < MAX; i++) {
            lookup[i] = 0;
        }
    }
    static int fibo(int n){
        if(n<=1) {
            lookup[n] = n;
        }
        else
            lookup[n]=fibo(n-1)+fibo(n-2);
        return lookup[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();;
        fib f = new fib();
        f.initialise();
        System.out.print(f.fibo(n));
    }
}
