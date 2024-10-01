import java.util.*;

public class EvenOrOdd {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        if(n>=0){
           if(n%2==0){
              System.out.println(n+" is even number");
           }else{
              System.out.println(n+" is odd number");
           }
        }else{
            System.out.println(" Invalid number");
        }
    }
}
