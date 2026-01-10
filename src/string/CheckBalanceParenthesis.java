package string;
import java.util.stream.*;
import java.util.*;
public class CheckBalanceParenthesis {
    //Check Balanced Parentheses Input: "{[()]}" Output: true
    public boolean balancedPar(String s){
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
            char t=st.pop();
            if(c==')'&&t!='('||
                    c=='}'&&t!='{'||
                    c==']'&&t!='['){
                return false;
            }
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[]){
        String str="{[()]}";
        CheckBalanceParenthesis c=new CheckBalanceParenthesis();
        System.out.println(c.balancedPar(str));

    }
}
