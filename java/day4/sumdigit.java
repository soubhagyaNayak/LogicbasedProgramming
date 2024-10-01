import java.util.*;
public class sumdigit {
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        int digit;
        while(n!=0){
            digit=n%10;
            if(digit%3==0){
                sum=sum+digit;
            }
            n=n/10;
        }
       System.out.println("Sum of digit which is divisible by 3 is"+sum);
    }
}
