class Solution {
    public boolean isPalindrome(String s) {
        String x=s.toLowerCase();

        
        String t1="";
        for(int i=0;i<x.length();i++){
           if((x.charAt(i)>='a' && x.charAt(i)<='z')||(x.charAt(i)>='0' && x.charAt(i)<='9') ){
             t1=t1+x.charAt(i);
           }
        }
        String t2="";
        for(int i=x.length()-1;i>=0;i--){
            if((x.charAt(i)>='a' && x.charAt(i)<='z') || (x.charAt(i)>='0' && x.charAt(i)<='9') ){
               t2=t2+x.charAt(i);
           }
        }

        if(t1.equals(t2)){
            return true;
        }
        else{
            return false;
        }
    }
}
