class Thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i=0;
        try{
            while (i < 100) {
                System.out.println("Welcome");
                Thread.sleep(200);
                i++;
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

//class T1 implements Runnable{
//    public void run(){
//        System.out.println("Thread 1");
//    }
//}
//class T2 implements Runnable{
//    public void run(){
//        System.out.println("Thread 2");
//    }
//}
public class Threading {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.out.println(t1.getId());
        System.out.println(t2.getId());

//        t1.start();
//        t2.start();

//        T1 bullet1 = new T1();
//        Thread gun1 = new Thread(bullet1);
//        gun1.start();
//
//        T1 bullet2 = new T1();
//        Thread gun2 = new Thread(bullet2);
//        gun2.start();





    }
}
