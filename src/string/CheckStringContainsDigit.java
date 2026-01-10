package string;
import java.util.stream.*;
import java.util.*;
public class CheckStringContainsDigit {
    //Check If String Contains Only Digits Input: "12345" Output: true ADVANCED LEVEL
    public static void main(String[] args){
        String str ="12345";
        try{
            int c =Integer.parseInt(str);
            System.out.println(true);
        }catch(NumberFormatException e){
            System.out.println(false);

        }
        // method 2
        boolean b=str.chars().allMatch(c->Character.isDigit(c));
        System.out.println(b);

        //method 3
        boolean f= true;
        for(char c:str.toCharArray()){
            if(c<'0'||c>'9'){
                System.out.println(false);
                f=false;
                break;
            }
        }if(f)System.out.println(f);
    }
}
