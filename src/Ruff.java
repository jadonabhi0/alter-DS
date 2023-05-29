import java.util.*;

public class Ruff {

   public static int encode(String str){
       StringBuilder sb = new StringBuilder();
       int count = 1;
       for(int i = 1 ; i < str.length() ; i++){
           if (str.charAt(i) == str.charAt(i-1)){
               count++;
           }else{
               if (count == 1){
                   sb.append(str.charAt(i-1));
               }else{
                   sb.append(str.charAt(i-1)+""+count);
                   count = 1;
               }
           }
       }
       if (str.charAt(str.length()-1) != str.charAt(str.length()-2)){
           sb.append(str.charAt(str.length()-1));
       }else {
           sb.append(str.charAt(str.length()-1)+""+count);
       }
//       System.out.println(sb);
       return sb.length();
   }


   public static int helper(String str, int k, int l){
       if (str.length() == 0) return 0;
       if (k == 0) return encode(str);
       int c = 0;
       for(int i = 0 ; i < l ; i++){
           String s = str.substring(0,i)+str.substring(i+1);
           int a = helper(s, k-1, l);
           int b = helper(str, k, l);
           c = Math.min(a, b);
       }
       return c;
   }

    public static void main(String[] args) {



    }
}