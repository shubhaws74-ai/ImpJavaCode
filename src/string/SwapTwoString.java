package string;
import java.util.stream.*;
import java.util.*;
public class SwapTwoString {
    //. Swap Two Strings Without Using Third Variable
    // Input: str1="hello", str2="world" Output: str1="world", str2="hello*/
    public static void main(String args[]){
        String s1 ="hello";
        String s2="world";

        System.out.println("Before Swaping The String: ");
        System.out.println(s1);
        System.out.println(s2);
        s1=s1+s2;//helloworld
        s2=s1.substring(0,s2.length());
        s1=s1.substring(s2.length());
        System.out.println("After Swaping The String: ");
        System.out.println(s1);
        System.out.println(s2);

        //method 2 using strem
        String c1 ="hello";
        String c2="world";
        String[] d=Stream.of(c1,c2).toArray(String[]::new);
        c1=d[1];
        c2=d[0];
        System.out.println(c1+" "+c2);
    }
}
