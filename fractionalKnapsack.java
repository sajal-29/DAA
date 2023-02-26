package DAA;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int[] profit = {280,100,120,120};
        int[] weight = {40,10,20,24};
        int knapsack_weight = 60;
        System.out.println(getMaxProfit(profit,weight,knapsack_weight));
    }

    private static double getMaxProfit(int[] profit, int[] weight,int wt) {
        double max = 0;
        int maxNum = 0;
        int maxWt = 0;
        double maxPW = 0;
        double[] Pbyw = new double[profit.length];
        for (int i = 0; i < Pbyw.length; i++) {
            Pbyw[i] = ((double)profit[i]/(double)weight[i]);
        }
        int i=0;
        while(wt!=0){
            maxPW = Pbyw[i];
            for (int j = i; j < Pbyw.length; j++) {
                if(maxPW <= Pbyw[j]){
                    maxPW = Pbyw[j];
                    maxNum = profit[j];
                    maxWt = weight[j];
                    swap2(i, j, Pbyw);
                    swap(i,j,profit);
                    swap(i, j, weight);
                }
                else{
                    maxPW = Pbyw[j];
                    maxNum = profit[i];
                    maxWt = weight[i];
                    break;
                }
            }
            if(wt - maxWt >= 0){
                max += maxNum;
                wt -= maxWt;
            }
            else{
                double fraction = (double)wt / (double)maxWt;
                max += (maxNum * fraction);
                wt -= (int)(wt - (maxWt * fraction));
                break;
            }
            
            i++;
        }
        return max;
    }

    private static void swap2(int i, int j, double[] arr) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
