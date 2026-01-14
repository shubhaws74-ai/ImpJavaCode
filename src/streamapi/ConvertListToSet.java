package streamapi;
import java.util.stream.*;
import java.util.*;
public class ConvertListToSet {
    //19. Multiply all numbers
    //Input: [1,2,3,4] //Output: 24
    //20. Convert list to set
    //Input: [1,2,2,3] //Output: [1,2,3]
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,2,3);
        Set<?>st=list.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println(st);
        //2
        int mul=list.stream().reduce(1,(a,b)->a*b);
        System.out.println(mul);
    }
}
