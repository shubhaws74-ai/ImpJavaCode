package string;
import java .util.stream.*;
import java.util.*;
public class LongestWord {
    //Find Longest Word in a Sentence Input: "Java stream api is powerful" Output: "powerful"
    public static void main(String [] args){
        String str ="Java stream api is powerful";
        String rs=Arrays.stream(str.split("\\s+")).max(Comparator.comparing(String::length)).orElse("");
        System.out.println(rs);


        String s[]=str.split("\\s+");
        int mx=0;
        String v="";
        for(String k:s){
            if(mx<k.length()){
                mx=k.length();
                v=k;
            }
        }System.out.println(v);
    }
}
