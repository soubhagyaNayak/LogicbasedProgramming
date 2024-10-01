import java.util.*;

public class sumofPrimeDigit {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sum=0;
        int digit;

        while(n!=0){
            digit=n%10;
            if(digit==2||digit==3||digit==5||digit==7){
                sum=sum+digit;
            }
            n=n/10;
        }
        System.out.println("Sum of prime digit is " +sum);
    }
}
