import java.util.*;



class lcp14{

    public static String  longestcommonprefix(String[] str ){
        if(str.length ==0 || str==null){
            
            return "0" ;
        }
        String prefix = str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

          

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String[] str2= new String[3];
        for(int i=0;i<3;i++){
            str2[i]=sc.nextLine();
        }
        String str1= longestcommonprefix(str2);
        System.out.println("The longest common prefix is : "+str1);
    }
}