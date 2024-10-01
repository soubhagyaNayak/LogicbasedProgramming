import java.util.*;
public class coditionwiseBookstore {
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        if(n>=30 && n<=100){
           if(n>=30 && n<=50){
            System.out.println("D");
           }
           else if(n>=51&&n<=60){
            System.out.println("C");
           }
           else if(n>=61&&n<=80){
            System.out.println("B");
           }
           else if(n>=81&&n<=100){
            System.out.println("A");
           }
        }else{
            System.out.println("Invalid");
        }
    }
}
