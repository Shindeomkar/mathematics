package mathematics;

import java.util.*;

public class Countdigits {
    static int countDigit(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num;
        System.out.println("enter the number:1");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("no of digts="+countDigit(num));

    }
}

