package streamapi;
import java.util.stream.*;
import java.util.*;
public class ArrayQna {
    //2. Find unique elements
    //Input: [1,2,2,3,4,4] //Output: [1,3]
    //3. Count frequency of each number
    //Input: [1,1,2,3,3,3] //Output: {1=2, 2=1, 3=3}
    //4. Find first non-repeating number
    //Input: [4,5,1,2,1,4] //Output: 5
    //5. Find second highest number
    //Input: [10,20,30,40] //Output: 30
    public static void main(String[] args) {
        //1
        List<Integer>list=Arrays.asList(1,2,2,3,4,4);
       List<Integer>lr= list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());
        System.out.println(lr);

        //2
        List<Integer>list1=Arrays.asList(1,1,2,3,3,3);
              Map<Integer,Long>mr= list1.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
              System.out.println(mr);
        //3

        List<Integer>list2=Arrays.asList(4,5,1,2,1,4);
        int nr=list2.stream().collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()==1).findFirst().get().getKey();
        System.out.println(nr);

        System.out.println(list2.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println(list2.stream().collect(Collectors.averagingInt(n->n)));
        System.out.println(list2.stream().anyMatch(n->n<0));

    }
}
