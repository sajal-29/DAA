package DAA;

import java.util.ArrayList;

public class coinChange {
    static int[] deno = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    static int n = deno.length;

    static void CC(int val){
        ArrayList<Integer> coin = new ArrayList<Integer>();

        for (int i = n-1; i >= 0; i--) {
            while (val >= deno[i]){
                val -= deno[i];
                coin.add(deno[i]);
            }
        }
        System.out.println(coin.size());
    }
    public static void main(String[] args) {
        int n = 93;
        CC(n);
    }
}
