package Easy;

public class KthSmallestElement {

    public int kthsmallest(final int[] A, int B) {

        int length=A.length;
        int res=0;

        int k=0;
        int index=-1;
        while( k<B){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<length-k;i++ ){
                if(A[i]<=min){
                    min=A[i];
                    index=i;
                }

            }
            int temp=A[index];
            A[index]=A[length-k-1];
            A[length-k-1]=temp;

            k++;
        }
        res=A[length-k];
       return res;
    }


    public static void main(String[] args){

    KthSmallestElement obj=new KthSmallestElement();

    int[] arr={  8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36,
            44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92 };
   // int[] arr={2,1,4,3,2};
    int B=9;

    int result= obj.kthsmallest(arr,B);

    System.out.println(result);
    }

}
