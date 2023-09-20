package Easy;

public class MergeSort {

    public void mergeProcess(int[] A,int l,int y,int r){

        int p1=l;int p2=y;int p3=0;
        int[] temp=new int[r-l+1];

        while(p1<y && p2<=r){

            if(A[p1]<=A[p2]){
                temp[p3++]=A[p1++];
            }else{
                temp[p3++]=A[p2++];
            }

        }

        while(p1<y){
            temp[p3++]=A[p1++];
        }
        while(p2<=r){
            temp[p3++]=A[p2++];
        }

        for(int i=0;i< r-l+1 ; i++){
            A[i+l]=temp[i];
        }

    }
    public void mergeSort(int[] A,int l,int r){


        if(l==r) return ;
        int mid= l+ (r-l)/2;
        mergeSort(A,l,mid);
        mergeSort(A,mid+1,r);

        mergeProcess(A,l,mid+1,r);

    }



    public static void main(String[] args){

    MergeSort obj=new MergeSort();
    int[] arr={ 3,10,6,8,15,2,12,18,1,7 };

     obj.mergeSort(arr,0,arr.length-1);

        for(int j:arr)
        {
            System.out.print( j+" ");
        }
    }

}
