import java.util.*;
public class ducknumberCheck {
    public static void main(String args[]){
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int flag=0;
       int d;
       while(n!=0){
          d=n%10;  
          if(d==0){
            flag=1;
            break;
          }
          n=n/10;
       }
      if(flag==1){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
}
