package string;

public class LowerToUpperCase {
    //Convert Lowercase to Uppercase (Without Built-in Methods) Input: "java" Output: "JAVA"
    public static void main(String [] args){
        String str="java";
        StringBuilder sb =new StringBuilder();
        for(char c:str.toCharArray()){
            sb.append((char)(c-32));
        }System.out.println(sb.toString());
    }
}
