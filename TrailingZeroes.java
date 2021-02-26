package mathematics;

import java.util.Scanner;

public class TrailingZeroes
{
    static int trailingZeroes(int n)
    {
        int res = 0;

        for(int i=5; i<=n; i=i*5)
        {
            res = res + (n / i);
        }

        return res;
    }

    public static void main(String[] args) {
        int num;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("no of trailing zeroes is ="+trailingZeroes(num));

    }
}

