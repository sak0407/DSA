package Easy;
import java.util.Arrays;

public class MaxMod {

    public int solve(int[] A) {
        int n = A.length;
        int flag = 0;
        //sort the array
        Arrays.sort(A);
        //keep the pointer at the end of the array
        int i = n - 1;
        // keep going backwards until we dont find a different element
        while (flag == 0 && i != 0) {
            if (A[i] == A[i - 1])
                i--;
            else
                flag = 1;
        }
        //if we find a different element before reaching the end of the array, print the element
        //at the index before that
        //else return 0 because in that case all the elements are same and no
        //matter which indices we choose, the answer will always be 0
        if (i != 0)
            return A[i - 1];
        else
            return 0;
    }

    public static void main(String[] args){


    MaxMod obj=new MaxMod();

    int[] arr={ 1, 2, 3 ,44 };

    int result= obj.solve(arr);


            System.out.print( result+" ");
    }

}
