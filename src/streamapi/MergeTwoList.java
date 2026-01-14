package streamapi;
import java.util.*;
import java.util.stream.*;
public class MergeTwoList {
    //Merge two lists without duplicates
    //Input: [1,2],[2,3]
    //Output: [1,2,3]
    public static void main(String[] args) {
        List<Integer>list1=Arrays.asList(1,2);
        List<Integer>list2=Arrays.asList(2,3);
        //manual using for loop
        List<Integer>lr=new ArrayList<>(list1);
        for(int n:list2)
        {
            if(!lr.contains(n))lr.add(n);
        }
        System.out.println(lr);

        // using stream
        List<Integer>lst=Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(lst);

    }
}
