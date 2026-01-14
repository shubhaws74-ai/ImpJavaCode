package streamapi;
import java.util.*;
import java.util.stream.*;
public class StringAdv {
    //27. Find longest word
    //Input: ["Java","SpringBoot","API"]
    //Output: "SpringBoot
    //28. Find shortest word
    //Input: ["Java","Spring","API"]
    //Output: "API"
    public static void main(String[] args) {
        List<String>ls=Arrays.asList("Java","SpringBoot","API");
        String mr=ls.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(mr);
        String ms=ls.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(ms);
        String sr=ls.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        System.out.println(sr);
        List<String> sl=ls.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sl);
        List<String> al=List.of("banana","apple","cherry").stream().sorted().collect(Collectors.toList());
        System.out.println(al);

        List<String> alr=List.of("banana","apple","cherry").stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(alr);

//Group strings by length
//Input: ["one","two","three"]
//Output: {3=[one,two],5=[three]}
        List<String>list=Arrays.asList("one","two","three");
        Map<Integer,List<String>>m=list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(m);

        //
        Long lo=Arrays.stream("Java is very powerful".split("\\s+")).count();
        System.out.println(lo);

        //Find palindrome strings
        //Input: ["madam","java","level"]
        //Output: ["madam","level"]
       List<String>lr= List.of("madam","java","level").stream().filter(c->c.equals(String.valueOf(new StringBuilder(c).reverse().toString()))).toList();
        System.out.println(lr);
    }
}
