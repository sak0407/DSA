package Easy;

import java.util.Arrays;
public class ChocolateDistribution {
    public int solve(int[] A, int B) {

       // consider the smallest number of input A can be 0 and B can also be zero

        int length=A.length;
        if(length<1 || B<1){
            return 0;
        }
        Arrays.sort(A);
        int min=A[B-1]-A[0];
        int start=1;
        int end=B;
        while( end < length ){
            int diff=A[end]-A[start];
            if(min>diff){
                min=diff;
            }
            end++;
            start++;
        }
        return min;
    }

    public static void main(String[] args){

    ChocolateDistribution obj=new ChocolateDistribution();

    int[] arr={ 3, 4, 1, 9, 56, 7, 9, 12};
    int B=5;
    int result= obj.solve(arr,B);
    System.out.print( result+" ");
    }

}
