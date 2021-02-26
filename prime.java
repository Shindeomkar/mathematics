package mathematics;

import java.util.Scanner;

public class prime {
    static boolean isprime(int num1)
    {
        for (int i=2;i<num1;i++) {
            if (num1 % i == 0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        int num1;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        if(isprime(num1))
            System.out.println("is prime");
        else
            System.out.println("is not prime");


    }
}
