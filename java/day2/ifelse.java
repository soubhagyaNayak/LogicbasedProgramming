import java.util.*;
public class ifelse {
    public static void main(String args[]){
      Scanner scn=new Scanner(System.in);
      int a=scn.nextInt();
      if(a>=1 && a<=100){
         if(a%2!=0){
           System.out.println("Wired");
         }else{
            if(a>=2 && a<=5){
                System.out.println("Not Wired");
            }
            else if(a>=6 && a<=20){
                System.out.println("Wired");
            }
         }
      }
    }
}
