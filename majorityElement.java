package DAA;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {100};
        System.out.println(majority(arr));
    }
    public static int majority(final int[] A) {
        if(A.length==1){
            return A[0];
        }
        int max=0;
        double a = Math.floor(A.length/2);
        int[] arr = new int[100];
        for (int i = 0; i < A.length; i++) {
            arr[A[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > a ){
                max = Math.max(max, i);
            }
        }
        return max;
    }
    
}
