package DAA;

import java.util.Arrays;
import java.util.Comparator;

class Activity{
    int start;
    int finish;


    public Activity(int s, int f){
        this.start = s;
        this.finish = f;
    }
}
    class Compare{
        void compare(Activity[] arr, int n){
            Arrays.sort(arr, new Comparator<Activity>() {
                public int compare(Activity a ,Activity b){
                    return a.finish - b.finish;
                }
            });
        }
    }
    class ActivitySelection_noSort{

        static void activitySelection(Activity[] arr, int n){
            
            Compare cmp = new Compare();
            cmp.compare(arr, n);
            int i=0;
            System.out.print("("+ arr[i].start + " " + arr[i].finish+ ")");

            for (int j = 1; j < n; j++) {
                if(arr[i].finish <= arr[j].start){
                    System.out.print(",("+ arr[j].start + " " + arr[j].finish+ ")");
                    i=j;
                }
            }
        }
        public static void main(String[] args) {

        int n = 6;
        Activity arr[] = new Activity[n];
        arr[0] = new Activity(5, 9);
        arr[1] = new Activity(1, 2);
        arr[2] = new Activity(3, 4);
        arr[3] = new Activity(0, 6);
        arr[4] = new Activity(5, 7);
        arr[5] = new Activity(8, 9);
 
        activitySelection(arr, n);
        }
}

