package streamapi;
import java.util.*;
import java.util.stream.*;
public class StringAdv2 {
    //37. Find anagram strings
    //Input: ["eat","tea","tan"] //Output: [[eat,tea]]
    //38. Find most repeated character
    //Input: "success" //Output: 's'
    //39. Find least repeated character
    //Input: "success" //Output: 'u'
    //40. Remove empty strings
    //Input: ["Java","","Spring",""] //Output: ["Java","Spring"]
    public static void main(String[] args) {
        List<String> lr=List.of("Java","","Spring","").stream().filter(e->e!="").toList();
        System.out.println(lr);
        List<String> lor=List.of("Java","","Spring","").stream().filter(e->e!=null&&!e.isEmpty()).toList();
        System.out.println(lor);

        //
        char cr="success".chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue()).findFirst().get().getKey();
        System.out.println(cr);
        char cd="success".chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().sorted((Map.Entry.<Character,Long>comparingByValue()).reversed()).findFirst().get().getKey();
        System.out.println(cd);

    }
}
