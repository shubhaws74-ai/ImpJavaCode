package streamapi;
import java.util.stream.*;
import java.util.*;
public class NumberStartingWith1 {
    //Find numbers starting with 1
    //Input: [10,15,21,30]
    //Output: [10,15]
    public static void main(String[] arg){
        List<Integer>list=Arrays.asList(10,15,21,30);
        List<Integer>lr=list.stream().filter(c->(String.valueOf(c)).startsWith("1")).collect(Collectors.toList());
        System.out.println(lr);
    }
}
