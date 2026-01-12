package lamdaexpression;

public class Impl1 {


    public static void main(String[] args){
       // Impl1 i=new Impl1();
        Test2 t=(a,b)-> a+b;
        // if curly bracket is present then must use return statement;
        // if single statement is there we have to remove the return statement
        Test1 n=(c)->c.disp(70,70);
        int v=t.disp(40,90);
        System.out.println(v);
        System.out.println( n.disp(t));
    }
}
