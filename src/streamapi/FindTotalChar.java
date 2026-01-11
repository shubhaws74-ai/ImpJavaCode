package streamapi;
import java.util.stream.*;
import java.util.*;
public class FindTotalChar {
    //Find total characters count
    //
    //Input: ["Java","API"]
    //Output: 7
    public static void main(String [] args){
        List<String>list=Arrays.asList("Java","API");
        int l=list.stream().reduce("",(a,b)->a+b).length();
        System.out.println(l);
        String str[]={"Java","API"};
        int lm=Arrays.stream(str).reduce("",(a,b)->a+b).length();
        System.out.println(lm);
        int ll=Arrays.stream(str).collect(Collectors.joining("")).length();
        System.out.println(ll);
    }
}
