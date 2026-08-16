import java.util.Scanner;
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int start = 0 ;
        int end = arr.length-1 ;
        while(start>end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= arr[temp];
            start++;
            end--;
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        obj.reverseArray(arr); 
        for(int i = 0 ; i<arr.length ; i ++){
            System.out.print(arr[i]);
            
            
        }
    }
    
}
