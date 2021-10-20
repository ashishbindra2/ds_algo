

import java.util.*;
//used resursion
class Main {

   static boolean pali(int l,int r,String s)
   {
     if(l>r) return true;
     if(s.charAt(l)!=s.charAt(r))    return false;
     return pali(l+1,r-1,s);
   }
    
 static boolean isPal(String s){
  return pali(0,s.length()-1,s);
  }
    public static void main(String args[] ) throws Exception {
      String s="aaaab";
      System.out.println(isPal(s));

}
}
