package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

//class vechile{
//    int speed = 100;
//}
//class bike extends vechile{
//    int speed = 80;
//}
//abstract class engine {
//    abstract void run();
//    abstract void brake();
//}
//class motor extends engine {
//    void run(){
//        System.out.println("motor starts");
//    }
//    void brake(){
//        System.out.println("breaks failed");
//    }
//}

//interface employee{
//  public void data();
//
//}
//class akshit implements employee {
//  public void data() {
//       System.out.println("akshit = gay");
//   }
//}

//class test extends Thread{
//    public void run(){
//        System.out.println("Thread");
////        System.out.println(Thread.currentThread().getName());
////        System.out.println(Thread.currentThread().getPriority());
//    }
//}
//class task implements Runnable{
//    public void run(){
//        System.out.println("Thread by interface ");
////        System.out.println(Thread.currentThread().getName());
//    }
//}
//class test extends Thread{
//   synchronized public void run(){
//        try{
//            for(int i=1; i<=5; i++){
//                Thread.sleep(1000);
//                System.out.println(i);
//            }
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
//}
//class constructor{
//    constructor(int a){
//        System.out.println(a);
//    }
//    constructor(int b, int a){
//        System.out.println(a*b);
//    }
//
//}
class Table {
     synchronized void Printable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
class thread1 extends Thread{
    Table t;
    thread1 (Table t){
        this.t=t;
    }
    public void run(){
        t.Printable(5);
    }
}
class thread2 extends Thread{
    Table t;
    thread2 (Table t){
        this.t=t;
    }
    public void run(){
        t.Printable(7);
    }
}


public class exam {
    public static void main(String[] args ){
//        Scanner sc = new Scanner(System.in);
//        int sum = sc.nextInt();
//        System.out.println(sum);
//        System.out.println("Hello");
//        int fact = 1;
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            fact*=i;
//        }
//        System.out.println(fact);

//        bike honda = new bike();
//        System.out.println(honda.speed);
//        vechile maruthi = new vechile();
//        System.out.println(maruthi.speed);

//        motor key = new motor();
//        key.run();
//        key.brake();

//        akshit ass = new akshit();
//        ass.data();

//          test t = new test();
//          System.out.println(Thread.currentThread().getPriority());
//          Thread.currentThread().setPriority(10);
//          System.out.println(Thread.currentThread().getPriority());
//          t.start();
//          task th = new task();
//          Thread thr = new Thread(th);
//          thr.start();
//          System.out.println(Thread.currentThread().getName());
//          System.out.println(Thread.currentThread().getPriority());

//        test t1 = new test();
//        t1.start();

//        constructor c = new constructor(10);
//        constructor d = new constructor(10,5);

        Table obj = new Table();
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);
        t1.start();
        t2.start();












    }
}
