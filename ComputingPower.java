package mathematics;

import java.util.Scanner;

public class ComputingPower {
    static int computingPower(int x,int n)
    {
        int i=n;
        int result=1;
        while(i>0)
        {
            result=result*x;
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        int x, n;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt();
        int result = computingPower(x, n);
        System.out.println("x^n="+result);
    }
}
