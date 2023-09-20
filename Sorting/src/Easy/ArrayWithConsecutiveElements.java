package Easy;

import java.util.Arrays;

public class ArrayWithConsecutiveElements {
    public int solve(int[] A) {

        //sort the array ;
        Arrays.sort(A);

        //Once it sort, check with indecs whetherit is equal or not
        // to check indecs we have to make 0 index to array starting index;
        for(int i=0;i<A.length;i++){
            if(A[0]+i !=A[i]){
                return 0;
            }
        }

        return 1;

    }


    public static void main(String[] args){

    ArrayWithConsecutiveElements obj=new ArrayWithConsecutiveElements();

    //int[] arr={ 3, 2, 1, 4, 5};

    int[] arr={1, 3, 2, 5};

    System.out.println(obj.solve(arr));
    }

}
