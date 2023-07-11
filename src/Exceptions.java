import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args){
//        int a=5;
//        int b=0;
//        try {
//            int c = a / b;
//        }
//        catch(ArithmeticException e){
//            System.out.println("HaHa");
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("HeHe");
//        }

        Scanner sc = new Scanner(System.in);
        int []arr = new int[3];
        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 22;

        int i=0;
        while(i<5){
            try {
                int index = sc.nextInt();
                System.out.println("Value:"+arr[index]);
                break;
            }
            catch(Exception e){
                i++;
                System.out.println("Invalid Index");
            }
        }
        if(i>=5){
            System.out.println("Error");
            throw new IndexOutOfBoundsException();
        }


    }
}
