package string;
import java.util.stream.*;
import java.util.*;
public class CountWords {
    //Count Number of Words Input: "I love Java" Output: 3
    public static void main(String [] args){
        String str ="I Love Java";
       long l= Arrays.stream(str.split("\\s+")).count();
       System.out.println(l);
        boolean f =false;
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch!=' '&& !f){
                count++;
                f=true;
            }
            else if(ch==' ') f=false;
        }System.out.println(count);
    }

}
