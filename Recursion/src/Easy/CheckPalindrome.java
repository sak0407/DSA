package Easy;

public class CheckPalindrome {

    public int solve(int i,int j,String A){

        if(i>=j) return 1;

        if(A.charAt(i)!=A.charAt(j)){
            return 0;
        }

        return solve(i+1,j-1,A);
    }
    public int solve(String A){

        int i=0;
        int j=A.length()-1;

        return solve(i,j,A);
    }

    public static void main(String[] args){

    CheckPalindrome obj=new CheckPalindrome();

    String A="NAMAN";

    int result= obj.solve(A);

    System.out.println(result);
    }


}
