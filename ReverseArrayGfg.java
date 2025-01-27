public class ReverseArrayGfg {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        
        // Create a reversed copy of the array in temp
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }
        
        // Copy reversed elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        
        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        ReverseArrayGfg reverseArrayGfg = new ReverseArrayGfg();
        int[] arr = {1, 2, 3, 4}; // Input array
        reverseArrayGfg.reverseArray(arr); // Call the reverseArray method
    }
}
