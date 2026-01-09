package string;
import java.util.stream.*;
import java.util.*;
public class NonRepeatingChar {
    //Find First Non-Repeating Character Input: "swiss" Output: 'w'
    public static void main(String args[]){
        String s="swiss";
        //method1
       Map<Character,Long>mp= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
       for(Map.Entry<Character,Long>entry:mp.entrySet()){
           if(entry.getValue()==1) {
               System.out.println(entry.getKey());
               break;
           }
       }
    }
}
