package string;
import java.util.stream.*;
import java.util.*;
public class RemoveDuplicates {
    //Remove Duplicate Characters Input: "programming" Output: "progamin"
    public static void main(String [] args){
        String str ="programming";
        //method 1
       String rs=str.chars().mapToObj(c->(char)c).distinct().map(String::valueOf).collect(Collectors.joining(""));
       System.out.println(rs);
       //method 2
        Set<Character>set=new HashSet<>();
        String sr=str.chars().mapToObj(c->(char)c).filter(c->set.add(c)).map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(sr);

        // method 3
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String sv="";
        for(char c: map.keySet()){
            sv=sv+c;
        }System.out.println(sv);

    }
}
