package DAA;

public class Activity_selection {
    static void activitySselection(int[] start ,int[] end){
        int i=0;
        System.out.print(i+" ");
        for (int j = 1; j < end.length; j++) {
            if(end[i] <= start[j]){
                System.out.print(j + " ");
                i=j;
            }
        }
    }
    public static void main(String[] args) {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };

        activitySselection(s, f);
    }
}

