import java.util.*;
public class numberOfOccurance {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int key=scn.nextInt();
        int d;
        int c=0;
        while(n!=0){
           d=n%10;
          if(d==key){
            c++;
          }
           n=n/10;
        }
       System.out.println(c);
    }
}
