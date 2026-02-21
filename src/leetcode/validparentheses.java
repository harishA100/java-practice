import java.util.*;

class Validparen{
    public static boolean isvalid(String str){
        Stack<Character> stack = new Stack<>();
            for(int i=0;i<str.length();i++){
                char ch= str.charAt(i);
                if(ch=='{' || ch=='[' || ch=='(')
                {   
                    stack.push(ch);
                }
                else{
                    if(stack.isEmpty()){
                        return false;
                    }
                char top = stack.peek();
                if(ch=='}' && top=='{' || ch==']' && top=='[' || ch==')' && top=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
                }
            }
            return stack.isEmpty();
    }
}

              

              
class validparentheses{
    public static void main(String[] args){
        Validparen valid = new Validparen();
        String str="{{(([]))}}";
        if(valid.isvalid(str)){
            System.out.println("is valid");
        }
        else{
            System.out.println("is not valid");
        }

    }
}
