class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]==i+1){
                list.add(arr[i]);
            }
        }
        return list;
    }
}