package Class_612;
public class Power_By_Recursion {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
//        if(n<0){
//            x=1/x;
//            n=-n;
//        }
        int temp = power(x,n/2);
        if((n&1)==1){
            return x*temp*temp;
        }else{
            return temp*temp;
        }
    }

    public static void main(String[] args) {
        int x=-2;
        int n=5;
        System.out.println(power(x,n));


    }
}
