package string;
import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.*;
public class CheckPalindrome {
    /*Check Palindrome String Input: "madam" Output: true*/
    public boolean isPalindrome(String s){
        //return s.equals(s.chars().mapToObj(c->String.valueOf((char)c)).reduce("",(a,b)->b+a));
        StringBuilder sb = new StringBuilder(s);
        //return s.equals(sb.toString());
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }return true;

    }
    public static void main(String []args){
        String str ="madam";
        // method 1
        System.out.println(new CheckPalindrome().isPalindrome(str));

    }
}
