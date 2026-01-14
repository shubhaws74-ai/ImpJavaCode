package streamapi;

import com.sun.source.tree.BreakTree;

public class Emp {
    private int id;
    private String name;
    private int age;
    private String dept;
    private long salary;
    public Emp(int id,String name,int age,String dept,long salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDept(){
        return dept;
    }
    public long getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+age+" "+dept+" "+salary+" ";
    }
}
