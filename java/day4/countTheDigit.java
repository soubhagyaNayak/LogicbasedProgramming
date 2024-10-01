import java.util.*;
public class countTheDigit {
   public static void main(String args[]){
    Scanner scn =new Scanner(System.in);
    int num=scn.nextInt();
    int count=0;
    int digit;
    while(num!=0){
        digit=num%10;
        count++;
        num=num/10;
    }
    System.out.println("Number of digit is "+count);
   } 
}
