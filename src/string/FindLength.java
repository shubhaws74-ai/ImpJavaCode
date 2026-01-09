package string;
import java.util.stream.*;
import java.util.*;
public class FindLength {
    //Find Length of String Without Using length() Input: "hello" Output: 5
    public static void main(String [] args){
        String h="hello";
        int con=0;
        for(char c:h.toCharArray())con++;
        System.out.println(con);
        long cn=h.chars().mapToObj(c->(char)c).count();
        System.out.println(cn);
    }
}
