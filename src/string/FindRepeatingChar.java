package string;
import java.util.stream.*;
import java.util.*;
public class FindRepeatingChar {
    //Find First Repeating Character Input: "java" Output: 'a'
    public static void main(String [] args){
        String str="java";
        Set<Character>st=new LinkedHashSet<>();
        char rs=str.chars().mapToObj(c->(char)c).filter(c->!st.add(c)).findFirst().orElse(null);
        System.out.println(rs);
        char r=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().orElse(null);
        System.out.println(r);
    }
}
