package streamapi;
import java.util.*;
import java.util.stream.*;
public class LongestPalindrome {
    //Find longest palindrome string
    //Input: ["madam","level","java"]
    //Output: "madam"
    public static void main(String[] args){
        List<String>list=Arrays.asList("madam","level","java");
        String rs=list.stream().sorted(Comparator.comparing(String::length).reversed()).
                filter(c->c.equals(new StringBuilder(c).reverse().toString())).findFirst().get();
        System.out.println(rs);
    }
}
