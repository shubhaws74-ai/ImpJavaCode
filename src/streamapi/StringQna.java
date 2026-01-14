package streamapi;
import java.util.*;
import java.util.stream.*;
public class StringQna {
    //21. Count character occurrences
    //Input: "programming"
    //Output: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
    //22. Find first non-repeating character
    //Input: "swiss" //Output: 'w'
    //23. Find duplicate characters
    //Input: "java" //Output: ['a']
    //24. Reverse string using streams
    //Input: "java" //Output: "avaj"
    public static void main(String[] args) {
        String str="programming";
        String str1="swiss";
        String str2="java";
        Map<Character,Long>mp=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(mp);

        char mr=str1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
        System.out.println(mr);

        System.out.println(str2.chars().mapToObj(c->String.valueOf((char)c)).reduce("",(a,b)->b+a));
        Set<Character>set=new HashSet<>();

        List<?>li=str2.chars().mapToObj(c->(char)c).filter(n->!set.add(n)).toList();
        System.out.println(li);

        String ls=str.chars().mapToObj(c->String.valueOf((char)c)).distinct().collect(Collectors.joining(""));
        System.out.println(ls);


    }
}
