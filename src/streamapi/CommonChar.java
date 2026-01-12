package streamapi;
import java.util.stream.*;
import java.util.*;
public class CommonChar {
    //Find common characters in two strings
    //
    //Input: "java","ava"
    //Output: [a,v]
    public static void main(String[] args){
        List<String>list=Arrays.asList("java","ava");
        Set<Character>st=new LinkedHashSet<>();
       List<Character>lr= list.stream().reduce("",(a,b)->a+b)
                .chars().mapToObj(c->(char)c).filter(c->!st.add(c)).distinct().collect(Collectors.toList());
       System.out.println(lr);
       //method 2
        String s1=list.get(0);
        String s2=list.get(1);
        StringBuilder sb=new StringBuilder();
        for(char c:s1.toCharArray()){
            if((s2.indexOf(c)!=-1)&&(sb.indexOf(String.valueOf(c))==-1)){
                sb.append(c);
                //s2.indexOf(c)!=-1 string has overloaded method  indexOf so it can take string and char
                //stringbuilder has only string version indexof take only strings
            }
        }System.out.println(sb.toString());
    }
}
