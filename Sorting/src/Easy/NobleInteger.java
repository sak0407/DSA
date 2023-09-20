package Easy;
import java.util.Arrays;
public class NobleInteger {

    public int solve(int[] A) {

        Arrays.sort(A);


        for(int i=0;i<A.length;i++){

            //if element is negetive will it work? yes. How about duplicate value 3,3,3,3,3, here we should return -1

            while(i<A.length-1 && A[i]==A[i+1]){
                i++;
            }

            if(A.length-1-i == A[i]){

                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){

    NobleInteger obj=new NobleInteger();
        //int[] arr={ 1, 1, 3, 3};
        //int[] arr={3, 2, 1, 3};
        //int[] arr={-10,2,2,3,100};

        int[] arr={3,3,3,3,3,3};
    int result= obj.solve(arr);
    System.out.println(result);



    }

}
