package streamapi;
import java.util.stream.*;
import java.util.*;
public class FindFrequentChar {
    //Find least frequent number
    //
    //Input: [1,1,2,3,3,3]
    //Output: 2
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(1,1,2,3,3,3);
        int num=list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().min(Comparator.comparing(e->e.getValue())).get().getKey();
        System.out.println(num);


        int mx=list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().
                max(Comparator.comparing(e->e.getValue())).get().getKey();
        System.out.println(mx);


        int ms = list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                .skip(1)
                .findFirst()
                .get()
                .getKey();
        System.out.println(ms);

    }
}
