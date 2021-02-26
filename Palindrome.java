package mathematics;
import java.util.*;
public class Palindrome {


   static boolean isPalindrome(int num) {
        int key=num;
        int reversenum = 0;
        int r = 0;
        int i = 0;
        while (num != 0) {
            i = 0;
            r = num % 10;
            reversenum = reversenum*10 +r;
            num = num / 10;
            i++;
        }
        if(reversenum==key)
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        System.out.println("enter the num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num))
            System.out.println("no is palindrome");
        else
            System.out.println("no is not palindrome");


    }
}