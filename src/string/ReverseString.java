package string;

public class ReverseString {
    /*1.Reverse a String Input: "hello" Output: "olleh" */
    public static void main(String args[]){
        String input ="hello";
        String str="";
        for(int i=input.length()-1;i>=0;i--){
            str=str+input.charAt(i);
        }
        System.out.println(str);

        // using stream
        String res=input.chars().mapToObj(c->String.valueOf((char)c)).reduce("",(a,b)->b+a);
        System.out.println(res);
    }
}
