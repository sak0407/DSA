package Easy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class LargestNumber {
    public String solve(final int[] A) {
        String result="";

        //each array element need to convert in string
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<A.length;i++){
            list.add(Integer.toString(A[i]));
        }
        
        Collections.sort(list,(s1,s2)-> (s2+s1).compareTo(s1+s2));

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            result += list.get(i);
        }

        //valid number can't start with zero.
        //0 0 0 0 0 output is 0000 , but we need it only one zero

        int pos=0;

        while(pos < result.length()-1 && result.charAt(pos)=='0'){
            pos++;
        }

        result=result.substring(pos);

        return result;

    }


    public static void main(String[] args){

    LargestNumber obj=new LargestNumber();
    int arr[]={0,0,0,0,0};
    //int[] arr={ 9, 3, 2, 0 };
    //int arr={3,30,34,5,9};
    String result= obj.solve(arr);
    System.out.println(result);
    }

}
