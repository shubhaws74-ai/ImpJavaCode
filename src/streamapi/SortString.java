package streamapi;
import java.util.stream.*;
import java.util.*;
public class SortString {
    //Sort strings ignoring case
    //
    //Input: ["java","API","Spring"]
    //Output: ["API","java","Spring"]
    public static void main(String[] args){
        List<String>list=Arrays.asList("java","API","Spring");
        List<String>rl=list.stream().sorted((a,b)->a.compareToIgnoreCase(b)).toList();
        System.out.println(rl);
        List<String>l=list.stream().sorted(String::compareToIgnoreCase).toList();
        System.out.println(l);
        List<String>kl=list.stream().sorted(Comparator.comparing(String::toLowerCase)).toList();
        System.out.println(kl);


    }
}
