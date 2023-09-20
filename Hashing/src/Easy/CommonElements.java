package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommonElements {

    public ArrayList<Integer> solve1(ArrayList<Integer> A, ArrayList<Integer> B) {

        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
        for(int x: A){
            a.put(x, a.getOrDefault(x, 0)+1);
        }
        for(int x: B){
            b.put(x, b.getOrDefault(x, 0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int k: a.keySet()){
            if(b.containsKey(k)){
                for(int i = 0; i < Math.min(a.get(k), b.get(k)); ++i){
                    ans.add(k);
                }
            }
        }
        return ans;
    }


    public ArrayList<Integer> solve2(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        return result;
    }

   public static void main(String[] args) {
       CommonElements obj=new CommonElements();
       ArrayList<Integer> arr1=new ArrayList<Integer> (Arrays.asList(2, 1, 4, 10));
       ArrayList<Integer> arr2=new ArrayList<Integer> (Arrays.asList(3, 6, 2, 10, 10));

       System.out.println(obj.solve1(arr1,arr2));
       System.out.println(obj.solve2(arr1,arr2));

   }

}
