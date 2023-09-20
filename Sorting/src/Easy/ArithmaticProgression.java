package Easy;

import java.util.Arrays;

public class ArithmaticProgression {

    public int solve(int[] A){

        Arrays.sort(A);

        int temp =A[1]-A[0];

        for(int i=1;i<A.length-1;i++){
            if(A[i+1]-A[i]!=temp){
                return 0;
            }
        }
    return 1;
    }

    public static void main(String[] args){

    ArithmaticProgression obj=new ArithmaticProgression();

    int[] arr={ 5,3,1};

    int result= obj.solve(arr);

    System.out.println(result);
    }

}
