package string;
import java.util.stream.*;
import java.util.*;
public class FindDuplicateChar {
    //Find Duplicate Characters Input: "programming" Output: ['r','g','m']
    public static void main(String [] args){
        String str="programming";
        Set<Character>set=new HashSet<>();
        String st=str.chars().mapToObj(c->(char)c).filter(c->!set.add(c)).distinct()
                .map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(st);

        // method 2 using map
        Map<Character,Long>m=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
       for(Map.Entry<Character,Long>entry:m.entrySet()){
           if(entry.getValue()>1)System.out.print(entry.getKey());
       }System.out.println();

       //method 3
        List<Character>ls=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
       System.out.println(ls);

    }
}
