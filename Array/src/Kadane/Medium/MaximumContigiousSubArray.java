package Kadane.Medium;

class MaximumContigiousSubArray {

    public int solve1(int[] A) {

        //basic Approach : consider all subarray
        int length=A.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<length;i++){

            int sum=0;
            for(int j=i;j<length;j++){

                sum +=A[j];
                if(max<sum){
                    max=sum;
                }
            }

        }
        
        return max;
    }
    public int solve2(int[] A) {

        // Kadane alogo :
        int ans =Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<A.length;i++){

            sum += A[i];
            if(ans<sum){
                ans=sum;
            }

            if(sum<0){
                sum=0;
            }

        }
        return ans;
    }


    public static void main(String[] args){

    MaximumContigiousSubArray obj=new MaximumContigiousSubArray();
    int[] arr={ -2, 1, -3, 4, -1, 2, 1, -5, 4};

    //int result= obj.solve1(arr);
    int result= obj.solve2(arr);
    System.out.print( result+" ");

    }

   

}
