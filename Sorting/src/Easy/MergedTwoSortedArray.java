package Easy;

public class MergedTwoSortedArray {

    public int[] solve(final int[] A, final int[] B) {

        int A_length=A.length;
        int B_length=B.length;

        int p1=0;int p2=0; int p3=0;

        int[] result=new int[A_length+B_length];

        while(p1<A_length && p2<B_length){
            // if A[p1] < B[p2] merge sort will be unstable, bcz jump of element will be happen
            //if A[p1] <= B[p2] stable
            if(A[p1]<= B[p2]){
              result[p3]=A[p1];
              p3++;
              p1++;
            }else{
                result[p3]=B[p2];
                p3++;
                p2++;
            }

        }
        while(p1<A_length){
            result[p3]=A[p1];
            p3++;
            p1++;
        }
        while(p2<B_length){
            result[p3]=B[p2];
            p3++;
            p2++;
        }

        return result;
    }


    public static void main(String[] args){

    MergedTwoSortedArray obj=new MergedTwoSortedArray();

    int[] arr1={ 2, 11, 19};
    int[] arr2={4, 7, 9 };

    int[] result= obj.solve(arr1,arr2);

        for (int j : result) {
            System.out.print(j + " ");
        }
    }

}
