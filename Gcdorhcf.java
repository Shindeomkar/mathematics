package mathematics;

import java.util.Scanner;


public class Gcdorhcf {
    static int findMin(int num1,int num2)
    {
        if(num1<num2)
            return num1;
        else return num2;
    }
    static int gcdorHcf(int num1,int num2)
    {
        int min=findMin(num1,num2);
        while(min!=1)
        {
            if(num1%min==0 && num2%min==0)
                return min;
            else
                min--;
        }
        return min;
    }

    public static void main(String[] args) {
        int num1,num2;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("hcf is ="+gcdorHcf(num1,num2));

    }
}
