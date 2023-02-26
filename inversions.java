package DAA;

public class inversions {
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println(Invert(arr));
    }

    private static int Invert(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i<j && arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
