package string;
import java.util.stream.*;
import java.util.*;
public class LongestWordString {
    //Find Longest String from List Input:
    // ["java","spring","microservices"] Output: "microservices
    public static void main(String[] args){
        List<String>list=Arrays.asList("java","spring","microservices");
        String rs=list.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println(rs);
        long ls=list.stream().map(String::length).sorted(Comparator.reverseOrder()).findFirst().orElse(0);
        System.out.println(ls);
        int s=list.stream().mapToInt(String::length).max().getAsInt();
        System.out.println(s);
    }
}
