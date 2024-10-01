import java.util.*;
public class findEvenDigit {
    public static void main(String args[]){
        Scanner scn =new Scanner (System.in);
        int num=scn.nextInt();
        int digit;
        int Evensum=0;
        int oddSum=0;
        while(num!=0){
          digit=num%10;
          if(digit%2==0){
            System.out.println(digit+"is even");
            Evensum=Evensum+digit;
          }
          else{
            System.out.println(digit+"is odd");
            oddSum=oddSum+digit;
          }
          num=num/10;
          
        }
        System.out.println("Even digit sum is"+ Evensum);
        System.out.println("Odd digit sum is"+ oddSum);
    }
}
