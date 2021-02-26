package mathematics;

import java.util.Scanner;

public class PrimeFactors {
    static boolean isPrime(int num1)
    {
        for (int i=2;i<num1;i++) {
            if (num1 % i == 0)
                return false;
        }
        return true;

    }
    static void primeFactors(int num1)
    {

        for (int i=2;i<num1;i++) {
            if (num1 % i == 0) {
                    if (isPrime(i))
                    {
                       int x=i;
                        while(num1%x==0)
                        {
                            System.out.println(i);
                            x=x*i;
                        }
                    }
                }
            }
        }


    public static void main(String[] args) {
        int num1;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        primeFactors(num1);



    }
}
