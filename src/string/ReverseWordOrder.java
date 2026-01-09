package string;
import java.util.stream.*;
import java.util.*;
public class ReverseWordOrder {
    /*Reverse Word Order in a Sentence
    Input: "my name is shubham" Output: "shubham is name my" */
    public static void main(String args[]){
        String str ="my name is shubham";
        // method 1 using stream
       String rs= Arrays.stream(str.split("\\s+")).reduce("",(a,b)->b+" "+a);
       System.out.println(rs);

       // using loop manual way
        String s[]=str.split("\\s+");
        for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]+" ");
        }

    }
}
