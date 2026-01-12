package streamapi;
import java.util.stream.*;
import java.util.*;
public class LastRepeated {
    //82. Find first repeated element
    //
    //Input: [1,2,3,2,1]
    //Output: 2
    //
    //83. Find last repeated element
    //
    //Input: [1,2,3,2,1]
    //Output: 1
    //
    //84. Convert int[] to List<Integer>
    //
    //Input: [1,2,3]
    //Output: [1,2,3]
    public static void main(String[] args) {
        int a[]={1,2,3};
        List<Integer>l=Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(l);
        List<Integer>list=Arrays.asList(1,2,3,2,1);
//       int nf= list.stream().collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
//                .entrySet().stream().filter(e->e.getValue()>1).findFirst().get().getKey();
//        System.out.println(nf);
        Set<Integer>set=new LinkedHashSet<>();
        int nf=list.stream().filter(c->!set.add(c)).findFirst().get();
        System.out.println(nf);
        int nl=list.stream().filter(n->!set.add(n)).collect(Collectors.toCollection(LinkedList::new)).getLast();
        System.out.println(nl);

    }
}
