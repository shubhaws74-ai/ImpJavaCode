package string;
import java.util.*;
import java.util.stream.*;
public class MaxOccuringChar {
    //Find Maximum Occurring Character Input: "aabbbbcc" Output: 'b'
    public static void main(String [] args){
        //method 1
        String s="aabbbbcc";
        char bv= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
               .entrySet().stream().sorted(Map.Entry.comparingByValue()).findFirst().get().getKey();
       System.out.println(bv);

       //method 2
        int seen[]=new int[26];
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            seen[c-'a']++;
        }int mx=0;
        char ch='\\';
        for(char c:s.toCharArray()){
            if(mx<seen[c-'a']){
               mx=seen[c-'a'];
               ch=c;
            }
        }
       System.out.println(ch);

        // method 3
        String input = "aabbbbcc";

        char result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println(result);

    }
}
