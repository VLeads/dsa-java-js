class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        // used Kadane's algorithm
        int n = arr.length;
        
        int firstLargest = -1;
        int secondLargest = -1;
        
        for(int i=0; i<n; i++){
            if(arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            if(arr[i] < firstLargest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
        
    }
}