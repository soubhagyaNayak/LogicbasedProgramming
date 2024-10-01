

public class reverseString {
   
    public static void main(String args[]){
        String name="manish";
        String eman="";
        char ch;
        for(int i=0;i<name.length();i++){
            ch=name.charAt(i);
            eman=ch+eman;
        }
        System.out.println(eman);
    }
}
