import java.util.*;
public class reverseInteger {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int rev=0;
        int d;
        while(n!=0){
         d=n%10;
         rev=rev*10+d;
         n=n/10;
        }
        System.out.print(rev);
    }
}
