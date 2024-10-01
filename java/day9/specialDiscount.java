import java.util.*;

public class specialDiscount {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d;
        int sum=0;
        while(n!=0){
            d=n%10;
            if(d==2||d==3||d==5||d==7){
                sum=sum+d;
            }
            n=n/10;
        }
        System.out.println("discount given by shop is "+sum);

    }
}
