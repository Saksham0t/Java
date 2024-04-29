public class Reverse {
    public int reverse(int x){
        long rev=0;
        while(x!=0){
            int ld = x%10;
            rev=(rev*10)+ld;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*rev);
        }
        return (int)rev;
    }
    public static void main(String[] args) {
        Reverse rv = new Reverse();
//        System.out.println(reverse(1876543211));

        int a =rv.reverse(8765);
        System.out.println(a);
    }
}
