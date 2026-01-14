package streamapi;
import java.util.stream.*;
import java.util.*;
public class ListIsSorted {
    //  //68. Check if list is sorted
    //    //Input: [1,2,3]
    //    //Output: true
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(1,2,3);
       boolean b= list.equals(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(b);
       boolean br= IntStream.range(1,list.size()).allMatch(n->list.get(n-1)<=list.get(n));
        System.out.println(br);
    }
}
