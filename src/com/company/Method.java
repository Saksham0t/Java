package com.company;

public class Method {

//    static int logic(int a, int b){
//        int s;
//        if(a>=b){
//            System.out.println(s = a+b);
//        }else {
//            System.out.println(s = a-b);
//        }
//        a=744;                             //does not affect main bcz its copy
//        return s;
//    }

//    static void change(int z){
//        z=9;
//    }                                   //void not requires return

//    static void change2(int []arr){
//        arr[0] = 50;
//    }

//    static void foo (){
//        System.out.println("hello");
//    }
//
//    static void foo (int a){
//        System.out.println("hello "+ a);
//    }
//
//    static void foo (int a,int b){             //If return type is changed then it is not method overloading
//        System.out.println("hello "+ a );
//        System.out.println("hello "+ b);
//    }

                                                //Varargs
//    static int sum(int a, int b){
//        int result ;
//        result = a+b;
//        return result;
//    }
//    static int sum(int a, int b, int c){
//        int result ;
//        result = a+b+c;
//        return result;
//    }
//    static int sum(int ...arr){                 // multiple method overloading in one method by varargs
//        int result = 0;
//            for(int a:arr){
//                result += a;
//            }
//        return result;
//    }
                                                   //Recursion
//    static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }else{
//            int p = 1;
//            for(int i=n; i>=1; i--){
//                p *= i;
//            }
//            return p;
//        }
//    }
//    static int recursion(int n){
//        if(n==0 || n==1){
//            return 1;
//        }else{
//            return n * recursion(n-1);
//        }
//    }

//    static int fib(int n){       //Fibonacci series by recursion
//        if(n==1 || n==0) {
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
//        else{
//            return fib(n-1) + fib(n-2);
//        }
//    }
                                                 //Table by method
//    static void table(int t){
//        for(int i=1; i<=10; i++){
//            System.out.format(" %dX%d = %d\n",t,i,i*t);
//        }
//    }
                                                   //Pattern by method
//    static void pattern(int n) {
//        for (int i=0; i < n; i++) {
//            for (int j=0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
                                              //sum by recursion
//    static int sum(int n) {
//        if(n==0 || n==1){
//            return n;
//        }else{
//            return n + sum(n-1);
//        }
//    }
                                              //Pattern2 by method
//    static void pattern2(int n){
//        for (int i=1; i <= n; i++) {
//            for (int j=n; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
                                       //Average by varargs
//    static int sum(int ...arr){
//        int c=0;
//        for(int element:arr){
//            c += element;
//        }
//            return c/2;
//    }
                                               //Pattern1 by recursion
//    static void pattern(int n){
//       if(n>0){
//           pattern(n-1);
//        for(int i=0; i<n; i++){
//            System.out.print("*");
//          }
//           System.out.println();
//       }
//    }
                                             //Pattern2 by recursion
//    static void pattern(int n){
//       if(n>0){
//        for(int i=0; i<n; i++){
//            System.out.print("*");
//          }
//           System.out.println();
//           pattern(n-1);
//       }
//    }



    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x=sc.nextInt(), y= sc.nextInt();
//        int sum ;
//        sum = logic(x,y);
        //or
//        if(x>=y){
//            System.out.println(sum = x+y);
//        }else {
//            System.out.println(sum = x-y);
//        }

                                       //Without static
//        Method obj = new Method();     // method invocation using object creation
//        sum = obj.logic(x,y);

//         int u = 99;
//         change(u);
//        System.out.println(u);      // Integer does not change

//          int []array = {77,66,33,55};
//          change2(array);
//          System.out.println(array[0]);      // Array does change

//            foo();                                 //Method Overloading
//            int y=3000;
//            foo(y);
//            int c=8, d=9;
//            foo(c,d);
                                                   //varargs
//        System.out.println(sum());
//        System.out.println(sum(7));
//        System.out.println(sum(9,7));
//        System.out.println(sum(8,9,7));
                                                  //recursion
//          int f = 4;
//        System.out.println(factorial(f));
//        System.out.println(recursion(f));
                                                    //fibonacci
//        int n = 7;
//        System.out.println(fib(n));
//        for(int i=1; i<=n; i++){
//            System.out.print(fib(i)+ " ");
//        }

//        int n = 6;
//        table(n);

//        int n=6;
//        pattern(n);

//        int n=3;
//        System.out.println(sum(n));

//        int n=7;
//        pattern2(n);

//        System.out.println(sum(11,19));

//        int pat = 4;
//        pattern(pat);

//        int pat = 4;
//        pattern(pat);


    }
}
