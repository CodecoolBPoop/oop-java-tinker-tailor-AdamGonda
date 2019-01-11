import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 3;//in.nextInt();
        int n = 5;//in.nextInt();
        List<Integer> arr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        populate(arr, n);

        int idx = 0;
        while(!arr.isEmpty()){
            for (int i = 0; i < k - 1; i++) {
                if(idx >= arr.size() - 1) idx = 0;

                else idx++;
            }
            result.add(arr.get(idx));
            arr.remove(idx);
            if(idx > arr.size() - 1) idx = 0;
        }
        System.out.println(result);
    }

    private static void populate(List<Integer> list, int toN){
        for (int i = 1; i <= toN; i++) {
            list.add(i);
        }
    }
}
