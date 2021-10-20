import java.util.*;

class Main {
   static void subSeq(int ind,String s,ArrayList<Character> al ,int n){
     if(ind == n )
     { 
         System.out.println(al);
         return ;
     }
     //pick
     al.add(s.charAt(ind));
     subSeq(ind+1,s,al,n);
     al.remove(al.size()-1);
     //non-pick
     subSeq(ind+1,s,al,n);
    }
 static void isPal(String s){
   subSeq(0,s,new ArrayList<>(),s.length());
  }
    public static void main(String args[] ) throws Exception {
      String s="234";
      isPal(s);
}
}
