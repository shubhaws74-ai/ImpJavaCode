package streamapi;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<Emp>list=Arrays.asList(new Emp(2,"john",27,"HR",4000L),
                new Emp(5,"Alice",29,"IT",7000L),
                new Emp(1,"Sam",19,"IT",6000L),
                new Emp(7,"Bob",45,"HR",5000L));
                //new Emp(25,"Ramu",30,"Finance",9000L));

// Q28. Find Employee with Max Salary
//Input: [John=4000, Alice=7000, Bob=5000]
//Output: Alice=7000
Optional<Emp> m=list.stream().max(Comparator.comparing(Emp::getSalary));
        System.out.println(m.get().getName()+"="+m.get().getSalary());
        Emp e=list.stream().max(Comparator.comparing(Emp::getSalary)).get();
        System.out.println(e.getName()+"="+e.getSalary());
        Emp e1=list.stream().sorted(Comparator.comparing(Emp::getSalary).reversed()).findFirst().orElse(null);
        System.out.println(e1.getName()+"="+e1.getSalary());
//Q29. Sort Employees by Salary
//Input: [John=4000, Alice=7000, Bob=5000]
//Output: [John=4000, Bob=5000, Alice=7000]
List<String>rt=list.stream().sorted(Comparator.comparing(Emp::getSalary)).map(em->em.getName()+"="+em.getSalary()).collect(Collectors.toList());
        System.out.println(rt);
        list.stream().sorted(Comparator.comparing(Emp::getSalary)).forEach(f->System.out.print(f.getName()+"="+f.getSalary()+" "));
        System.out.println();
        List<Emp>rut=list.stream().sorted(Comparator.comparing(Emp::getSalary)).collect(Collectors.toList());
        rut.forEach(b->System.out.print(b.getName()+" "+b.getSalary()+" "));
//Q30. Get Names of Employees Working in IT
//Input: [John-HR, Alice-IT, Bob-HR, Sam-IT]
//Output: [Alice, Sam]
        System.out.println();
List<String>lf=list.stream().filter(b->b.getDept().equals("IT")).map(b->b.getName()).toList();
        System.out.println(lf);
//Q31. Find Average Salary of Employees
//Input: [John=4000, Alice=7000, Bob=5000]
//Output: 5333.33
double avg=list.stream().collect(Collectors.averagingLong(Emp::getSalary));
        System.out.println(avg);
//Q32. Group Employees by Department
//Input: [John-HR, Alice-IT, Bob-HR, Sam-IT]
//Output: {HR=[John, Bob], IT=[Alice, Sam]}
Map<String,List<String>>mp=list.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.mapping(Emp::getName,Collectors.toList())));
        System.out.println(mp);
//Q33. Partition Employees Based on Salary > 5000
//Input: [John=4000, Alice=7000, Bob=5000]
//Output: {false=[John, Bob], true=[Alice]}
Map<Boolean,List<String>>jkl=list.stream().collect(Collectors.
        partitioningBy(b->b.getSalary()>5000,Collectors.mapping(Emp::getName,Collectors.toList())));
        System.out.println(jkl);
//Q34. Find Second Highest Salary
//Input: [John=4000, Alice=7000, Bob=5000, Sam=6000]
//Output: Sam=6000
Emp ev=list.stream().sorted(Comparator.comparing(Emp::getSalary).reversed()).skip(1).findFirst().orElse(null);
        System.out.println(ev.getName()+"="+ev.getSalary());

//Q35. Sort Employees by Department then by Name
//Input: [John-HR, Alice-IT, Bob-HR, Sam-IT]
//Output: [Bob-HR, John-HR, Alice-IT, Sam-IT]
List<String>dr=list.stream().sorted(Comparator.comparing(Emp::getDept).thenComparing(Emp::getName)).
        map(b-> b.getName()+"-"+b.getDept()).collect(Collectors.toList());
        System.out.println(dr);
//Q36. Convert List of Employees to Map (name->salary)
//Input: [John=4000, Alice=7000, Bob=5000]
//Output: {John=4000, Alice=7000, Bob=5000}

 Map<String,Long>mpr=list.stream().collect(Collectors.toMap(b->b.getName(),b->b.getSalary(),(a,b)->a,LinkedHashMap::new));
        System.out.println(mpr);
 /*“LinkedHashMap::new creates the result map, and when duplicate keys occur,
 the merge function (e1, e2) -> e1 decides to keep the existing value instead of
 throwing an exception.”*/

//Q37. Get Employee Names as CSV
//Input: [John=4000, Alice=7000, Bob=5000]
//Output: "John, Alice, Bob
        String hj=list.stream().map(Emp::getName).collect(Collectors.joining(", "));
        System.out.println(hj);
    }
}
