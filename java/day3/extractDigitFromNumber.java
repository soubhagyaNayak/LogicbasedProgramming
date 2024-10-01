import java.util.*;
public class extractDigitFromNumber {
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        int number=scn.nextInt();
        while(number!=0){
            int digit=number%10;
            System.out.print(digit+ " ");
            number =number/10;
        } 
    }
}
