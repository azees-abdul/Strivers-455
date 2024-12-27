import java.util.Scanner;

class Solution {
    static int findNthFibonacci(int n){
        
        if( n ==1 || n ==2){
            return 1;
        }
        int prev1 = 1, prev2= 1, current =0;
        for(int i =3;i<=n;i++){
            current = prev1 +prev2;
            prev2 = prev1;
            prev1= current;

        }
        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n
        System.out.print("");
        int n = sc.nextInt();

        // Find and print the n-th Fibonacci number
        System.out.println(findNthFibonacci(n));
    }
}
