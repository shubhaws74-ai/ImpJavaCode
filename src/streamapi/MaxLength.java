package streamapi;
import java.util.stream.*;
import java.util.*;
public class MaxLength {
    //Find employee with longest name
    //
    //Input: [Tom,Alexander]
    //Output: Alexander
    public static void main(String [] args){
        List<String>list=Arrays.asList("Tom","Alexander");
        String m=list.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println(m);
        String mx=list.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().orElse("no string");
        System.out.println(mx);
        String str[]={"Tom","Alexander"};
        String nb=Arrays.stream(str).max(Comparator.comparing(String::length)).orElse("not found");
        System.out.println(nb);
    }
}
