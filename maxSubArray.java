package DAA;

public class maxSubArray {
    public static void main(String[] args) {
        
        int[] arr = {1};
        System.out.println(maxSum(arr,0,arr.length-1));
    }

    private static int sum(int[] arr, int l, int h, int  m) {
        int count = 0;
        int left = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            count += arr[i];
            if(count > left){
                left = count;
            }
        }

        count = 0;
        int right = Integer.MIN_VALUE;
        for (int i = m; i < arr.length; i++) {
            count += arr[i];
            if(count > right){
                right = count;
            }
        }

        return Math.max(left+right-arr[m],Math.max(left, right));
    }

    private static int maxSum(int[] arr,int l, int h) {
        if(l>h){
            return Integer.MIN_VALUE;
        }
        if(l==h){
            return arr[l];
        }
        int mid = (h-l)/2 + l;

        return Math.max(Math.max(maxSum(arr, l, mid), maxSum(arr, mid+1, h)),sum(arr, l, h, mid));
    }
}
