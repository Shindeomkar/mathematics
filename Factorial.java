package mathematics;

import java.util.Scanner;


public class Factorial {
static int factorialValueIs(int num)
{
    int result=1;
    for(int i=0;i<num;i++)
    {
        result=result*(num-i);
    }
    return result;
}
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("factorial value is ="+factorialValueIs(num));

    }
}
