package Easy;
import java.util.Arrays;

public class ElementsRemoval {

    public int solve(int[] A){

        Arrays.sort(A);

        /*  Approach 1 : with prefix sum

        In this approach there is space complexcity o(n)

        int[] pf=new int[A.length];

        for(int i=0;i<A.length;i++){
            if(i==0){
                pf[0]=A[0];
            }else{
                pf[i]=pf[i-1]+A[i];
            }
        }
        int sum=0;
        for(int i=0;i<pf.length;i++){
            sum += pf[i];
        }

         */

        int sum=0;

        for(int i=A.length-1;i>=0;i--){
            sum +=A[i] * (A.length-i);
        }


        return sum;
    }


    public static void main(String[] args){

    ElementsRemoval obj=new ElementsRemoval();

    int[] arr={ 2,1 };

    int result= obj.solve(arr);

        System.out.println(result);
    }


}
