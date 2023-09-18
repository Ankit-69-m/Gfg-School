
class GfG
{
    public boolean isBinary(String str) {
        int count =0; // All characters are '0' or '1', so it's a binary string
        String s ="";
        for (int i=0; i<str.length(); i++){
            s+=str.charAt(i);
            if(s.equals("1")||s.equals("0"))
            {}
            else{
              count++;  
            }
            s="";
        }
        if(count==0) return true;
        return false;
    }
}