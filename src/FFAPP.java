public class FFAPP {
    public static void main(String[] args) {

        // Factorial
//        int n = 5;
//        int fact = 1;
//        for(int i=1; i<=n; i++){
//            fact = fact*i;
//        }
//        System.out.println(fact);


        // Fibonacci Series
//        int a=0, b=1;
//        int c;
//        System.out.println(a);
//        System.out.println(b);
//        for(int i=0; i<=10; i++){
//            c=a+b;
//            System.out.println(c);
//            a = b;
//            b = c;
//        }


        // Armstrong Number
//        int num=153;
//        int temp = num;
//        int rem;
//        int arm=0;
//        while(temp != 0){
//            rem=temp%10;
//            arm = arm + (rem*rem*rem);
//            temp = temp/10;
//        }
//        if (arm == num) {
//            System.out.println("Armstrong Number");
//        }else {
//            System.out.println("Not a Armstrong Number");
//        }


        // Palindrome Number
//        int num = 121;
//        int temp = num;
//        int rev = 0 , rem;
//        while(temp != 0){
//            rem = temp%10;
//            rev = rev*10 + rem;
//            temp = temp/10;
//        }
//        if (rev == num) {
//            System.out.println("Palindrome Number");
//        }else {
//            System.out.println("Not a Palindrome Number");
//        }


        // Prime Number
        int n=10;
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }

        //Armstrong for any number
//        int n = 154;
//        int sum=0;
//        int count=0;
//        for(int temp=n; temp!=0; count++){
//            temp=temp/10;
//        }
//        System.out.println(count);
//        for(int temp=n; temp!=0; temp=temp/10){
//            int ld=temp%10;
//            sum = (int) (sum+Math.pow(ld,count));
//        }
//        System.out.println(sum);
//        if(n==sum){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }


    }
}
