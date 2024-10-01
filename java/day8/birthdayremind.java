import java.util.*;

public class birthdayremind{
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String m=scn.nextLine();
    int day=scn.nextInt();
    if(m.equals("july") && day==5){
       System.out.println(1);
    }else{
        System.out.println(0);
    }
    }
}
