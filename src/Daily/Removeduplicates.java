import java.util.*;
class Removeduplicates{
    public static void main(String[] args){
        String str = "programming";
        StringBuilder s1 = new StringBuilder();
        for(int j=0;j<str.length();j++){
            char c = str.charAt(j);
            boolean isfound = false;

            for(int i =0;i<s1.length() ;i++){
                if(c==s1.charAt(i)){
                    isfound = true;
                    break;
                }
            }
            if(!isfound){
                s1.append(c);
            }

        }
        System.out.print(s1.toString());
    }
}
