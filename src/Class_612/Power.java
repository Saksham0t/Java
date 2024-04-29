package Class_612;
public class Power {
    public static long power(int n ,int b){
        long p=1;
        for(int i =1; i<=b; i++){
            p=p*n;
        }
        return p;
    }
    public static void main(String[] args) {
        int n,b;
        long ans = power(5,3);
        System.out.println(ans);

    }
}
