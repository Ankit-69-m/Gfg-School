class GfG
{
    void printPat(int n)
    {
        for (int i=n; i>0; i--){
            for(int j=n; j>0; j-- ){
                for(int count=i; count>0; count--){
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }
        
    }
}