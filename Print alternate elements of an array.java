class GfG{
    public static void print(int arr[], int n){
        for(int i=0; i<=n-1; i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i]=scan.nextInt();
        }
        GfG.print(arr,n);
        
    }
    
}