import java.util.Scanner;

class Solution {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;       // old max becomes second largest
                max = arr[i];     // new largest found
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];    // update second largest
            }
        }

        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.getSecondLargest(arr));
    }
}