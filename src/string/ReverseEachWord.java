package string;
import java.util.stream.*;
import java.util.*;
public class ReverseEachWord {
    /*2.Reverse Each Word in a String Input: "Java is easy" Output: "avaJ si ysae" */
    public static void main(String []args){
        StringBuilder sb = new StringBuilder();
        String str ="Java is easy";
        // method 1 using stream
        String rs=Arrays.stream(str.trim().split("\\s+")).map(s->new StringBuilder(s).reverse()).
                collect(Collectors.joining(" "));
        System.out.println(rs);
        // method 2 using loop
        for(String s:str.split("\\s+")){
            sb.append(new StringBuilder(s).reverse()+" ");
        }
        System.out.println(sb.toString());
    }
}
