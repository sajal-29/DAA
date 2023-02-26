package DAA;

import java.util.ArrayList;

import java.util.Collections;

class job{

    job(){}
    
    char id;
    int deadline;
    int profit;
    job(char id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    void jobSelection(ArrayList<job> arr, int t){
        Collections.sort(arr, (a,b) -> b.profit - a.profit);

        boolean[] check = new boolean[t];

        char[] job = new char[t];

        for (int i = 0; i < arr.size(); i++) {
            for (int j = Math.min(t-1, arr.get(i).deadline-1); j >= 0; j--) {
                if(check[j] == false){
                    check[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }
        for (char c : job) {
            System.out.println(c +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<job> arr = new ArrayList<job>();
		arr.add(new job('a', 2, 100));
		arr.add(new job('b', 1, 19));
		arr.add(new job('c', 2, 27));
		arr.add(new job('d', 1, 25));
		arr.add(new job('e', 3, 15));

        job j = new job();

        j.jobSelection(arr, 3);
        
    }

}
