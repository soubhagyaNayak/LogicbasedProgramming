import java.util.Scanner;
public class sumOfDigit {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        int sum=0;
        while(number!=0){
          int digit=number%10;
          sum=sum+digit;
          System.out.print(digit+ " ");
          number=number/10;
        }
        System.out.println("\n"+sum);
    }
}
