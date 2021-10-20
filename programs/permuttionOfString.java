//print all permutation of sting using stringBuffer
//not for interview approch
import java.util.*;
class Main {
   static void printPermutation(int ind,StringBuffer ans,String s,HashMap<Integer,Integer> map){
     if(ind == s.length())
     { 
        System.out.println(ans);
         return;
     } 
     for(int i=0;i<s.length();i++){
         if(map.get(i)==null||map.get(i)==0){
             map.put(i,1);
             ans.append(s.charAt(i));
             printPermutation(ind+1,ans,s,map);
             map.put(i,0);
            ans.deleteCharAt(ans.length()-1);
         }
     }
    }
    public static void main(String args[] ) throws Exception {
    String s="abc";
    printPermutation(0,new StringBuffer(),s,new HashMap<>());
}
}

////print all permutation of sting using string


class Main {
   static void printPermutation(int ind,String ans,String s,HashMap<Integer,Integer> map){
     if(ind == s.length())
     { 
        System.out.println(ans);
         return;
     } 
     for(int i=0;i<s.length();i++){
         if(map.get(i)==null){
             map.put(i,1);
             ans=ans.concat(""+s.charAt(i));
             printPermutation(ind+1,ans,s,map);
             map.remove(i);
            ans = ans.substring(0,ans.length()-1);
         }
     }
    }
    public static void main(String args[] ) throws Exception {
    String s="abc";
    printPermutation(0,"",s,new HashMap<>());
}
}
