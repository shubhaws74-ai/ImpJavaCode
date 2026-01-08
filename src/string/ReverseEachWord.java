package string;
import java.util.stream.*;
import java.util.*;
public class ReverseEachWord {
    /*2.Reverse Each Word in a String Input: "Java is easy" Output: "avaJ si ysae" */
    public static void main(String []args){
        StringBuilder sb = new StringBuilder();
        String str ="Java is easy";
        for(String s:str.trim().split("\\+")){
            sb.append(new StringBuilder(s).reverse());
        }
        System.out.println(sb.toString());

    }
}
