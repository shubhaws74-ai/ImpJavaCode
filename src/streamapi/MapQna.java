package streamapi;
import java.util.stream.*;
import java.util.*;
public class MapQna {
    //77. Convert Map to List//Input: {A=1,B=2} Output: [A=1,B=2]
    //78. Sort Map by value Input: {A=3,B=1}//Output: {A=3,B=1}
    //79. Find max value from Map Input: {A=3,B=5}//Output: 5
    // 80. Find key with max value Input: {A=3,B=5} //Output: B
    public static void main(String[] args) {
        Map<Character,Integer>map=new LinkedHashMap<>();
        map.put('A',2);
        map.put('B',19);
        List<String>lr=map.entrySet().stream().map(e->e.getKey()+"="+e.getValue()).toList();
        System.out.println(lr);

        //
        Map<Character,Integer>pm=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        System.out.println(pm);

        //
       char ch= map.entrySet().stream().max(Comparator.comparing(e->e.getValue())).get().getKey();
       System.out.println(ch);
        int mx= map.entrySet().stream().max(Comparator.comparing(e->e.getValue())).get().getValue();
        System.out.println(mx);

    }
}
