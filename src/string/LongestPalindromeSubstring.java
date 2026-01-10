package string;
import java.util.*;
import java.util.stream.*;
public class LongestPalindromeSubstring {
    //Longest Palindromic Substring Input: "babad" Output: "bab"
    public static void main(String [] args){
        String str="babad";
        String rs="";
        int mx=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s=str.substring(i,j);
                if(mx<s.length()&& s.equals(new StringBuilder(s).reverse().toString())){
                    rs=s;
                    mx=s.length();
                }
            }
        }System.out.println(rs);
    }
}
