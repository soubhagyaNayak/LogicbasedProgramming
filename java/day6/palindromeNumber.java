import java.util.*;
public class palindromeNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int actualnum=scn.nextInt();
        int temp=actualnum;
        int d;
        int rev=0;
        while(temp!=0){
            d=temp%10;
          rev=rev*10+d;
          temp=temp/10;
        }
        if(actualnum==rev){
            System.out.println("It's a Palindrome Number");
        }else{
            System.out.println("It's not a palindrome Number");
        }
    }
}